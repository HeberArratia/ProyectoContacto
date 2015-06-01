
<%@page import="servicio.ServicioContactoProxy"%>
<%@page import="orm.Contacto"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<!-- Estilos -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/estilo.css">
<link rel="stylesheet" type="text/css" href="css/font-awesome.css">
<link rel="stylesheet" type="text/css" href="css/fonts.css">
<!-- JS -->
<script type="text/javascript" src="js/jquery-2.1.3.min.js"></script>
<script type="text/javascript" src="js/codigo.js"></script>

<link href='http://fonts.googleapis.com/css?family=Arimo'
	rel='stylesheet' type='text/css'>
<title>Contactos</title>
</head>
<body>
	<!-- Titulo -->
	<header class="text-center principal">
	<h1>Contactos</h1>

	</header>
	<!-- Contenido -->
	<div id="contenido" class="container">
		<section id="contactos" class=""> <!-- Titulo Contenido -->
		<section class="anadir"> <a href="nuevoContacto.jsp"> <img
			src="images/add.png" alt="">
			<p>Añadir contacto</p>
		</a> </section>
		<%
		ServicioContactoProxy scp = new ServicioContactoProxy();
		Contacto contactos[] = scp.listaContactos();
		
		for(int i = 0;i<contactos.length;i++){ %> 
		<div class="contacto">
			<div class="col-xs-9">
				<p id="nombre"><%=contactos[i].getNombre() + " " + contactos[i].getApellido() %></p>
				<p class="datosecundarios"><%= contactos[i].getTelefono() %></p>
				<p class="datosecundarios"><%= contactos[i].getMail() %></p>
				<p class="datosecundarios"><%= contactos[i].getDireccion()%></p>
				<p class="datosecundarios"><%= contactos[i].getRut() %></p>
			</div>
			<div class="col-xs-3">
				<div class="col-xs-6">
					<a href="editarContacto.jsp?nom=<%=contactos[i].getNombre()%>&&ape=<%=contactos[i].getApellido()%>&&tele=<%= contactos[i].getTelefono() %>&&mail=<%= contactos[i].getMail() %>&&dire=<%= contactos[i].getDireccion()%>&&rut=<%= contactos[i].getRut()%>&&idcontacto=<%=contactos[i].getUid()%>"><img class="control" src="images/edit.png"
						alt="Editar"></a>
				</div>
				<div class="col-xs-6">
					<a href="eliminarContacto.jsp?idcontacto=<%=contactos[i].getUid()%>"><img class="control" src="images/delete.png"
						alt="Eliminar"></a>
				</div>
			</div>
			<div class="col-xs-12 separador"></div>
		</div>
       <%} %>

		<!-- Inicio formulario -->
		<form></form>
		<!-- Fin formulario --> </section>
	</div>
	<!-- Fin Contenido -->
	<footer> Heber Arratia - UFRO </footer>
</body>
</html>