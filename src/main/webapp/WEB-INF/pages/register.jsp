<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<h1 style="color:cyan;text-align: center"></h1>
    <form action="/register.jsp" method="post">
    		PID			:::<input type="text" name="pId"><br><br>
    		Name	:::<input type="text" name="pName"><br><br>
    		Address:::<input type="text" name="pAddress"><br><br>
    		Age			::<input type="text" name="age"><br><br>
    		Mobile  ::<input type="text" name="mob"><br><br>
    		<input type="submit" name="s1" value="insert">
    		<input type="submit" name="s1" value="update" >
    		<input type="submit" name="s1" value="delete" >
    		<input type="submit" name="s1" value="view" >
    </form>
    Operation:::${Operation_Status}
    