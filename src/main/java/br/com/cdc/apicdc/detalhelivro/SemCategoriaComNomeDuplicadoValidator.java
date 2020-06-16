package br.com.cdc.apicdc.detalhelivro;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class SemCategoriaComNomeDuplicadoValidator implements Validator {

	private CategoriaRepository categoriaRepository;

	public SemCategoriaComNomeDuplicadoValidator(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return NovaCategoriaForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("aqui no validor da categoria");
//		NovaCategoriaForm form = (NovaCategoriaForm) target;
//		Optional<Categoria> possivelCategoria = categoriaRepository.findByNome(form.getNome());
//		
//		if(possivelCategoria.isPresent()) {
//			errors.rejectValue("nome", null, "Já existe uma categoria com esse nome");
//		}
	}

}
