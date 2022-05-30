<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring CRUD</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>

<body>
 <div class="container">
  <div class="col-md-offset-2 col-md-7">
   <h2 class="text-center">Função Read</h2>
	<div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Lista de Contatos</div>
    </div>
    <div class="panel-body">
     <table class="table table-striped table-bordered">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Telefone</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="contact" items="${contacts}">
            <tr>
                <td>${contact.id}</td>
                <td>${contact.name}</td>
                <td>${contact.email}</td>
                <td>${contact.telefone}</td>
                <td><a href="/update-contact/${contact.id}" class="btn btn-success" role="button">Update</a>   <a href="/delete-contact/${contact.id}" class="btn btn-danger" role="button">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
	<a href="/create-contact" class="btn btn-primary" role="button">Adicionar Contato</a>
	<a href="/" class="btn btn-primary col-md-offset-1"  role="button">Logout</a>
    </div>
   </div>
  </div>
  <br/>
</div>
</body>
</html>