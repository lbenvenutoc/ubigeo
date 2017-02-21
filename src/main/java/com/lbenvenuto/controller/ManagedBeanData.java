package com.lbenvenuto.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.lbenvenuto.bean.Departamento;
import com.lbenvenuto.bean.Distrito;
import com.lbenvenuto.bean.Provincia;
import com.lbenvenuto.servicio.ServicioUbigeo;

@ManagedBean(name = "data")
@SessionScoped
public class ManagedBeanData {

	private List<Departamento> lstDepartamento = new ArrayList<>();
	private List<Provincia> lstProvincia = new ArrayList<>();
	private List<Distrito> lstDistrito = new ArrayList<>();
	private ServicioUbigeo servicio = new ServicioUbigeo();
	private Departamento departamento = new Departamento();
	private Provincia provincia = new Provincia();

	public ManagedBeanData() {
		lstDepartamento = servicio.listarDepartamento();
	}

	public void cargarProvincia() {
		lstProvincia = servicio.listarProvincia(departamento.getCodigoDepartamento());
		lstDistrito = new ArrayList<>();
	}

	public void cargarDistrito() {
		lstDistrito = servicio.listarDistrito(provincia.getCodigoProvincia());
	}

	public List<Departamento> getLstDepartamento() {
		return lstDepartamento;
	}

	public void setLstDepartamento(List<Departamento> lstDepartamento) {
		this.lstDepartamento = lstDepartamento;
	}

	public List<Provincia> getLstProvincia() {
		return lstProvincia;
	}

	public void setLstProvincia(List<Provincia> lstProvincia) {
		this.lstProvincia = lstProvincia;
	}

	public List<Distrito> getLstDistrito() {
		return lstDistrito;
	}

	public void setLstDistrito(List<Distrito> lstDistrito) {
		this.lstDistrito = lstDistrito;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

}
