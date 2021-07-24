package com.aoe2.service.aoe2be;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Aoe2Controller {
    @GetMapping(path="/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping(path="/hello-world/path-var/{name}")
    public String helloPathVar(@PathVariable String name) {
        return String.format("Say hello to the world, %s", name);
    }
}
