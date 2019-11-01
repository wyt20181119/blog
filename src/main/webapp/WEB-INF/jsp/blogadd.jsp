<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 2019/10/15/015
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

<form id="blogadd" name="blog" method="post" action="<%=url%>/blog/add">
    <input type="hidden" name="userid" placeholder="用户id" value="sada2">
    <input type="hidden" name="blogid" placeholder="博文id" value="">
    标题：<input type="text" name="title" value="">
    博文：<input type="text" name="blog_content" value="">
    <button type="submit" name="发布" >发布</button>
</form>

</body>
</html>
