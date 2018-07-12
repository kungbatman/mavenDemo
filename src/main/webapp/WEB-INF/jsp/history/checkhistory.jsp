<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<% 
	String path =request.getContextPath();
	String basepath = request.getScheme()+"://" + request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<%=basepath%>css/history/history.css" type="text/css">
<script type="text/javascript" src="<%=basepath%>js/jquery/jquery-3.3.1.min.js"></script>
<title>Insert title here</title>

<script type="text/javascript">
	function changeIframe() {
		document.getElementById("upframe").style.display = "block";

	}
</script>


<style type="text/css">
html, body {
	height: 100%;
}

#history_chackhistory {
	height: 21px;
	line-height: 21px;
	padding: 0 11px;
	background: #02bafa;
	border: 1px #26bbdb solid;
	border-radius: 3px;
	/*color: #fff;*/
	display: inline-block;
	text-decoration: none;
	font-size: 12px;
	outline: none;
	margin-left: 20%;
	margin-top: %;
}

.navigation {
	border: 1px red solid;
	width: 10%;
	margin-left: 5%;
	margin-top: 10%;
	height: 60%;
}

#content {
	border: 1px blue solid;
	height: 70%;
	width: 70%;
	margin-left: 25%;
	margin-top: -33%;
}

.check_number {
	float: left;
	border: 1px yellow solid;
}

.check_time {
	float: left;
	border: 1px yellow solid;
}

.check_history {
	float: left;
	border: 1px solid red;
}

.display_history {
	border: 1px red solid;
	width: 98%;
	height: 80%;
	margin-top: 10%;
}

.history_table {
	width: 99%;
}

.th {
	width: 10%;
}
</style>

</head>
<body>
	<div
		style="border: 1px red solid; width: 90%; height: 90%; margin-left: 5%">
		<div class="navigation">
			<a id="history_chackhistory" href="">查看历史记录</a>
		</div>


		<div id="content">
			<!-- 查詢條件 -->
			<!-- 表号查询 -->
			<form action="checkAllHistory.do" method="post" id="checkHistoryForm"
				target="upframe">
				<div class="check_number">
					表号：<input type="text" name="terminalName" placeholder="请输入设备id"
						value="">
				</div>
				<div>
					地区:<input type="text" name="area_Id" placeholder="请输入地区ID">
				</div>
				<!-- 时间查询 -->
				<div class="bigin_time">
					起始时间：<input type="text" name="beginTime" placeholder="请输入起始时间"
						value="">
				</div>
				<div class="end_time">
					结束时间：<input type="text" name="endTime" placeholder="请输入结束时间"
						value="">
				</div>

				<!-- 查询按钮 -->
				<div class="check_history">
					<!-- <a href="checkAllHistory.do">查看</a> -->
					<button id="submitCheckHistory" type="submit"
						onclick="changeIframe()">查看历史</button>
				</div>
			</form>

			<iframe id="upframe" name="upframe" allowtransparency="true" src="#"
				width="100%" height="800px" frameborder="0" marginheight="0"
				marginwidth="0" style="display: none;"> </iframe>
		</div>
	</div>
</body>
</html>