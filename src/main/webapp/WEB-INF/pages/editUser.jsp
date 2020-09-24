<%--
  Created by IntelliJ IDEA.
  User: 酩酊大醉
  Date: 2020/5/28
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>用户注册</title>
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/signin.css" rel="stylesheet">
    <base href="<%=basePath%>">
    <title>修改用户</title>
    <script type="text/javascript">
        function updateUser(){
            var form = document.forms[0];
            form.action = "<%=basePath%>/customer/updateUser";
            form.method="post";
            form.submit();
        }
    </script>
</head>
<body style="align-content: center">
<h1>修改用户</h1>
<form action="" name="customerForm">
    <input type="hidden" name="id" value="${customer.uId }" class="form-control"/>
    顾客ID：<input type="text" name="uId" value="${customer.uId}" readonly="readonly" class="form-control"><br>
    姓名：<input type="text" name="uName" value="${customer.uName }" class="form-control"/><br>
    账户: <input type="text" name="uAgentname" value="${customer.uAgentname}" class="form-control"><br>
    密码：<input type="text" name="uPassword" value="${customer.uPassword }" class="form-control"/><br>
    性别：<input type="text" name="uSex" value="${customer.uSex}" class="form-control"><br>
    出生日期：<input type="text" name="uBirthday" value="${customer.uBirthday}" class="form-control"><br>
    手机号码：<input type="text" name="uTelephone" value="${customer.uTelephone}" class="form-control"><br>
    电子邮箱：<input type="text" name="uEmail" value="${customer.uEmail}" class="form-control"><br>
    积分：<input type="text" name="uIntegral" value="${customer.uIntegral}" readonly="readonly" class="form-control"><br>
    <input type="button" value="修改" onclick="updateUser()" class="form-control"/>
</form>
</body>
</html>
