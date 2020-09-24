<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>欢迎</title>
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/404.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/welcome.css">
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
<script src="js/script.js"></script>

<div id="parallax-container">
    <div style="background: url(images/SkyBG.webp);"></div>
    <div style="background: url(images/Clouds1.webp);"></div>
    <div style="background: url(images/Clouds2.webp);"></div>
    <div style="background: url(images/Clouds3.webp);"></div>
    <div style="background: url(images/Moon.webp)"></div>
    <div style="background: url(images/Hill.webp)"></div>
</div>
<div id="content">
    <div style="height:100px;">
        <div class="custom-navbar">
            <div class="brand-logo">
                <img src="${pageContext.request.contextPath}/images/logo.svg" width="80px">
            </div>
            <div class="navbar-links">
                <ul>
                    <li><a href="${pageContext.request.contextPath}/tologin">Login</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="${pageContext.request.contextPath}/admin/loginInfo">管理员登录入口</a></li>
                    <li><a href="${pageContext.request.contextPath}/toregister" class="btn-request">Register</a></li>
                </ul>
            </div>
        </div>
    </div>
</div>

</body>
</html>
