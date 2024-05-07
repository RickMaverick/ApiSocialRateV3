package com.example.ApiSocialRateV3.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class ModeloML implements Serializable {
    private String nicho;
    private String publicoAlvoCampanha;
    private String generoAlvoCampanha;
    private String interessesDoPublico;
    private String canalDaCampanha;
    private String alcanceDaCampanha;

    //Construtor Vazio
    public ModeloML() {
        // Construtor vazio
    }
}