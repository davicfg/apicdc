package br.com.cdc.apicdc.detalhelivro;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.URL;

@Entity
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private @NotBlank String nome;
	private @NotBlank @URL String linkGithub;
	private @PastOrPresent LocalDateTime createdAt = LocalDateTime.now();

	public Autor(@NotBlank String nome, @NotBlank @URL String linkGithub) {
		this.nome = nome;
		this.linkGithub = linkGithub;
	}

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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
}
