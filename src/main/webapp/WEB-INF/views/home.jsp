<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="security"
           uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Splitter</title>
  </head>
  <body>
    <h1>Welcome to Splitter <security:authentication property="principal.username" />!</h1>
    <a href="<c:url value="/mygroups" />">Groups</a> |
    <a href="<c:url value="/newgroup" />">Create a new group</a> 
  </body>
</html>