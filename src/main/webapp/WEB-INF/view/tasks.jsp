<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <link rel="stylesheet" href="/style.css">
    <title>Task List</title>
</head>
<body>
    <div align="center" class="task-header">
        <h1 class="display-2">All Tasks</h1>
    </div>
    <div class="main">
        <c:forEach var="task" items="${taskList}">
            <h1 class="display-6">${task.taskName}</h1>
            <table class="table">
                <tr class="table-dark">
                    <th>Start Date</th>
                    <th>End Date</th>
                    <th>Description</th>
                    <th>Severity</th>
                </tr>
                <tr>
                    <td>${task.startDate}</td>
                    <td>${task.endDate}</td>
                    <td>${task.description}</td>
                    <td>${task.severity}</td>
                </tr>
            </table>
            <br>
        </c:forEach>
    </div>
</body>
</html>
