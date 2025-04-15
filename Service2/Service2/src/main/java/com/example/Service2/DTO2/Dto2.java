package com.example.Service2.DTO2;

import jakarta.persistence.*;

@Entity
public class Dto2 {

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

}
