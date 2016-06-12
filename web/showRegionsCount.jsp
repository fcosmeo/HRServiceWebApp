<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="service" class="pe.edu.utp.hrserviceapp.models.ServiceBean" scope="session"/>
<html>
<head>
    <title>Show Regions</title>
</head>
<body>
    <p>Regions Count: <jsp:getProperty name="service" property="regionsCount"/></p>
</body>
</html>