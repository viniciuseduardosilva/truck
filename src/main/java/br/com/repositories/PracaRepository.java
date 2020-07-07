package br.com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.model.Praca;

@Repository
public interface PracaRepository extends CrudRepository<Praca, Long>{
	
	@Query(value =
			" SELECT * FROM dataChegada WHERE dataChegada = DATE ':dia' ",
				nativeQuery = true)
	List<Praca> semana(@Param("dia") String dia);
	
	@Query(value =
			" SELECT * FROM dataChegada WHERE dataChegada = DATE ':dia' ",
				nativeQuery = true)
	List<Praca> dia(@Param("dia") String dia);
	
	@Query(value =
			" SELECT * FROM dataChegada WHERE dataChegada = DATE ':ano' ",
				nativeQuery = true)
	public List<Praca> ano(@Param("ano") String ano);

}
