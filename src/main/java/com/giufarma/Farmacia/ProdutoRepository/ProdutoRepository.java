package com.giufarma.Farmacia.ProdutoRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giufarma.Farmacia.ProdutoModel.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
	public abstract List<ProdutoModel>findAllProdutoIgnoreCase(String  produto);
}
	
