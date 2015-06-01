<%@page import="servicio.ServicioContactoProxy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8"> 
	<!-- Estilos -->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/estilo.css">
	<link href='http://fonts.googleapis.com/css?family=Arimo' rel='stylesheet' type='text/css'>
	<title>Contactos</title>
</head>
<body>
	<!-- Titulo -->
	<header class="text-center principal">
			<h1>Eliminar contacto</h1>
		
	</header>
<!-- Contenido -->
<div id="contenido" class="container">
<section id="contactos" class="">	
	<!-- Titulo Contenido -->
	<section class="anadir">
		<a href="index.jsp">
			<img src="images/atras.png" alt="">
		<p>Regresar a la lista de contactos</p>
		</a>
		
	</section>
	
	<% 
	 String idc = request.getParameter("idcontacto");
	 ServicioContactoProxy scp = new ServicioContactoProxy();
	 String resultado = scp.eliminarContacto(idc);
	 String mensaje;
	 if (resultado.equals("Contacto eliminado")){
		 mensaje = "<div class='alert alert-success' role='alert'><strong>Todo bien! </strong> Contacto "
					+ "eliminado exitosamente. </div>";
	 } else if (resultado.equals("Contacto no existe")){
		 mensaje = "<div class='alert alert-danger' role='alert'><strong>Oh no! </strong> Contacto "
					+ "no existe. </div>";
	 }else {
		 mensaje = "<div class='alert alert-danger' role='alert'><strong>Todo bien! </strong> Error!. </div>";
	 }
     %>
	<!-- Inicio formulario -->
     <div id="mensaje" class="col-xs-12">
     <%= mensaje %>
     </div>
	
</section>
</div> <!-- Fin Contenido -->
<footer>
	Heber Arratia - UFRO
</footer>
</body>
</html>