package com.uce.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.modelo.dto.RegistroMatriculaDTO;
import com.uce.edu.service.IMatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {

	@Autowired
	private IMatriculaService matriculaService;

	@GetMapping("/inicio")
	public String cargarPagina(Model modelo) {
		modelo.addAttribute("matriculaDTO", new RegistroMatriculaDTO());
		return "vistaMatricula";
	}

	@PostMapping("/generar")
	public String registrarEstudiante(RegistroMatriculaDTO matriculaDTO) {
		this.matriculaService.generarMatriculas(matriculaDTO.getEstudiante().getCedula(), matriculaDTO.getMateria().getCodigo(), matriculaDTO.getMateria().getCodigo(), matriculaDTO.getMateria().getCodigo(), matriculaDTO.getMateria().getCodigo());
		return "redirect:/matriculas/inicio";
	}

}
