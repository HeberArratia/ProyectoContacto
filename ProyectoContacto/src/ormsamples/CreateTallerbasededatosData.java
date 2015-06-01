/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateTallerbasededatosData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.TallerbasededatosPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : rut, direccion, telefono, mail, apellido, nombre
			orm.ContactoDAO.save(lormContacto);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateTallerbasededatosData createTallerbasededatosData = new CreateTallerbasededatosData();
			try {
				createTallerbasededatosData.createTestData();
			}
			finally {
				orm.TallerbasededatosPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
