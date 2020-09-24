<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/5/25
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
</head>
<body>
<%--<div style="text-align: center">
    <form action="${pageContext.request.contextPath}/admin/tologin" method="post"">
        <span>${msg1}</span><br>
        用户名:<input type="text" name="aAccount"><br>
        <span>${msg2}</span><br>
        密码:<input type="password" name="aPassword"><br>
        <input type="submit" value="登录">
    </form>
</div>--%>

<div class="container">
    <div class="login-wrapper">
        <div class="header">login</div>
        <div class="form-wrapper">
            <form action="${pageContext.request.contextPath}/admin/getlogin" method="post">
            <input type="text" name="aAccount" placeholder="username" class="input-item">
            <input type="password" name="aPassword" placeholder="password" class="input-item">
<%--            <div class="btn">--%>
                <input type="submit" value="登录" class="btn">
<%--            </div>--%>
            </form>
        </div>
        <div class="msg">
            Don't hava a account?<a href="#">Sign Up</a>
        </div>
    </div>
</div>

</body>
</html>
