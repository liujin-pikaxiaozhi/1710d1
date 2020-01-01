<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<link rel="stylesheet" href="cms/css/index3.css">
<script type="text/javascript" src="cms/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
var orderMether='${vo.orderMether=="asc"?"desc":"asc"}';
	function myOrder(orderColumn) {
		location.href="select?orderColumn="+orderColumn+"&orderMether="+orderMether+"";
	}
</script>
</head>
<body>
<form action="select" method="post">
电影名称<input type="text" name="name" value="${vo.name}"><br>
上映时间<input type="date" name="datea1" value="${vo.datea1}">--
	<input type="date" name="datea2" value="${vo.datea2}"><br>
电影价格<input type="text" name="price1" value="${vo.price1}">--
	<input type="text" name="price2" value="${vo.price2}"><br>
电影年代<select name="year">
		<option value="-1">请选择年代</option>
		<option value="2015">2015</option>
		<option value="2019">2019</option>
		<option value="2020">2020</option>
	</select><br>
电影时长<input type="text" name="longTime1" value="${vo.longTime1}">--
	<input type="text" name="longTime2" value="${vo.longTime2}">
<input type="submit" value="查看">
</form>
<table>
	<tr>
		<td>电影编号</td>
		<td>电影名称</td>
		<td>电影价格</td>
		<td><a href="javascript:myOrder('longTime')">电影时长</a></td>
		<td><a href="javascript:myOrder('year')">电影年代</a></td>
		<td><a href="javascript:myOrder('datea')">上映时间</a></td>
		<td>区域</td>
		<td>状态</td>
		<td>操作</td>
	</tr>
	<c:forEach var="m" items="${list}" varStatus="count">
		<tr>
			<td>${m.id}</td>
			<td>${m.name}</td>
			<td>${m.price}</td>
			<td>${m.longTime}</td>
			<td>${m.year}</td>
			<td>${m.datea}</td>
			<td>${m.area}</td>
			<td>${m.status==0?'即将上映':m.status==1?'正在热映':'已经下架'}</td>
			<td>
				操作
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>