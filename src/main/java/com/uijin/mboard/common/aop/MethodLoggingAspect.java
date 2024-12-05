package com.uijin.mboard.common.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

@Slf4j
public class MethodLoggingAspect {

  @Before("execution(* com.uijin..*(..))")
  public void logMethodCall(JoinPoint joinPoint) {
    String methodName = joinPoint.getSignature().getName();

    Object[] args = joinPoint.getArgs();

    log.info("Called method: {} with arguments: {}", methodName, Arrays.toString(args));
  }
}
