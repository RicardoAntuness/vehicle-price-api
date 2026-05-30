package com.ricardo.fipeapi.controller;

import com.ricardo.fipeapi.dto.MarcaDTO;
import com.ricardo.fipeapi.dto.VeiculoDTO;
import com.ricardo.fipeapi.service.FipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fipe")
@RequiredArgsConstructor
public class FipeController {

    private final FipeService fipeService;

    @GetMapping("/marcas")
    public List<MarcaDTO> buscarMarcas() {
        return fipeService.buscarMarcas();
    }

    @GetMapping("/veiculo/{marca}/{modelo}/{ano}")
    public VeiculoDTO buscarVeiculo(
            @PathVariable String marca,
            @PathVariable String modelo,
            @PathVariable String ano
    ) {
        return fipeService.buscarVeiculo(marca, modelo, ano);
    }
}

