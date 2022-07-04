package br.com.Generation.Blog.BlogPessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.com.Generation.Blog.BlogPessoal.model.*;


@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>   {
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo); 

}