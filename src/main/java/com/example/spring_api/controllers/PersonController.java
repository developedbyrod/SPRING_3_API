package com.example.spring_api.controllers;

import com.example.spring_api.models.PersonModel;
import com.example.spring_api.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")

public class PersonController {

    @Autowired
    private PersonServices personServices;

    @RequestMapping(value = "/{Id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonModel findById(@PathVariable(value = "Id") String Id) throws Exception{
       if(Id == null){
           throw new Exception("Id is null");
       }
       return personServices.findById(Id);
    }

}
