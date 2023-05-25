package ec.edu.isteclrg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.isteclrg.domain.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long>{
	
}
