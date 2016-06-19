<%--
  Created by IntelliJ IDEA.
  User: GrupoUTP
  Date: 18/06/2016
  Time: 09:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="service" class="pe.edu.utp.hrserviceapp.models.ServiceBean" scope="session"/>
<jsp:setProperty name="service" property="textCriteria" value="<%=request.getParameter("criteria")%>"/>

<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

    <title>List Countries for Criteria</title>
</head>
<body>
<table class="table-striped">
    <thead>
    <tr>
        <th>Country</th>
        <th>Region</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="country" items="${service.countriesForTextCriteria}">
        <tr>
            <td><c:out value="${country.name}"/></td>
            <td><c:out value="${country.name}"/></td>
        </tr>
    </tbody>
</table>

</body>
</html>
