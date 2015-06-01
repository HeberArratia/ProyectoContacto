package servicio;

public class ServicioContactoProxy implements servicio.ServicioContacto {
  private String _endpoint = null;
  private servicio.ServicioContacto servicioContacto = null;
  
  public ServicioContactoProxy() {
    _initServicioContactoProxy();
  }
  
  public ServicioContactoProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicioContactoProxy();
  }
  
  private void _initServicioContactoProxy() {
    try {
      servicioContacto = (new servicio.ServicioContactoServiceLocator()).getServicioContacto();
      if (servicioContacto != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servicioContacto)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servicioContacto)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servicioContacto != null)
      ((javax.xml.rpc.Stub)servicioContacto)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public servicio.ServicioContacto getServicioContacto() {
    if (servicioContacto == null)
      _initServicioContactoProxy();
    return servicioContacto;
  }
  
  public java.lang.String modificarContacto(java.lang.String nom, java.lang.String ape, java.lang.String mail, java.lang.String tele, java.lang.String dire, java.lang.String rut, int idc) throws java.rmi.RemoteException{
    if (servicioContacto == null)
      _initServicioContactoProxy();
    return servicioContacto.modificarContacto(nom, ape, mail, tele, dire, rut, idc);
  }
  
  public java.lang.String crearContacto(java.lang.String nom, java.lang.String ape, java.lang.String mail, java.lang.String tele, java.lang.String dire, java.lang.String rut) throws java.rmi.RemoteException{
    if (servicioContacto == null)
      _initServicioContactoProxy();
    return servicioContacto.crearContacto(nom, ape, mail, tele, dire, rut);
  }
  
  public java.lang.String eliminarContacto(java.lang.String rutContacto) throws java.rmi.RemoteException{
    if (servicioContacto == null)
      _initServicioContactoProxy();
    return servicioContacto.eliminarContacto(rutContacto);
  }
  
  public orm.Contacto[] listaContactos() throws java.rmi.RemoteException{
    if (servicioContacto == null)
      _initServicioContactoProxy();
    return servicioContacto.listaContactos();
  }
  
  
}