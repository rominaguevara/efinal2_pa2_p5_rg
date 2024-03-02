package com.uce.edu.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value= TxType.REQUIRED)
	public void insertarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<Matricula> reporteMatriculas() {
		// TODO Auto-generated method stub
		TypedQuery<Matricula> myQuery = this.entityManager.createQuery("SELECT m FROM Matricula m",
				Matricula.class);
		List<Matricula> matriculas = myQuery.getResultList();
		matriculas.forEach(matricula -> {
			matricula.getEstudiante(); 
			matricula.getMateria();	
		});
		return matriculas;
	}

	

}
