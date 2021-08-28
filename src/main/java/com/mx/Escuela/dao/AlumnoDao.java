package com.mx.Escuela.dao;
import org.springframework.data.repository.CrudRepository;

import com.mx.Escuela.dominio.Alumno;

public interface AlumnoDao extends CrudRepository<Alumno, Integer> {

}
