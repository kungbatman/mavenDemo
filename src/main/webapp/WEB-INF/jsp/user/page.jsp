<%@ page language="java"  import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="page">
	<c:forEach items="${pageInfo}" var="p">
		<c:choose>  
	   <c:when test="${currentPage eq p}">   
	    	<strong>${p}</strong>
	   </c:when>  
	   <c:otherwise> 
	    	<a href="index.do?page=${p}&name=${name}">${p}</a>
	   </c:otherwise>  
	</c:choose>  
	</c:forEach>
</div>