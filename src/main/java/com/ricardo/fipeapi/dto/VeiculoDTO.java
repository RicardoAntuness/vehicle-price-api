package com.ricardo.fipeapi.dto;

import lombok.Data;

@Data
public class VeiculoDTO {

    private String Valor;
    private String Marca;
    private String Modelo;
    private Integer AnoModelo;
    private String Combustivel;
    private String CodigoFipe;
    private String MesReferencia;
}
