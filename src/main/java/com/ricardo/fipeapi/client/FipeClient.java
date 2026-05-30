package com.ricardo.fipeapi.client;

import com.ricardo.fipeapi.dto.MarcaDTO;
import com.ricardo.fipeapi.dto.VeiculoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "fipe", url = "https://parallelum.com.br/fipe/api/v1")
public interface FipeClient {

    @GetMapping("/carros/marcas")
    List<MarcaDTO> getMarcas();

    @GetMapping("/carros/marcas/{marca}/modelos/{modelo}/anos/{ano}")
    VeiculoDTO getVeiculo(
            @PathVariable String marca,
            @PathVariable String modelo,
            @PathVariable String ano
    );
}
