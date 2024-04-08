<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Modifier un employé</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h1 class="mt-5">Modifier un employé</h1>
    <form method="post" action="M">
        <div class="form-group">
            <label for="Id">Id :</label>
            <input type="number" class="form-control" id="Id" name="Id" value="${employeeToModify.getId()}" readonly>
        </div>
        <div class="form-group">
            <label for="newNom">Nom :</label>
            <input type="text" class="form-control" id="Nom" name="newNom" value="${employeeToModify.getNom()}">
        </div>
        <div class="form-group">
            <label for="newEmail">Email :</label>
            <input type="text" class="form-control" id="Email" name="newEmail" value="${employeeToModify.getEmail()}">
        </div>
        <div class="form-group">
            <label for="newNumero">Numéro :</label>
            <input type="number" class="form-control" id="Numéro" name="newNumero" value="${employeeToModify.getNuméro()}">
        </div>
        <div class="form-group">
            <label for="newDepartement">Département :</label>
            <input type="text" class="form-control" id="Département" name="newDepartement" value="${employeeToModify.getDépartement()}">
        </div>
        <div class="form-group">
            <label for="newPoste">Poste :</label>
            <input type="text" class="form-control" id="Poste" name="newPoste" value="${employeeToModify.getPoste()}">
        </div>
        <button type="submit" class="btn btn-primary">Modifier</button>
    </form>
</div>

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
