package com.everis.corporate.Service.Impl;

import com.everis.corporate.Model.CorpClient;
import com.everis.corporate.Repository.CorpClientRepo;
import com.everis.corporate.Service.CorpClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CorpClientServiceImpl implements CorpClientService {

    @Autowired
    private CorpClientRepo repo;

    @Override
    public Flux<CorpClient> findAll() 
    {
        return repo.findAll();
    }

    @Override
    public Mono<CorpClient> findByRUC(String ruc) 
    {
        return repo.findByRUC(ruc);
    }

    @Override
    public Mono<CorpClient> addCorpClient(CorpClient client)
    {
        return repo.save(client);
    }
}