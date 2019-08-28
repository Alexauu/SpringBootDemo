<%--
  Created by IntelliJ IDEA.
  User: alexau
  Date: 2019/8/28
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改</title>
</head>
<body>

<div style="margin:0px auto; width:500px">

    <form action="../categories/${c.id}" method="post">
        <input type="hidden" name="_method" value="PUT">
        name: <input name="name" value="${c.name}"> <br>
        <button type="submit">提交</button>

    </form>
</div>

</body>
</html>
