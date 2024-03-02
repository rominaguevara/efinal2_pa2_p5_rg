package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.modelo.Estudiante;
import com.uce.edu.repository.IEstudianteRepository;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Override
	public void registarEstudainte(String nombre, String apellido, String cedula, String direccion, String telefono) {
		// TODO Auto-generated method stub
		Estudiante est = new Estudiante();
		est.setNombre(nombre);
		est.setApellido(apellido);
		est.setCedula(cedula);
		est.setDirección(direccion);
		est.setTelefono(telefono);
		this.estudianteRepository.insertarEstudiante(est);
	}

}
