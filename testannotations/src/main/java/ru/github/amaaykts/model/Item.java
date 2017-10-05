package ru.github.amaaykts.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class Item {
    private String name;
    private InModel inModel;
    private InModel inModel2;

    public Item() {
        System.out.println();
        System.out.println("--------Item constructor--------");
        System.out.println(inModel);

    }

    public InModel getInModel() {
        return inModel;
    }

    @Autowired
    public void setInModel2(InModel inModel2){
        System.out.println("Item.setInModel2 autowired");
        this.inModel = inModel;
    }

    @Autowired
    public void setInModel(InModel inModel) {
        System.out.println("Item.setInModel autowired");
        this.inModel = inModel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Item.setName xml beans");
        this.name = name;
    }

    @PostConstruct
    public void init() {
        System.out.println(inModel);
        System.out.println("Init");
    }
}
