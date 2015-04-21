<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
</head>
<body>
<p> HIII ${it.name} </p>
<form method="post" action ="/social/sendRequest">
<input type="text" name= "email" >
<input type="submit" value= "send request">
</form>

<form method="post" action ="/social/addFriend">
<input type="text" name= "email" >
<input type="submit" value= "accept friend">
</form>
</body>
</html>