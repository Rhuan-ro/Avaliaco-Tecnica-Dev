package com.avl_tec.processos.service;


import com.avl_tec.processos.dto.request.ProcessRequestDTO;
import com.avl_tec.processos.dto.response.ProcessResponseDTO;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProcessService {

    ProcessResponseDTO findById (Long id_process);

    List<ProcessResponseDTO> findAll();

    ProcessResponseDTO register(ProcessRequestDTO processDTO);

    ProcessResponseDTO update(Long id_process, ProcessRequestDTO processDTO);

    String delete(Long id_process);
}
