<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Insert New Employee</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<h1> Insert Employee Form</h1>
<br/>

<form modelAttribute="emp" action="save" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" placeholder="Enter name"><br>
    <label for="wage">Wage:</label>
    <input type="number" id="wage" name="wage" placeholder="Enter wage"><br>
    <button type="submit" class="btn btn-success">Add</button>
</form>

</body>
</html>