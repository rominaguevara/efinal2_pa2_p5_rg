package com.uce.edu.modelo.dto;

import com.uce.edu.modelo.Estudiante;
import com.uce.edu.modelo.Materia;

public class RegistroMatriculaDTO {
	
		
	private Estudiante estudiante;
    private Materia materia;
    
    //SET Y GET
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
    
    

}
