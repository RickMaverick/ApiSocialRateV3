package com.example.ApiSocialRateV3.model;

import com.example.ApiSocialRateV3.controller.dto.InfluencerDTO;
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

    public Influencer (InfluencerDTO influencerDTO){
        this.nome = influencerDTO.getNome();
        this.areaAtuacao = influencerDTO.getAreaAtuacao();
        this.faixaEtariaPublico = influencerDTO.getFaixaEtariaPublico();
        this.generoPublico = influencerDTO.getGeneroPublico();
        this.alcanceInfluencer = influencerDTO.getAlcanceInfluencer();
        this.generoInfluencer = influencerDTO.getGeneroInfluencer();
    }
}
