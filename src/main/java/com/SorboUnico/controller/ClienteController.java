
package com.SorboUnico.controller;

import com.SorboUnico.domain.ClienteV;
import com.SorboUnico.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/cliente/listado")
    public String inicio(Model model){
        
        var clientes = clienteService.getClientes();
        model.addAttribute("clientes",clientes);
        
        var compraTotal=0;
        for (var c: clientes) {
            compraTotal+=c.getComprado();
        }
        model.addAttribute("compraTotal",compraTotal);
        model.addAttribute("totalClientes",clientes.size());
        
        model.addAttribute("clientes",clientes);
        return "/cliente/listado";
        
    }
    
    @GetMapping("/cliente/nuevo")
    public String nuevoCliente(ClienteV cliente){
        
        return"/cliente/nuevo";
    }
    
    @PostMapping("/cliente/guardar")
    public String guardarCliente(ClienteV cliente){
        
        clienteService.save(cliente);
        return"redirect:/cliente/listado";
    }
    
    @GetMapping("/cliente/modificar/{idCliente}")
    public String modificarCliente(ClienteV cliente, Model model){
        
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente",cliente);
        return"/cliente/modificar";
    }
    
    @GetMapping("/cliente/eliminar/{idCliente}")
    public String eliminarCliente(ClienteV cliente){
        
        clienteService.delete(cliente);
        return"redirect:/cliente/listado";
    }
}
