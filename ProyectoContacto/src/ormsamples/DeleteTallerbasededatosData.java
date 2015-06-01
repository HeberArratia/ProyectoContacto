/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteTallerbasededatosData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.TallerbasededatosPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Delete the persistent object
			orm.ContactoDAO.delete(lormContacto);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteTallerbasededatosData deleteTallerbasededatosData = new DeleteTallerbasededatosData();
			try {
				deleteTallerbasededatosData.deleteTestData();
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
