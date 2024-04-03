package com.learn.learning;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class FirstController {
    @GetMapping("/")
    public String Home() {
        return "Home";
    }

    @PostMapping("/post-order")
    public String Post(@RequestBody Order order) {
        return "Requested accepted and Order is :" + " " + order;
    }

    @PostMapping("/post-order-record")
    public String PostRecord(@RequestBody OrderRecord order) {
        return "Requested accepted and Order is :" + " " + order;
    }

    @GetMapping("/hello/{user-name}")
    public String sayHello(
            @PathVariable("user-name") String userName) {
        return userName;
    }

}
