<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 2019/10/15/015
  Time: 19:36
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

我的首页
<a href="<%=url%>/blog/addIndex">发博客</a>

<form action="<%=url%>/blog/search" method="post" >
    <input type="text" name="search" placeholder="查询博客">
    <button type="submit" >搜索</button>
</form>

<%--查询全部博客--%>
<c:forEach items="${lists}" var="list">

    <a href="<%=url%>/blog/findOne/${list.blogid}">
        <span style="font-size:20px;color:black;">${list.title }</span>
        <br>
        <div>${list.blog_content }</div>
    </a>

</c:forEach>


</body>
</html>
