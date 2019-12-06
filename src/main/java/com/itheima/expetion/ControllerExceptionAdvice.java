package com.itheima.expetion;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 这种方式无法处理404异常
 */
@ControllerAdvice
public class ControllerExceptionAdvice {
    //只有出现AccessDeniedException异常才调转403.jsp页面
    @ExceptionHandler(AccessDeniedException.class)
    public String exceptionAdvice() {
        System.out.println("出现403");
        return "redirect:/403.jsp";
    }

    @ExceptionHandler(RuntimeException.class)
        public String runtimeExceptionAdvice() {
        System.out.println("出现500");
        return "redirect:/500.jsp";
    }



}