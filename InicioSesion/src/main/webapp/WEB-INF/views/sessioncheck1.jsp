<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio sesion</title>
</head>
<body>
    <%
    if (request.getSession() != null) {
	    HttpSession sessionTemp = request.getSession();
	    String userName = (String) sessionTemp.getAttribute("user");
	    out.println(
	    		"<p>Enhorabuena " +
	    		userName +
	    		", has pasado.</p><br>"
	    		);
    }else{
    	out.println("La sesión ha caducado.Vuelva a la página principal.");
    }
    %>
    <input type="button" onclick="location.href='sessioncheck2'" value="Prueba 2" />
    <input type="button" onclick="location.href='index'" value="Principal" />
</body>
</html>