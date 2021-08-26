<%--
  Created by IntelliJ IDEA.
  User: xiBinFang
  Date: 2021/8/18
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试标题</title>
</head>
<body>
<%--<IMG src="${pageContext.request.contextPath}/img/DSC_0827.JPG">--%>

<form action="${pageContext.request.contextPath}/Hello" method="post">
    文本框1<input name="name" type="text">
    <input type="submit" value = "提交">

</form>
<p></p>
<h2>request域</h2>
<h3>后端传来了：${requestScope.get("res")}</h3>

<p></p>
<h2>session域</h2>
<h3>后端传来了：${sessionScope.get("res")}</h3>
</body>
</html>
