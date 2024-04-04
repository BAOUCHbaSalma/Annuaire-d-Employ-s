<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Liste des Employés</title>
</head>
<body>
    <h1>Liste des Employés</h1>
    
    

        <table border="1">
            <tr>
                <th>Nom</th>
                <th>Email</th>
                <th>Numéro</th>
                <th>Département</th>
                <th>Poste</th>
            </tr>
            
            <c:forEach var="employee" items="${sessionScope.listEmp}">
				    <tr>
				        <td>${employee.getNom()}</td>
				        <td>${employee.getEmail()}</td>
				        <td>${employee.getNuméro()}</td>
				        <td>${employee.getDépartement()}</td>
				        <td>${employee.getPoste()}</td>
				    </tr>
			</c:forEach>

              
             
           
        </table>
        <button><a href="/Gestion_Employee/">AJOUTER</a></button>
    
    
   
</body>
</html>


