
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="service" class="pe.edu.utp.hrserviceapp.models.ServiceBean" scope="session"/>
<html>
<head>
    <title>Countries Count</title>
</head>
<body>
<p>Countries Count: <jsp:getProperty name="service" property="countriesCount"/></p>
</body>
</html>

