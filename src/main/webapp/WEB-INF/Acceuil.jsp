<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Ajouter un employé</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h1 class="mt-5">Ajouter un employé</h1>
    <form method="post" action="A">
        <div class="form-group">
            <label for="Id">Id :</label>
            <input type="number" class="form-control" id="Id" name="Id">
        </div>
        <div class="form-group">
            <label for="Nom">Nom :</label>
            <input type="text" class="form-control" id="Nom" name="Nom">
        </div>
        <div class="form-group">
            <label for="Email">Email :</label>
            <input type="text" class="form-control" id="Email" name="Email">
        </div>
        <div class="form-group">
            <label for="Numéro">Numéro :</label>
            <input type="number" class="form-control" name="Numero">
        </div>
        <div class="form-group">
            <label for="Département">Département :</label>
            <input type="text" class="form-control"  name="Departement">
        </div>
        <div class="form-group">
            <label for="Poste">Poste :</label>
            <input type="text" class="form-control" id="Poste" name="Poste">
        </div>
        <button type="submit" class="btn btn-primary">Ajouter</button>
    </form>
</div>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
