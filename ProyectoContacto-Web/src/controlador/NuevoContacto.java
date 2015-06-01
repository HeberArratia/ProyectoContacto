package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicio.ServicioContactoProxy;

/**
 * Servlet implementation class NuevoContacto
 */
public class NuevoContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NuevoContacto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String telefono = request.getParameter("telefono");
		String mail = request.getParameter("mail");
		String direccion = request.getParameter("direccion");
		String rut = request.getParameter("rut");
		ServicioContactoProxy scp = new ServicioContactoProxy();
		String retorno = scp.crearContacto(nombre, apellido, mail, telefono, direccion, rut);
		String mensaje;
		if (retorno.equals("Contacto ingresado")){
			
			mensaje = "<div class='alert alert-success' role='alert'><strong>Todo bien! </strong> Contacto "
					+ "" + nombre + " " + apellido +" añadido exitosamente. </div>";
			
		} else if (retorno.equals("Contacto existe con anterioridad")){
			
			mensaje = "<div class='alert alert-danger' role='alert'><strong>Oh no! </strong> Contacto "
					+ "" + nombre + " " + apellido +" ya existe. </div>";
			
		} else if(retorno.equals("Valor ingresado invalido")){
			mensaje = "<div class='alert alert-danger' role='alert'><strong>Oh no!</strong> "
					+ "existe un valor no aceptado </div>";
		} else{
			mensaje = "<div class='alert alert-danger' role='alert'><strong>Oh no!</strong> "
					+ "No se agrego nuevo estudiante </div>";
		}
		request.setAttribute("Mensaje",  mensaje);
		request.getRequestDispatcher("nuevoContacto.jsp").forward(request, response);
	}

}
