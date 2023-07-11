package com.elasexatas.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@Table(name = "tb_postagens")
public class Postagem {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo titulo é Obrigatório!")
	@Size(min = 5, max = 255, message = "O atributo título deve conter no mínimo 05 e no máximo 255 caracteres")
	private String tituloPostagem;
	
	@NotBlank(message = "O atributo conteúdo é Obrigatório?")
	@Size(min = 10, max = 1000, message = "O atributo texto deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String conteudo;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	@Size(min = 5, max = 255, message = "O atributo link da imagem deve conter 5 e no máximo 255 caracteres")
	private String imagem;
	
	@Size(min = 5, max = 255, message = "O atributo link deve conter 5 e no máximo 255 caracteres")
	private String link;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;

}