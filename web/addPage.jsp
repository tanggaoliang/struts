<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Tanggl
  Date: 2018/12/6
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Add Page</title>
</head>
<body>
<h1 align="center" style="color:green"> Add Page </h1>
<%--普通方式--%>
<%--<h1 align="center" style="color:green">name is  ${name}</h1>--%>
<%--重定向带参数的--%>
<h1 align="center" style="color:green">redirct:${param.name} </h1>
<s:debug/>
</body>
</html>
