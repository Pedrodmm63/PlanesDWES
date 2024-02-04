package com.spring.tutoriasEDU.Enmarcar;

import com.spring.tutoriasEDU.Actividad.Actividad;
import com.spring.tutoriasEDU.planes.Plan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class Enmarca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@ManyToOne
	//@MapsId("idPlan")
	@JoinColumn(name="id_plan")
	Plan plan;
	
	
	@ManyToOne
	//@MapsId("idActividad")
	@JoinColumn(name="id_actividad")
	Actividad actividad;

	private String fecha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
