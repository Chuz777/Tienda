/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controllers;

import com.tienda.entities.Persona;
import com.tienda.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/persoans")
public class PersonaController {
    
    @Autowired
    private PersonaService personaService;
    
    @GetMapping
    public String listarPersonas(Model model){
    
        model.addAtribute("personas", personaService.listarTodas());
        return "test";
    }
    
    @GetMapping("/")
    public String mostrarPaginaInicio(){
        return "index";
    }
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaPersona(Model model) {
        model.addAtribute("persona", new Persona());
        return "persona-form";
    }
    
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarPersona(@PathVariable Long id, Model model) {
        model.addAtribute("persona", personaService.obtenerPorId(id));
        return "persona-form";
    }
    @GetMapping("/eliminar/{id}")
    public String mostrarFormularioEditarPersona(@PathVariable Long id) {
       personaService.eliminar(id));
        return "redirect:/personas";
    }
    
    
    
}
