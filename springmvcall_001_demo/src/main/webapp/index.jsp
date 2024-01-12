<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024/1/9
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/demo">提交</a>
<br><br><br>

<form action="${pageContext.request.contextPath}/a.action" method="post">
    姓名<input name="name"><br>
    年龄<input name="age"><br>
    <input type="submit" value="post请求">
</form>

<a href="${pageContext.request.contextPath}/WEB-INF/asd.jsp">asd</a>
</body>
</html>
