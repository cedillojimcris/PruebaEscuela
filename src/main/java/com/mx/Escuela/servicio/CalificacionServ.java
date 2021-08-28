package com.mx.Escuela.servicio;

import java.util.List;
import com.mx.Escuela.dominio.Calificacion;

public interface CalificacionServ {
	
	public void guardar(Calificacion calificacion);
	public void editar(Calificacion calificacion);
	public void eliminar(Calificacion calificacion);
	public Calificacion buscar(Calificacion calificacion);
	public List<Calificacion> listar();

}
