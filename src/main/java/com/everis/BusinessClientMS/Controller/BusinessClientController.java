package com.everis.BusinessClientMS.Controller;

import com.everis.BusinessClientMS.Model.BusinessClient;
import com.everis.BusinessClientMS.Service.BusinessClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bclients")
public class BusinessClientController
{
    @Autowired
    public BusinessClientService service;

    //Get All Clients
    @GetMapping("/all")
    public Flux<BusinessClient> getAllClients()
    {
        return service.findAllClients();
    }

    //Get client by RUC
    @GetMapping("/{}")
    public Flux<BusinessClient> getClientByRuc()
    {
        return service.findAllClients();
    }

    // //Get client by Name
    // @GetMapping("/{}")
    // public Flux<BusinessClient> getClientByName()
    // {
    //     return service.findAllClients();
    // }

    // //Get client by Phone
    // @GetMapping("/all")
    // public Flux<BusinessClient> getClientByPhone()
    // {
    //     return service.findAllClients();
    // }

    // //Save client on db
    // @PostMapping
    // public Mono<BusinessClient> addClient(@RequestBody BusinessClient client)
    // {        
    //     return service.addClient(client);
    // }

    // //Update client data on db
    // @PutMapping
    // public Mono<BusinessClient> updateClient(@RequestBody BusinessClient client)
    // {        
    //     return null;
    // }

    // //Delete client data on db
    // @DeleteMapping
    // public Mono<BusinessClient> deleteClient(@RequestBody BusinessClient client)
    // {        
    //     return null;
    // }
}