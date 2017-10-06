package ru.github.amaaykts.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.Random;

public class PhoneBean {
    private String index;
    private String number;

    public PhoneBean() {
        System.out.println("PhoneBean()" + this);
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        System.out.println("PhoneBean() setIndex");
        this.index = index;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        System.out.println("PhoneBean() setNumber");
        this.number = number;
    }

    @Bean(name = "getSingletonPhone")
    @Scope(value = "singleton")
    public Phone getSingletonPhone() {
        Phone phone = new Phone();
        phone.setNumber("" + new Random().nextInt(500));
        System.out.println("getSingletonPhone " + phone);
        return phone;
    }

    @Bean
    @Scope(value = "prototype")
    public Phone getPrototypePhone() {
        Phone phone = new Phone();
        phone.setNumber("" + new Random().nextInt(500));
        System.out.println("getPrototypePhone " + phone);
        return phone;
    }
}
