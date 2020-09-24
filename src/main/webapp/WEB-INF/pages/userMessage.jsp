<%--
  Created by IntelliJ IDEA.
  User: 酩酊大醉
  Date: 2020/6/10
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/css/message-style.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="login-wrapper">
            <div class="header">Messages</div>
            <div class="form-wrapper">
                <form action="${pageContext.request.contextPath}/userMessage/addMessage" method="post">
                    <input id="mUserid" type="text" name="mUserid" placeholder="请输入您的顾客ID"  class="input-item"><br>
                    <input id="mDsc" type="text" name="mDsc" placeholder="请输入留言内容" class="input-item"><br>
                    <input id="mRid" type="text" name="mRid" placeholder="请输入权限id" class="input-item">
                    <input type="submit" value="提交" class="btn">
                </form>
            </div>
            <div class="msg">
                Return to <a href="${pageContext.request.contextPath}/caete/toformpage">Main Page</a>
            </div>
        </div>
    </div>
</body>
</html>
