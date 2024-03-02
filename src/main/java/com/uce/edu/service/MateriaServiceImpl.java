package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.modelo.Materia;
import com.uce.edu.repository.IMateriaRepository;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	private IMateriaRepository iMateriaRepository;

	@Override
	public void registrarMateria(String nombre, String codigo, Integer numeroDeCreditos, String cedulaProfesor) {
		// TODO Auto-generated method stub
		Materia mate = new Materia();
		mate.setNombre(nombre);
		mate.setCodigo(codigo);
		mate.setNumeroDeCreditos(numeroDeCreditos);
		mate.setCedulaProfesor(cedulaProfesor);
		this.iMateriaRepository.insertarMateria(mate);
	}

}
