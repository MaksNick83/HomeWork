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
<form action="/HW20/getAllWithSumLesserOrEqualAndNumberNomenclature" method="post">
    <input type="text" name="cost" placeholder="cost">
    <input type="text" name="countNomenclature"  placeholder="Count Nomenclature">
    <input type="submit" value="Search">
</form>
<c:if test="${not empty orders}">
    <c:forEach var="order" items="${orders}">
        <table>
            <tr>
                <td><c:out value="ID: ${order.id}"/></td>
                <td><c:out value="Number: ${order.number}"/></td>
                <td><c:out value="Date: ${order.date}"/></td>
            </tr>
        </table>
        <table>
            <colgroup>
                <col style="background-color: #0f0" />
                <col span="2" />
            </colgroup>
            <thead>
            <tr>
                <th>Nomenclature</th>
                <th>Count</th>
                <th>Price</th>
            </tr>
            </thead>
            <c:forEach var="orderNomenclature" items="${order.orderNomenclatures}">

                <tr>
                    <td><c:out value="${orderNomenclature.nomenclature.display}"/></td>
                    <td><c:out value="${orderNomenclature.count}"/></td>
                    <td><c:out value="${orderNomenclature.nomenclature.price}"/></td>
                </tr>
            </c:forEach>
        </table>
    </c:forEach>
</c:if>

</body>
</html>
