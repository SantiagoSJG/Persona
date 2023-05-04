// Spring Data 6: Creamos repositorio 
package com.SegundoProyecto.HolaSpring.Repository;

import com.SegundoProyecto.HolaSpring.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// La interface Dao se extiende de Crud Repository, y 
// ahi indicamos la Persona y ID

// Esto es un repositorio, se cambia CrudRepository por JpaRepository

// Al extender de JPArepository, no hace falta agregar el bean @Repository


@Repository
public interface PersonaRepository extends JpaRepository <Persona, Integer>{
    
}