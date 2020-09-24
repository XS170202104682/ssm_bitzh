<%--
  Created by IntelliJ IDEA.
  User: LZX
  Date: 2020/5/26
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>修改订单状态</title>
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
                        <a>修改订单状态</a>
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
                        <form  action="${pageContext.request.contextPath}/order/update" method="post">
                        <table class="table table-hover">
                            <tr><th>id</th><th>订单状态</th><th>操作</th></tr>

                                <tr>
                                    <td><input class="form-control" type="text" readonly name="oId" value="${order.oId}"></td>
                                    <td><input class="form-control" type="text" id="oStatus" name="oStatus" value="${order.oStatus}"></td>
                                    <td>
                                        <input type="submit" class="btn btn-danger btn-sm"   value="提交">
                                        <a type="button" class="btn btn-danger btn-sm" href="${pageContext.request.contextPath}/order/selectAll">
                                            取消</a></td>
                                </tr>

                        </table>
                        </form>

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
