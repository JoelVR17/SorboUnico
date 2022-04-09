package com.SorboUnico.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class LogController {
    
    @GetMapping("/")
    public String inicio(){
        
        return "Login";
        
    }
    
    @GetMapping("/Registro")
    public String registro(){
        
        return "Registro";
    }
    
    @GetMapping("/log")
    public String inicioSesion(){
        
        return "Login";
    }
    
    @GetMapping("/logOut")
    public String logOut(){
        
        return "Login";
    }
    
}
