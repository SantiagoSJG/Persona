// Ejercicio Resturante 3: Creamos interface IPlatosService
package com.SegundoProyecto.HolaSpring.Service;

import com.SegundoProyecto.HolaSpring.Model.Persona;
import java.util.List;

public interface IPersonaService {
    
    //// Ejercicio Resturante 4: Creamos los metodos para las peticiones HTTP
    
    /// GET
    //Metodo para traer todos los platos
    public List<Persona> getPersonas();
    
    /// POST
    //Metodo para agregar un nuevo plato
    public void agregarPersona(Persona plato);
    
    
    /// DELETE
    //Borrar una plato
    public void eliminarPersona(Long id);
    
    /// GET
    //Ver mas informacion de un plato
    public Persona verPersona(Long id);
}
