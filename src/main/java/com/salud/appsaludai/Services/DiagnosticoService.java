package com.salud.appsaludai.Services;

import com.salud.appsaludai.DTO.DiagnosticoDTO;
import com.salud.appsaludai.Entidades.Diagnostico;
import com.salud.appsaludai.Interfaces.IDiagnosticoServices;
import com.salud.appsaludai.Repository.DiagnosticoRepository;
import com.salud.appsaludai.Repository.EnfermedadRepository;
import com.salud.appsaludai.Repository.SintomaRepository;
import com.salud.appsaludai.Repository.UsuarioGeneralRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiagnosticoService implements IDiagnosticoServices {
    @Autowired
    private DiagnosticoRepository diagnosticoRepository;
    @Autowired
    private UsuarioGeneralRepository usuarioGeneralRepository;
    @Autowired
    private EnfermedadRepository enfermedadRepository;
    @Autowired
    private SintomaRepository sintomaRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Diagnostico findById(Long id) {
        return diagnosticoRepository.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public DiagnosticoDTO registrar(DiagnosticoDTO diagnosticoDTO) {
        Diagnostico diagnostico = new Diagnostico();
        diagnostico.setConsentimiento(diagnosticoDTO.getConsentimiento());
        diagnostico.setFecha(diagnosticoDTO.getFecha());

        // Relaciones
        diagnostico.setUsuario(usuarioGeneralRepository.findById(diagnosticoDTO.getIdUsuario()).orElse(null));
        diagnostico.setEnfermedad(enfermedadRepository.findById(diagnosticoDTO.getIdEnfermedad()).orElse(null));

        if (diagnosticoDTO.getIdsSintomas() != null) {
            diagnostico.setSintomas(
                    sintomaRepository.findAllById(diagnosticoDTO.getIdsSintomas())
            );
        }

        Diagnostico saved = diagnosticoRepository.save(diagnostico);
        return modelMapper.map(saved, DiagnosticoDTO.class);
    }
    @Transactional
    @Override
    public void borrar(Long id) {
        diagnosticoRepository.deleteById(id);
    }

    @Override
    public List<DiagnosticoDTO> findAll() {
        return diagnosticoRepository.findAll()
                .stream()
                .map(d -> modelMapper.map(d, DiagnosticoDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public Diagnostico actualizar(Diagnostico diagnostico) {
        if (diagnosticoRepository.existsById(diagnostico.getId())) {
            return diagnosticoRepository.save(diagnostico);
        }
        return null;
    }

    @Override
    public List<DiagnosticoDTO> buscarPorUsuario(Long idUsuario) {
        return diagnosticoRepository.findByUsuario_Id(idUsuario)
                .stream()
                .map(d -> modelMapper.map(d, DiagnosticoDTO.class))
                .collect(Collectors.toList());
    }

}
