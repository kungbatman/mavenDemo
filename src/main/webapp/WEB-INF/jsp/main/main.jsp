<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
	<!-- 上 -->
	<div style="height: 19%;">

		<jsp:include page="../common/head/head.jsp"></jsp:include>
	</div>
	<!-- 	中 -->
	<div style="height: 60%">
		
	</div>
	<!-- 	下 -->
	<%-- <div style="height: 19%;">
		<jsp:include page="../common/foot/foot.jsp"></jsp:include>
			
	</div> --%>








</body>
</html>