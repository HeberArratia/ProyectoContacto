package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.ParseConversionEvent;

import servicio.ServicioContactoProxy;

/**
 * Servlet implementation class EditarContacto
 */
public class EditarContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarContacto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nombre");
		String ape = request.getParameter("apellido");
		String tele = request.getParameter("telefono");
		String mail = request.getParameter("mail");
		String dire = request.getParameter("direccion");
		String rut = request.getParameter("rut");
		int idc = Integer.parseInt(request.getParameter("idcon"));  
		ServicioContactoProxy scp = new ServicioContactoProxy();
		String mensaje = scp.modificarContacto(nom, ape, mail, tele, dire, rut, idc);
		String direccion = "mensajeEdicion.jsp?resultado="+mensaje;
		response.sendRedirect(direccion);
	}

}
