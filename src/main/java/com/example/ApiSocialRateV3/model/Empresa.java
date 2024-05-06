package com.example.ApiSocialRateV3.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Empresa {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String nicho;
    @Nullable
    private List<Campanha> campanhas;
}
