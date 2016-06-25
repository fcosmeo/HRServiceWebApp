<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="service" class="pe.edu.utp.hrserviceapp.models.ServiceBean" scope="session"/>
<html>
<head>
    <title>Search Countries</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
</head>
<body>
<form action="countEmployeesForCountriesForCriteria.jsp" method="post">
    <div class="form-group">
        <label for="criteria">Criteria for Search</label>
        <p></p>
        <select name="criteria" id="criteria" class="combo-box">
            <c:forEach var="country" items="${service.allCountries}">
                <option value="<c:out value="${country.id}"/>"><c:out value="${country.name}"/></option>
            </c:forEach>
        </select>

    </div>
    <button type="submit" class="btn btn-default">Submit</button>
</form>
</body>
</html>

