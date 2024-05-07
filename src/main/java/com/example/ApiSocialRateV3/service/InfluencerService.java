package com.example.ApiSocialRateV3.service;

import com.example.ApiSocialRateV3.controller.dto.InfluencerDTO;
import com.example.ApiSocialRateV3.model.Influencer;
import com.example.ApiSocialRateV3.repository.InfluencerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfluencerService {
    @Autowired
    private InfluencerRepository influencerRepository;

    public Influencer cadastrarInfluencer(InfluencerDTO influencerDTO){
        Influencer newInfluencer = new Influencer(influencerDTO);
        return influencerRepository.save(newInfluencer);
    }
}
