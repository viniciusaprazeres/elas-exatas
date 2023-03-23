package com.elasexatas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é Obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo nome deve conter no mínimo 05 e no máximo 100 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo usuário é Obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo usuário deve conter no mínimo 05 e no máximo 100 caracteres")
	private String usuario;
	
	@NotBlank(message = "O atributo senha é Obrigatório!")
	@Size(min = 8, max = 24, message = "O atributo senha deve conter no mínimo 08 e no máximo 24 caracteres")
	private String senha;
	
	@NotNull(message = "O link da imagem é Opcional!")
	@Size(min = 5, max = 255, message = "O atributo senha deve conter no mínimo 05 e no máximo 255 caracteres")
	private String foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	

}
