package com.lbenvenuto.bean;

import java.io.Serializable;

public class Departamento implements Serializable {

	private static final long serialVersionUID = 758313721256281690L;

	private Integer codigoDepartamento;
	private String nombreDepartamento;

	public Departamento() {

	}

	public Departamento(Integer codigoDepartamento, String nombreDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
		this.nombreDepartamento = nombreDepartamento;
	}

	public Integer getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(Integer codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	@Override
	public String toString() {
		return "Departamento [codigoDepartamento=" + codigoDepartamento + ", nombreDepartamento=" + nombreDepartamento
				+ "]";
	}

}
