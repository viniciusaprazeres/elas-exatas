package com.elasexatas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "O nome é obrigatório!")
	private String nome;
	
	@Schema(example = "email@email.com.br")
	@NotNull(message = "O usuário é obrigatório!")
	@Email(message = "O usuário deve ser um e-mail válido.")
	private String usuario;
	
	@NotBlank(message = "A senha é obrigatório!")
	@Size(min = 8, message = "A senha deve conter no mínimo 08 caracteres")
	private String senha;
	
	@Size(max = 5000, message = "O link da foto deve conter no máximo 5000 caracteres")
	private String foto;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;

}