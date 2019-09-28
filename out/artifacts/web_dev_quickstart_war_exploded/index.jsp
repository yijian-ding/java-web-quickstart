<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
首页
<h3>欢迎你：${pageContext.request.getAttribute("username")}</h3>
<h3>这是rep跳转的密码${pageContext.request.getAttribute("password")}</h3>
<h3>这里是response跳转的用户名：<%=session.getAttribute("username")%></h3>
  <a herf="login.html" target="_blank">点击返回登陆</a>
  </body>
</html>