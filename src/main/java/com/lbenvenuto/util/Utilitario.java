package com.lbenvenuto.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.lbenvenuto.bean.Departamento;
import com.lbenvenuto.bean.Distrito;
import com.lbenvenuto.bean.Provincia;

public class Utilitario {

	private List<Departamento> lstDepartamento = new ArrayList<>();
	private List<Provincia> lstProvincia = new ArrayList<>();
	private List<Distrito> lstDistrito = new ArrayList<>();
	private static final String archivo = "E:\\ubigeo.txt";

	public Utilitario() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			String registro;
			StringTokenizer st;

			while ((registro = br.readLine()) != null) {
				st = new StringTokenizer(registro, "/");
				String departamento = st.nextToken();
				String[] arrDepartamento = departamento.split(" ");
				if (st.hasMoreTokens()) {
					String provincia = st.nextToken();
					String[] arrProvincia = provincia.split(" ");
					if (st.hasMoreTokens()) {
						String distrito = st.nextToken();
						String[] arrDistrito = distrito.split(" ");
						String nombreDistrito = "";
						if (arrDistrito.length > 2) {
							nombreDistrito += arrDistrito[1] + " " + arrDistrito[2];
						} else {
							nombreDistrito += arrDistrito[1];
						}

						lstDistrito.add(new Distrito(Integer.parseInt(arrDistrito[0]), nombreDistrito,
								Integer.parseInt(arrProvincia[0])));
					} else {
						lstProvincia.add(new Provincia(Integer.parseInt(arrProvincia[0]), arrProvincia[1],
								Integer.parseInt(arrDepartamento[0])));
					}

				} else {
					lstDepartamento.add(new Departamento(Integer.parseInt(arrDepartamento[0]), arrDepartamento[1]));
				}

			}
			br.close();
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}
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

}
