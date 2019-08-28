<%--
  Created by IntelliJ IDEA.
  User: alexau
  Date: 2019/8/27
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
</head>
<body>

<div style="width:500px;border:1px solid lightgray;margin:200px auto;padding:80px">

    系统 出现了异常，异常原因是：
    <br><br>
    ${exception}
    <br><br>
    出现异常的地址是：
    ${url}
</div>

</body>
</html>
