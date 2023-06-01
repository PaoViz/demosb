package ec.edu.isteclrg.service.crud;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.isteclrg.domain.Pais;
import ec.edu.isteclrg.domain.Provincia;
import ec.edu.isteclrg.dto.PaisDTO;
import ec.edu.isteclrg.dto.ProvinciaDTO;
import ec.edu.isteclrg.persistence.ProvinciaRepository;
import ec.edu.isteclrg.service.GenericCrudServiceImpl;

@Service

public abstract class ProvinciaService extends GenericCrudServiceImpl<Provincia, ProvinciaDTO> {

	@Autowired
	private ProvinciaRepository repository;
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public Optional<Provincia> find(ProvinciaDTO dto) {
		return repository.findById(dto.getId());
	}

	@Override
	public ProvinciaDTO mapToDto(Provincia domain) {
		return modelMapper.map(domain, ProvinciaDTO.class);
	}

	@Override
	public Provincia mapToDomain(ProvinciaDTO dto) {
		return modelMapper.map(dto, Provincia.class);
	}
	
	
}
