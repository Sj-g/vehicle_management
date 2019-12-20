<%--
  Created by IntelliJ IDEA.
  User: 王帅
  Date: 2019/12/15
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta charset="utf-8">
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Favicon icon -->
    <title>司机登录</title>
    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/static/css/style.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet" />
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
        * {
            color: white;
        }
    </style>

    <script>

        //切换验证码
        function refreshCode() {
            //1.获取验证码的图片对象
            var vcode = document.getElementById("vcode");

            //2.设置其src属性，加上时间戳
            vcode.src = "${pageContext.request.contextPath}/login/checkCode??name=DRIVER&time="+new Date().getTime();
        }

    </script>

</head>

<body >
<div class="main-wrapper" >
    <!-- Preloader - style you can find in spinners.css -->
    <div class="preloader">
        <div class="lds-ripple">
            <div class="lds-pos"></div>
            <div class="lds-pos"></div>
        </div>
    </div>
    <!-- Preloader - style you can find in spinners.css -->
    <div style="background-color: #023B68">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="${pageContext.request.contextPath}/adminLogin2.jsp" style="color: white;font-family: 楷体;text-decoration: none">管理员登录</a>&nbsp;&nbsp;&nbsp;
        <a href="${pageContext.request.contextPath}/driverRegister2.jsp" style="color: white;font-family: 楷体;text-decoration: none;font-size: large">加入我们</a>
    </div>

    <!-- Login box.scss -->
    <div class="auth-wrapper d-flex no-block justify-content-center align-items-center bg-dark" style="background: url(${pageContext.request.contextPath}/static/img/banner.jpg) no-repeat;">

        <div class="auth-box bg-dark border-top border-secondary" >
            <div class="box-head" style="border-bottom: 1px solid #e0e0e0;overflow: hidden;  width:360px;height:80px;line-height:50px; ">
                <!-- <div class="box-head-net" style="float:right;font-size: 14px;">
                    没有账号？
                    <a href="../regist/regist.html">立即注册</a>
                </div> -->

                <h3 style="font-size:20px;display: block;height: 80px;line-height:50px;text-align: center">司机登录</h3>
            </div>
            <div>
                <!-- Form -->
                <form class="form-horizontal m-t-20" id="loginform" action="${pageContext.request.contextPath}/login/driverLoginRequest" method="post" style="border: 0px">
                    <div class="row p-b-30">
                        <div class="col-12">
                            <div class="input-group mb-3">
                                <!-- <div class="input-group-prepend">
                                    <span class="input-group-text bg-success text-white"    id="basic-addon1"><i class="ti-user"></i></span>
                                </div> -->
                                <label style=" font-size: 20px;width: 80px;text-align: center; height: 35.6px;line-height: 35.6px;">用户名:</label>
                                <input type="text" class="form-control form-control-lg" name="driverName" placeholder="用户名" aria-label="Username" aria-describedby="basic-addon1" required="" style="border: none;">
                            </div>
                            <div class="input-group mb-3">
                                <!-- <div class="input-group-prepend">
                                    <span class="input-group-text bg-warning text-white"    id="basic-addon2"><i class="ti-pencil"></i></span>
                                </div> -->
                                <label style="font-size: 20px;width: 80px;text-align: center; height: 35.6px;line-height: 35.6px;">密&nbsp;&nbsp;码:</label>
                                <input type="password" class="form-control form-control-lg" name="driverPassword" placeholder="密码" aria-label="Password" aria-describedby="   basic-addon1" required="" style="border: none;">
                            </div>
                            <div class="input-group mb-3">
                                <!-- <div class="input-group-prepend">
                                    <span class="input-group-text bg-success text-white"    id="basic-addon1"><i class="ti-user"></i></span>
                                </div> -->
                                <label style="font-size: 20px;width: 80px;text-align: center; height: 35.6px;line-height: 35.6px;">验证码:</label>
                                <input type="text" class="form-control form-control-lg" name="verifycode" placeholder="验证码" aria-label="Username" aria-describedby="basic-addon1" required="" style="border: none;">
                                <a href="javascript:refreshCode();">
                                    <img src="${pageContext.request.contextPath}/login/checkCode?name=DRIVER" title="看不清点击刷新" id="vcode"/>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="row border-top border-secondary" style="border-top: 1px solid #e0e0e0;">
                        <div class="col-12">
                            <div class="form-group">
                                <div class="p-t-40" style="text-align: center">
                                    <button class="btn btn-success" type="submit" >登录</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
                <!-- 出错显示的信息框 -->
                <c:if test="${driverError!=null}">
                    <!-- 出错显示的信息框 -->
                    <div class="alert alert-dark alert-dismissible" role="alert">
                        <button type="button" class="close" data-dismiss="alert" >
                            <span style="color: red">&times;</span></button>
                        <strong style="color: red" >${driverError}</strong>
                    </div>
                </c:if>
            </div>

        </div>

    </div>
    <!-- Login box.scss -->
</div>

<!-- All Required js -->

<script src="${pageContext.request.contextPath}/static/jq/jquery-2.1.0.min.js"></script>
<!-- Bootstrap tether Core JavaScript -->
<script src="${pageContext.request.contextPath}/static/js/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>

<!-- This page plugin js -->

<script>

    $('[data-toggle="tooltip"]').tooltip();
    $(".preloader").fadeOut();
    // ==============================================================
    // Login and Recover Password
    // ==============================================================
    $('#to-recover').on("click", function() {
        $("#loginform").slideUp();
        $("#recoverform").fadeIn();
    });
    $('#to-login').click(function(){

        $("#recoverform").hide();
        $("#loginform").fadeIn();
    });
</script>

</body>

</html>
