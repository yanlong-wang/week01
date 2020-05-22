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
       <h1>晒被</h1>
       
<form action="#" method="post">
       
	宿舍号：<input type="text" name="i_name" ><br>
	
	<select name="t_id">
		<option value="">请选择老师</option>	
	</select><br>
	<input type="button" value="添加" onclick="tj()">
</form>

<script type="text/javascript">
	
	$.post("queryAllTeacher",function(obj){
		for ( var x in obj) {
			$("select").append("<option value='"+obj[x].t_id+"'>"+obj[x].t_name+"</option>");
		}
	},"json");
	
	function tj() {
		$.post("addInfo",$("form").serialize(),function(data){
			if(data){
				alert("保存成功！")
				location="queryInfoByItem";
			}else{
				alert("保存失败！")
				location="add.jsp";
			}
		},"json");
	}

</script>

</body>
</html>