<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<html>
  <head>
    <title>My JSP 'login.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="${ctx }/static/lib/bootstrap-3.3.5/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${ctx }/static/admin/login.css">
	<script type="text/javascript" src="${ctx }/static/lib/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="${ctx }/static/lib/bootstrap-3.3.5/js/bootstrap.min.js"></script>
	<style type="text/css">
	</style>
  </head>
  
  <body>
    <div class="container">
      <form class="form-signin" action="${ctx }/admin/doLogin" method="post">
        <h2 class="form-signin-heading">Please sign in ${errorMsg }</h2>
        <label for="inputEmail" class="sr-only">账号</label>
        <input type="text" id="inputEmail" class="form-control" placeholder="账号" name="username" required autofocus>
        <label for="inputPassword" class="sr-only">密码</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="密码" name="password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me">记住我
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
      </form>

    </div>
  </body>
</html>
