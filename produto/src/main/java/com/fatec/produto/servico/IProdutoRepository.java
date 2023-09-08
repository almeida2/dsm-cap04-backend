package com.fatec.produto.servico;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.produto.model.Produto;
@Repository
public interface IProdutoRepository extends JpaRepository <Produto, Long> {
	public List<Produto> findAllByDescricaoIgnoreCaseContaining(String descricao);
}
