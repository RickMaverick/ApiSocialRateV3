package com.example.ApiSocialRateV3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Influencer {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String areaAtuacao;
    private String faixaEtariaPublico;
    private String generoPublico;
    private int alcanceInfluencer;
    private String generoInfluencer;
}
