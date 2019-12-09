package com.everis.corporate.Controller;

import com.everis.corporate.Service.corpClientService;
import com.everis.corporate.Model.corpClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class corpClientController
{
    //@Autowired
    private corpClientService service;
    
    //Get All Clients
    @GetMapping("/clients/all")
    public Flux<corpClient> getAllClients()
    {
        return service.findAll();
    }

    //Get client by Ruc
    public Mono<corpClient> getClientByRuc(String ruc)
    {
        return service.findByRUC(ruc);
    }

    //Save client on db
    public Mono<corpClient> addClient(corpClient client)
    {
        return service.addCorpClient(client);
    }
}