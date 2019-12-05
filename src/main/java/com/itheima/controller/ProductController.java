package com.itheima.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    //表示当前有方法都需要ROLE_ADMIN或者ROLE_PRODUCT才能访问
    //@RolesAllowed({"ROLE_ADMIN","ROLE_PRODUCT"})                 //JSR-250注解
    //@PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_PRODUCT')")     //spring表达式注解
    @Secured({"ROLE_ADMIN","ROLE_PRODUCT"})                      //SpringSecurity注解
    @RequestMapping("/findAll")
    public String findAll(){
        return "product-list";
    }
}
