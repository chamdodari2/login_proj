<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="dog_shopingmall_proj.ds.JndiDS"%>
 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="login/css/index.css">

</head>
<body>
<%--  <%=JndiDS.getConnection() %> --%>

<c:choose>
<c:when test="${id. eq null }" >
<h2>로그인한 상태가 아닙니다.</h2>
<h1><a href="login/loginForm.html">로그인</a></h1>
</c:when>
<c:otherwise>
<h3>${id } 으로 로그인하셨습니다.</h3>
<h1><a href="logout">로그아웃</a></h1>
</c:otherwise>

</c:choose>
</body>
</html>