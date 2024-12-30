package com.codex.aposta.controller;

import com.codex.aposta.model.Apostador;
import com.codex.aposta.model.dto.ApostadorIn;
import com.codex.aposta.repository.ApostadorRepository;
import com.codex.aposta.service.ApostadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RequiredArgsConstructor
@RestController
public class ApostadorController {

    private final ApostadorService apostadorService;

    @PostMapping("/apostador")
    public ResponseEntity salvarApostador(@RequestBody ApostadorIn apostadorIn){
        apostadorService.salvarApostador(apostadorIn);
        return ResponseEntity.status(CREATED).build();
    }

}
