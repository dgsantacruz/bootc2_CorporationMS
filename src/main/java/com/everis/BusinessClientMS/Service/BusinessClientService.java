package com.everis.BusinessClientMS.Service;

import com.everis.BusinessClientMS.Model.BusinessClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BusinessClientService
{
    public Flux<BusinessClient> findAllClients();

    public Mono<BusinessClient> addClient(BusinessClient client);
}