package com.lbenvenuto.bean;

import java.io.Serializable;

public class Provincia implements Serializable {

	private static final long serialVersionUID = 8170638987790100148L;
	private Integer codigoProvincia;
	private String nombreProvincia;
	private Integer codigoDepartamento;
	
	public Provincia(){
		
	}

	public Provincia(Integer codigoProvincia, String nombreProvincia, Integer codigoDepartamento) {
		this.codigoProvincia = codigoProvincia;
		this.nombreProvincia = nombreProvincia;
		this.codigoDepartamento = codigoDepartamento;
	}

	public Integer getCodigoProvincia() {
		return codigoProvincia;
	}

	public void setCodigoProvincia(Integer codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}

	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}

	public Integer getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(Integer codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	@Override
	public String toString() {
		return "Provincia [codigoProvincia=" + codigoProvincia + ", nombreProvincia=" + nombreProvincia
				+ ", codigoDepartamento=" + codigoDepartamento + "]";
	}

}
