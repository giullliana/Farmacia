package com.giufarma.Farmacia.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_tema")

public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String medicamentos;
	
	@NotNull
	private String higiene;
	
	@NotNull
	private String beleza;
	
	@NotNull
	private String alimentos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(String medicamentos) {
		medicamentos = medicamentos;
	}

	public String getHigiene() {
		return higiene;
	}

	public void setHigiene(String higiene) {
		higiene = higiene;
	}

	public String getBeleza() {
		return beleza;
	}

	public void setBeleza(String beleza) {
		beleza = beleza;
	}

	public String getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(String alimentos) {
		alimentos = alimentos;
	}
	

}
