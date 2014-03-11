<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>来虎验证码自动接收系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="pragma" content="no-cache"/>
    <meta http-equiv="cache-control" content="no-cache"/>
    <meta name="author" content="深圳来虎科技有限公司"/>
    <meta name="Copyright" content="深圳来虎科技有限公司版权所有"/>
    <meta http-equiv="expires" content="0"/>
    <meta http-equiv="robots" content="all"/>
    <meta http-equiv="keywords" content="验证码,来虑,短信接收,手机验证码,手机验证码接收,验证码接收,代接各大网站验证码,淘宝验证码,京东验证码,自动接收短信,代收短信,代收验证码"/>
    <meta http-equiv="description" content="来虎是一个专业的验证码接收平台"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"/>
    <link rel="stylesheet" href="<%=request.getContextPath() %>/css/bootstrap.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath() %>/css/flexy-menu.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath() %>/css/laihu.css"/>

    <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.10.1.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/flexy-menu.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $(".flexy-menu").flexymenu({speed: 300, type: "vertical" });
        });
    </script>
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
    <!--[if lt IE 9]>
    <script src="<%=request.getContextPath() %>/js/html5shiv.js"></script>
    <![endif]-->
    <!--[if IE 7]>
    <link rel="stylesheet" href="<%=request.getContextPath() %>/css/font-awesome-ie7.min.css">
    <![endif]-->
    <decorator:head/>
</head>
<body>
    <div class="container">
        <page:applyDecorator page="/console/menu.jsp" name="menuer" />
        <div class="main">
            <page:applyDecorator page="/views/header.jsp" name="header"/>
            <div class="content">
                <decorator:body/>
            </div>
            <page:applyDecorator page="/views/footer.jsp" name="footer"/>
        </div>
    </div>
</body>
</html>
