package com.everis.corporate.Controller;

import com.everis.corporate.Service.Impl.CorpClientServiceImpl;
import com.everis.corporate.Model.CorpClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CorpClientController
{
    @Autowired
    private CorpClientServiceImpl service;
    
    //Get All Clients
    @GetMapping("/clients/all")
    public Flux<CorpClient> getAllClients()
    {
        return service.findAll();
    }

    //Get client by Ruc
    public Mono<CorpClient> getClientByRuc(String ruc)
    {
        return service.findByRUC(ruc);
    }

    //Save client on db
    public Mono<CorpClient> addClient(CorpClient client)
    {
        return service.addCorpClient(client);
    }
}