package com.example.ApiSocialRateV3.controller;

import com.example.ApiSocialRateV3.model.ModeloML;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

@RestController
@RequestMapping("/decision")
public class ModeloMLController {

    private ModeloML modelo;

    @GetMapping("/carregar-modelo")
    public String carregarModelo() {
        try {
            // Carregar o arquivo do modelo
            ClassPathResource resource = new ClassPathResource("modeloML/modelo_salvo.pkl");

            // Ler o modelo do arquivo
            InputStream inputStream = resource.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            modelo = (ModeloML) objectInputStream.readObject();
            objectInputStream.close();

            return "Modelo carregado com sucesso!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao carregar o modelo: " + e.getMessage();
        }
    }
}