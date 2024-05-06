package com.example.ApiSocialRateV3.controller;

import com.example.ApiSocialRateV3.controller.dto.EmpresaDTO;
import com.example.ApiSocialRateV3.model.Empresa;
import com.example.ApiSocialRateV3.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;

    @PostMapping
    public ResponseEntity<Empresa> postEmpresa(@RequestBody EmpresaDTO empresaDTO){
        return ResponseEntity.ok(empresaService.cadastrarEmpresa(empresaDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpresa(@PathVariable Long id){
        empresaService.deletarEmpresaPorId(id);
        return ResponseEntity.noContent().build();
    }
}
