package com.example.ApiSocialRateV3.controller;

import com.example.ApiSocialRateV3.controller.dto.InfluencerDTO;
import com.example.ApiSocialRateV3.model.Influencer;
import com.example.ApiSocialRateV3.service.InfluencerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/influencers")
public class InfluencerController {
    @Autowired
    private InfluencerService influencerService;

    @PostMapping
    public ResponseEntity<Influencer> postInfluencer(@RequestBody InfluencerDTO influencerDTO){
        return ResponseEntity.ok(influencerService.cadastrarInfluencer(influencerDTO));
    }
}
