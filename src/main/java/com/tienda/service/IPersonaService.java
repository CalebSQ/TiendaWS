package com.tienda.Service;

import com.tienda.entity.Persona;
import java.util.List;
import org.springframework.stereotype.Repository;

public interface IPersonaService {
    public List<Persona> getAllPerson();
    public void savePerson(Persona persona);
    public Persona getPersonById(long id);
    public void delete(long id);
    public Persona findByNombre (String nombre);
}