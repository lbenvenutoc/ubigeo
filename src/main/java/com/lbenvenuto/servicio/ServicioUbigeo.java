package com.lbenvenuto.servicio;

import java.util.ArrayList;
import java.util.List;

import com.lbenvenuto.bean.Departamento;
import com.lbenvenuto.bean.Distrito;
import com.lbenvenuto.bean.Provincia;
import com.lbenvenuto.util.Utilitario;

public class ServicioUbigeo {

	private Utilitario util = new Utilitario();

	public List<Departamento> listarDepartamento() {
		return util.getLstDepartamento();
	}

	public List<Provincia> listarProvincia(Integer codigoDepartamento) {
		List<Provincia> lista = util.getLstProvincia();
		List<Provincia> listaResultado = new ArrayList<>();
		for (Provincia p : lista) {
			if (p.getCodigoDepartamento() == codigoDepartamento) {
				listaResultado.add(p);
			}
		}
		return listaResultado;
	}

	public List<Distrito> listarDistrito(Integer codigoProvincia) {
		List<Distrito> lista = util.getLstDistrito();
		List<Distrito> listaResultado = new ArrayList<>();
		for (Distrito d : lista) {
			if (d.getCodigoProvincia() == codigoProvincia) {
				listaResultado.add(d);
			}
		}
		return listaResultado;
	}

}
