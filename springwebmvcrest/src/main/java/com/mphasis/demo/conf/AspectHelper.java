package com.mphasis.demo.conf;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectHelper {
	
@Before("execution(* com.mphasis.demo.*.*.*(..))")
public void beforeMethod(JoinPoint joinPoint) {
	System.out.println("Aspect called");
	System.out.println(joinPoint.getSignature().getName());
	System.out.println(Arrays.toString(joinPoint.getArgs()));
	}
	
	@After("execution(* com.mphasis.demo.*.*.*(..))")
	public void afterMethod(JoinPoint joinPoint) {
		System.out.println("Aspect called after");
		System.out.println(joinPoint.getSignature().getName());
	}

}
