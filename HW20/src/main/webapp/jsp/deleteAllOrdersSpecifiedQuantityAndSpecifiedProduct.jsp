<%--
  Created by IntelliJ IDEA.
  User: maxni
  Date: 06.10.2022
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:import url="/jspf/header.jspf" />
<form action="/HW20/deleteAllOrdersSpecifiedQuantityAndSpecifiedProduct" method="post">
    <input type="text" name="nameNomenclature" placeholder="Nomenclature" >
    <input type="text" name="quantity" placeholder="quantity" >
    <input type="submit" value="Delete">
</form>
<c:if test="${not empty result}">
    <li>${result}</li>
</c:if>

</body>
</html>
