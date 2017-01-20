package com.lbenvenuto.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.lbenvenuto.util.FacesUtils;
import com.lbenvenuto.validate.Validacion;

@ManagedBean(name = "data")
@SessionScoped
public class ManagedBeanData {

	private String numero = "";
	private String resultado = "";
	public List<Integer> lstNumeros;

	public ManagedBeanData() {
		lstNumeros = new ArrayList<Integer>();
	}

	public void ingresarNumero() {
		System.out.println("ingresarNumero " + numero);
		String mensaje = null;

		try {
			Integer numeroRecibido = Integer.parseInt(numero);
			if (lstNumeros.size() > 1) {
				mensaje = Validacion.validarNumero(numeroRecibido, lstNumeros);
			}
			if (mensaje == null) {
				lstNumeros.add(numeroRecibido);
				numero = "";
			} else {
				FacesUtils.showFacesMessage(mensaje, 1);
			}
		} catch (NumberFormatException e) {
			mensaje = "Data ingresada no es número";
			FacesUtils.showFacesMessage(mensaje, 1);
		}

	}

	public void ordenarNumeros() {
		if (!lstNumeros.isEmpty()) {
			Collections.sort(lstNumeros);
			for (Integer i : lstNumeros) {
				System.out.println("Resultado " + i);
				resultado += "[" + i + "], ";
			}
		} else {
			FacesUtils.showFacesMessage("Debe ingresar elementos a la lista de números", 1);
		}

	}

	public void limpiar() {
		lstNumeros = new ArrayList<Integer>();
		resultado = "";
		numero = "";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public List<Integer> getLstNumeros() {
		return lstNumeros;
	}

	public void setLstNumeros(List<Integer> lstNumeros) {
		this.lstNumeros = lstNumeros;
	}

}
