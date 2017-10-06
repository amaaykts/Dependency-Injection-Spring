package ru.github.amaaykts.model;

public class Phone {
    private String index;
    private String number;

    public Phone() {
        System.out.println("Phone()");
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        System.out.println("Phone() setIndex");
        this.index = index;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        System.out.println("Phone() setNumber");
        this.number = number;
    }
}
