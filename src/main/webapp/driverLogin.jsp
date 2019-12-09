<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 王帅
  Date: 2019/12/6
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>司机登录</title>
</head>
<body>
<h1>司机登录</h1>
<form action="${pageContext.request.contextPath}/login/driverLoginRequest" method="post">
    用户名：<input name="driverName" type="text"><br/>
    密 码 ：<input name="driverPassword" type="password"><br/>
    <c:if test="${driverError!=null}">
        <span style="color: red">${driverError}</span>
    </c:if>
    <button type="submit">提交</button>
    <a href="${pageContext.request.contextPath}/adminLogin.jsp">管理员登录</a>
    <a href="${pageContext.request.contextPath}/driverRegister.jsp">加入我们</a>
</form>
</body>
</html>
