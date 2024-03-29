<%--
  Created by IntelliJ IDEA.
  User: alexau
  Date: 2019/8/27
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>商品列表</title>

    <script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>

    <script type="text/javascript">
        /*将post method 改变为delete*/
        $(function(){
            $(".delete").click(function(){
                var href=$(this).attr("href");
                $("#formdelete").attr("action",href).submit();
                return false;
            })
        })
    </script>
</head>
<body>
<div align="center">

</div>

<div style="width:500px;margin:20px auto;text-align: center">
    <table align='center' border='1' cellspacing='0'>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>编辑</td>
            <td>删除</td>
        </tr>
        <c:forEach items="${page.list}" var="c" varStatus="st">
            <tr>
                <td>${c.id}</td>
                <td>${c.name}</td>
                <td><a href="categories/${c.id}">编辑</a></td>
                <td><a class="delete" href="categories/${c.id}">删除</a></td>
            </tr>
        </c:forEach>

    </table>
    <br>
    <div>
        <a href="?start=0">[首  页]</a>
        <a href="?start=${page.pageNum-1}">[上一页]</a>
        <a href="?start=${page.pageNum+1}">[下一页]</a>
        <a href="?start=${page.pages}">[末  页]</a>
    </div>
    <br>
    <form action="categories" method="post">
    name: <input name="name"> <br>
    <button type="submit">提交</button>

</form>

    <form id="formdelete" action="" method="POST" >
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
