package br.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.repositories.PracaRepository;

@Service
public class PracaService {
	
	@Autowired
	private PracaRepository pracaRepository;
	
	public Integer qtdDias(String dia) {
		Integer qtdDias = pracaRepository.dia(dia).size();		
		return qtdDias;
	}

	public Integer qtdSemana(String dia) {
		Integer qtdSemana = pracaRepository.semana(dia).size();	
		return qtdSemana;
	}
	
	public Integer qtdAno(String ano) {
		Integer qtdAno = pracaRepository.ano(ano).size();
		return qtdAno;
	}

}
