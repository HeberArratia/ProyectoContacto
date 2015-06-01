package Validacion;

import logicanegocios.ContactoLN;

public class DBvalidacion {

	public static boolean validarAtributos(ContactoLN contacto) {
	/*
	 * Si nombre y apellido son menores e iguales que 20, nombre y apellido
	 * estan compuestos de letras y la validacion del rut es verdadera se
	 * retorna una variable boolean true, de lo contrario se retorna false
	 */
	if (contacto.getNombre().length() <= 100 && contacto.getApellido().length() <= 100
			&& contacto.getMail().length() <= 50 && contacto.getTelefono().length() <= 20
			&& contacto.getDireccion().length() <= 30 && validarSoloLetras(contacto.getNombre())
			&& validarSoloLetras(contacto.getApellido()) && validarSoloNumeros(contacto.getTelefono())
			&& validarRut(contacto.getRut())) {
		return true;
	} else {
		return false;
	}
}

/**
 * Metodo que valida que el rut este compuesto de 9 numeros
 * 
 * @return booleano con el resultado de la operacion
 */
public static boolean validarRut(String rut) {
	// Si el parametro ingresado se compone de numeros y su largo es 9, se
	// retorna true
	if (rut.matches("\\d*") == true && rut.length() == 9) {
		return true;
	} else {
		return false;
	}
}

public static boolean validarSoloNumeros(String cadena) {
	// Si el parametro ingresado se compone de numeros y su largo es 9, se
	// retorna true
	if (cadena.matches("\\d*") == true) {
		return true;
	} else {
		return false;
	}
}

/**
 * Metodo que valida que una cadena ingresada por parametro se componga de
 * solo letras
 * 
 * @param cedena
 *            de texto
 * @return booleano con el resultado de la operacion
 */
public static boolean validarSoloLetras(String cedena) {
	// Si la cadena se compone de solo letras, se retorna true
	if (cedena.matches("([a-z]|[A-Z]|\\s)+")) {
		return true;
	} else {
		return false;
	}
}
	
}

