<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 2019/10/15/015
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String path = request.getContextPath();
    String url = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
//你的项目名称改动，
    //http://127.0.0.1:8080/项目名称
%>
发布成功<br>
<a href="<%=url%>">返回首页</a><br>
</body>
</html>
