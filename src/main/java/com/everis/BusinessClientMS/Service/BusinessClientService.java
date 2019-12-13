package com.everis.BusinessClientMS.Service;

import com.everis.BusinessClientMS.Model.BusinessClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BusinessClientService
{
    //Create Client
    public Mono<BusinessClient> addClient(BusinessClient client);
    
    //Delete Client
    public Mono<Void> delClient(BusinessClient client);

    //Get All Client
    public Flux<BusinessClient> findAllClients();    
}