package com.avl_tec.processos.controller;

import com.avl_tec.processos.dto.request.ProcessRequestDTO;
import com.avl_tec.processos.dto.response.ProcessResponseDTO;
import com.avl_tec.processos.service.ProcessService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/process")
@RequiredArgsConstructor
public class ProcessController {

    private final ProcessService processService;

    @GetMapping(value = "/{id_process}")
    public ResponseEntity<ProcessResponseDTO> findById(@PathVariable Long id_process) {
        return ResponseEntity.ok().body(processService.findById(id_process));
    }

    @GetMapping
    public ResponseEntity<List<ProcessResponseDTO>> findAll() {
        return ResponseEntity.ok().body(processService.findAll());
    }

    @PostMapping
    public ResponseEntity<ProcessResponseDTO> register(@RequestBody ProcessRequestDTO processRequestDTO, UriComponentsBuilder uriBuilder) {

        ProcessResponseDTO processResponseDTO = processService.register(processRequestDTO);

        URI uri = uriBuilder.path("/process/{id_process}").buildAndExpand(processResponseDTO.getId_process()).toUri();

        return ResponseEntity.created(uri).body(processResponseDTO);
    }

    @PutMapping(value = "/{id_process}")
    public ResponseEntity<ProcessResponseDTO> update(@RequestBody ProcessRequestDTO processDTO, @PathVariable(name = "id_process") Long id_process) {
        return ResponseEntity.ok().body(processService.update(id_process,processDTO));
    }

    @DeleteMapping(value = "/{id_process}")
    public ResponseEntity<String> delete(@PathVariable(value = "id_process") Long id_process) {
        return ResponseEntity.ok().body(processService.delete(id_process));
    }

}
