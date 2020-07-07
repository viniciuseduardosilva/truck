package br.com.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.model.Caminhoneiro;

@Repository
public interface CaminhoneiroRepository extends CrudRepository<Caminhoneiro, Long> {

	@Query(value =
			" SELECT * FROM caminhoneiro ",
				nativeQuery = true)
	public List<Caminhoneiro> todos();
	
	@Query(value =
			" SELECT carga FROM caminhoneiro where carga = 'N' ",
				nativeQuery = true)
	public List<Caminhoneiro> carga();
	
	
	@Query(value =
			" SELECT possuiVeiculo FROM caminhoneiro where possuiVeiculo = 'S' ",
				nativeQuery = true)
	public List<Caminhoneiro> possuiVeiculo();
	
	
}
