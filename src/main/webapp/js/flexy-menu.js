$.fn.flexymenu = function (e) {
    function r() {
        $(".flexy-menu").find("li").unbind();
        $(".flexy-menu").find("ul").hide(0);
        if (window.innerWidth <= 768) {
            o();
            s();
            if (n == true) {
                a();
                n = false
            }
        } else {
            u();
            i();
            if (t.type == "horizontal" && t.align == "right" && n == false) {
                a();
                n = true
            }
        }
    }

    function i() {
        $(".flexy-menu li").bind("mouseover",function () {
            $(this).children("ul").stop(true, true).fadeIn(t.speed)
        }).bind("mouseleave", function () {
            $(this).children("ul").stop(true, true).fadeOut(t.speed)
        })
    }

    function s() {
        $(".flexy-menu > li").bind("click", function () {
            if ($(this).children("ul").css("display") == "none") {
                $(this).find("ul").slideDown(t.interval)
            } else {
                $(this).children("ul").slideUp(t.interval)
            }
        })
    }

    function o() {
        $(".flexy-menu > li:not(.showhide)").hide(0);
        $(".flexy-menu > li.showhide").show(0);
        $(".flexy-menu > li.showhide").bind("click", function () {
            if ($(".flexy-menu > li").is(":hidden")) {
                $(".flexy-menu > li").slideDown(300)
            } else {
                $(".flexy-menu > li:not(.showhide)").slideUp(300);
                $(".flexy-menu > li.showhide").show(0)
            }
        })
    }

    function u() {
        $(".flexy-menu > li").show(0);
        $(".flexy-menu > li.showhide").hide(0)
    }

    function a() {
        $(".flexy-menu > li").addClass("right");
        var e = $(".flexy-menu").width();
        var t = $(".flexy-menu").children("li");
        var n = 0;
        $(".flexy-menu").children("li:not(.showhide)").detach();
        for (var r = t.length; r >= 1; r--) {
            $(".flexy-menu").append(t[r])
        }
    }

    var t = {speed: 300, type: "horizontal", align: "left"};
    $.extend(t, e);
    var n = false;
    if (t.type == "vertical") {
        $(".flexy-menu").addClass("vertical");
        if (t.align == "right") {
            $(".flexy-menu").addClass("right")
        }
    }
    $(".flexy-menu").prepend("<li class='showhide'><span class='title'>展开菜单</span><span class='icon'><em></em><em></em><em></em><em>	</em></span></li>");
    r();
    $(window).resize(function () {
        r()
    })
}