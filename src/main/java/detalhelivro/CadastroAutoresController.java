package detalhelivro;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroAutoresController {

	@PostMapping(value = "/api/autor")
	public void novo(@RequestParam NovoAutorForn form) {
		//TODO: process POST request
		
	}

}
