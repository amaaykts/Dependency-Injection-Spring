package ru.github.amaaykts.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("TestBeanPostProcessor.postProcessBeforeInitialization " + o.getClass().toString());
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("TestBeanPostProcessor.postProcessAfterInitialization " + o.getClass().toString());
        return o;
    }
}
