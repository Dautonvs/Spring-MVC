<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tags:template titulo="Cadastro de Festa">


	<c:if test="${not empty msg }">
		<div class="alert alert-succes">
			${msg}
		</div>
	</c:if>



	<form action="cadastrar" method="post">
		<div class="form-group">
			<labelfor="id-qtd">Quantidade de Pessoas</label>
			<input type="text" name="quantidade" class="form-control" id="id-qtd">
		</div>
		<div class="form-group">
			<labelfor="id-end">Endereço</label>
			<input type="text" name="endereco" class="form-control"
					id="id-end">
		</div>
		<div class="form-group">
			<labelfor="id-card">Cardapio</label>
			<textarea rows="5" cols="50" class="form-control"
						name="cardapio" id="id-card"></textarea>

		</div>
		<div class="form-group">
			<input type="checkbox" name="lembranca" id="id=lemb">
			<labelfor="id-lemb">Lembrancas</label>
		</div>
		<input type="submit" value="Cadastrar" class="btn btn-primary">
	</form>


</tags:template>
