package com.avl_tec.processos.service;

import com.avl_tec.processos.util.ProcessMapper;
import com.avl_tec.processos.entity.Process;
import com.avl_tec.processos.dto.request.ProcessRequestDTO;
import com.avl_tec.processos.dto.response.ProcessResponseDTO;
import com.avl_tec.processos.repository.ProcessRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class ProcessServiceImpl implements ProcessService {

    private final ProcessRepository processRepository;

    private ProcessMapper processMapper;


    public ProcessResponseDTO findById(Long id_process) {

        return processMapper.toProcessDTO(returnProcess(id_process));

    }

    @Override
    public List<ProcessResponseDTO> findAll() {

        return processMapper.toProcessDTO(processRepository.findAll());
    }

    @Override
    public ProcessResponseDTO register(ProcessRequestDTO ProcessDTO) {

        Process process = processMapper.toProcess(ProcessDTO);

        return processMapper.toProcessDTO(processRepository.save(process));
    }

    @Override
    public ProcessResponseDTO update(Long id_process, ProcessRequestDTO processDTO) {

        Process process = returnProcess(id_process);

        processMapper.updateProcessData(process,processDTO);

        return processMapper.toProcessDTO(processRepository.save(process));

    }

    @Override
    public String delete(Long id_process) {
        processRepository.deleteById(id_process);
        return "Process "+id_process+" deleted";
    }

    private Process returnProcess(Long id_process){
        return processRepository.findById(id_process)
                .orElseThrow(() -> new RuntimeException("Process not found"));


    }

}