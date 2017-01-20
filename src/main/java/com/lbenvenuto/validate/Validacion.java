package com.lbenvenuto.validate;

import java.util.List;

public class Validacion {

	public static String validarNumero(Integer numero, List<Integer> lista) {
		String mensaje = null;
		for (Integer i : lista) {
			System.out.println(numero+" - "+i);
			if (i==numero) {
				mensaje="No se puede ingresar dicho número pues ya existe";
				break;
			}
		}
		return mensaje;
	}

}
