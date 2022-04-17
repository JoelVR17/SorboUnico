package com.SorboUnico.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MenuController {
    
    @GetMapping("/Perfil")
    public String perfil(){
        
        log.info("Estamos usando Spring");
        return "Perfil";
        
    }
    
    @GetMapping("/Menu")
    public String menu(){
        
        log.info("Estamos usando Spring");
        return "Menu";
        
    }
    
    @GetMapping("/Reserva")
    public String reserva(){
        
        log.info("Estamos usando Spring");
        return "Reserva";
        
    }
    
    @GetMapping("/Contacto")
    public String contacto(){
        
        log.info("Estamos usando Spring");
        return "Contacto";
        
    }
    
    @GetMapping("/Nosotros")
    public String nosotros(){
        
        log.info("Estamos usando Spring");
        return "Nosotros";
        
    }
}
