package br.com.projeto.utd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.utd.entidades.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	
}
