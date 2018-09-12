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
                    <td><b>Matricula</b></td>
                    <td><b>Cilindrada</b></td>
                    <td><b>Detalhe</b></td>
                </tr>
                <c:forEach var="carro" items="${carros}">
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
        <a href="novoCarro">Adicionar Carro</a>
    </tiles:putAttribute>
</tiles:insertDefinition>

