package br.com.cdc.apicdc.detalhelivro;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.URL;

public class NovoAutorForn {
	
	@NotBlank
	private String nome;
	@NotBlank
	@URL
	private String linkGithub;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLinkGithub() {
		return linkGithub;
	}
	public void setLinkGithub(String linkGithub) {
		this.linkGithub = linkGithub;
	}
	public Autor construir() {
		return new Autor(nome, linkGithub);
	}
	
}
