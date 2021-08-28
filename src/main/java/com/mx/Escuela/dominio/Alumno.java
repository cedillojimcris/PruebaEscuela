package com.mx.Escuela.dominio;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ALUMNOP")
public class Alumno {

	@Id
	int id_alumno;
	String nombre;
	String app;
	String apm;
	String materia;
	
	@OneToMany(mappedBy="alumno", cascade=CascadeType.ALL)
	List<Calificacion> lista = new ArrayList<Calificacion>();
	
	
}
