package com.danigri.dockerspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/message")
    public String getMessage() {
        return "Hello world!!!";
    }

}
