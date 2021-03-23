package com.giufarma.Farmacia.Repository;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giufarma.Farmacia.Model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria , Long> {
	
public List<Categoria>findAllBymedicamentosContainingIgnoreCase(String  medicamentos);
	

}
