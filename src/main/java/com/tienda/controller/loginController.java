package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author caleb
 */
@Controller
public class loginController {
    
    @GetMapping("/")
    public String index(){
        return "login";
    }
}
