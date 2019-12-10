package com.everis.corporate.Repository;

import com.everis.corporate.Model.CorpClient;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Mono;

public interface CorpClientRepo extends ReactiveMongoRepository<CorpClient, String>
{
    public Mono<CorpClient> findByRUC(String ruc);
}