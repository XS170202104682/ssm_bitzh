<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/26 0026
  Time: 17:49
  To change this template use File | Settings | File Templates.
  过度用的页面
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>菜单</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>菜品号</th>
        <th>菜品名</th>
        <th>菜品数量</th>
        <th>菜品价格</th>
        <th>菜品分量</th>
        <th>加入购物车</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach var="caete" items="${listall}">
            <tr>
                <td>${caete.cId}</td>
                <td>${caete.cName}</td>
                <td>${caete.cCount}</td>
                <td>${caete.cPrice}</td>
                <td>${caete.cWeight}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/caete/addShopping?cId=${caete.cId}">添加购物车</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
    <a href="${pageContext.request.contextPath}/caete/selectShopping">进入购物车</a>
</table>
</body>
</html>
