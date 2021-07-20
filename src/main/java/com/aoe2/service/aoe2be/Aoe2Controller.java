package com.aoe2.service.aoe2be;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Aoe2Controller {
    @GetMapping(path="/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
}
