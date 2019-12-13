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

    @Override
    public Flux<BusinessClient> findAllClients() 
    {
        return repo.findAll();
    }

    @Override
    public Mono<BusinessClient> addClient(BusinessClient client)
    {
        return repo.save(client);
    }
}