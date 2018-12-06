<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Tanggl
  Date: 2018/12/5
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>LIST</title>
    <style>
        table {
            border-collapse: collapse
        }

        td {
            border: 1px solid gray
        }
    </style>
</head>
<body>
<h1 align="center" style="color:green"> ${date} </h1>
<table align="center">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>st.index</td>
        <td>st.count</td>
        <td>st.first</td>
        <td>st.last</td>
        <td>st.odd</td>
        <td>st.even</td>
    </tr>
    <s:iterator value="products" var="p" status="st">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${st.index}</td>
            <td>${st.count}</td>
            <td>${st.first}</td>
            <td>${st.last}</td>
            <td>${st.odd}</td>
            <td>${st.even}</td>
        </tr>
    </s:iterator> <br>
    <s:checkboxlist list="products" value="selectedProducts" name="product.id"
                    listValue="name" listKey="id"/> <br>
    <s:radio list="products" name="product.id" value="2" listValue="name" listKey="id"/> <br>
    <s:select list="products" label="products" name="product.id" listKey="id" listValue="name" multiple="false"
              size="1"/>


</table>
<table border="1" cellspacing="0">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>products</td>
    </tr>
    <s:iterator value="categories" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>
                <s:iterator value="#c.products" var="p">
                    ${p.name} <br>
                </s:iterator>
            </td>
        </tr>
    </s:iterator>
</table>
<s:debug/>
</body>
</html>
