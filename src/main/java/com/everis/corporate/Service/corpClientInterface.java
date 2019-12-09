package com.everis.corporate.Service;

import com.everis.corporate.Model.corpClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface corpClientInterface
{
    public Flux<corpClient> findAll();

    public Mono<corpClient> findByRUC(String ruc);

    public Mono<corpClient> addCorpClient(corpClient client);
}