package ec.edu.isteclrg.dto;

import lombok.Data;

@Data

public class BarrioDTO {
	
	private Long id;
	
	private String nombre;
	
	private Integer calificacionPositiva;
	
	private Integer calificacionNegativa;
	
	private CiudadDTO ciudadDTO;
	
	private String administrador;
	
	//pendiente tipoBarrioDTO

}
