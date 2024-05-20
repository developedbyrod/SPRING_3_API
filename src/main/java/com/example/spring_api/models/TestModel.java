package com.example.spring_api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_TEST")

public class TestModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final long id;
    private final String name;

    public TestModel(long id, String name) {

        this.id = id;
        this.name = name;
    }
}
