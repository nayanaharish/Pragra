package com.example.demo;

public class Employee <T,R, S ,K>{

  private   T id;
    private R name;
    private S address;
    private K mob;

    public Employee(T id, R name ,S address ,K mob) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mob = mob;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public R getName() {
        return name;
    }

    public void setName(R name) {
        this.name = name;
    }

}
