package com.spring.tutoriasEDU.planes;

import java.util.HashSet;
import java.util.Set;

import com.spring.tutoriasEDU.Actividad.Actividad;
import com.spring.tutoriasEDU.Curso.Curso;
import com.spring.tutoriasEDU.Enmarcar.Enmarca;
import com.spring.tutoriasEDU.tutores.Tutor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;



@Entity
public class Plan {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String nombre;
	
	
	@OneToOne(targetEntity=Tutor.class,mappedBy="plan")
	private Tutor tutor;

	
	@ManyToOne
	@JoinColumn(name="FK_CURSO")
	private Curso curso;
	
	@OneToMany(
			targetEntity = Enmarca.class,
			mappedBy="plan")
	private Set<Actividad> usuarios = new HashSet<Actividad>();
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	@Override
	public String toString() {
		return "Plan [id=" + id + ", nombre=" + nombre + ", tutor=" + tutor + ", curso=" + curso + "]";
	}
	
	
	
	
	
	
}
