package com.everis.BusinessClientMS.Repository;

import com.everis.BusinessClientMS.Model.BusinessClient;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;



public interface BusinessClientRepo extends ReactiveMongoRepository<BusinessClient, String>
{
    
}