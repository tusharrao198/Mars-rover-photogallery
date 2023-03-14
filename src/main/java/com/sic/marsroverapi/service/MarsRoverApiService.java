package com.sic.marsroverapi.service;

import com.sic.marsroverapi.response.MarsRoverApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarsRoverApiService {

    public MarsRoverApiResponse getResponseData() {
        RestTemplate rt = new RestTemplate();
        String url = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=10&api_key=RtPQmCvks2TEcaAdMOaeHLWJUfJDMQh2fKW5LVjQ";
        ResponseEntity<MarsRoverApiResponse> response =  rt.getForEntity(url , MarsRoverApiResponse.class);
        return response.getBody();
    }
}
