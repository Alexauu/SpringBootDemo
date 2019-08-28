<%--
  Created by IntelliJ IDEA.
  User: alexau
  Date: 2019/8/28
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图片显示</title>
</head>
<body>

<div style="width:500px;border:1px solid lightgray;margin:200px auto;padding:80px">

    您上传的图片是：
    <br><br>
    ${fileName}
    <br><br>
    <img src="<%=request.getContextPath()%>/uploaded/${fileName}" height="400" width="400" />
    <br><br>
</div>

</body>
</html>
