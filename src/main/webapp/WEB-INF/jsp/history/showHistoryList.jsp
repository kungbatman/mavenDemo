<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
	<!-- ��ʾ��ʷ��¼ -->
	<div class="display_history" style="background: red" >
		<table class="history_table" border="1" width="100%">
			<thead>
				<tr>
					<th class="th">��ַ����</th>
					<th class="th">��ַ���</th>
					<th class="th">�Ǳ��</th>
					<th class="th">�ۼ�����</th>
					<th class="th">�����ۼ�����</th>
					<th class="th">�����ۼ�����</th>
					<th class="th">˲ʱ����</th>
					<th class="th">��ˮ�¶�</th>
					<th class="th">״̬</th>
					<th class="th">ʱ��</th>
				</tr>
			</thead>
			<!-- �������� -->
			
				<%--������ʷ���� --%> 
				<c:forEach items="${historicalRecordsList}" var="historicalRecord">
				<tr>
					<th align="center">${historicalRecord.area.areaname}</th>
					<th align="center">${historicalRecord.areanumber}</th>
					<th align="center">${historicalRecord.meternumber}</th>
					<th align="center">${historicalRecord.cumulativeflow}</th>
					<th align="center">${historicalRecord.positivecumulativeflow}</th>
					<th align="center">${historicalRecord.instantaneousflow}</th>
					<th align="center">${historicalRecord.watersupplytemperature}</th>
					<th align="center">${historicalRecord.state}</th>
					<th align="center">${historicalRecord.time}</th>
				</tr>
				</c:forEach>
		</table>
	</div>
</body>
</html>