<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 2019/10/15/015
  Time: 19:53
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

<c:forEach items="${lists}" var="list">
<form id="blogadd" name="blog" method="post" action="<%=url%>/blog/blogUpdate">
    <input type="hidden" name="userid" placeholder="用户id" value="${list.userid}">
    <input type="hidden" name="blogid" placeholder="博文id" value="${list.blogid}">
    标题：<input type="text" name="title" value="${list.title}">
        博文：<input type="text" name="blog_content" value="${list.blog_content}">
    <button type="submit" name="发布" >修改发布</button>
</form>

</c:forEach>

</body>
</html>
