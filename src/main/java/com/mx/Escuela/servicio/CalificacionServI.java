package com.mx.Escuela.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Escuela.dao.calificacionDao;
import com.mx.Escuela.dominio.Calificacion;

@Service
public class CalificacionServI implements CalificacionServ {
	
	@Autowired
	calificacionDao califDao;

	@Override
	public void guardar(Calificacion calificacion) {
		// TODO Auto-generated method stub
		califDao.save(calificacion);
	}

	@Override
	public void editar(Calificacion calificacion) {
		// TODO Auto-generated method stub
		califDao.save(calificacion);
	}

	@Override
	public void eliminar(Calificacion calificacion) {
		// TODO Auto-generated method stub
		califDao.delete(calificacion);
	}

	@Override
	public Calificacion buscar(Calificacion calificacion) {
		// TODO Auto-generated method stub
		return califDao.findById( calificacion.getId_calif()).orElse(null);
	}

	@Override
	public List<Calificacion> listar() {
		// TODO Auto-generated method stub
		return (List<Calificacion>) califDao.findAll();
	}

}
