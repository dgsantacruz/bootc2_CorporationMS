package com.everis.BusinessClientMS.Repository;

import com.everis.BusinessClientMS.Model.BusinessClient;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Flux;

public interface BusinessClientRepo extends ReactiveMongoRepository<BusinessClient, String>
{
    Flux<BusinessClient> findByName(String name);
}