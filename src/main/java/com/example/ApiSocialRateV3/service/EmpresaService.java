package com.example.ApiSocialRateV3.service;

import com.example.ApiSocialRateV3.controller.dto.EmpresaDTO;
import com.example.ApiSocialRateV3.model.Empresa;
import com.example.ApiSocialRateV3.repository.EmpresaRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    public Empresa cadastrarEmpresa(@NonNull EmpresaDTO empresaDTO){
        Empresa empresa = new Empresa(empresaDTO);
        return empresaRepository.save(empresa);
    }

    public void deletarEmpresaPorId(Long id){
        empresaRepository.deleteById(id);
    }
}
