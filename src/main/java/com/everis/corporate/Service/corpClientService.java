package com.everis.corporate.Service;

import com.everis.corporate.Model.CorpClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CorpClientService
{
    public Flux<CorpClient> findAll();

    public Mono<CorpClient> findByRUC(String ruc);

    public Mono<CorpClient> addCorpClient(CorpClient client);
}