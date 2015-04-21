<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
</head>
<body>
<p> HIII ${it.name} </p><br>
<p>New notification: ${it.notification}</p>

<form method="post" action ="/social/sendRequest">
<input type="text" name= "email" >
<input type="submit" value= "send request">
</form>

<form method="post" action ="/social/addFriend">
<input type="text" name= "email" >
<input type="submit" value= "accept friend">
</form>

 <form method="post" action ="/social/Conversation">
Enter The Friend email you want to chat with : <input type="text" name= "Friend" ><br> </br>
Enter the message : <input type="text" name= "Message" >
<input type="submit" value= "Send Message">

</form> 


</body>
</html>