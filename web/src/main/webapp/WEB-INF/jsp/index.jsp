<%--
  Created by IntelliJ IDEA.
  User: songrengui
  Date: 2019/6/26
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" pageEncoding="UTF-8"  %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<form action="/user/addUser" method="post">
    账号：<input type="text" name="loginacct" >
    姓名：<input type="text" name="username">
    密码：<input type="password" name="userpswd">
    <input type="submit" value="OK">

</form>
</body>
</html>
