package com.uce.edu.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.modelo.Materia;
import com.uce.edu.modelo.Matricula;
import com.uce.edu.repository.IEstudianteRepository;
import com.uce.edu.repository.IMateriaRepository;
import com.uce.edu.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Autowired
	private IEstudianteRepository iEstudianteRepository;

	@Autowired
	private IMateriaRepository iMateriaRepository;

	@Override
	public void generarMatriculas(String cedulaEstudiante, String codigo1, String codigo2, String codigo3,
			String codigo4) {
		// TODO Auto-generated method stub
		List<String> codigosMaterias = Arrays.asList(codigo1, codigo2, codigo3, codigo4);
		List<Materia> materias = codigosMaterias.stream().map(x -> iMateriaRepository.buscarPorCodigo(x)).toList();
		List<Matricula> matriculas = materias.stream().map(materia -> {
			Matricula matricula = new Matricula();
			matricula.setMateria(materia);
			matricula.setFechaMatricula(LocalDateTime.now());
			matricula.setEstudiante(iEstudianteRepository.buscarPorCedula(cedulaEstudiante));
			return matricula;
		}).toList();
		matriculas.parallelStream().forEach(matricula -> {
			matricula.setNombreHilo(Thread.currentThread().getName());
			this.iMatriculaRepository.insertarMatricula(matricula);
		});
	}

	@Override
	public List<Matricula> reporteMatriculas() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepository.reporteMatriculas();
	}

}
