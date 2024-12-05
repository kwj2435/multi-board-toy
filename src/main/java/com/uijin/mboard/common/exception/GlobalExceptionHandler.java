//package com.uijin.mboard.common.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RestControllerAdvice
//public class GlobalExceptionHandler {
//  // CustomException 처리
//  @ExceptionHandler(CommonApiException.class)
//  public ResponseEntity<Object> handleCustomException(CommonApiException ex) {
//    Map<String, Object> errorResponse = new HashMap<>();
//    errorResponse.put("errorCode", ex.getErrorCode().getCode());
//    errorResponse.put("errorMessage", ex.getErrorCode().getMessage());
//
//    return new ResponseEntity<>(errorResponse, ex.getHttpStatus());
//  }
//
//  // 일반적인 Exception 처리 (모든 예외를 포괄적으로 처리)
//  @ExceptionHandler(Exception.class)
//  public ResponseEntity<Object> handleGenericException(Exception ex) {
//    Map<String, Object> errorResponse = new HashMap<>();
//    errorResponse.put("errorMessage", "An unexpected error occurred.");
//
//    // 디버깅 정보를 추가하고 싶다면 로그에 기록
//    ex.printStackTrace(); // 실제로는 Logger 사용 권장
//    return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
//  }
//}
