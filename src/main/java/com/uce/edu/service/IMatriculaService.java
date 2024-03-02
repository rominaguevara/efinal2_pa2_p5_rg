package com.uce.edu.service;

import java.util.List;

import com.uce.edu.modelo.Matricula;

public interface IMatriculaService {

	public void generarMatriculas(String cedulaEstudiante, String codigo1, String codigo2, String codigo3,
			String codigo4);

	public List<Matricula> reporteMatriculas();

}
