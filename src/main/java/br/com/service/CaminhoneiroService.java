package br.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.model.Caminhoneiro;
import br.com.repositories.CaminhoneiroRepository;

@Service
public class CaminhoneiroService {

	@Autowired
	private CaminhoneiroRepository caminhoneiroRepository;
	
	public List<Caminhoneiro> buscaTodos() {
		return caminhoneiroRepository.todos();
	}
	
	public List<Caminhoneiro> buscaCargas() {
		return caminhoneiroRepository.carga();
	}
		
	public Integer buscaVeiculos() {
		Integer qtdVeiculos = caminhoneiroRepository.possuiVeiculo().size();
		return qtdVeiculos;
	}
	
	public Caminhoneiro buscaCaminhonheiro(Long id) {
		return caminhoneiroRepository.findById(id).orElse(null);
	}
	
	public Caminhoneiro salva(Caminhoneiro caminhoneiro) {
		return caminhoneiroRepository.save(caminhoneiro);
	}
	
}
