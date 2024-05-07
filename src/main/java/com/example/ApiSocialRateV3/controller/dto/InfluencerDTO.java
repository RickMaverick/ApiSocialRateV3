package com.example.ApiSocialRateV3.controller.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class InfluencerDTO {
    @NonNull
    private String nome;
    @NonNull
    private String areaAtuacao;
    @NonNull
    private String faixaEtariaPublico;
    @NonNull
    private String generoPublico;
    @NonNull
    private int alcanceInfluencer;
    @NonNull
    private String generoInfluencer;
}
