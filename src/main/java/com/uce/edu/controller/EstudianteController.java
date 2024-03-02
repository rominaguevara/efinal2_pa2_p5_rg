package com.uce.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.modelo.dto.RegistroEstudianteDTO;
import com.uce.edu.service.IEstudianteService;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@GetMapping("/inicio")
	public String cargarPagina(Model modelo) {
		modelo.addAttribute("estudianteDTO", new RegistroEstudianteDTO());
		return "vistaEstudiante";
	}
	
	@PostMapping("/registrar")
	public String registrarEstudiante(RegistroEstudianteDTO estudianteDTO) {
		this.estudianteService.registarEstudainte(estudianteDTO.getNombre(), estudianteDTO.getApellido(), estudianteDTO.getCedula(), estudianteDTO.getDireccion(), estudianteDTO.getTelefono());
		return "redirect:/estudiantes/inicio";
	}
}
