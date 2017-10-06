package ru.github.amaaykts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.github.amaaykts.model.Phone;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("------XML Singleton Phone-----");
        System.out.println(context.getBean("phoneSingleton"));
        System.out.println(context.getBean("phoneSingleton"));

        System.out.println("------XML Prototype Phone-----");
        System.out.println(context.getBean("phonePrototype"));
        System.out.println(context.getBean("phonePrototype"));

        System.out.println("------@Bean Singleton Phone-----");
        Phone singletonPhone = (Phone) context.getBean("getSingletonPhone");
        System.out.println(singletonPhone.getNumber());
        singletonPhone = (Phone) context.getBean("getSingletonPhone");
        System.out.println(singletonPhone.getNumber());

        System.out.println("------@Bean Prototype Phone-----");
        Phone prototypePhone = (Phone) context.getBean("getPrototypePhone");
        System.out.println(prototypePhone.getNumber());
        prototypePhone = (Phone) context.getBean("getPrototypePhone");
        System.out.println(prototypePhone.getNumber());

    }
}
