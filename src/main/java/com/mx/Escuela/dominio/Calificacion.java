package com.mx.Escuela.dominio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity 
@Table(name ="CALIFP")
public class Calificacion {

	@Id
	int id_calif;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_ALUMNO")
	Alumno alumno;
	
	double calificacion;
	
}
