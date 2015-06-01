package JUnit;

import static org.junit.Assert.*;
import logicanegocios.ContactoLN;

import org.junit.Test;


public class ContactoLNTest {
	@Test
	public void test() {
////		 //Verificar si se crea un contacto
//		 String resultado = "";
//		 resultado = ContactoLN.crearContacto(new ContactoLN("Rodrigo","Beltran",
//				 "rodri.beltran@milto.pe","82738491","Peru 343","123511708"));
////		 //Resultado esperado: "Contacto ingresado"
//		 assertTrue(resultado == "Contacto ingresado");
////		 //--> aprobada
		 
////		 //Verificar si no crea con dato invalido
//		 String resultado = "";
//		 resultado = ContactoLN.crearContacto(new ContactoLN("Rodri","Beltran",
//				 "rodri.beltran@milto.pe","82738491","Peru 343","3299467324"));
////		 //Resultado esperado: "Valor ingresado invalido"
//		 assertTrue(resultado == "Valor ingresado invalido");
////		 //--> aprobada		 
		 
////	 //Verificar si no se crea contacto existente
//	 String resultado = "";
//	 resultado = ContactoLN.crearContacto(new ContactoLN("Hebera","Urratia",
//			 "hebers.im87@gmail.com","28936594","Vergara Albanu 155","187003105"));
////	 //Resultado esperado: "Contacto existe con anterioridado"
//	 assertTrue(resultado == "Contacto existe con anterioridad");
////	 //--> aprobada
//	 		
		
////	 //Verificar si se edito contacto
//	 String resultado = "";
//	 resultado = ContactoLN.modificarContacto(new ContactoLN("Heber","Arratia",
//			 "h.arratia01@ufromail.cl","98936594","Vergara Albano 151","187003105"));
////	 //Resultado esperado: "Contacto editado"
//	 assertTrue(resultado == "Contacto editado");
////	 //--> aprobada	
	 
////	 //Verificar edicion contacto no existente
//	 String resultado = "";
//	 resultado = ContactoLN.modificarContacto(new ContactoLN("Heber","Arratia",
//			 "h.arratia01@ufromail.cl","98936594","Vergara Albano 151","183511203"));
////	 //Resultado esperado: "Contacto editado"
//	 assertTrue(resultado == "Contacto no existe");
////	 //--> aprobada	
		
//	 //Verificar si se elimino contacto
	 String resultado = "";
	 resultado = ContactoLN.eliminarContacto("6");
//	 //Resultado esperado: "Contacto eliminado"
	 assertTrue(resultado == "Contacto eliminado");
//	 //--> aprobada		
		
////	 //Verificar si no se elimino contacto no existente
//	 String resultado = "";
//	 resultado = ContactoLN.eliminarContacto("183511203");
////	 //Resultado esperado: "Contacto no existe"
//	 assertTrue(resultado == "Contacto no existe");
////	 //--> aprobada			
		 
		
//		orm.Contacto contactos[] =   ContactoLN.listaContactos();
//		for (int i = 0; i < contactos.length; i++) {
//			System.out.println(contactos[i].getNombre());
//		}
	}
}
