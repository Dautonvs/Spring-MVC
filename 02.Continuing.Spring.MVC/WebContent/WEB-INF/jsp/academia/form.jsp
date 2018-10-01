<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Academia</title>
</head>
<body>
	<form action="cadastrar" method="post">
		<div>
			<labelfor="id-nome">Nome</label>
			<input type="text" name="nome" id="id-nome">
		</div>
		<div>
			<labelfor="id-matr">Matricula</label>
			<input type="text" name="matricula" id="id-matr">
		</div>
		<div>
			<labelfor="id-turma">Turma</label>
			<input type="text" name="turma" id="id-turma">
		</div>
		<div>
			<input type="checkbox" name="matriculado" id="id-matriculado">
			<labelfor="id-matriculado">Matriculado</label>

		</div>
		<div>
		<input type="radio" name="genero" id="fem" value="Feminino">
		<label for="fem">Feminino</label>
		<input type="radio" name="genero" id="masc" value="Masculino">
		<label for="fem">Masculino</label>

		</div>
		<input type="submit" value="Enviar">
	</form>




</body>
</html>