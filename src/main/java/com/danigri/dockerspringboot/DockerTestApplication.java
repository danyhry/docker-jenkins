package com.danigri.dockerspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(DockerTestApplication.class, args);
    }

}
