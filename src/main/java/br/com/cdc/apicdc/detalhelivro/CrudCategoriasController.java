package br.com.cdc.apicdc.detalhelivro;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudCategoriasController {

	@Autowired
	private CategoriaRepository categoriaRepository;

	//TODO Resoilver problema com o validator
	@InitBinder(value = "novaCategoriaForm")
	public void init(WebDataBinder dataBinder) {
			dataBinder.addValidators(new SemCategoriaComNomeDuplicadoValidator(categoriaRepository));
	}

	@PostMapping(value = "/api/categoria")
	@Transactional
	public void novaCateogria(@RequestBody NovaCategoriaForm form) {
		// Não utilizamos o build na class form porque, nesse caso, só existe um attr na
		// classe de form.
		Categoria novaCategoria = new Categoria(form.getNome());

		categoriaRepository.save(novaCategoria);
	}

}
