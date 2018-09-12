<%@page contentType="text/html" pageEncoding="windows-1253"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
    <body>
        <div clas="page">
            <tiles:insertAttribute name="header" />
            <div class="content">
                <tiles:insertAttribute name="body" />
            </div>
            <tiles:insertAttribute name="footer" />
        </div>
    </body>
</html>
