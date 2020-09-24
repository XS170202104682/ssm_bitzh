<%--
  Created by IntelliJ IDEA.
  User: 酩酊大醉
  Date: 2020/5/25
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>用户注册</title>
    <!-- Bootstrap -->
<%--    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet"> --%>
    <link href="${pageContext.request.contextPath}/css/register-style.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="login-wrapper">
        <div class="header">Register</div>
        <div class="form-wrapper">
            <form  action="customer/register" method="post">
            <input id="uName" name="uName" class="input-item" placeholder="用户名" type="text">
            <input id="uAgentname" name="uAgentname" class="input-item" placeholder="账号名" type="text">
            <input id="uPassword" name="uPassword" class="input-item" placeholder="密码" type="password">
            <input id="uSex" name="uSex" class="input-item" placeholder="性别" type="text">
            <input id="uBirthday" name="uBirthday" class="input-item" placeholder="出生日期" type="text">
            <input id="uTelephone" name="uTelephone" class="input-item" placeholder="电话号码" type="text">
            <input id="uEmail" name="uEmail" class="input-item" placeholder="电子邮箱" type="text">
            <input id="uIntegral" name="uIntegral" class="input-item" type="text" readonly="readonly" placeholder="积分" value="5">
            <input type="submit" value="注册" class="btn">
        </form>
        </div>
        <div class="msg">
            Already hava a account?<a href="${pageContext.request.contextPath}/tologin">Sign Up</a>
        </div>
    </div>
</div>
</body>
</html>
