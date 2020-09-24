<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/28 0028
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%--
    主页公共部分，设置为可重用部分，减少代码量
--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>div+css餐饮分类导航菜单代码 </title>

    <link href="${pageContext.request.contextPath}/css/reseta.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/gbstylea.css" rel="stylesheet">


</head>

<body style="background:#f4f4f4;">
<!-- header begin -->
<div class="gbhead1">
    <div class="gbhedcontain">
        <p><img src="${pageContext.request.contextPath}/images/xgbicon.png">饿得慌堂食系统</p>
        <ul class="gbhdconul1">
            <li class="gbfl gbhdzs"><a href="${pageContext.request.contextPath}/userMessage/toAddMessage" title="" target="_blank">用户留言</a></li>
            <li class="gbfl">　｜　</li>
            <li class="gbfl"><a href="#" title="" target="_blank">手机上菜</a></li>
            <li class="gbfl">　｜　</li>
            <li class="gbfl wxewmli">
                <a href="#" title="" target="_blank">微信</a>
                <div class="wxewm"><img src="${pageContext.request.contextPath}/images/xdd.jpg" alt=""></div>
            </li>
            <li class="gbfl">　｜　</li>
            <li class="gbfl"><a href="#" title="" target="_self">联系我们</a></li>
        </ul>
    </div>
</div>
<div class="gbhead2">
    <div class="gbhdcon">
        <!---<div class="gblogo gbfl"><a href="#" title="K18餐饮加盟网"><img src="i/logo.png" alt=""></a></div>--->
        <div class="gbsecdivaa">
            <div class="gbsearch">
                <form id="form1" name="form1" action="${pageContext.request.contextPath}/caete/findName" method="post">
                    <input type="text" class="inp_text"  placeholder="请输入菜品名称.." name="cName" >
                    <input type="hidden" name="sid" value="">
                    <input type="submit" value="搜索" class="inp_sub log100_listen">
                </form>
            </div>
            <p class="gbssp">

            </p>
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
            <li><a href="${pageContext.request.contextPath}/caete/findFruits">新鲜水果<i></i></a></li>
            <li><a href="${pageContext.request.contextPath}/caete/findMeat">鲜美荤菜<i></i></a></li>
            <li><a href="${pageContext.request.contextPath}/caete/findDrinks">清凉冰饮<i></i></a></li>
            <li><a href="${pageContext.request.contextPath}/caete/findVegetable">爽口素菜<i></i></a></li>
            <li><a href="${pageContext.request.contextPath}/caete/findOthers">其他食品<i></i></a></li>
            <li><a href="#">敬请期待</a></li>
            <li><a href="#">敬请期待</a></li>
            <li><a href="#">敬请期待</a></li>
            <li><a href="#">敬请期待</a></li>
        </ul>
    </div>
</div>
<!-- header end -->

<div class="gbcont1">
    <ul class="gbco11">
        <li>
            <a href="#" title="８元汉堡 全天爆单" target="_blank" class="gbco1ig"><img src="${pageContext.request.contextPath}/images/201901281531223754335.jpg" alt=""></a>
            <div class="gbco1dv gbco1dv1">
                <label class="gbco1lb">汉堡</label>
                <a href="#" title="" target="_blank">麦塔基汉堡</a>
                <p>额度：3-5万</p>
                <p>８元汉堡 全天爆单</p>
                <a href="#" title="８元汉堡 全天爆单" target="_blank" class="gbco1ck">立即查看</a>
            </div>
        </li>
        <li>
            <a href="#" title="海鲜零食 万元开店" target="_blank" class="gbco1ig"><img src="${pageContext.request.contextPath}/images/201901311435002714771.jpg" alt=""></a>
            <div class="gbco1dv gbco1dv2">
                <label class="gbco1lb">小吃</label>
                <a href="#" title="" target="_blank">漫鲸捞汁小海鲜</a>
                <p>额度：3-5万</p>
                <p>海鲜零食 万元开店</p>
                <a href="#" title="海鲜零食 万元开店" target="_blank" class="gbco1ck">立即查看</a>
            </div>
        </li>
        <li>
            <a href="#" title="粗粮煎饼 酥脆好吃" target="_blank" class="gbco1ig"><img src="${pageContext.request.contextPath}/images/201901111451162717397.png" alt=""></a>
            <div class="gbco1dv gbco1dv3">
                <label class="gbco1lb">煎饼</label>
                <a href="#" title="" target="_blank">石小沫煎饼果儿</a>
                <p>额度：5-10万</p>
                <p>粗粮煎饼 酥脆好吃</p>
                <a href="#" title="粗粮煎饼 酥脆好吃" target="_blank" class="gbco1ck">立即查看</a>
            </div>
        </li>
        <li>
            <a href="#" title="麻辣海鲜 人手一杯" target="_blank" class="gbco1ig"><img src="${pageContext.request.contextPath}/images/201902101827112717806.jpg" alt=""></a>
            <div class="gbco1dv gbco1dv4">
                <label class="gbco1lb">小吃</label>
                <a href="#" title="" target="_blank">赶海鲜生即食小海鲜</a>
                <p>额度：3-5万</p>
                <p>麻辣海鲜 人手一杯</p>
                <a href="#" title="麻辣海鲜 人手一杯" target="_blank" class="gbco1ck">立即查看</a>
            </div>
        </li>
    </ul>

</div>

</body>
</html>