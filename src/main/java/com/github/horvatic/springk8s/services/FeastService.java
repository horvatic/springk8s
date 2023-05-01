package com.github.horvatic.springk8s.services;

import org.springframework.stereotype.Service;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class FeastService implements IFeastService {

    private final WebClient webClient;

    public FeastService() {
        this.webClient = WebClient.builder().baseUrl("http://192.168.0.101:6566")
        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE)
        .build();
    }

    public Mono<String> getFeatures() {
        return webClient.post()
            .uri("/get-online-features")
            .bodyValue("{\"features\": [ \"driver_hourly_stats:conv_rate\", \"driver_hourly_stats:acc_rate\", \"driver_hourly_stats:avg_daily_trips\" ], \"entities\": { \"driver_id\": [ 1001, 1002, 1003]}}")
            .retrieve()
            .bodyToMono(String.class);
    }
}

