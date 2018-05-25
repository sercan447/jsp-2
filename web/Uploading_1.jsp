<%-- 
    Document   : Uploading_1
    Created on : 26.Şub.2017, 15:56:20
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
    File :<br/>
    <form action="zeytindali" method="POST" enctype="multipart/form-data">
            
        <input type="file" name="dosya_sistemi" size="50" />
        <br/>
        <input type="submit" value="Uploading" />
    </form>
</body>
</html>
