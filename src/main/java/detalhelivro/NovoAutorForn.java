package detalhelivro;

import javax.validation.constraints.NotBlank;

public class NovoAutorForn {
	
	@NotBlank
	private String nome;
	private String github; 
}
