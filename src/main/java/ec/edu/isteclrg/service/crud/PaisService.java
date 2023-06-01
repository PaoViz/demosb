package ec.edu.isteclrg.service.crud;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.isteclrg.domain.Pais;
import ec.edu.isteclrg.dto.PaisDTO;
import ec.edu.isteclrg.persistence.PaisRepository;
import ec.edu.isteclrg.service.GenericCrudServiceImpl;


@Service
public abstract class PaisService extends GenericCrudServiceImpl<Pais, PaisDTO>{
	
	@Autowired
	private PaisRepository repository;
	private ModelMapper modelMapper= new ModelMapper();
	
	@Override
	public Optional<Pais> find(PaisDTO dto) {
		return repository.findById(dto.getId());
	}

	@Override
	public PaisDTO mapToDto(Pais domain) {
		return modelMapper.map(domain, PaisDTO.class);
	}

	@Override
	public Pais mapToDomain(PaisDTO dto) {
		return modelMapper.map(dto, Pais.class);
	}
	
	
	
	

}
