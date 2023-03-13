package com.sic.marsroverapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/")
    public String Home() {
        return "HI HEllo se kuch nahi hoga!";
    }
}
