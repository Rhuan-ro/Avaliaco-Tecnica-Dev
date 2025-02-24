package com.avl_tec.processos.util;

import com.avl_tec.processos.dto.request.ProcessRequestDTO;
import com.avl_tec.processos.dto.response.ProcessResponseDTO;
import com.avl_tec.processos.entity.Process;

import java.util.List;
import java.util.stream.Collectors;

public class ProcessMapper {

    public Process toProcess(ProcessRequestDTO processDTO) {

        return Process.builder()
                .defendant(processDTO.getDefendant())
                .build();

    }

    public ProcessResponseDTO toProcessDTO(Process process) {
        return new ProcessResponseDTO(process);
    }

    public List<ProcessResponseDTO> toProcessDTO(List<Process> processList) {
        return processList.stream().map(ProcessResponseDTO::new).collect(Collectors.toList());
    }

    public void updateProcessData(Process process, ProcessRequestDTO processDTO) {
        process.setDefendant(processDTO.getDefendant());
    }

}
