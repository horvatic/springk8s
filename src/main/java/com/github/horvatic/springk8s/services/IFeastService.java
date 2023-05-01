package com.github.horvatic.springk8s.services;

import reactor.core.publisher.Mono;

public interface IFeastService {
    Mono<String> getFeatures();
}