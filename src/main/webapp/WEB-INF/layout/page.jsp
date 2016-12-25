<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Splitter</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Le styles -->
<link
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<script src="http://code.jquery.com/jquery.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="../resources/js/html5shiv.js"></script>
    <![endif]-->
</head>
<body>
	<table border="0" cellpadding="2" cellspacing="2" align="left">
		<tr>
			<td colspan="2" align="center">
				<div id="header">
					<t:insertAttribute name="header" />
				</div>
			</td>
		</tr>
		<tr>
			<td>
				<div id="content">
					<t:insertAttribute name="body" />
				</div>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<div id="footer">
					<t:insertAttribute name="footer" />
				</div>
			</td>
		</tr>
	</table>
</body>
</html>
