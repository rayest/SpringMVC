<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/7 0007
  Time: 下午 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"/>
    <input type="submit" name="上传"/>
</form>
</body>
</html>