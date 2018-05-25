<%-- 
    Document   : Result
    Created on : 26.Şub.2017, 16:33:59
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
    
    <% String msg = (String) request.getAttribute("gurumesaji"); %>
    
    <% 
        out.println(msg);
    %>
    
    
    
</body>
</html>
