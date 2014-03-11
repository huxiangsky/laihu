<%@ page language="java" pageEncoding="UTF-8" %>
<link rel="shortcut icon" type="image/x-icon" href="<%=request.getContextPath()%>/img/favicon.ico" media="screen"/>
<script type="text/javascript">
    function exit() {
        if (confirm('确定要退出系统?')) {
            window.location.href = "<%=request.getContextPath() %>/loginout";
        }
    }
</script>
<div class="header">
    <div class="notifs-icon-wrapper">
        <div class="notifs">
            <span class="text-center"><a href="#"><i class="icon-shopping-cart"></i></a></span>
            <div id="orders_notif_wrapper" class="notifs_wrapper" style="display: none;">
                <h3>最近的订单</h3>
                <p class="no_notifs">没有新的订单</p>
                <ul id="list_orders_notif"></ul>
                <p>
                    <a href="#">显示所有</a>
                </p>
            </div>
        </div>
        <div class="notifs">
            <a href="#"><i class="icon-user"></i></a>
        </div>
    </div>
    <div class="employee-box">
        <div class="employee-infos">
            <div class="clear"></div>
            <ul class="employee-links">
                <li>
                    <a href="#" title="帮助">
                        <i class="icon-info-sign"></i>
                    </a>
                </li>
                <li class="separator">&nbsp;</li>
                <li><a class="header-logout" href="#" title="退出"><i class="icon-off"></i></a></li>
                <li class="separator">&nbsp;</li>
            </ul>
        </div>
    </div>
</div>