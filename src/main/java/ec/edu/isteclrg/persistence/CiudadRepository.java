package ec.edu.isteclrg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.isteclrg.domain.Ciudad;

public interface CiudadRepository  extends JpaRepository<Ciudad, Long>{

}
