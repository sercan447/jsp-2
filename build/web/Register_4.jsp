<%-- 
    Document   : Register_4
    Created on : 25.Şub.2017, 23:06:58
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
    
    <h1><font color="green"><%= request.getParameter("username")  %></font></h1>
    <% 
        if(request.getAttribute("olumlu") != null){
            out.println(request.getAttribute("olumlu"));
    
            }
        
                    out.println("<br/>veri 1: "+request.getAttribute("veri1"));
                    out.println("<br/>veri 2 : "+request.getAttribute("veri2"));
                    out.println("<br/> veri 3 : "+request.getAttribute("veri3"));
                    
        %>
    
    
</body>
</html>
