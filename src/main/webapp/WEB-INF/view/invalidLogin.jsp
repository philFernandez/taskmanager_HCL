<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <link rel="stylesheet" href="/exceptionStyle.css">
    <title>Invalid Password</title>
</head>
<body>
    
    <div align="center" class="task-header">
        <h1 class="display-2">Passwords Don't Match</h1>
    </div>
    <br>
    <div class="container">
        <h5>
            The password entered does not match our records
        </h5>
        <a href="login"><button class="btn btn-primary">Try Again</button></a>
    </div>
</body>
</html>
