<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/28 0028
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>订单页面</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/gbstyle.css" />
    <style>
        h1{
            width: 400px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            font-size: 30px;
        }
    </style>
</head>

<body style="background:#f4f4f4;">
<!-- header begin -->
<div class="gbhead1">
    <div class="gbhedcontain">
        <p><img src="${pageContext.request.contextPath}/images/xgbicon.png" alt="">订单页面</p>
    </div>
</div>
<div class="gbhead2">
    <div class="gbhdcon">
        <!---<div class="gblogo gbfl"><a href="#" title="K18餐饮加盟网"><img src="i/logo.png" alt=""></a></div>--->
        <div class="gbsecdivaa">
            <div>
            </div>
        </div>
        <div class="gbhykh gbfr">
            <div class="out outl5">
                <ul class="img imgl5">
                    <li style="display: list-item;"><a href="#" title="" target="_blank"><img src="${pageContext.request.contextPath}/images/201902131628142713058.jpg" alt=""></a></li>
                    <li style="display: none;"><a href="#" title="" target="_blank"><img src="${pageContext.request.contextPath}/images/201902131628542718111.jpg" alt=""></a></li>
                    <li style="display: none;"><a href="#" title="" target="_blank"><img src="${pageContext.request.contextPath}/images/201902281659422718293.jpg" alt=""></a></li>
                </ul>
                <ul class="num numl5"></ul>
                <div class="left btn"></div>
                <div class="right btn"></div>
            </div>
        </div>
    </div>
    <div class="gbnav">
        <div class="gbsjfl">
            <span><i></i>饿得慌餐厅简介</span>
            <ul>
                <!-- 选中给a添加check类名-->
                <li>
                    <p class="sxf1">热门菜</p>

                    <a href="#" title="" target="_blank">酸菜鱼</a>
                    <a href="#" title="" target="_blank">鱼香肉丝</a>
                    <a href="#" title="" target="_blank">回锅肉</a>
                    <a href="#" title="" target="_blank">宫保鸡丁</a>
                    <a href="#" title="" target="_blank">北京烤鸭</a>

                </li>
                <li>
                    <p class="sxf2">店面规模</p>

                    <a href="#" title="" target="_blank" class="check">中型餐馆</a>
                    <a href="#" title="" target="_blank">使用面积300m²</a>
                    <a href="#" title="" target="_blank">就餐座位150座</a>

                </li>

            </ul>
        </div>
        <ul class="nav_ul">
            <!-- 选中给li添加check类名-->
            <li style="float: left"><a href="${pageContext.request.contextPath}/caete/toCaete">返回菜单</a></li>
            <li style="float: right"><a href="${pageContext.request.contextPath}/caete/selectAll">查看订单</a></li>
        </ul>
    </div>
</div>
<!-- header end -->

<div class="gbcont1">
    <ul class="gbco11">
        <h1>请您稍候，您的菜马上就来。</h1>
    </ul>
</div>

</body>
</html>
