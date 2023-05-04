//// Ejercicio Resturante 5: Creamos servicio que implemente IPlatoService

package com.SegundoProyecto.HolaSpring.Service;

import org.springframework.stereotype.Service;

import com.SegundoProyecto.HolaSpring.Model.Persona;
import com.SegundoProyecto.HolaSpring.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PersonaService implements IPersonaService {
    
    
//// Ejercicio Resturante 6: Importamos repositorio
    @Autowired
    private PersonaRepository repo;
    
    
    // Metodo para recuperar toda la lista de platos
    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPlatos = repo.findAll();
        
        return listaPlatos;
    }
    
    // Metodo para guardar un nuevo plato
    @Override
    public void agregarPersona(Persona persona) {
        repo.save(persona);
    }

    @Override
    public void eliminarPersona(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Persona verPersona(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
}
