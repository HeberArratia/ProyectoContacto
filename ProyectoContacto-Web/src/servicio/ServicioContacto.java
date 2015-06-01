/**
 * ServicioContacto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servicio;

public interface ServicioContacto extends java.rmi.Remote {
    public java.lang.String modificarContacto(java.lang.String nom, java.lang.String ape, java.lang.String mail, java.lang.String tele, java.lang.String dire, java.lang.String rut, int idc) throws java.rmi.RemoteException;
    public java.lang.String crearContacto(java.lang.String nom, java.lang.String ape, java.lang.String mail, java.lang.String tele, java.lang.String dire, java.lang.String rut) throws java.rmi.RemoteException;
    public java.lang.String eliminarContacto(java.lang.String rutContacto) throws java.rmi.RemoteException;
    public orm.Contacto[] listaContactos() throws java.rmi.RemoteException;
}
