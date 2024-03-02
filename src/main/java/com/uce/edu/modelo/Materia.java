package com.uce.edu.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_mate")
	@SequenceGenerator(name = "seq_mate", sequenceName = "seq_mate", allocationSize = 1)
	@Column(name = "mate_identificador")
	private Integer identificador;
	
	@Column(name = "mate_codigo")
	private String codigo;
	
	@Column(name = "mate_nombre")
	private String nombre;

	@Column(name = "mate_numero_creditos")
	private Integer numeroDeCreditos;
	
	@Column(name = "mate_cedula_profesor")
	private String cedulaProfesor;
	
	@OneToMany(mappedBy = "materia")
	private List<Matricula> matriculas;
	
	//GET Y SET
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumeroDeCreditos() {
		return numeroDeCreditos;
	}

	public void setNumeroDeCreditos(Integer numeroDeCreditos) {
		this.numeroDeCreditos = numeroDeCreditos;
	}

	public String getCedulaProfesor() {
		return cedulaProfesor;
	}

	public void setCedulaProfesor(String cedulaProfesor) {
		this.cedulaProfesor = cedulaProfesor;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	
	
	
}
