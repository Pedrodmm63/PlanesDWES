package com.spring.tutoriasEDU.Actividad;

import java.util.HashSet;
import java.util.Set;

import com.spring.tutoriasEDU.Enmarcar.Enmarca;
import com.spring.tutoriasEDU.planes.Plan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Actividad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(
			targetEntity = Enmarca.class,
			mappedBy="actividad")
	private Set<Plan> usuarios = new HashSet<Plan>();
	
	@Column
	public String nombre;
	
	@Column 
	public boolean obligatorio;

	@Column
	public String descripcion;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<Plan> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Plan> usuarios) {
		this.usuarios = usuarios;
	}

	public boolean isObligatorio() {
		return obligatorio;
	}

	public void setObligatorio(boolean obligatorio) {
		this.obligatorio = obligatorio;
	}

	public String getNombree() {
		return nombre;
	}

	public void setNombree(String nombree) {
		this.nombre = nombree;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	
	
}
