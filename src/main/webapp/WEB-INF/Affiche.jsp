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
              <c:forEach items="${Employees}" var="Employee">
                <tr>
              
                    <td>${Employee.Nom}</td>
                    <td>{Employee.Email}</td>
                    <td>{Employee.Numéro}</td>
                    <td>{Employee.Département}</td>
                    <td>{Employee.Poste}</td>
                     
                </tr>
                 </c:forEach>
             
           
        </table>
    
    
   
</body>
</html>


