<%--
  Created by IntelliJ IDEA.
  User: 王帅
  Date: 2019/12/6
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理员登录</title>
</head>
<body>
<h1>管理员登录</h1>
<form action="${pageContext.request.contextPath}/login/adminLoginRequest" method="post">
    用户名：<input name="adminName" type="text"><br/>
    密 码 ：<input name="adminPassword" type="password"><br/>
    <c:if test="${adminError!=null}">
        <span style="color: red">${adminError}</span>
    </c:if>
    <button type="submit">提交</button>
</form>
</body>
</html>
