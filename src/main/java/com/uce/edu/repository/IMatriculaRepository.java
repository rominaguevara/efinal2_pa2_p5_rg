package com.uce.edu.repository;

import java.util.List;

import com.uce.edu.modelo.Matricula;

public interface IMatriculaRepository {

	public void insertarMatricula(Matricula matricula);
	
	public List<Matricula> reporteMatriculas();
	
}
