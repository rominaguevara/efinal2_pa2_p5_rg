package com.uce.edu.repository;

import com.uce.edu.modelo.Materia;

public interface IMateriaRepository {

	public void insertarMateria(Materia materia);

	public Materia buscarPorCodigo(String codigo);

	public void actualizar(Materia materia);

}
