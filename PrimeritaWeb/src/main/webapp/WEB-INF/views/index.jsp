<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <% 
        ArrayList<String> alnombres = new ArrayList<String>();
        alnombres.add("Jonatan");
        alnombres.add("Carrera");
        alnombres.add("Juan");
        alnombres.add("Castaño");
        alnombres.add("Ricardo");
        alnombres.add("Algo");
        alnombres.add("Fernando");
        alnombres.add("Perez");
        alnombres.add("Jeffery");
        alnombres.add("Wilberth");
        %>

        <script>
            function pinchar(){
                var campo = document.getElementById("cosa");
                alert("Hola " + cosa.value);
            }
        </script>
    </head>
    <body>
        <% out.println("<h1>\"Personas\"</h1>");
        %>
        <table border="1">
            <tr>
                <td>Nombre</td>
                <td>Apellidos</td>
            </tr>
            <% for (int i=0; i<alnombres.size(); i = i+2) {
                out.println("<tr><td>" + alnombres.get(i) + "</td><td>" + alnombres.get(i+1) + "</td></tr>");
            }
            %>
        </table>

        <input type="text" value="" id="cosa">
        <input type="button" value="Clica aquí" onclick="javascript:pinchar()">
    </body>
</html>