<%--
  Created by IntelliJ IDEA.
  User: 王帅
  Date: 2019/12/7
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta content="text/html; charset=utf-8" http-equiv="Content-Type"/>
    <title>司机资格申请</title>
    <!-- 引入bootstrap样式文件 -->
    <link rel="stylesheet" media="screen" href="${pageContext.request.contextPath}/static/css/css.css"/>
    <!-- 引入jquery -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jq/jquery-2.1.0.min.js"></script>
    <!-- 引入js文件 -->
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/jquery.easing.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/static/js/jQuery.time.js" type="text/javascript"></script>
    <script>

        //表单校验内容

        //校验用户名
        function checkDriverName() {
            var driverNameInput = $("#driverName").val();
            var reg_username = /^\w{3,10}$/;
            var flag = reg_username.test(driverNameInput);
            if (flag) {
                if (isExist) {
                    $("#driverName").css("border", "1px solid green");
                    $("#driverNameInfo").html("");
                } else {
                    var driverNameInfo = "该用户名已经存在";
                    $("#driverNameInfo").css("color", "red");
                    $("#driverName").css("border", "1px solid red");
                    $("#driverNameInfo").html(driverNameInfo);
                }

            } else {
                var driverNameInfo = "用户名名必须为3-10位字母、数字、下划线";
                $("#driverName").css("border", "1px solid red");
                $("#driverNameInfo").css("color", "red");
                $("#driverNameInfo").html(driverNameInfo);
            }

            return flag;
        }

        //校验密码
        function checkPassword() {
            var password = $("#driverPassword").val();
            var reg_password = /^\w{6,12}$/;
            var flag = reg_password.test(password);
            if (flag) {
                $("#driverPassword").css("border", "1px solid green");
                $("#driverPasswordInfo").html("");
            } else {
                var passwordInfo = "密码必须为6-12位字母、数字、下划线";
                $("#driverPassword").css("border", "1px solid red");
                $("#driverPasswordInfo").css("color", "red");
                $("#driverPasswordInfo").html(passwordInfo);

            }
            return flag;
        }

        //校验真实姓名
        function checkDriverRealName() {
            var driverRealName = $("#driverRealName").val();
            if (driverRealName.length === 0 || driverRealName.length > 18) {
                var driverRealNameInfo = "请输入至多18个英文字符或9个汉字字符";
                $("#driverRealName").css("border", "1px solid red");
                $("#driverRealNameInfo").css("color", "red");
                $("#driverRealNameInfo").html(driverRealNameInfo);

                return false;

            } else {
                $("#driverRealName").css("border", "1px solid green");
                $("#driverRealNameInfo").html("");

                return true;

            }
        }

        //校验身份证号码
        function checkDriverIdNumber() {
            var driverIdNumber = $("#driverIdNumber").val();
            var reg_IdNumber = /^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$|^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/;
            var flag = reg_IdNumber.test(driverIdNumber);

            if (flag) {
                $("#driverIdNumber").css("border", "1px solid green");
                $("#driverIdNumberInfo").html("");
            } else {
                var driverIdNumberInfo = "身份证号码格式不合法";
                $("#driverIdNumber").css("border", "1px solid red");
                //显示提示信息
                $("#driverIdNumberInfo").css("color", "red");
                $("#driverIdNumberInfo").html(driverIdNumberInfo);
            }

            return flag;
        }

        //校验电话号码
        function checkPhoneNum() {
            var phoneNum = $("#driverPhoneNumber").val();
            var reg_phoneNum = /^[1]([3-9])[0-9]{9}$/;
            var flag = reg_phoneNum.test(phoneNum);

            if (flag) {
                $("#driverPhoneNumber").css("border", "1px solid green");
                $("#driverPhoneNumberInfo").html("");
            } else {
                var phoneNumInfo = "电话号码格式不合法";
                $("#driverPhoneNumber").css("border", "1px solid red");
                $("#driverPhoneNumberInfo").css("color", "red");
                $("#driverPhoneNumberInfo").html(phoneNumInfo);
            }

            return flag;
        }

        //校验出生日期
        function checkdriverBirthday() {
            var driverBirthday = $("#driverBirthday").val();
            if (driverBirthday == "" || null == driverBirthday) {
                var driverBirthdayInfo = "请选择出生日期";
                $("#driverBirthday").css("border", "1px solid red");
                $("#driverBirthdayInfo").css("color", "red");
                $("#driverBirthdayInfo").html(driverBirthdayInfo);
                return false;
            } else {
                $("#driverBirthday").css("border", "1px solid green");
                $("#driverBirthdayInfo").html("");
                return true;
            }
        }

        //校验身份证正面
        function checkDriverIdImgFront() {
            var flag = false;
            var img = $("#driverIdImgFront").val();
            if (img !== "") {
                $("#driverIdImgFrontInfo").html("");
                flag = true;
            } else {
                var fileInfo = "请选择要上传的图片";
                $("#driverIdImgFrontInfo").css("color", "red");
                $("#driverIdImgFrontInfo").html(fileInfo);
            }
            return flag;
        }

        //校验身份证反面
        function checkDriverIdImgReverse() {
            var flag = false;
            var img = $("#driverIdImgReverse").val();
            if (img !== "") {
                $("#driverIdImgReverseInfo").html("");
                flag = true;
            } else {
                var fileInfo = "请选择要上传的图片";
                $("#driverIdImgReverseInfo").css("color", "red");
                $("#driverIdImgReverseInfo").html(fileInfo);
            }
            return flag;
        }

        //校验籍贯
        function checkDriverNative() {
            var driverNative = $("#driverNative").val();
            if (driverNative == "" || driverNative == null) {
                var driverNativeInfo = "籍贯信息不能为空";
                $("#driverNative").css("border", "1px solid red");
                $("#driverNativeInfo").css("color", "red");
                $("#driverNativeInfo").html(driverNativeInfo);
                return false;
            } else {
                $("#driverNative").css("border", "1px solid green");
                $("#driverNativeInfo").html("");
                return true;
            }
        }

        //校验现住址
        function checkDriverNowAddress() {
            var driverNowAddress = $("#driverNowAddress").val();
            if (driverNowAddress == "" || driverNowAddress == null) {
                var driverNowAddressInfo = "现住址不能为空";
                $("#driverNowAddress").css("border", "1px solid red");
                $("#driverNowAddressInfo").css("color", "red");
                $("#driverNowAddressInfo").html(driverNowAddressInfo);
                return false;
            } else {
                $("#driverNowAddress").css("border", "1px solid green");
                $("#driverNowAddressInfo").html("");
                return true;
            }
        }

        //校验驾驶证号码
        function checkLicenseId() {
            var licenseId = $("#licenseId").val();
            if (licenseId == "" || licenseId == null) {
                var licenseIdInfo = "请输入驾驶证号码";
                $("#licenseId").css("border", "1px solid red");
                $("#licenseIdInfo").css("color", "red");
                $("#licenseIdInfo").html(licenseIdInfo);
                return false;
            } else {
                $("#licenseId").css("border", "1px solid green");
                $("#licenseIdInfo").html("");
                return true;
            }
        }

        //校验准驾车型
        function checkAllowType() {
            var allowType = $("#allowType").val();
            if (allowType == "" || allowType == null) {
                var allowTypeInfo = "请选择准驾车型";
                $("#allowType").css("border", "1px solid red");
                $("#allowTypeInfo").css("color", "red");
                $("#allowTypeInfo").html(allowTypeInfo);
                return false;
            } else {
                $("#allowType").css("border", "1px solid green");
                $("#allowTypeInfo").html("");
                return true;
            }
        }

        //校验工作经验
        function checkDriverExperience() {
            var driverExperience = $("#driverExperience").val();
            if (driverExperience == "" || driverExperience == null) {
                var driverExperienceInfo = "请选择工作时间";
                $("#driverExperience").css("border", "1px solid red");
                $("#driverExperienceInfo").css("color", "red");
                $("#driverExperienceInfo").html(driverExperienceInfo);
                return false;
            } else {
                $("#driverExperience").css("border", "1px solid green");
                $("#driverExperienceInfo").html("");
                return true;
            }
        }

        //校验邮箱
        function checkEmail() {
            var email = $("#driverEmail").val();
            var reg_email = /^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
            var flag = reg_email.test(email);
            if (flag) {
                $("#driverEmail").css("border", "1px solid green");
                $("#driverEmailInfo").html("");
            } else {
                var emailInfo = "邮箱格式不合法";
                $("#driverEmail").css("border", "1px solid red");
                $("#driverEmailInfo").css("color", "red");
                $("#driverEmailInfo").html(emailInfo);
            }
            return flag;
        }

        //校验验证码
        function checkIdentifyCode() {
            var identifyCode = $("#identifyCode").val();
            var reg_IdentifyCode = /^\w{5}$/;
            var flag = reg_IdentifyCode.test(identifyCode);
            if (flag){
                if (isCorrect){
                    $("#identifyCode").css("border", "1px solid green");
                    $("#identifyCodeInfo").html("");
                }else {
                    var identifyCodeInfo = "验证码错误";
                    $("#identifyCodeInfo").css("color", "red");
                    $("#identifyCode").css("border", "1px solid red");
                    $("#identifyCodeInfo").html(identifyCodeInfo);
                    flag=false;
                }
            }else {
                var identifyCodeInfo = "请输入五位验证码";
                $("#identifyCode").css("border", "1px solid red");
                $("#identifyCodeInfo").css("color", "red");
                $("#identifyCodeInfo").html(identifyCodeInfo);
            }

            return flag;
        }

        $(function () {

            $("#driverName").blur(checkDriverName);
            $("#driverPassword").blur(checkPassword);
            $("#driverRealName").blur(checkDriverRealName);
            $("#driverEmail").blur(checkEmail);
            $("#driverIdNumber").blur(checkDriverIdNumber);
            $("#driverPhoneNumber").blur(checkPhoneNum);
            $("#driverBirthday").blur(checkdriverBirthday);
            $("#driverIdImgFront").blur(checkDriverIdImgFront);
            $("#driverIdImgReverse").blur(checkDriverIdImgReverse);
            $("#driverNative").blur(checkDriverNative);
            $("#driverNowAddress").blur(checkDriverNowAddress);
            $("#licenseId").blur(checkLicenseId);
            $("#allowType").blur(checkAllowType);
            $("#driverExperience").blur(checkDriverExperience);
            $("#identifyCode").blur(checkIdentifyCode);

            //为司机名输入框绑定事件
            $("#driverName").change(function () {
                var driverNameInput = $(this).val();
                var s = {"driverName": driverNameInput};
                $.ajax({
                    url: "${pageContext.request.contextPath}/register/checkDriverName",
                    data: s,
                    dataType: "json",
                    success: function (data) {
                        // alert(data);
                        isExist = data;
                        if (!data) {
                            var driverNameInfo = "该用户名已经存在";
                            $("#driverNameInfo").css("color", "red");
                            $("#driverName").css("border", "1px solid red");
                            $("#driverNameInfo").html(driverNameInfo);

                        } else {
                            checkDriverName();
                        }
                    }
                });
            });

            //为验证码输入框绑定事件
            $("#identifyCode").change(function () {
                var identifyCodeInput = $(this).val();
                var driverEmail = $("#driverEmail").val();
                var s = {"identifyCode": identifyCodeInput,"driverEmail": driverEmail};
                $.ajax({
                    url: "${pageContext.request.contextPath}/register/checkIdentifyCode",
                    data: s,
                    dataType: "json",
                    success: function (data) {
                        // alert(data);
                        isCorrect = data;
                        if (!data) {
                            var identifyCodeInfo = "验证码错误";
                            $("#identifyCodeInfo").css("color", "red");
                            $("#identifyCode").css("border", "1px solid red");
                            $("#identifyCodeInfo").html(identifyCodeInfo);

                        } else {
                            checkIdentifyCode();
                        }
                    }
                });
            });

            $(".applyForm").submit(function () {

                if (!checkDriverName()) {
                    return false;
                }

                if (!(checkDriverName() && checkPassword() && checkDriverRealName() && checkEmail() && checkDriverIdNumber() && checkPhoneNum() && checkdriverBirthday() && checkDriverIdImgFront() && checkDriverIdImgReverse() && checkDriverNative() && checkDriverNowAddress() && checkLicenseId() && checkAllowType() && checkDriverExperience() && checkIdentifyCode() && isExist)) {
                    if (!isExist) {
                        var driverNameInfo = "该用户名已经存在";
                        $("#driverNameInfo").css("color", "red");
                        $("#driverName").css("border", "1px solid red");
                        $("#driverNameInfo").html(driverNameInfo);
                    }
                    return false;
                } else {

                    alert("申请已提交，结果会以邮箱和短信形式通知您，亲耐心等待！");
                    return true;
                }

            });

        });

        //邮箱验证码发送
        var InterValObj; //timer变量，控制时间
        var count = 60; //间隔函数，1秒执行
        var curCount;//当前剩余秒数
        //发送短信验证码
        function sendMessage() {

            var driverEmail = $("#driverEmail").val();
            if (driverEmail == "" || driverEmail == null) {
                var emailInfo = "邮箱不能为空";
                $("#driverEmail").css("border", "1px solid red");
                //显示提示信息
                $("#driverEmailInfo").css("color", "red");
                $("#driverEmailInfo").html(emailInfo);
                return;
            } else if (checkEmail()) {

            } else {
                return;
            }

            curCount = count;
            // 设置button效果，开始计时
            document.getElementById("btnSendCode").setAttribute("disabled", "true");//设置按钮为禁用状态
            document.getElementById("btnSendCode").value = curCount + "秒后重获";//更改按钮文字
            InterValObj = window.setInterval(SetRemainTime, 1000); // 启动计时器timer处理函数，1秒执行一次

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
                document.getElementById("btnSendCode").value = "重获验证码";
            } else {
                curCount--;
                document.getElementById("btnSendCode").value = curCount + "秒后重获";
            }
        }

    </script>
    <style>
        #msform {
            background: #0f13176e;
            width: 830px;
            margin: 150px auto;
            text-align: center;
            position: relative;
            height: 678px;
        }

        .form-three {
            width: 800px;
            height: 368px;
        }

        #msform .action-button {
            width: 100px;
            background: #27AE60;
            font-weight: bold;
            color: white;
            border: 0 none;
            border-radius: 1px;
            cursor: pointer;
            padding: 10px 5px;
            margin-top: 340px;
            float: none;
        }

    </style>
</head>
<body>

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
    <a href="${pageContext.request.contextPath}/driverLogin2.jsp"
       style="color: white;font-family: 楷体;text-decoration: none;font-size: large">司机登录</a>
</div>

<form class="applyForm" id="msform" action="${pageContext.request.contextPath}/register/driverRegister" method="post"
      enctype="multipart/form-data">

    <div class="box-head"
         style="border-bottom: 1px solid #e0e0e0;overflow: hidden;  width:800px;height:50px;line-height:50px;margin: 0 auto; ">
        <h3 style="font-size:20px;display: block;margin: 0 auto;height: 50px;line-height:50px;">信息填写</h3>
    </div>
    <br/>

    <div class="form-two">
        <div class="lform-two">
            <div>
                <label style=" margin-left: 27px;height: 48px; text-align: center;line-height: 48px;">&nbsp;&nbsp;用&nbsp;户&nbsp;名:</label>
                <input type="text" id="driverName" name="driverName" placeholder="请输入用户名" class="input-css"/>
                <span id="driverNameInfo"></span>
            </div>
            <div>
                <label style=" margin-left: 27px;height: 48px; text-align: center;line-height: 48px;">真实姓名:</label>
                <input type="text" id="driverRealName" name="driverRealName" placeholder="请输入真实姓名" class="input-css"/>
                <span id="driverRealNameInfo"></span>
            </div>
            <div>
                <label style="margin-left: 27px;height: 48px; text-align: center;line-height: 48px;">出生日期:</label>
                <input type="date" id="driverBirthday" name="driverBirthday" placeholder="Birthday" class="input-css"/>
                <span id="driverBirthdayInfo"></span>
            </div>
            <div>
                <label style="margin-left: 12px;height: 48px; text-align: center;line-height: 48px;">身份证正面:</label>
                <input type="file" id="driverIdImgFront" name="driverIdImgFront" class="input-css"
                       style="background-color: white;">
                <span id="driverIdImgFrontInfo"></span>
            </div>
            <div>
                <label style=" margin-left: 35px;height: 48px; text-align: center;line-height: 48px;">籍&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;贯:</label>
                <input class="input-css" type="text" id="driverNative" name="driverNative" placeholder="请输入籍贯">
                <span id="driverNativeInfo"></span>
            </div>
            <div>
                <label style=" margin-left: 27px;height: 48px; text-align: center;line-height: 48px;">驾驶证号:</label>
                <input class="input-css" type="text" id="licenseId" name="licenseId" placeholder="驾驶证号"/>
                <span id="licenseIdInfo"></span>
            </div>
            <div>
                <label style=" margin-left: 27px;height: 48px; text-align: center;line-height: 48px;">工作经验:</label>
                <select id="driverExperience" name="driverExperience" class="input-css">
                    <option value="">请选择时间范围</option>
                    <option value="一年以下">一年以下</option>
                    <option value="一年-三年">一年-三年</option>
                    <option value="三年-五年">三年-五年</option>
                    <option value="五年以上">五年以上</option>
                </select>
                <span id="driverExperienceInfo"></span>
            </div>
            <div>
                <label style=" margin-left: 27px;height: 48px; text-align: center;line-height: 48px;">验&nbsp;&nbsp;证&nbsp;&nbsp;码:</label>
                <input class="input-css" type="text" id="identifyCode" name="identifyCode" placeholder="填写验证码"/>
                <span id="identifyCodeInfo"></span>
            </div>
        </div>

        <div class="rform-two">
            <div>
                <label style="margin-left: 27px;height: 48px; text-align: center;line-height: 48px;">密&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;码:</label>
                <input type="password" id="driverPassword" name="driverPassword" placeholder="请输入六到十二位密码"
                       class="	input-css"/>
                <span id="driverPasswordInfo"></span>
            </div>
            <div>
                <label style="margin-left: 27px;height: 48px; text-align: center;line-height: 48px;">身份证号:</label>
                <input type="text" id="driverIdNumber" name="driverIdNumber" placeholder="请输入身份证号" class="input-css"/>
                <span id="driverIdNumberInfo"></span>
            </div>
            <div>
                <label style="margin-left: 27px;height: 48px; text-align: center;line-height: 48px;">联系电话:</label>
                <input class="input-css" type="text" id="driverPhoneNumber" name="driverPhoneNumber"
                       placeholder="请输入联系电话"/>
                <span id="driverPhoneNumberInfo"></span>
            </div>
            <div>
                <label style="margin-left: 12px;height: 48px; text-align: center;line-height: 48px;">身份证反面:</label>
                <input type="file" id="driverIdImgReverse" name="driverIdImgReverse" class="input-css"
                       style="background-color: white">
                <span id="driverIdImgReverseInfo"></span>
            </div>
            <div>
                <label style="margin-left: 27px;height: 48px; text-align: center;line-height: 48px;">现居地址ַ:</label>
                <input class="input-css" type="text" id="driverNowAddress" name="driverNowAddress"
                       placeholder="请输入详细地址">
                <span id="driverNowAddressInfo"></span>
            </div>
            <div>
                <label style="margin-left: 27px;height: 48px; text-align: center;line-height: 48px;">准驾车型:</label>
                <select id="allowType" name="allowType" class="input-css">
                    <option value="">请选择类别</option>
                    <option value="A1">A1</option>
                    <option value="A2">A2</option>
                    <option value="A3">A3</option>
                    <option value="B1">B1</option>
                    <option value="B2">B2</option>
                    <option value="C1">C1</option>
                    <option value="C2">C2</option>
                </select>
                <span id="allowTypeInfo"></span>
            </div>
            <div>
                <label style="margin-left: 39px;height: 48px; text-align: center;line-height: 48px;">邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱:</label>
                <input id="driverEmail" type="text" name="driverEmail" placeholder="请输入邮箱" class="input-css"/>
                <span id="driverEmailInfo"></span>
            </div>
            <div>
                <input id="btnSendCode"
                       style="width: 100px;height: 37px;text-align: center;background-color: white;border: 1px solid #E2E2E2;margin-top: 7px;margin-left: -246px;"
                       name="btnSendCode" type="button" value="获取验证码" onclick="sendMessage();"/>
            </div>
        </div>
    </div>
    <br/>

    <div>
        <button type="submit" class="action-button">提交申请</button>
    </div>
</form>

</body>
</html>
