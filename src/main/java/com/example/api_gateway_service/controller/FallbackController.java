package com.example.api_gateway_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("Server is temporarily unavailable, Please try again later");
    }
}
