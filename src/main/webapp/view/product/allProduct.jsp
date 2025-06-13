<%--
  Created by IntelliJ IDEA.
  User: vietnguyen
  Date: 10/06/2025
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="products" value="${requestScope['products']}"/>
<c:set var="total" value="${products.size()}"/>
<c:set var="stt" value="1"/>

<html>
<head>
    <title>book storage</title>
    <link rel="stylesheet" href="https://unpkg.com/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://unpkg.com/bs-brain@2.0.4/components/logins/login-9/assets/css/login-9.css">
</head>
<body>
<p class="font-monospace">Total <c:out value="${total}"/> Users</p>
<table id="productsTable" class="table">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">name</th>
        <th scope="col">price</th>
        <th scope="col">sale</th>
        <th scope="col">inventory</th>
        <th scope="col">activities</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="item">

        <tr>
            <td><c:out value="${stt}"/></td>
            <td><c:out value="${item.getProductName()}"/></td>
            <td><c:out value="${item.getProductPrice()}"/></td>
            <td><c:out value="${item.getProductSale()}"/></td>
            <td><c:out value="${item.getProductInventory()}"/></td>
            <td>
                <a href="/product/delete?id=<c:out value="${item.gerProductId()}"/>" class="btn btn-outline-danger">Delete</a>
                <a href="/product/update?id=<c:out value="${item.getProductId()}"/>" class="btn btn-outline-warning">Update</a>
            </td>
        </tr>
        <c:set var="stt" value="${stt + 1}"/>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
