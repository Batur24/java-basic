<%@ page import="Sample.HelloWorld" %><%--
  Created by IntelliJ IDEA.
  User: batur
  Date: 2017/7/3
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple jsp Page</title>
  </head>
  <body>
    <h3 class="message"><%=HelloWorld.getFun()%></h3>
  </body>
</html>
