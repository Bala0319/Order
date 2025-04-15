package com.example.Service3.DTO3;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dto3 {
    @Id
    private int id;

    private String value;

    private String number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Dto3() {
    }
    public Dto3(int id, String value, String number) {
        super();
        this.id = id;
        this.value = value;
        this.number = number;
    }

    @Override
    public String toString() {
        return "{"
                + "\"id\":\"" + id + "\","
                + "\"value\":\"" + value + "\","
                + "\"number\":\"" + number + "\""
                + "}";
    }



}
