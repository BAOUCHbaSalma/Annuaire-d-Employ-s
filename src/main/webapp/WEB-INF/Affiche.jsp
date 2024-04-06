<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Liste des Employés</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1>Liste des Employés</h1>

        <table class="table table-bordered mt-3">
            <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Nom</th>
                    <th scope="col">Email</th>
                    <th scope="col">Numéro</th>
                    <th scope="col">Département</th>
                    <th scope="col">Poste</th>
                    <th scope="col">Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="employee" items="${listEmp}">
                    <tr>
                       <td>${employee.getId()}</td>
                        <td>${employee.getNom()}</td>
                        <td>${employee.getEmail()}</td>
                        <td>${employee.getNuméro()}</td>
                        <td>${employee.getDépartement()}</td>
                        <td>${employee.getPoste()}</td>
                        <td>
                            <a href="/Gestion_Employee/Modifier?Id=${employee.getId()}" class="btn btn-primary btn-sm">Modifier</a>
                            <a href="/Gestion_Employee/Supprimer?Id=${employee.getId()}" class="btn btn-danger btn-sm">Supprimer</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
      
        <a href="/Gestion_Employee/" class="btn btn-success">Ajouter Employé</a>
    </div>

  

   
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
