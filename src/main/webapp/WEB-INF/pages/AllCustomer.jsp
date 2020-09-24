<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 酩酊大醉
  Date: 2020/5/25
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>欢迎</title>
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/signin.css" rel="stylesheet">
</head>
<body style="align-content: center">
<h6><a href="<%=basePath%>register.jsp">添加用户</a></h6>
<table border="1">
    <tbody>
    <tr>
        <th>ID</th>
        <th>用户名</th>
        <th>用户ID</th>
        <th>密码</th>
        <th>性别</th>
        <th>出生日期</th>
        <th>手机号码</th>
        <th>电子邮箱</th>
        <th>用户积分</th>
        <th>选    项</th>
    </tr>
    <c:forEach items="${list}" var="customer">
        <tr>
            <td>${customer.uId}</td>
            <td>${customer.uName}</td>
            <td>${customer.uAgentname}</td>
            <td>${customer.uPassword}</td>
            <td>${customer.uSex}</td>
            <td>${customer.uBirthday}</td>
            <td>${customer.uTelephone}</td>
            <td>${customer.uEmail}</td>
            <td>${customer.uIntegral}</td>
            <td>
                <a href="<%=basePath%>/customer/getCustomer?uId=${customer.uId}">修改</a>
                <a href="<%=basePath%>/customer/delCustomer?uId=${customer.uId}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>

</body>
</html>
