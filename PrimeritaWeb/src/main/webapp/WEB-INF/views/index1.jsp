<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.primerita.web.utilidades.Calculadora" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora</title>
</head>
<body>
    <% int primero = 3;
    int segundo = 6;
    
    Calculadora cal = new Calculadora();
    %>
	<p>La suma de los 3 campos es: <%= cal.suma(primero, segundo) %></p>
    <p>La resta de los 3 campos es: <%= cal.resta(primero, segundo) %></p>
    <p>La multiplicación de los 3 campos es: <%= cal.multi(primero, segundo) %></p>

    <p>Los valores eran <%= primero %> y <%= segundo %></p>
</body>
</html>