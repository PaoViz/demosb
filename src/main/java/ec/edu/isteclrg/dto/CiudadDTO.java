package ec.edu.isteclrg.dto;

import lombok.Data;

@Data

public class CiudadDTO {
	
    private Long id; 

	
	private String nombre;
	
	private ProvinciaDTO provinciaDTO;
}
