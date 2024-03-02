package com.uce.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.modelo.Matricula;
import com.uce.edu.service.IMatriculaService;

@Controller
@RequestMapping("/reportes")
public class ReporteController {
	
	@Autowired
	private IMatriculaService matriculaService;

	@GetMapping("/inicio")
	public String cargarPagina(Model modelo) {
		modelo.addAttribute("matricula", new Matricula());
		return "vistaReporte";
	}

	@PostMapping("/reporte")
	public String reporteMatriculas(Model modelo ) {
		List<Matricula> lista = this.matriculaService.reporteMatriculas();
		modelo.addAttribute("matriculas",lista);
		return "redirect:/reportes/inicio";
	}	
}
