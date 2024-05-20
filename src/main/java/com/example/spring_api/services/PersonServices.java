package com.example.spring_api.services;

import com.example.spring_api.models.PersonModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;


@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public PersonModel findById(String Id){
        logger.info("Finding one person.");
        PersonModel personModel = new PersonModel();
        personModel.setId(counter.incrementAndGet());
        personModel.setFirstName("One");
        personModel.setLastName("Person");
        personModel.setAddress("Some address");
        personModel.setGender("Male");
        return personModel;
    }

    public List<PersonModel> findAll(){
        logger.info("Finding all people.");
        List<PersonModel> persons = new ArrayList<PersonModel>();
        for(int i = 0; i < 8; i++){
            PersonModel person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    private PersonModel mockPerson(int i) {
        PersonModel person = new PersonModel();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person" + i);
        person.setLastName("LastName" + i);
        person.setAddress("Some address" + i);
        person.setGender("Gender: " + i);
        return person;
    }


}
