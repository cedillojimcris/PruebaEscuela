package com.mx.Escuela.dao;

import org.springframework.data.repository.CrudRepository;
import com.mx.Escuela.dominio.Calificacion;

public interface calificacionDao extends CrudRepository<Calificacion, Integer> {

}
