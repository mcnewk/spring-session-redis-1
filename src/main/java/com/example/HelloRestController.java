package com.example;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@RestController
public class HelloRestController {

    @GetMapping("/greeting")
    Greeting greeting(HttpSession session) {
        Greeting greeting = (Greeting) session.getAttribute("greeting");

        if (greeting == null) {

            greeting = new Greeting(UUID.randomUUID(), RandomStringUtils.random(20, true, true));
            System.out.println("No Session found, so creating:" + greeting.toString());
            session.setAttribute("greeting", greeting);
        }
        session.setAttribute("greeting", greeting);

        return greeting;
    }
}
