package com.learningHibernateSpringBoot.Generics;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class AspectTest {

    private static final Logger log = LoggerFactory.getLogger(AspectTest.class);

    @Pointcut("execution(* Generics.Services.UserService.save(..))")
    public void loggingPointCut(){}

    @Before("loggingPointCut()")
    public void before(JoinPoint joinPoint){
        log.info("Before method excute"+joinPoint.getSignature());
    }

    @After("loggingPointCut()")
    public void after(JoinPoint joinPoint){
        log.info("After method excute"+joinPoint.getSignature());
}
}