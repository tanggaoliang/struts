<%--
  Created by IntelliJ IDEA.
  User: Tanggl
  Date: 2018/12/5
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>upload</title>
</head>
<body>
<div>
    <form action="upload" method="post" enctype="multipart/form-data">
        upload :<input type="file" name="image" accept="image/*"> <br>
        <input type="submit" value="submit">
    </form>
</div>
</body>
</html>
