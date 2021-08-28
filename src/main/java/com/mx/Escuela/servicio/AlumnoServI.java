package com.mx.Escuela.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Escuela.dominio.Alumno;
import com.mx.Escuela.dao.AlumnoDao;

@Service
public class AlumnoServI implements AlumnoServ {

	@Autowired
	AlumnoDao alumnoDao;
	
	@Override
	public void guardar(Alumno alumno) {
		// TODO Auto-generated method stub
		alumnoDao.save(alumno);
	}

	@Override
	public void editar(Alumno alumno) {
		// TODO Auto-generated method stub
		alumnoDao.save(alumno);
	}

	@Override
	public void eliminar(Alumno alumno) {
		// TODO Auto-generated method stub
		alumnoDao.delete(alumno);
	}

	@Override
	public Alumno buscar(Alumno alumno) {
		
		return alumnoDao.findById( alumno.getId_alumno()).orElse(null);
	}

	@Override
	public List<Alumno> listar() {
		// TODO Auto-generated method stub
		return (List<Alumno>) alumnoDao.findAll();
	}

}
