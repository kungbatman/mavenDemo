<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<% 
	String path =request.getContextPath();
	String basepath = request.getScheme()+"://" + request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>hello</title>
</head>
<body>
<frameset rows="25%, 50% ,25%">
	<frame src="<%=basepath%>/WEB-INF/jsp/common/foot/foot.jsp">
	<frame src="<%=basepath%>/WEB-INF/jsp/common/head/head.jsp">
	<frame src="<%=basepath%>/WEB-INF/jsp/common/foot/foot.jsp">
</frameset>
</body>

</html>