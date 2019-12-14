package com.everis.BusinessClientMS.Controller;

import com.everis.BusinessClientMS.Model.BusinessClient;
import com.everis.BusinessClientMS.Service.Impl.BusinessClientServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class BusinessClientController
{
    @Autowired
    private BusinessClientServiceImpl service;

    //Save client on db
    @PostMapping("/clients/create")
    public Mono<BusinessClient> addClient(BusinessClient client)
    {
        return service.addClient(client);
    }
    
    //Get All Clients
    @GetMapping("/clients/all")
    public Flux<BusinessClient> getAllClients()
    {
        return service.findAllClients();
    }


}