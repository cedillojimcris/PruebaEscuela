package com.mx.Escuela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Escuela.dominio.Alumno;
import com.mx.Escuela.servicio.AlumnoServ;


@CrossOrigin
@RestController
@RequestMapping("alumnoCtrl")
public class AlumnoCtrl {

	@Autowired
	AlumnoServ alumnoServ;
	
	@GetMapping("listar")
	public List<Alumno> listar(){
		var lista = alumnoServ.listar();
		System.out.println("listar -->"+lista);
		return lista;
	}
	
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Alumno alumno)
	{
		alumnoServ.guardar(alumno);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Alumno alumno)
	{
		alumnoServ.editar(alumno);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Alumno alumno)
	{
		alumnoServ.eliminar(alumno);
	}
	
	@PostMapping("buscar")
	public Alumno buscar(@RequestBody Alumno alumno)
	{
		alumno = alumnoServ.buscar(alumno);
		return alumno;
	}

}
