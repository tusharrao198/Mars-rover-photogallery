package com.sic.marsroverapi;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class MarsRoverApiTest {

    @Test
    public void smallTest() {
        RestTemplate rt = new RestTemplate();
//        String url = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=10&api_key=RtPQmCvks2TEcaAdMOaeHLWJUfJDMQh2fKW5LVjQ";
        ResponseEntity<String> response =  rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=10&api_key=RtPQmCvks2TEcaAdMOaeHLWJUfJDMQh2fKW5LVjQ" , String.class);
        System.out.println(response.getBody());
    }

}
