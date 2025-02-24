package com.avl_tec.processos.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "process")
@NoArgsConstructor
@Getter
@Setter
public class Process {

    @Id
    @Column(name = "id_process", nullable = false, unique = true)
    private Long id_process;

    @Column(name = "defendant", nullable = true)
    private String defendant;

    @Builder
    public Process(Long id_process, String defendant) {
        this.id_process = id_process;
        this.defendant = defendant;
    }
}
