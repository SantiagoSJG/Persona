// Creamos una clase Persona, 2 vamos a controlador:

// Spring Data 1: Actualizamos clase Persona para hacerla una Entidad

package com.SegundoProyecto.HolaSpring.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

// Spring Data 2: Agregamos @Entity, Id y Sequence
@Entity


@Table(name="persona")
@Getter @Setter
// Spring Data 3: Implementamos la interfaz Serializable,
// Spring Data 4: aunque en MySQL no es necesario
public class Persona {
    
    
    
    // Spring Data 5: Agregamos ID a id, y generamos un valor auto incrementable 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String apellido;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
}
