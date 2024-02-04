package com.spring.tutoriasEDU.Curso;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Cascade;

import com.spring.tutoriasEDU.planes.Plan;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Curso {

	
	@Id	
	private String nombre;
	
	@OneToMany(targetEntity=Plan.class,mappedBy="curso",cascade = CascadeType.ALL)
	private List<Plan> planes = new ArrayList<Plan>();

	
	


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Plan> getPlanes() {
		return planes;
	}

	public void setPlanes(List<Plan> planes) {
		this.planes = planes;
	}

	@Override
	public String toString() {
		return "Curso [nombre=" + nombre  + "]";
	}
	
	
	
	
	
}
