<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="windows-1253"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1253">
        <title>JSP Page</title>
        <style>
            .error {
                color:red; font-weight: bold;
            }
        </style>    
    </head>
    <body>
        <h1>Adicionar Carro</h1>
        
        <form:form method="POST" modelAttribute="novoCarro">
            <label for="marca">Marca</label><br />
            <form:select path="marca">
                <c:forEach var="marca" items="${marcas}">
                    <option value="${marca}"><c:out value="${marca}" /></option>
                </c:forEach>
            </form:select>
            <form:errors path="marca" cssClass="error" />
            <br />
            
            <label for="modelo">Modelo</label><br />
            <form:input type="text" path="modelo" />
            <form:errors path="modelo" cssClass="error" />
            <br />
            
            <label for="matricula">Matricula</label><br />
            <form:input path="matricula" /><br />
            <form:errors path="matricula" cassClass="error"/>

            Cilindrada<br />
            <input type="text" name="cilindrada" /><br />
            
            Preco (compra)<br />
            <input type="text" name="precoCompra" /><br />
            
            Preco venda (minimo)<br />
            <input type="text" name="precoMinimoVenda" /><br />
            
            <input type="submit" name="save" value="Guardar" />
            
        </form:form>
    </body>
</html>
