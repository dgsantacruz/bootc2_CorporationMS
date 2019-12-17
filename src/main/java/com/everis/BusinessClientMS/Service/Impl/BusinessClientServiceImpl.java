package com.everis.BusinessClientMS.Service.Impl;

import com.everis.BusinessClientMS.Model.BusinessClient;
import com.everis.BusinessClientMS.Repository.BusinessClientRepo;
import com.everis.BusinessClientMS.Service.BusinessClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BusinessClientServiceImpl implements BusinessClientService {

    @Autowired
    private BusinessClientRepo repo;

    //Get All Clients
    @Override
    public Flux<BusinessClient> findAllClients() 
    {
        return repo.findAll();
    }

    //Get client by BusinessName
    @Override
    public Mono<BusinessClient> findClientByBusinessName(String name) {
        return repo.findByBusinessName(name);
    }

    //Get client by Ruc
    @Override
    public Mono<BusinessClient> findClientByRuc(String ruc) {
        return repo.findByRuc(ruc);
    }

    //Get client by Phone
    @Override
    public Mono<BusinessClient> findClientByPhone(String phone) {
        return repo.findByPhone(phone);
    }

    //Create Client
    @Override
    public Mono<BusinessClient> addClient(BusinessClient client)
    {
        return repo.save(client);
    }

    //Delete Client
    @Override
    public Mono<Void> delClient(BusinessClient client)
    {
        return repo.delete(client);
    }
}