<!DOCTYPE html>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultado</title>
</head>
<body>
    <% HashMap<String,String> checks = (HashMap) request.getAttribute("mapaValidacion");

	        for (Map.Entry<String, String> data : checks.entrySet()) {
	            out.println(data.getKey() + data.getValue() + "<br>");
	    	}
    %>
</body>
</html>