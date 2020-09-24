<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/5/20
  Time: 13:53
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
                <a href="${pageContext.request.contextPath}/staff/allStaff" class="list-group-item">员工资料</a>
                <a href="${pageContext.request.contextPath}/caete/allCaete" class="list-group-item">菜品库</a>
                <a href="${pageContext.request.contextPath}/customer/selectAll" class="list-group-item">顾客信息</a>
                <a href="${pageContext.request.contextPath}/order/selectAll" class="list-group-item">订单信息</a>
                <a href="${pageContext.request.contextPath}/userMessage/selectAll" class="list-group-item">留言表信息</a>
                <a href="${pageContext.request.contextPath}/admin/loginInfo" class="list-group-item">退出</a>
            </div>
        </div>
        <div class="col-md-9">
            <div>
                <ol class="breadcrumb">
                    <li><span class="glyphicon glyphicon-home"></span>&nbsp;
                        <a href="${pageContext.request.contextPath}/main">主页</a>
                    </li>
                    <li class="active">
                        <a href="${pageContext.request.contextPath}/caete/toaddCaete">添加菜品</a>
                    </li>
                    <li class="active">

                    </li>
                </ol>
            </div>

            <div class="mid" >

                <div class="col-md-12">
                    <form action="${pageContext.request.contextPath}/caete/addCaete" method="post">
                        <div class="form-group">
                            <label>菜品名称</label>
                            <input type="text" class="form-control" name="cName" required>
                            <label>菜品数量</label>
                            <input type="text" class="form-control" name="cCount" required>
                            <label>菜品价格</label>
                            <input type="text" class="form-control" name="cPrice" required>
                            <label>菜品份量</label>
                            <input type="text" class="form-control" name="cWeight" required>
                            <label>菜品种类</label>
                            <input type="text" class="form-control" name="cType" required>
                        </div>
                        <input type="submit" class="btn btn-primary" value="添加">
                    </form>

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
