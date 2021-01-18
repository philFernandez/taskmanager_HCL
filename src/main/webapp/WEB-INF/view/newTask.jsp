<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <link rel="stylesheet" href="/style.css">
    <title>New Task</title>
</head>
<body>
    <div align="center" class="task-header">
        <h1 class="display-2">New Task</h1>
    </div>
    <div class="main">
        <form:form modelAttribute="task">

            <table class="table">
                <tr>
                    <td>
                        <form:label path="taskName">Task Name</form:label>
                    </td>
                    <td>
                        <form:input path="taskName" type="text" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="startDate">Start Date</form:label>
                    </td>
                    <td>
                        <form:input path="startDate" type="date" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="endDate">End Date</form:label>
                    </td>
                    <td>
                        <form:input path="endDate" type="date" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="description">Description</form:label>
                    </td>
                    <td>
                        <form:textarea path="description" />
                    </td>
                </tr>
            </table>
            <button type="submit" class="btn btn-dark">Save Task</button>

        </form:form>

    </div>
    
</body>
</html>