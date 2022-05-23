<%@ page import="com.example.entity.Student" %>
<%
    Student student = (Student) request.getAttribute("studentNgoaiView");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2 class="p-3 mb-2 bg-success text-white">Success</h2>
    <div>Đăng kí thành công</div>
    <div class="alert alert-success">
        <div>
            Username: <%= student.getUsername()%>
        </div>
        <div>
            Fullname: <%= student.getFullname()%>
        </div>
        <div>
            Email: <%= student.getEmail()%>
        </div>
        <div>
            Phone: <%= student.getPhone()%>
        </div><div>
            Birthday: <%= student.getBirthday()%>
        </div>
    </div>


</div>

</body>
</html>
