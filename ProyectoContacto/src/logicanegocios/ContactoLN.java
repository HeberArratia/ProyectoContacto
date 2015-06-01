package logicanegocios;

import org.orm.PersistentException;

import Validacion.DBvalidacion;

public class ContactoLN {

	private String nombre;
	private String apellido;
	private String mail;
	private String telefono;
	private String direccion;
	private String rut;

	public ContactoLN(String nombre, String apellido, String mail,
			String telefono, String direccion, String rut) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.telefono = telefono;
		this.direccion = direccion;
		this.rut = rut;
	}

	public static String crearContacto(ContactoLN nuevoContacto) {
		try {
			// Validar atriburos de contacto
			if (DBvalidacion.validarAtributos(nuevoContacto)) {
				// Condicion de busqueda de contacto (rut)
				String condicionContacto = "rut='" + nuevoContacto.getRut()
						+ "'";
				// Buscar contacto por medio de la condicion declarada
				orm.Contacto contactoBuscado = orm.ContactoDAO
						.loadContactoByQuery(condicionContacto, null);
				// Verificar que contacto no se creo con anterioridad
				if (contactoBuscado == null) {
					// Creamos el contacto
					orm.Contacto lormContacto = orm.ContactoDAO
							.createContacto();
					// Enviamos los valores a contacto
					lormContacto.setNombre(nuevoContacto.getNombre());
					lormContacto.setApellido(nuevoContacto.getApellido());
					lormContacto.setMail(nuevoContacto.getMail());
					lormContacto.setTelefono(nuevoContacto.getTelefono());
					lormContacto.setDireccion(nuevoContacto.getDireccion());
					lormContacto.setRut(nuevoContacto.getRut());
					// Guardamos el nuevo contacto
					orm.ContactoDAO.save(lormContacto);
					// Retornamos mensaje de confirmacion
					return "Contacto ingresado";
				} else {
					// Retornamos mensaje de confirmacion
					return "Contacto existe con anterioridad";
				}
			} else {
				return "Valor ingresado invalido";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static String modificarContacto(ContactoLN nuevoContacto, int idc) {
		try {
			// Validar atriburos de contacto
			if (DBvalidacion.validarAtributos(nuevoContacto)) {
				// Condicion de busqueda de contacto (id)
				String condicionContacto = "uid='" + idc
						+ "'";
				// Buscar contacto por medio de la condicion declarada
				orm.Contacto lormContacto;
				lormContacto = orm.ContactoDAO.loadContactoByQuery(
						condicionContacto, null);
				// Verificar que contacto exista
				if (lormContacto != null) {
					// Se envian los nuevos valores a contacto
					lormContacto.setNombre(nuevoContacto.getNombre());
					lormContacto.setApellido(nuevoContacto.getApellido());
					lormContacto.setMail(nuevoContacto.getMail());
					lormContacto.setTelefono(nuevoContacto.getTelefono());
					lormContacto.setDireccion(nuevoContacto.getDireccion());
					lormContacto.setRut(nuevoContacto.getRut());
					// Guardar Contacto
					orm.ContactoDAO.save(lormContacto);
					// Retornamos mensaje de confirmación
					return "Contacto editado";
				} else {
					return "Contacto no existe";
				}
			} else {
				return "Valor ingresado invalido";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static String eliminarContacto(String id) {
		try {
			// Condicion de busqueda de contacto (id)
			String condicionContacto = "uid='" + id + "'";
			// Buscar contacto por medio de la condicion declarada
			orm.Contacto contactoBuscado = orm.ContactoDAO.loadContactoByQuery(
					condicionContacto, null);
			// Verificar que contacto exista
			if (contactoBuscado != null) {
				// Se elimina el contacto
				orm.ContactoDAO.delete(contactoBuscado);
				// Retornamos mensaje de confirmacion
				return "Contacto eliminado";
			} else {
				return "Contacto no existe";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Delete the persistent object
		return null;
	}

	public static orm.Contacto[] listaContactos() {
		// Se instancia una lista de contactos con valor nulo
		orm.Contacto[] ormContactos = null;
		try {
			System.out.println("Listing Estudiante...");
			// Se almacenan todos los contactos
			ormContactos = orm.ContactoDAO.listContactoByQuery(null, null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Se devuelve la lista del estudiantes
		return ormContactos;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		// TODO - implement ContactoLN.getAttribute
		return this.mail;
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setMail(String mail) {
		// TODO - implement ContactoLN.setAttribute
		this.mail = mail;
	}

	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRut() {
		return this.rut;
	}

	/**
	 * 
	 * @param rut
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

}