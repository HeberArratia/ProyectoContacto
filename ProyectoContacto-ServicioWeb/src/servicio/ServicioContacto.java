package servicio;

import logicanegocios.ContactoLN;

public class ServicioContacto {

	/**
	 * Metodo que permite crear un nuevo contacto en la base de datos
	 * @param nom del contacto
	 * @param ape del contacto
	 * @param mail del contacto
	 * @param tele del contacto
	 * @param dire del contacto
	 * @param rut del contacto
	 * @return String de confirmacion 
	 */
	public String crearContacto(String nom, String ape, String mail, String tele, String dire, String rut) {
		// Se llama al metodo de la capa de negocios y se le pasan los parametros correspontientes
		// El metodo retorna el string que retorna el metodo de la capa de negocios
		return ContactoLN.crearContacto(new ContactoLN(nom,ape,
				 mail,tele,dire,rut));
	}

	/**
	 * Metodo que permite editar un contacto de la base de datos
	 * @param nom del contacto
	 * @param ape del contacto
	 * @param mail del contacto
	 * @param tele del contacto
	 * @param dire del contacto
	 * @param rut del contacto
	 * @param idc del contacto
	 * @return String de confirmacion
	 */
	public String modificarContacto(String nom, String ape, String mail, String tele, String dire, String rut, int idc) {
		// Se llama al metodo de la capa de negocios y se le pasan los parametros correspontientes
        // El metodo retorna el string que retorna el metodo de la capa de negocios
		return ContactoLN.modificarContacto(new ContactoLN(nom,ape,
				 mail,tele,dire,rut),idc);
	}

	/**
	 * Metodo que permite eliminar un contacto de la base de datos
	 * @param rutContacto
	 * @return String de confirmacion
	 */
	public String eliminarContacto(String id) {
		// Se llama al metodo de la capa de negocios y se le pasa el id del contacto a eliminar
		// El metodo retorna el string que retorna el metodo de la capa de negocios
		return ContactoLN.eliminarContacto(id);
	}

	/**
	 * Metodo que permite obtener la lista de todos los contactos
	 * @return lista de contactos
	 */
	public orm.Contacto[] listaContactos() {
		// Se llama al metodo de la capa de negocios 
		// El metodo retorna el arreglo que retorna el metodo de la capa de negocios
		return ContactoLN.listaContactos();
	}
}
