<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Tanggl
  Date: 2018/12/5
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>ADD PRODUCT 2</title>
</head>
<s:head/>
<body>
<div align="center">
    <s:form action="addProduct">
        <s:textfield name="product.name" label="product name"/>
        <s:submit value="Submit"/>
    </s:form>

</div>

</body>
</html>
