<%-- 
    Document   : Register_1
    Created on : 25.Şub.2017, 11:39:10
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
   
    <form action="guru_registering" method="POST">
        <table style="width:50%">
            
            <tr>
                <td>First isim </td>
                <td><input type="text" name="first_isim"/>
            </tr>
            
            <tr>
                <td>Last isim </td>
                <td><input type="text" name="last_isim" />
            </tr>
            <tr>
                <td>User isim</td>
                <td><input type="text" name="user_isim"/></td>
            </tr>
            
            <tr>
                <td>Password </td>
                <td><input type="password"  name="password"/></td>
            </tr>
            
            <tr>
                <td>Adres </td>
                <td><input type="text" name="adres"  /></td>
            </tr>
            
            <tr>
                <td>Contac No</td>
                <td><input type="text" name="contact" /></td>
            </tr>
        </table>
        
        <input type="submit" value="Veri Bilimine Gir" />
    </form>
    
</body>
</html>
