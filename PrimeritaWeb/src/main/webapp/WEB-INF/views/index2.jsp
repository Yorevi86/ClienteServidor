<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora formulario</title>
</head>
<body>
    <form name="calculadora" method="get" action="result">

        <p>Indique un numero:</p>

        <input type="number" value="" name="num1">

        <p>Indique otro numero:</p>

        <input type="number" value="" name="num2">

        <p>Seleccione una operacion de las siguientes:</p>
        <select name="operacion" id="op">
            <option value="suma">Suma</option>
            <option value="resta">Resta</option>
            <option value="multi">Multiplicacion</option>
            <option value="divi">Division</option>
        </select>

        <input type="submit" value="Calcular">
    </form>
</body>
</html>