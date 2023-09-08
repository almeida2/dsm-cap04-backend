package com.fatec.produto.servico;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.produto.model.Imagem;

@Repository
public interface IImagemRepository extends JpaRepository<Imagem, Long> {
	Optional<Imagem> findByNome(String nome);
}
