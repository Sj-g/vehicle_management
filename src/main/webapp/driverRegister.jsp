<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 王帅
  Date: 2019/12/7
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- 引入bootstrap样式文件 -->
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
    <!-- 引入jquery -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jq/jquery-2.1.0.min.js"></script>
    <!-- 引入js文件 -->
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
    <script>
        var InterValObj; //timer变量，控制时间
        var count = 60; //间隔函数，1秒执行
        var curCount;//当前剩余秒数
        //发送短信验证码
        function sendMessage() {
            curCount = count;
            // 设置button效果，开始计时
            document.getElementById("btnSendCode").setAttribute("disabled","true" );//设置按钮为禁用状态
            document.getElementById("btnSendCode").value=curCount + "秒后重获";//更改按钮文字
            InterValObj = window.setInterval(SetRemainTime, 1000); // 启动计时器timer处理函数，1秒执行一次

            var driverEmail = $("#driverEmail").val();
            var s = {"driverEmail": driverEmail};

            $.ajax({
                url: "${pageContext.request.contextPath}/register/sendIdentifyCode",
                data: s,
                cache: false,
                async: true,
                dataType: "json",
            });
        }

        //timer处理函数
        function SetRemainTime() {
            if (curCount == 0) {//超时重新获取验证码
                window.clearInterval(InterValObj);// 停止计时器
                document.getElementById("btnSendCode").removeAttribute("disabled");//移除禁用状态改为可用
                document.getElementById("btnSendCode").value="重获验证码";
            }else {
                curCount--;
                document.getElementById("btnSendCode").value=curCount + "秒后重获";
            }
        }
    </script>
</head>
<body>

<div>
    <h1>司机注册</h1>
    <form action="${pageContext.request.contextPath}/register/driverRegister" method="post" enctype="multipart/form-data">
        用户名：<input type="text" name="driverName"><br/>
        密码：<input type="password" name="driverPassword"><br/>
        真实姓名：<input type="text" name="driverRealName"><br/>
        出生日期：<input type="text" name="driverBirthday"><br/>
        身份证号<input type="text" name="driverIdNumber"><br/>
        身份证正面：<input type="file" name="driverIdImgFront"><br/>
        身份证反面：<input type="file" name="driverIdImgReverse"><br/>
        联系电话：<input type="text" name="driverPhoneNumber"><br/>
        邮箱：<input type="text" id="driverEmail" name="driverEmail"><br/>
        籍贯：<input type="text" name="driverNative"><br/>
        现住址：<input type="text" name="driverNowAddress"><br/>
        驾驶证号：<input type="text" name="licenseId"><br/>
        工作经验：<input type="text" name="driverExperience"><br/>
        准驾车型：<input type="text" name="allowType"><br/>
        验证码：<input type="text" name="identifyCode">
        <input id="btnSendCode"
               style="width: 120px;height: 39px;text-align: center;background-color: white;border: 1px solid #E2E2E2;"
               name="btnSendCode" type="button"
               value="获取验证码" onclick="sendMessage();" /><br/>
        <c:if test="${identifyCodeError!=null}">
            <span style="color: red">${identifyCodeError}</span>
        </c:if>
        <button type="submit">提交申请</button>
        &nbsp;&nbsp;&nbsp;
        <a href="driverLogin.jsp">返回</a>
    </form>
</div>

</body>
</html>
