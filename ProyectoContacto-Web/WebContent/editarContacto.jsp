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
	
	<link href='http://fonts.googleapis.com/css?family=Arimo' rel='stylesheet' type='text/css'>
	<title>Editar contactos</title>
</head>
<body>
	<!-- Titulo -->
	<header class="text-center principal">
			<h1>Editar contacto</h1>
		
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
	<!-- Inicio formulario -->

	
	
	<% 
	String nom = request.getParameter("nom");
	String ape = request.getParameter("ape");
	String tele = request.getParameter("tele");
	String mail = request.getParameter("mail");
	String dire = request.getParameter("dire");
	String rut = request.getParameter("rut");
	String idcontacto = request.getParameter("idcontacto");
	request.setAttribute("Nom", nom);
	request.setAttribute("Ape", ape);
	request.setAttribute("Tele", tele);
	request.setAttribute("Mail", mail);
	request.setAttribute("Dire", dire);
	request.setAttribute("Rut", rut);
	request.setAttribute("idc", idcontacto);
     %>

	<form class="col-xs-12" action="EditarContacto" method="post">
	 <input type="text" class="ancho200 form-control" value="${idc}" name="idcon" required></imput>
  	<label for="exampleInput">Nombre:</label>
  	 <input type="text" class="ancho200 form-control" value="${Nom}" name="nombre" required></imput>
  	 <label for="exampleInput">Apellido:</label>
  	 <input type="text" class="ancho200 form-control" value="${Ape}" name="apellido" required></imput>	
  	 <label for="exampleInput">Teléfono:</label>
  	 <input type="text" class="ancho200 form-control" value="${Tele}" name="telefono" required></imput>
  	 <label for="exampleInput">Mail:</label>
  	 <input type="email" class="ancho200 form-control" value="${Mail}" name="mail" required></imput>
  	 <label for="exampleInput">Dirección:</label>
  	 <input type="text" class="ancho200 form-control" value="${Dire}" name="direccion" required></imput>
  	 <label for="exampleInput">Rut:</label>
  	 <input type="text" class="ancho200 form-control" value="${Rut}" name="rut" required></imput>
  	 <div id="mensaje"> ${Mensaje}</div>
  	
  	   <button id="boton" type="submit" class="btn btn-primary btn-lg" >Editar contacto</button>
	</form> <!-- Fin formulario -->
</section>
</div> <!-- Fin Contenido -->
<footer>
	Heber Arratia - UFRO
</footer>
</body>
</html>