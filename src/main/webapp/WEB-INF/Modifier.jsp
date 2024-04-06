<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<p> Modifier un employee</p>

 <form method="post" action="A">
 
  <p>
	 
	      <label for="Id">Id :</label>
          <input type="number" name="Id" id="Id" value="${employeeToModify.getId()}"  />
	 
	 </p>
	 <p>
	 
	       <label for="newNom">Nom : </label>
            <input type="text" name="newNom" id="Nom" value="${employeeToModify.getNom()}"/>
	 
	 </p>
	 
	  <p>
	 
	       <label for="newEmail">Email : </label>
            <input type="text" name="newEmail" id="Email" value="${employeeToModify.getEmail()}" />
	 
	 </p>
	 
	  <p>
	 
	       <label for="newNuméro">Numéro : </label>
            <input type="Number" name="newNuméro" id="Numéro" value="${employeeToModify.getNuméro()}"/>
	 
	 </p>
	 
	  <p>
	 
	       <label for="newDépartement">Département: </label>
            <input type="text" name="newDépartement" id="Département" value="${employeeToModify.getDépartement()}" />
	 
	 </p>
	 
	   <p>
	 
	       <label for="newPoste">Poste: </label>
            <input type="text" name="newPoste" id="Poste" value="${employeeToModify.getPoste()}"/>
	 
	 </p>
         
            
            <input type="submit" value="Modifier"/>
        </form>


</body>
</html>