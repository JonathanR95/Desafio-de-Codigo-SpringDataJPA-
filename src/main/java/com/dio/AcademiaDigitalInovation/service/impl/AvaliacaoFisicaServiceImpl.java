package com.dio.AcademiaDigitalInovation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.AcademiaDigitalInovation.entity.Aluno;
import com.dio.AcademiaDigitalInovation.entity.AvaliacaoFisica;
import com.dio.AcademiaDigitalInovation.entity.form.AvaliacaoFisicaForm;
import com.dio.AcademiaDigitalInovation.entity.form.AvaliacaoFisicaUpdateForm;
import com.dio.AcademiaDigitalInovation.repository.AlunoRepository;
import com.dio.AcademiaDigitalInovation.repository.AvaliacaoFisicaRepository;
import com.dio.AcademiaDigitalInovation.service.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

	
	@Autowired
	private AvaliacaoFisicaRepository avaliacaoFisicaRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Override
	public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
		AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
		Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
		
		avaliacaoFisica.setAluno(aluno);
		avaliacaoFisica.setPeso(form.getPeso());
		avaliacaoFisica.setAltura(form.getAltura());
		
		return avaliacaoFisicaRepository.save(avaliacaoFisica);
		
	}

	@Override
	public AvaliacaoFisica get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AvaliacaoFisica> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
