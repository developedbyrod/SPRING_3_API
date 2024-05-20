package com.example.spring_api.services;

import com.example.spring_api.models.PersonModel;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;


@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public PersonModel findById(String Id){
        logger.info("Findding one person.");
        PersonModel personModel = new PersonModel();
        personModel.setId(counter.incrementAndGet());
        personModel.setFirstName("One");
        personModel.setLastName("Person");
        personModel.setAddress("Some address");
        personModel.setGender("Male");
        return personModel;
    }


}
