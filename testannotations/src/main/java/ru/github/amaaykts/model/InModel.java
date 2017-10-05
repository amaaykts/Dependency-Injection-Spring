package ru.github.amaaykts.model;

import javax.annotation.PostConstruct;

public class InModel {
    private String name;

    public InModel() {
        System.out.println();
        System.out.println("----------InModel constructor----------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("InModel.setName xml beans");

        this.name = name;
    }

    @PostConstruct
    public void init() {
        System.out.println("Init");
    }

}
