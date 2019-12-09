package com.everis.corporate.Repository;

import com.everis.corporate.Model.corpClient;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Mono;

public interface corpClientRepo extends ReactiveMongoRepository<corpClient, String>
{
    public Mono<corpClient> findByRUC(String ruc);
}