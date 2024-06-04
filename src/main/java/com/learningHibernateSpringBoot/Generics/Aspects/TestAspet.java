package com.learningHibernateSpringBoot.Generics.Aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspet {

    @Before("execution(public * com.learningHibernateSpringBoot.Generics.service..(..))")
    public void before() {
        System.out.println("--------------------------------");
        System.out.println("before");
        System.out.println("--------------------------------");
    }

    @After("execution(public * com.learningHibernateSpringBoot.Generics.services..(..))")
    public void after() {
        System.out.println("--------------------------------");
        System.out.println("after");
        System.out.println("--------------------------------");
}
}