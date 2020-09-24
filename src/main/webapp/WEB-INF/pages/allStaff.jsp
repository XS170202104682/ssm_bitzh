<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/5/24
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工资料</title>
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>员工列表</small>
                </h1>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/admin/main">返回首页</a>
            </div>
        </div>
    </div>


    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/staff/toAddStaff">添加员工</a>
        </div>
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/staff/allStaff">显示全部员工信息</a>
        </div>

        <div class="col-md-4 column">
            <form action="${pageContext.request.contextPath}/staff/find" method="post">
                <%--                <span style="color: red;font-weight: bold">${error}</span>--%>
                <input type="text" name="findStaff" class="form-inline" class="form-control" placeholder="请输入员工名称">
                <input type="submit" value="查询" class="btn btn-primary">
            </form>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>姓名</th>
                    <th>年龄</th>
                    <th>性别</th>
                    <th>电话</th>
                    <th>邮箱</th>
                    <th>入职时间</th>
                    <th>薪水</th>
                    <th>职位</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="record" items="${pi.list}">
                    <tr>
                        <td>${record.getsName()}</td>
                        <td>${record.getsAge()}</td>
                        <td>${record.getsSex()}</td>
                        <td>${record.getsTelephone()}</td>
                        <td>${record.getsEmail()}</td>
                        <td>${record.formateTime(record.sEntrytime)}</td>
                        <td>${record.getsSalary()}</td>
                        <td>${record.getsJob()}</td>
                        <td>
                            <a class="btn btn-info" href="${pageContext.request.contextPath}/staff/toUpdate?id=${record.getsId()}">更改</a> |
                            <a class="btn btn-danger" href="${pageContext.request.contextPath}/staff/deleteStaff/${record.getsId()} ">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div class="column-md-6">
                <nav aria-label="Page navigation">
                    <ul class="pagination pagination-centered">
                        <li><a href="${pageContext.request.contextPath}/staff/allStaff?pn=1&size=5">首页</a></li>
                        <li>
                            <a href="${pageContext.request.contextPath}/staff/allStaff?pn=${pi.pageNum-1}&size=5" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                        <c:forEach begin="1" end="${pi.pages}" var="pageNumber">
                            <li><a href="${pageContext.request.contextPath}/staff/allStaff?pn=${pageNumber}&size=5">${pageNumber}</a></li>
                        </c:forEach>
                        <li>
                            <a href="${pageContext.request.contextPath}/staff/allStaff?pn=${pi.pageNum+1}&size=5" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                        <li><a href="${pageContext.request.contextPath}/staff/allStaff?pn=${pi.pages}&size=5">尾页</a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
</div>



</body>
</html>