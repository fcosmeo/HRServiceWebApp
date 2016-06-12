<%--
  Created by IntelliJ IDEA.
  User: GrupoUTP
  Date: 11/06/2016
  Time: 09:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="service" class="pe.edu.utp.hrserviceapp.models.ServiceBean" scope="session"/>
<html>
<head>
    <title>Show Countries</title>
</head>
<body>
    <p>Countries Count: <jsp:getProperty name="service" property="countriesCount"/></p>
</body>
</html>
