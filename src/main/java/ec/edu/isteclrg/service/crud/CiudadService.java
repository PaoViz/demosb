package ec.edu.isteclrg.service.crud;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.isteclrg.domain.Ciudad;
import ec.edu.isteclrg.dto.CiudadDTO;
import ec.edu.isteclrg.persistence.CiudadRepository;
import ec.edu.isteclrg.service.GenericCrudServiceImpl;

@Service

public abstract class CiudadService extends GenericCrudServiceImpl<Ciudad, CiudadDTO> {

	@Autowired
	private CiudadRepository repository;
	private ModelMapper modelMapper= new ModelMapper();
	
	@Override
	public Optional<Ciudad> find(CiudadDTO dto) {
		return repository.findById(dto.getId());
	}

	@Override
	public CiudadDTO mapToDto(Ciudad domain) {
		return modelMapper.map(domain, CiudadDTO.class);
	}

	@Override
	public Ciudad mapToDomain(CiudadDTO dto) {
		return modelMapper.map(dto, Ciudad.class);
	}
}
