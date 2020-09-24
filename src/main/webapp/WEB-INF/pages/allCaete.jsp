<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/5/20
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>菜品展示</title>
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>菜品信息</small>
                </h1>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/admin/main">返回首页</a>
            </div>
        </div>
    </div>


    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/caete/toaddCaete">添加菜品</a>
        </div>
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/caete/allCaete">显示菜品</a>
        </div>

        <div class="col-md-4 column">
            <form action="${pageContext.request.contextPath}/caete/find" method="post">
                <span style="color: red;font-weight: bold">${error}</span>
                <input type="text" name="findcaete" class="form-inline" class="form-control" placeholder="请输入菜品名称">
                <input type="submit" value="查询" class="btn btn-primary">
            </form>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>菜品</th>
                    <th>数量</th>
                    <th>价格</th>
                    <th>份量</th>
                    <th>种类</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="caete" items="${pageInfo.list}">
                    <tr>
                        <td>${caete.getcName()}</td>
                        <td>${caete.getcCount()}</td>
                        <td>${caete.getcPrice()}</td>
                        <td>${caete.getcWeight()}</td>
                        <td>${caete.getcType()}</td>
                        <td>
                            <a class="btn btn-info" href="${pageContext.request.contextPath}/caete/toUpdate?id=${caete.getcId()}">更改</a> |
                            <a class="btn btn-danger" href="${pageContext.request.contextPath}/caete/deleteCaete/${caete.getcId()} ">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div class="column-md-6">
                <nav aria-label="Page navigation">
                    <ul class="pagination pagination-centered">
                        <li><a href="${pageContext.request.contextPath}/caete/allCaete?page=1&size=5">首页</a></li>
                        <li>
                            <a href="${pageContext.request.contextPath}/caete/allCaete?page=${pageInfo.pageNum-1}&size=5" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                        <c:forEach begin="1" end="${pageInfo.pages}" var="pageNumber">
                            <li><a href="${pageContext.request.contextPath}/caete/allCaete?page=${pageNumber}&size=5">${pageNumber}</a></li>
                        </c:forEach>
                        <li>
                            <a href="${pageContext.request.contextPath}/caete/allCaete?page=${pageInfo.pageNum+1}&size=5" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                        <li><a href="${pageContext.request.contextPath}/caete/allCaete?page=${pageInfo.pages}&size=5">尾页</a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
</div>



</body>
</html>
