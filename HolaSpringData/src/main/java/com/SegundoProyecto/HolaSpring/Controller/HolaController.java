package com.SegundoProyecto.HolaSpring.Controller;

import com.SegundoProyecto.HolaSpring.Model.Persona;
import com.SegundoProyecto.HolaSpring.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


// En lugar de Controlador REST, lo convertimos a controlador mvc
@Controller
public class HolaController {
    
    // Spring Data 7: Importamos el repositorio y lo injectamos con @Autowired
    @Autowired
    private PersonaRepository repositorio;
    
    
    
    // Spring Data 8: Creamos funcion para recuperar todas las personas
    @GetMapping("/personas")
    @ResponseBody
    public String getPersonas(Model model) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Pérez");
        persona.setTelefono("12345678");
        repositorio.save(persona);
        
        var personas = repositorio.findAll();
        
        model.addAttribute("personas" ,personas);
        
        System.out.println(personas);
        return "templates/index";
    }
}
