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

<table>
  <tr>
  	<td colspan="6">
  		<form action="queryInfoByItem" method="post">
  		
  			宿舍号：<input type="text" name="i_name" placeholder="${map.i_name }">
  			
  			<select name="i_status">
  				<option value="">请选择状态</option>
  				<option value="0" >晒被中</option>
  				<option value="1" >已收被</option>
  			</select>
  			
  			<select name="t_id">
  				<option value="">请选择老师</option>
  				<c:forEach items="${tlist }" var="t">
  					<option value="${t.t_id }">${t.t_name }</option>
  				</c:forEach>	
  			</select>
  			
  			<input type="submit" value="查询">
  			
  		</form>
  	</td>
  </tr>
  <tr>
    <th>ID</th>
    <th>宿舍号</th>
    <th>负责老师</th>
    <th>晒被时间</th>
    <th>状态</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${plist.list }" var="i">
  <tr>
    <td>${i.i_id }</td>
    <td>${i.i_name }</td>
    <td>${i.t_name }</td>
    <td>${i.i_uptime }</td>
    <td>${i.i_status==1?"已收被":"晾晒中" }</td>
    <td>
    	<c:if test="${i.i_status==1}">
    		<a href="queryInfoById?i_id=${i.i_id}">
    			<input type="button" value="查看">
    		</a>
    	</c:if>
    	<c:if test="${i.i_status==0}">
    		<a href="toShouBei?i_id=${i.i_id}">
    			<input type="button" value="收被">
    		</a>
    	</c:if>

        <a href="add.jsp"><input type="button" value="添加"></a>
    </td>
  </tr>
  </c:forEach>
  <tr>
  	<td colspan="6">
  		<a href="?pageNum=1">首页</a>
  		<a href="?pageNum=${plist.pageNum-1<1?plist.pageNum:plist.pageNum-1 }">上一页</a>
  		<a href="?pageNum=${plist.pageNum+1>plist.pages?plist.pageNum:plist.pageNum+1 }">下一页</a>
  		<a href="?pageNum=${plist.pages }">尾页</a>
  	</td>
  </tr>
</table>


</body>
</html>