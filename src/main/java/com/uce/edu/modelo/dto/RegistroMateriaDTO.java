package com.uce.edu.modelo.dto;

public class RegistroMateriaDTO {

	private String codigo;
	private String nombre;
	private Integer numeroDeCreditos;
	private String cedulaProfesor;
	
	//SET Y GET
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
	
	
	
}
