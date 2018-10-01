<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Carro</title>
</head>
<body>

	<h1>Cadastro de Veículos</h1>

	<form action="cadastrar" method="post">
		<div>
			<label for="id-placa">Placa</label>
			<input type="text" name="placa" id="id-placa">
		</div>
		<div>
			<label for="id-preco">Preço</label>
			<input type="text" name="preco" id="id-preco">
		</div>
		<div>
			<input type="checkbox" name="automatico" id="id-auto">
			<label for="id-auto">Automático</label>
		</div>
		<div>
			<label for="id-marca">Marca</label>
			<select id="id-marca" name="marca">
				<option>Ford</option>
				<option>Fiat</option>
				<option>GM</option>
				<option>Volkswagen</option>
			</select>
		</div>
		<input type="submit" value="OK">
	</form>

	 <% // Uso de Expression Languages para obter valores, referênciando a chave "carro" e seus atributos ex:"placa"  %>

	${carro.placa }
	${carro.preco }
	${carro.marca }
	${carro.automatico }

</body>
</html>