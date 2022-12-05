<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.primerita.web.clases.Persona" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Personas</title>
</head>
<body>
    <%  ArrayList<Persona> tabla = new ArrayList<Persona>();
        int cantidadHombres = 0;
        int cantidadMujeres = 0;
        HashMap<String, ArrayList<Persona>> ciudades = new HashMap<String, ArrayList<Persona>>();

        tabla.add(new Persona ("Jonatan", "Carrera Viera", "Sevilla", 'h'));
        tabla.add(new Persona ("Juan", "Castaño Carrilero", "Huelva", 'h'));
        tabla.add(new Persona ("Fernando", "Pérez Nieto", "Cádiz", 'm'));
        tabla.add(new Persona ("Pablo", "Domínguez Romero", "Almería", 'h'));
        tabla.add(new Persona ("Rafael", "Herrera Chávez", "Perú", 'h'));
        tabla.add(new Persona ("Paula", "Hidalgo Mauriño", "Córdoba", 'm'));
        tabla.add(new Persona ("Ana Isabel", "García Ruiz", "Málaga", 'm'));
        tabla.add(new Persona ("Paula", "Zújar Cote", "Jaen", 'm'));
        tabla.add(new Persona ("Sara", "Artiles Hera", "Huelva", 'm'));
        tabla.add(new Persona ("Eva", "Cárdenas Bermudez", "Murcia", 'm'));
    
    %>
	<table border="1">
        <tr>
            <td>Nombre</td>
            <td>Apellidos</td>
            <td>Provincia</td>
            <td>Sexo</td>
        </tr>
        <% for (int i=0; i<tabla.size(); i++) {
            out.println(
                "<tr><td>" + tabla.get(i).getNombre() +
                "</td><td>" + tabla.get(i).getApellidos() +
                "</td><td>" + tabla.get(i).getProvincia() +
                "</td><td>" + tabla.get(i).getSexo() +
                "</td></tr>");

            if (tabla.get(i).getSexo() == 'h'){
                cantidadHombres++;
            }else{
                cantidadMujeres++;
            }

            if (ciudades.get(tabla.get(i).getProvincia()) == null){
                String ciudadProvisional = tabla.get(i).getProvincia();
                ciudades.put(ciudadProvisional, new ArrayList<Persona>());
                ciudades.get(ciudadProvisional).add(tabla.get(i));
            }else{
                ciudades.get(tabla.get(i).getProvincia()).add(tabla.get(i));
            }
        }
        %>
    </table>

    <p>La cantidad de personas es <%= tabla.size() %>, siendo <%= cantidadHombres %> hombres y <%= cantidadMujeres %> mujeres.</p>

    <p>Las personas según provincia son:</p>
	<%
	for (Map.Entry<String, ArrayList<Persona>> mapaCiudades : ciudades.entrySet()) {
		String ciudad = mapaCiudades.getKey();
		ArrayList<Persona> personas = mapaCiudades.getValue();
		
		out.println(ciudad);
		out.println(
				"<table border=\"1\">" +
				"<tr>" +
				"<td>Nombre</td>" +
				"<td>Apellidos</td>" +
				"<td>Sexo</td>" +
				"</tr>");
		
		for (int i = 0; i<personas.size(); i++){
			out.println(
			"<tr><td>" + personas.get(i).getNombre() +
			"</td><td>" + personas.get(i).getApellidos() +
			"</td><td>" + personas.get(i).getSexo() +
			"</td></tr>");
		}
		
		out.println("</table><br>");
	}
	%>


</body>
</html>