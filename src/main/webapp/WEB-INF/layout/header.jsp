<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
	<c:url value="/resources/assets/css/myapp.css" var="appCss" />
	<link rel="stylesheet" type="text/css" href="${appCss}">
</head>
<body>
	<div class="header">
		<nav class="navbar navbar-fixed-top">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="/splitter">Splitter</a>
				</div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="/splitter">Home</a></li>
					<li><a href="#">Help</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="/splitter/signup"><span
							class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					<security:authorize access="isAuthenticated()">
						<security:authentication property="principal.username"
							var="loginId" scope="request" />
					</security:authorize>
					<c:choose>
						<c:when test="${loginId != null}">
							<c:url value="/logout" var="logoutUrl" />
							<li><a href="${logoutUrl}"><span
									class="glyphicon glyphicon-log-out"></span> Logout</a></li>
						</c:when>
						<c:when test="${loginId == null}">
							<li><a href="/splitter/login"><span
									class="glyphicon glyphicon-log-in"></span> Login</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="/splitter/login"><span
									class="glyphicon glyphicon-log-in"></span> Login</a></li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
		</nav>
	</div>
</body>
</html>
