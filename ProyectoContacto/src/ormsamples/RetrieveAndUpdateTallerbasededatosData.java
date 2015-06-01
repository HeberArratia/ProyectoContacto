/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateTallerbasededatosData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.TallerbasededatosPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Update the properties of the persistent object
			orm.ContactoDAO.save(lormContacto);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Contacto by ContactoCriteria");
		orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormContactoCriteria.uid.eq();
		System.out.println(lormContactoCriteria.uniqueContacto());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateTallerbasededatosData retrieveAndUpdateTallerbasededatosData = new RetrieveAndUpdateTallerbasededatosData();
			try {
				retrieveAndUpdateTallerbasededatosData.retrieveAndUpdateTestData();
				//retrieveAndUpdateTallerbasededatosData.retrieveByCriteria();
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
