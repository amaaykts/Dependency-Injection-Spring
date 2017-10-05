package ru.github.amaaykts;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws BeansException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    }
}
