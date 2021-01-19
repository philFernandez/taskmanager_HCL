<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <link rel="stylesheet" href="/style.css">
    <title>Register</title>
</head>
<body>
    
    <div align="center" class="task-header">
        <h1 class="display-2">Register</h1>
    </div>
    <br>
    <div class="container">
        <form:form modelAttribute="user" class="form-control">
            <form:label path="userName" class="form-label">User Name</form:label>
            <form:input path="userName" type="text" class="form-control" />
            <br>
            <form:label path="email" class="form-label">Email</form:label>
            <form:input path="email" type="email" class="form-control" />
            <br>
            <form:label path="password" class="form-label">Password</form:label>
            <form:input path="password" type="password" class="form-control" />
            <br>
            <button type="submit" class="btn btn-success">Register</button>
        </form:form>
    </div>
</body>
</html>