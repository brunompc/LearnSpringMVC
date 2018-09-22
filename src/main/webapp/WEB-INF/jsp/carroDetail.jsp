<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="windows-1253"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

        <h1>O meu carro #${id}</h1>

        <b>ID:</b> ${carro.id}<br />
        <b>Matricula:</b> ${carro.matricula}<br />
        <b>Marca:</b> ${carro.marca}<br />
        <b>Modelo:</b> ${carro.modelo}<br />
        <b>Cilindrada:</b> ${carro.cilindrada}<br />

    </tiles:putAttribute>
</tiles:insertDefinition>