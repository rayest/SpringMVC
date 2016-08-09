<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/student/save" method="post">
    <table>
        <tr>
            <th colspan="2">添加学生</th>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name" value="${student.name}"/></td>
        </tr>

        <tr>
            <td>年龄</td>
            <td><input type="text" name="age" value="${student.age}"/></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="hidden" name="id" value="${student.id}" />
                <input type="submit" value="提交" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>
