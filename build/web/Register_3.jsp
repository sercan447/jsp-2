<%-- 
    Document   : Register_3
    Created on : 25.Şub.2017, 22:53:02
    Author     : Sercan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
        <%
            if(request.getAttribute("olumsuz") != null){
                out.println("Veri : "+request.getAttribute("olumsuz"));
            }
        %>
    <form action="kardesian" method="POST">
        <table>
            <tr>
                <td>User Name</td>
                <td><input type="text" name="username" /></td>
            </tr>
            
            <tr>
                <td>Password</td>
                <td><input type="text" name="password"  /></td>
            </tr>
        </table>
        <input type="submit" value="Login" />
    </form>
    
    
</body>
</html>
