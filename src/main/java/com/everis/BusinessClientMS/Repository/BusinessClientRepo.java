package com.everis.BusinessClientMS.Repository;

import com.everis.BusinessClientMS.Model.BusinessClient;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Mono;

public interface BusinessClientRepo extends ReactiveMongoRepository<BusinessClient, String>
{
    //Name must match attributes in model file. (ie -> name throws error, must match "businessName")
    Mono<BusinessClient> findByBusinessName(String name);

    Mono<BusinessClient> findByRuc(String ruc);

    Mono<BusinessClient> findByPhone(String phone);
}