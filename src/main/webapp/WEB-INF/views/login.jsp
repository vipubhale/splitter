<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
</head>
<body onload='document.loginForm.username.focus();'>
	<div id="login-box" align="center">

		<h2>Login</h2>

		<form id='loginForm' name='loginForm' action="<c:url value='login' />"
			method='POST'>
			<table>
				<tr>
					<td><input type='text' name='username' value=''
						placeholder="Username"></td>
					</br>
				</tr>
				<tr>
					<td></br></td>
				</tr>
				<tr>
					<td><input type='password' name='password'
						placeholder="Password" /></td>
					</br>
				</tr>
				<tr>
					<td></br></td>
				</tr>
				<tr>
					<td>
						<button form="loginForm" formaction="login" formmethod="post"
							type="submit" id="submit" class="btn btn-default btn-block">Log
							in</button>
					</td>
				</tr>
			</table>
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
	</div>

</body>
</html>