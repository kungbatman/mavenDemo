<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>

<style type="text/css">
ul li {
	list-style: none;
	float: left;
	width: 100px;
}

#head_logo {
	float: left;
}

#head_navigation {
	float: left;
}
</style>
</head>
<body>
	<div id="head" style="height: 30%">
		<!-- logo -->
		<div id="head_logo"
			style="height: 100%; width: 20%; border: 1px solid red">
			<img alt="" src="<%=basepath%>image/common/logo_joyo.png"
				height="100px">
		</div>
		<!-- ������ -->
		<div id="head_navigation"
			style="height: 100%; width: 50%; border: 1px solid green;">
			<ul>
				<li><a type="" href="#"
					class=""> ������Ϣ</a></li>
				<li><a href="#"
					class=""> �豸��Ϣ</a></li>
				<li><a href="#"
					class=""> ��ʷ����</a></li>
				<li><a href="#"
					class=""> ���ݱ���</a></li>
				<li><a href="#"
					class="">ʵʱ��ʾ</a></li>
			</ul>
		</div>
		<!-- ʱ�� -->
		

	
	</div>

</body>

</html>