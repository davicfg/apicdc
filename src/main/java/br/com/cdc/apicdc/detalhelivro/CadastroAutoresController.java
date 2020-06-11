package br.com.cdc.apicdc.detalhelivro;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroAutoresController {
	
	@Autowired
	private AutorRepository autorRepository;
	
	@PostMapping(value = "/api/autor")
	@Transactional
	public void novo(@Valid @RequestBody NovoAutorForn form) {
		Autor novoAutor = form.construir();
		
		autorRepository.save(novoAutor);
	}

}
