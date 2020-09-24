<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LZX
  Date: 2020/5/26
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单信息</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">






</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <nav class="navbar navbar-fixed-top" role="navigation">
                <div class="container">
                    <div class="navbar-header">
                        <a class="navbar-brand " href="${pageContext.request.contextPath}/main">饿得慌后台管理系统</a>
                    </div>
                    <div id="navbar" class="navbar-right">
                        <a type="button" class="btn btn-info btn-sm" href="#">退出</a>
                    </div>
                </div>
            </nav>
        </div>
    </div>
    <div class="row" style="padding-top: 45px;height: 70%">
        <div class="col-md-3">
            <div class="list-group">
                <a href="${pageContext.request.contextPath}/main" class="list-group-item active ">
                    系统菜单
                </a>
                <a href="${pageContext.request.contextPath}/customer/selectAll" class="list-group-item">查看顾客信息</a>
                <a href="${pageContext.request.contextPath}/order/selectAll" class="list-group-item">订单管理</a>
                <a href="${pageContext.request.contextPath}/userMessage/selectAll" class="list-group-item">顾客留言信息</a>
                <a class="list-group-item" >菜单</a>
                <a class="list-group-item">菜单</a>
                <a class="list-group-item">菜单</a>
                <a class="list-group-item">退出</a>
            </div>
        </div>
        <div class="col-md-9">
            <div>
                <ol class="breadcrumb">
                    <li><span class="glyphicon glyphicon-home"></span>&nbsp;
                        <a href="${pageContext.request.contextPath}/main">主页</a>
                    </li>
                    <li class="active">
                        <a href="${pageContext.request.contextPath}/order/selectAll">查看订单信息</a>
                    </li>
                    <li class="active">
                        <a href="${pageContext.request.contextPath}/order/findByName">订单信息查询结果</a>
                    </li>
                </ol>
            </div>
            <div align="right" >
                <div class="mid" >

                    <form action="${pageContext.request.contextPath}/order/findByName" method="post">
                        <div class="search">
                            <div class="searchbox" >
                                <input type="text" placeholder="请输入用户姓名" name="name"/>
                                <button class="btn btn-info btn-sm">搜索</button>
                            </div>
                        </div>
                    </form>

                    <div class="col-md-12">
                        <table class="table table-hover">
                            <tr><th>id</th><th>姓名</th><th>菜品名</th><th>订单时间</th><th>订单状态</th><th>操作</th></tr>
                            <c:forEach items="${orderCustomList}" var="o">
                                <tr>
                                    <td>${o.oId}</td>
                                    <td>${o.uName}</td>
                                    <td>${o.cName}</td>
                                    <td>${o.oTime}</td>
                                    <td>${o.oStatus}</td>
                                    <td>
                                        <a type="button" class="btn btn-info btn-sm" href="${pageContext.request.contextPath}/order/updateGo?oId=${o.oId}">
                                            修改</a>
                                        <a type="button" class="btn btn-danger btn-sm" href="${pageContext.request.contextPath}/order/delete?id=${o.oId}">
                                            <span class="glyphicon glyphicon-trash" aria-hidden="true" ></span>
                                            删除</a></td>
                                </tr>
                            </c:forEach>
                        </table>

                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <hr style="height:1px;border:none;border-top:1px solid #ccc;"/>
            <div align="center" style="padding-top: 20px">
                Copyright © 2019-2020 ssm_bitzh
            </div>
        </div>
    </div>
</div>
</body>
</html>
