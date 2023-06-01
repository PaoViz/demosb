package ec.edu.isteclrg.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.isteclrg.dto.PaisDTO;
import ec.edu.isteclrg.dto.ProvinciaDTO;
import ec.edu.isteclrg.service.crud.ProvinciaService;

@RestController
@RequestMapping("/api/v1.0/provincia/")

public class ProvinciaController {
	
	@Autowired
	
	ProvinciaService service;
	
	@PostMapping
	public ResponseEntity<Object>guardar(@RequestBody ProvinciaDTO dto) {
		service.save(dto);
		return new ResponseEntity<>("Guardado correctamente", HttpStatus.OK);
	}
	
	

}
