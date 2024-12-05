package com.uijin.mboard.common.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class GlobalMethodLoggingAop {

  @Before("execution(* com.uijin..*.*(..))")
  public void logMethodCall(JoinPoint joinPoint) {
    String fullClassName = joinPoint.getSignature().getDeclaringTypeName();
    String className = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);
    String methodName = joinPoint.getSignature().getName();
    Object[] args = joinPoint.getArgs(); // 메서드의 파라미터

    // 로깅 처리
    log.info(">>>> Call Method: {}.{} - Args: {}", className, methodName, args);
  }
}
