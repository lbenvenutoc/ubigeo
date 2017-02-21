package com.lbenvenuto.bean;

import java.io.Serializable;

public class Distrito implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -808545345415092820L;

	private Integer codigoDistrito;
	private String nombreDistrito;
	private Integer codigoProvincia;

	public Distrito(Integer codigoDistrito, String nombreDistrito, Integer codigoProvincia) {
		this.codigoDistrito = codigoDistrito;
		this.nombreDistrito = nombreDistrito;
		this.codigoProvincia = codigoProvincia;
	}

	public Integer getCodigoDistrito() {
		return codigoDistrito;
	}

	public void setCodigoDistrito(Integer codigoDistrito) {
		this.codigoDistrito = codigoDistrito;
	}

	public String getNombreDistrito() {
		return nombreDistrito;
	}

	public void setNombreDistrito(String nombreDistrito) {
		this.nombreDistrito = nombreDistrito;
	}

	public Integer getCodigoProvincia() {
		return codigoProvincia;
	}

	public void setCodigoProvincia(Integer codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}

	@Override
	public String toString() {
		return "Distrito [codigoDistrito=" + codigoDistrito + ", nombreDistrito=" + nombreDistrito
				+ ", codigoProvincia=" + codigoProvincia + "]";
	}
	
	

}
