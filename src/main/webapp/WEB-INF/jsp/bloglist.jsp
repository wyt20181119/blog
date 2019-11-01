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

    <a href="<%=url%>/blog/blogEdit/${list.blogid}">编辑</a><br>

    <a href="<%=url%>/blog/blogDelete/${list.blogid}">删除</a><br>

      <span style="font-size:20px;color:black;">${list.title }</span>
    <br>
    <div>${list.blog_content }</div>

    <form action="<%=url%>/blog/blogCommentAdd" method="post">
        <input type="hidden" name="userid" value="usertest2">
        <input type="hidden" name="blogid" value="${list.blogid}">
        <input type="text" name="commentContent" placeholder="写评论" method="post">
        <button type="submit">发评论</button>
    </form>

</c:forEach>



<c:forEach items="${comments}" var="comment">
    <a href="<%=url%>/blog/blogCommentDelete/${comment.commentid}">删除</a>
    <div >${comment.commentContent}  <span >${comment.createtime}</span></div>

</c:forEach>


</body>
</html>
