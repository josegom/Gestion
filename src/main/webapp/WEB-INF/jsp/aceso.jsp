
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>                        
<sf:form method="POST" modelAttribute="usuario">
	<fieldset>
	<legend>Introduzca el nombre de usuario y la clave.</legend>
	<table>
	<tr>
		<th><label for="nombre">Nombre:</label></th>
		<td><sf:input path="nombre" id="nombre"/></td>
	</tr>
	<tr>
		<th><label for="nombre">Clave:</label></th>
		<td><sf:password path="clave" id="clave" size="15"/></td>
	</tr>
	<tr>
     <td colspan="2">
         <input type="submit" value="Aceptar" />
     </td>
	</tr>
	
	</table>
	</fieldset>
</sf:form>

