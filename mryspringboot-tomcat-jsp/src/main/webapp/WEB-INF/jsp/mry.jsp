<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>welcome to mry test</title>
</head>
<body>
 <c:set value="lgh是傻逼呀" var="sth" />
 sth: ${sth} 
 <br> Time:at ${time}
 <br> Message: ${message}
</body>
</html>