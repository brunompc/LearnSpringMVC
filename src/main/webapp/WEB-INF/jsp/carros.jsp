<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="windows-1253"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">
        <c:choose>
            <c:when test="${not empty carros}">
            <table border="1">
                <tr>
                    <td><b>Marca</b></td>
                    <td><b>Modelo</b></td>
                    <td><b>Matricula</b></td>
                    <td><b>Cilindrada</b></td>
                    <td colspan="3">&nbsp;</td>
                </tr>
                <c:forEach var="carro" items="${carros}">
                    <tr>
                        <td>${carro.marca}</td>
                        <td>${carro.modelo}</td>
                        <td>${carro.matricula}</td>
                        <td>${carro.cilindrada}</td>
                        <td><a href="${pageContext.request.contextPath}/carroDetail/${carro.id}">Ver</a></td>
                        <td><a href="${pageContext.request.contextPath}/carroEdit/${carro.id}">Editar</a></td>
                        <td><a href="">Apagar</a></td>
                    </tr>
                </c:forEach>
            </table>
            </c:when>
            <c:otherwise>
                Lista de carros Vazia.
            </c:otherwise>
        </c:choose>
    </tiles:putAttribute>
</tiles:insertDefinition>

