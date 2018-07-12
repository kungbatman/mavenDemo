<%@ page language="java"  import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<style type="text/css" media="screen">
<!-- /* PR-CSS */
table {
border-collapse:collapse; /* 关键属性：合并表格内外边框(其实表格边框有2px，外面1px，里面还有1px哦) */
border:solid #999; /* 设置边框属性；样式(solid=实线)、颜色(#999=灰) */
border-width:1px 0 0 1px; /* 设置边框状粗细：上 右 下 左 = 对应：1px 0 0 1px */
} 
table th,table td {border:solid #999;border-width:0 1px 1px 0;padding:2px;}
tfoot td {text-align:center;}
th{text-size:14px}
td{text-size:12px}
a:link {color:#84C7FF;text-decoration:none;}		/* 未被访问的链接 */
a:visited {color:#ccccc;}	/* 已被访问的链接 */
a:hover {color:#FF00FF;}	/* 鼠标指针移动到链接上 */
a:active {color:#0000FF;}	/* 正在被点击的链接 */
-->
</style>
</head>
<body>
<a href="${pageContext.request.contextPath}/user/add.do">add</a>

<form action="${pageContext.request.contextPath}/user/index.do">
<p>
<label>name:</label>
<input type="search" name="name" value="${name}">
<input type="submit" value="search"> 
</p>
</form>

<table>
<thead>
	<tr>
		<th>id</th>
		<th>name</th>
		<th>age</th>
		<th>operation</th>
	</tr>
</thead>
<tbody>
<c:forEach items="${user}" var="u">
<tr>
<td>${u.id}</td>
<td>${u.name}</td>
<td>${u.age}</td>
<td><a href="update.do?id=${u.id}">update</a> | <a  onclick="return confirm('确认删除吗？')" href="delete.do?id=${u.id}">delete</a></td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
<jsp:include page="page.jsp" flush="true"/><!--动态包含-->
</html>