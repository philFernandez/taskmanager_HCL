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
    <div class="main">
        <form:form modelAttribute="user" class="form-control">

            <table class="table">
                <tr>
                    <td>
                        <form:label path="userName" class="form-label">User Name</form:label>
                    </td>
                    <td>
                        <form:input path="userName" type="text" class="form-control" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="email" class="form-label">Email</form:label>
                    </td>
                    <td>
                        <form:input path="email" type="email" class="form-control" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="password" class="form-label">Password</form:label>
                    </td>
                    <td>
                        <form:input path="password" type="password" class="form-control" />
                    </td>
                </tr>
            </table>
            <button type="submit" class="btn btn-dark">Submit</button>
        </form:form>

    </div>
</body>
</html>