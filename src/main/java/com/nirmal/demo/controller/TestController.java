package com.nirmal.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/home")
    public String home(){
        return """
                This is a home page.
                <form action = "/logout" method="post">
                <button type="submit">Logout</button> </form>
                """;
    }

    @GetMapping("/admin")
    public String admin(){
        return "This is admin page";
    }
}
