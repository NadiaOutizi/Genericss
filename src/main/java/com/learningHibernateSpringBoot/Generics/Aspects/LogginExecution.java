package com.learningHibernateSpringBoot.Generics.Aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginExecution {

    @Before("@annotation(testAspect)")
    public void before() {
        System.out.println("--------------------------------");
        System.out.println("Before");
        System.out.println("--------------------------------");
    }

    @After("@annotation(testAspect)")
    public void after() {
        System.out.println("--------------------------------");
        System.out.println("Before");
        System.out.println("--------------------------------");
}
}