package com.everis.corporate.Service;

import com.everis.corporate.Model.corpClient;
import com.everis.corporate.Repository.corpClientRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class corpClientService implements corpClientInterface {

    @Autowired
    private corpClientRepo repo;

    @Override
    public Flux<corpClient> findAll() 
    {
        return repo.findAll();
    }

    @Override
    public Mono<corpClient> findByRUC(String ruc) 
    {
        return repo.findByRUC(ruc);
    }

    @Override
    public Mono<corpClient> addCorpClient(corpClient client)
    {
        return repo.save(client);
    }
}