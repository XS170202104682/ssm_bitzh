<%--
  Created by IntelliJ IDEA.
  User: 酩酊大醉
  Date: 2020/5/25
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>404 Page by Saleh Riaz</title>
    <meta name="description" content="Saleh Riaz - UI/UX Engineer. Designer. Computer Scientist">
    <meta name="keywords" content="ui engineer, ux, saleh, riaz, qureshi, website, softwares, salehriaz, salehriazq, computer scientist, design, visual design, saleh riaz qureshi"/>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/404.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body class="bg-purple">
    <div class="stars">
        <div class="custom-navbar">
            <div class="brand-logo">
                <img src="${pageContext.request.contextPath}/images/logo.svg" width="80px">
            </div>
            <div class="navbar-links">
                <ul>
                    <li><a href="${pageContext.request.contextPath}/tologin">Login</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="#">Features</a></li>
                    <li><a href="${pageContext.request.contextPath}/toregister" class="btn-request">Register</a></li>
                </ul>
            </div>
        </div>
        <div class="central-body">
            <img class="image-404" src="${pageContext.request.contextPath}/images/404.svg" width="300px">
            <a href="${pageContext.request.contextPath}/tologin" class="btn-go-home">GO BACK Login</a>
        </div>
        <div class="objects">
            <img class="object_rocket" src="${pageContext.request.contextPath}/images/rocket.svg" width="40px">
            <div class="earth-moon">
                <img class="object_earth" src="${pageContext.request.contextPath}/images/earth.svg" width="100px">
                <img class="object_moon" src="${pageContext.request.contextPath}/images/moon.svg" width="80px">
            </div>
            <div class="box_astronaut">
                <img class="object_astronaut" src="${pageContext.request.contextPath}/images/astronaut.svg" width="140px">
            </div>
        </div>
        <div class="glowing_stars">
            <div class="star"></div>
            <div class="star"></div>
            <div class="star"></div>
            <div class="star"></div>
            <div class="star"></div>

        </div>

    </div>

</body>
</html>
