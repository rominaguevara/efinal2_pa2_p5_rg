package com.uce.edu.repository;

import com.uce.edu.modelo.Estudiante;

public interface IEstudianteRepository {
	
	 public void insertarEstudiante(Estudiante estudiante);
	 
	 public Estudiante buscarPorCedula(String cedula); 
}
