<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/28 0028
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- 注意！
     这是可重用部分代码
     代码与index.jsp相似-->

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="/images/">
    <title>菜品主页</title>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-xs-6 col-sm-3">

            <center>
                <div class="page-header">
                    <h1><font face="FZShuTi">饿得慌！<small>欢迎您的光临</small></font> </h1>
                </div>
                <div><img src="${pageContext.request.contextPath}/images/1.jpg" width="150px" height="150px" class="img-circle"></div>
                <ul class="nav nav-pills nav-stacked">
                    <li class=""><a href="${pageContext.request.contextPath}/caete/findFruits"><h3>新鲜水果</h3></a></li>
                    <li class=""><a href="${pageContext.request.contextPath}/caete/findMeat"><h3>鲜美荤菜</h3></a></li>
                    <li class=""><a href="${pageContext.request.contextPath}/caete/findDrinks"><h3>清凉冰饮</h3></a></li>
                    <li class=""><a href="${pageContext.request.contextPath}/caete/findVegetable"><h3>爽口素菜</h3></a></li>
                    <li class=""><a href="${pageContext.request.contextPath}/caete/findOthers"><h3>其他食品</h3></a></li>
                </ul>
            </center>
        </div>
        <div class="col-xs-12 col-sm-6 col-md-8">

            <form action="${pageContext.request.contextPath}/caete/findName" method="post" class="form-inline" style="margin-top: 50px;">
            <div class="form-group"  style="padding-left: 200px;">
                <input type="text" style="width: 500px;" class="form-control"  placeholder="请输入菜品名称.." name="cName" >
            </div>
            <button type="submit" class="btn btn-default" >查询菜品</button>
            </form>

        </div>
    </div>
</div>
</body>
</html>
