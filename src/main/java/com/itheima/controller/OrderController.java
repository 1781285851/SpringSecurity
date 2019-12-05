package com.itheima.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
//表示当前类所有方法都需要ROLE_ADMIN或者ROLE_ORDER才能访问
//@RolesAllowed({"ROLE_ADMIN","ROLE_ORDER"})                 //JSR-250注解
@PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_ORDER')")     //spring表达式注解
//@Secured({"ROLE_ADMIN","ROLE_ORDER"})                      //SpringSecurity注解
public class OrderController {
    @RequestMapping("/findAll")
    public String findAll(){
        return "order-list";
    }
}
