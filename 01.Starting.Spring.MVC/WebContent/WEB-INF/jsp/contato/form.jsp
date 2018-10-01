<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contato</title>
</head>
<body>


	<h1>Contato</h1>

	<form action="enviar" method="post">
		<div>
			<label for="id-nome">Nome</label>
			<input type="text" name="nome" id="id-nome">
		</div>
		<div>
			<label for="id-email">Email</label>
			<input type="text" name="email" id="id-email">
		</div>
		<div>
			<label for="id-tel">Telefone</label>
			<input type="text" name="tel" id="id-tel">
		</div>
		<input type="submit" value="Enviar">
	</form>
	${msg}
	${atributos}




</body>
</html>