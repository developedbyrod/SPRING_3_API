package com.example.spring_api.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class PersonModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long Id;
    private String firstName;
    private String LastName;
    private String address;
    private String gender;

    public void Person(){

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonModel that = (PersonModel) o;
        return Objects.equals(Id, that.Id) && Objects.equals(firstName, that.firstName) && Objects.equals(LastName, that.LastName) && Objects.equals(address, that.address) && Objects.equals(gender, that.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, firstName, LastName, address, gender);
    }
}
