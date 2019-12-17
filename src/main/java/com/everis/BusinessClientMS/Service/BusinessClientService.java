package com.everis.BusinessClientMS.Service;

import com.everis.BusinessClientMS.Model.BusinessClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BusinessClientService
{
    //Get All Client
    public Flux<BusinessClient> findAllClients(); 
    
    //Get client by BusinessName
    public Mono<BusinessClient> findClientByBusinessName(String name); 
        
    //Get client by Ruc
    public Mono<BusinessClient> findClientByRuc(String ruc);

    //Get client by Phone
    public Mono<BusinessClient> findClientByPhone(String phone);

    //Create client data
    public Mono<BusinessClient> addClient(BusinessClient client);
    
    //Delete client data
    public Mono<Void> delClient(BusinessClient cliente);
 
}