<%--
  Created by IntelliJ IDEA.
  User: GaoXiang
  Date: 2015/9/16 0016
  Time: 下午 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>

<html>
<head>
    <title>首页测试</title>
</head>
<body>
<h2>WEB-INF!</h2>

<h4> 1` ${status}</h4>
<h4> 2` ${id}</h4>
<h4> 2` ${pageInfo.toString()}</h4>

<table style="width: 100%;" class="table table-striped table-bordered">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>url</th>
        <th>操作</th>
    </tr>

    <c:forEach var="item" items="${pageInfo.list}" varStatus="status" >
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.url}</td>
            <td>
                <a href="javascript:void(0);" onclick="delPpwer('${item.id}')">删除</a>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
