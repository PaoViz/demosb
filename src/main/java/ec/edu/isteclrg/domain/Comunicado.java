package ec.edu.isteclrg.domain;



import java.sql.Date;


import ec.edu.isteclrg.enums.TipoComunicado;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity


public class Comunicado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long id;
	
	@Column(nullable = false, length = 20)
	private String titulo ;
	
	@Column(nullable = false, length = 100)
	private String asunto ;
	
	@Column(nullable = false, length = 100)
	private String contenido ;
	
	@Column()
	private Date fecha;
	
	
	@Column(nullable = false)
	private TipoComunicado tipoComunicado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( nullable = false)
	private Barrio barrio;
	
	
	
	
	
	
	
	
	

}
