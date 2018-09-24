<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@page contentType="text/html" pageEncoding="windows-1253"%>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style.css">

<!DOCTYPE html>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

        <h2>Editar Carro</h2>
        
        <c:choose>
            <c:when test="${not empty ERROR_MESSAGE }">
                <b>${ERROR_MESSAGE}</b>
            </c:when>
            <c:otherwise>
                <form:form method="POST" modelAttribute="carroForm">
                    <label for="marca">Marca</label><br />
                    <form:select path="marca">
                    <c:forEach var="marca" items="${marcas}">
                        <option value="${marca}"><c:out value="${marca}" /></option>
                    </c:forEach>
                    </form:select>
                    <form:errors path="marca" cssClass="error" />
                    <br />
            
                    <label for="modelo">Modelo</label><br />
                    <form:input type="text" path="modelo" value="${carro.modelo}" />
                    <form:errors path="modelo" cssClass="error" />
                    <br />

                    <label for="matricula">Matricula</label><br />
                    <form:input path="matricula" value="${carro.modelo}" /><br />
                    <form:errors path="matricula" cassClass="error"/>

                    Cilindrada<br />
                    <input type="text" name="cilindrada" value="${carro.modelo}" /><br />

                    Preco (compra)<br />
                    <input type="text" name="precoCompra" value="${carro.modelo}" /><br />

                    Preco minimo (venda)<br />
                    <input type="text" name="precoMinimoVenda" /><br />

                    <input type="submit" name="save" value="Guardar" />

                </form:form>
            </c:otherwise>
        </c:choose>
    </tiles:putAttribute>
</tiles:insertDefinition>
