package com.example.ApiSocialRateV3.controller.dto;

import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class EmpresaDTO {
    @NonNull
    private String nome;
    @NonNull
    private String email;
    @NonNull
    private String nicho;
}
