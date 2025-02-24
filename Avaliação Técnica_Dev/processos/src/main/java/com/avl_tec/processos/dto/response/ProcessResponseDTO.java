package com.avl_tec.processos.dto.response;

import com.avl_tec.processos.entity.Process;
import lombok.Getter;

@Getter
public class ProcessResponseDTO {

    private Long id_process;

    private String defendant;

    public ProcessResponseDTO(Process process) {

        this.id_process = process.getId_process();
        this.defendant = process.getDefendant();
    }

}

