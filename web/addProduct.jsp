<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Tanggl
  Date: 2018/12/5
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>AddProduct</title>
</head>

<body>
<div align="center">
    <form action="addProduct" method="post">
        name:<input type="text" name="product.name"> <br>
        <input type="submit" value="submit">
    </form>
</div>

</body>
</html>
