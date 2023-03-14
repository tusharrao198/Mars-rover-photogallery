package com.sic.marsroverapi.web;

import com.sic.marsroverapi.response.MarsRoverApiResponse;
import com.sic.marsroverapi.service.MarsRoverApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {

    @Autowired
    private MarsRoverApiService roverService;
    @GetMapping("/")
    public String getHomeView(ModelMap model) {
        MarsRoverApiResponse roverData = roverService.getResponseData();
        model.put("roverData", roverData);
        return "home";
    }
}
