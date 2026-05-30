package com.ricardo.fipeapi.service;

import com.ricardo.fipeapi.client.FipeClient;
import com.ricardo.fipeapi.dto.MarcaDTO;
import com.ricardo.fipeapi.dto.VeiculoDTO;
import com.ricardo.fipeapi.entity.HistoricoConsulta;
import com.ricardo.fipeapi.repository.HistoricoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class FipeService {

    private final FipeClient fipeClient;
    private final HistoricoRepository historicoRepository;

    public List<MarcaDTO> buscarMarcas() {
        log.info("Buscando marcas na FIPE");
        return fipeClient.getMarcas();
    }

    public VeiculoDTO buscarVeiculo(String marca, String modelo, String ano) {

        VeiculoDTO veiculo = fipeClient.getVeiculo(marca, modelo, ano);

        HistoricoConsulta historico = HistoricoConsulta.builder()
                .marca(veiculo.getMarca())
                .modelo(veiculo.getModelo())
                .ano(veiculo.getAnoModelo())
                .valor(veiculo.getValor())
                .dataConsulta(LocalDateTime.now())
                .build();

        historicoRepository.save(historico);

        log.info("Consulta salva com sucesso");

        return veiculo;
    }
}
