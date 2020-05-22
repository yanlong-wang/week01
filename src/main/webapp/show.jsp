<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
			<h1>详情</h1>
	<form action="queryInfoByItem" method="post">
  		
  			宿舍号：<input type="text" name="i_name" value="${info.i_name }" disabled="disabled">
  			<br>
  			<select name="t_id" disabled="disabled">
  				<option value="">请选择老师</option>
  				<c:forEach items="${tlist }" var="t">
  					<option value="${t.t_id }" <c:if test="${t.t_id==info.t_id }">selected</c:if>>${t.t_name }</option>
  				</c:forEach>	
  			</select>
  			<br>
  			日期：<input type="text" name="i_uptime" value="${info.i_uptime }" disabled="disabled">
  			<br>
  			<select name="i_status" disabled="disabled">
  				<option value="" >请选择状态</option>
  				<option value="0" <c:if test="${info.i_status==0 }">selected</c:if>>晒被中</option>
  				<option value="1" <c:if test="${info.i_status==1 }">selected</c:if>>已收被</option>
  			</select>
  			<br>
  			<input type="submit" value="关闭">
  			
  		</form>

</body>
</html>