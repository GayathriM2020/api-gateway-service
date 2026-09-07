package com.example.api_gateway_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
    /*
    // Resilience4j example (Spring Boot)
    @CircuitBreaker(name="inventory", fallbackMethod="fallback")
    @Retry(name="inventory")
    @TimeLimiter(name="inventory")
    public CompletableFuture<Inventory> getInventory(String sku) { ... }
     */
    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("Server is temporarily unavailable, Please try again later");
    }
}
