<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC From Handling</title>
</head>
<body> <h2>Traveler Registration Result</h2>
    <table>
        <tr>
            <td>Name</td>
            <td>${u.name}</td>
        </tr>
        <tr>
            <td>Last name</td>
            <td>${u.lastName}</td>
        </tr>     
        <tr>
            <td>Birth Month</td>
            <td>${u.birthMonth}</td>
        </tr>  
        <tr>
            <td>Country</td>
            <td>${u.country}</td>
        </tr>   
        </table>
<a href = "viewAll.mvc">View all Travelers</a>
</body>
</html>