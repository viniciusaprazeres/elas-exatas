package com.elasexatas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.elasexatas.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public List<Postagem>  findAllByTituloPostagemContainingIgnoreCase(@Param("titulo") String titulo);

}
