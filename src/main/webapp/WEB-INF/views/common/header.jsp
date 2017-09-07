<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<c:set var="ctx" value="<%= application.getContextPath()%>"/>   <!--모든페이지에서 전역으로 쓰는것 /application은 모든것을 다 알고 있기 때문에   -->
<c:set var="img" value="${ctx}/resources/img"/> 
<c:set var="css" value="${ctx}/resources/css"/> 
<c:set var="js" value="${ctx}/resources/js"/> 
<!doctype html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>학생 관리</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="${css}/member.css" />
  <!--ㅡmember.js 호출  -->
  <script src="${js}/member.js"></script>
</head>
<body>
<div id="wrapper">
