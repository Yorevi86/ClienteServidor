<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultado</title>
</head>
<body>

    <%  String dato1 = request.getParameter("num1");
        String dato2 = request.getParameter("num2");
        String operation = request.getParameter("operacion");
    
        Integer num1 = Integer.valueOf(dato1);
        Integer num2 = Integer.valueOf(dato2);
        Integer resultado = 0;
    
        switch (operation) {
            case "suma":
                resultado = num1 + num2;
                break;
            case "resta":
                resultado = num2 -num1;
                break;
            case "multi":
                resultado = num1 * num2;
                break;
            case "divi":
                resultado = num2 / num1;
                break;
        }
    %>

    <p>El resultado de la operación <%= operation %> con los numeros <%= num1 %> y <%= num2 %> es: <%= resultado %></p>
</body>
</html>