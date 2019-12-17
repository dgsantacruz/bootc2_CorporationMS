package com.everis.BusinessClientMS.Controller;

import com.everis.BusinessClientMS.Model.BusinessClient;
import com.everis.BusinessClientMS.Service.BusinessClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//NOTES:
//You will get error if 2 mappings are matching or if the machine cant identify how to act in a ambiguos situation

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
    @GetMapping("/ruc/{ruc}")
    public Mono<BusinessClient> getClientByRuc(@PathVariable String ruc)
    {
        return service.findClientByRuc(ruc);
    }

    //Get client by Name
    @GetMapping("/name/{name}")
    public Mono<BusinessClient> getClientByName(@PathVariable String name)
    {
        return service.findClientByBusinessName(name);
    }

    //Get client by Phone
    @GetMapping("/phone/{phone}")
    public Mono<BusinessClient> getClientByPhone(@PathVariable String phone)
    {
        return service.findClientByPhone(phone);
    }

    //Create client on db
    @PostMapping
    public Mono<BusinessClient> addClient(@RequestBody BusinessClient client)
    {        
        return service.addClient(client);
    }

    //Update client data on db
    @PutMapping("/edit/{ruc}")
    public Mono<BusinessClient> editClient(@RequestBody BusinessClient client, @PathVariable String ruc)
    {        
        return service.findClientByRuc(ruc)
                .flatMap(c -> 
                {
                    c.setRuc(client.getRuc());
                    c.setBusinessName(client.getBusinessName());
                    c.setPhone(client.getPhone());
                    c.setAddress(client.getAddress());
                    //Important to note: when using brackets on a lambda function, it need to return something.
                    return service.addClient(c);
                });
    }

    //Delete client data on db
    @DeleteMapping("/delete/{ruc}")
    public Mono<Void> deleteClientByRuc(@PathVariable String ruc)
    {        
        return service.findClientByRuc(ruc)
                        .flatMap(c -> service.delClient(c));   
    }
}