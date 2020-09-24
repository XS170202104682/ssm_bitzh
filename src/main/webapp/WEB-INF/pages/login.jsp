<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <%--    <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    --%><title>欢迎</title><%--
        <!-- Bootstrap -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">--%>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="login-wrapper">
            <div class="header">login</div>
            <div class="form-wrapper">
                <form action="customer/login" method="post">
                    <input id="uAgentname" name="uAgentname"  placeholder="username" class="input-item" type="text">
                    <input id="uPassword" name="uPassword" class="input-item" placeholder="password" type="password">
                    <input type="submit" value="登录" class="btn">
                </form>
            </div>
            <div class="msg">
                Don't hava a account?<a href="${pageContext.request.contextPath}/toregister">Sign Up</a>
            </div>
        </div>
    </div>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<%--<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
--%>
</body>
</html>
