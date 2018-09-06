<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="windows-1253"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1253">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:choose>
            <c:when test="${not empty carros}">
            <table border="1">
                <tr>
                    <td><b>Matricula</b></td>
                    <td><b>Cilindrada</b></td>
                    <td><b>Detalhe</b></td>
                </tr>
                <c:forEach var="carro" items="${carros}">
                    <% String viewURL = ""; %>
                    <tr>
                        <td>${carro.matricula}</td>
                        <td>${carro.cilindrada}</td>
                        <td><a href="${pageContext.request.contextPath}/carroDetail/${carro.id}">Ver</a></td>
                    </tr>
                </c:forEach>
            </table>
            </c:when>
            <c:otherwise>
                Lista Vazia.
            </c:otherwise>
        </c:choose>
    </body>
</html>
