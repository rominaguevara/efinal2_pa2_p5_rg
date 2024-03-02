package com.uce.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.modelo.dto.RegistroMateriaDTO;
import com.uce.edu.service.IMateriaService;

@Controller
@RequestMapping("/materias")
public class MateriaController {
	
	@Autowired
	private IMateriaService iMateriaService;
	
	@GetMapping("/inicio")
	public String cargarPagina(Model modelo) {
		modelo.addAttribute("materiaDTO", new RegistroMateriaDTO());
		return "vistaMateria";
	}
	
	@PostMapping("/registrar")
	public String registrarMateria(RegistroMateriaDTO materiaDTO) {
		this.iMateriaService.registrarMateria(materiaDTO.getNombre(), materiaDTO.getCodigo(), materiaDTO.getNumeroDeCreditos(), materiaDTO.getCedulaProfesor());
		return "redirect:/materias/inicio";
	}

}
