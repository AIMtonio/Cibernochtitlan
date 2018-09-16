<%-- 
    Document   : test
    Created on : 14-may-2018, 13:53:00
    Author     : AntonioPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        
        <br><br>
        
        
        <%
        String kdr="Hola";    
        %>
        <input type="text" name="test" id="test" value="<%= kdr %>">
        
    </body>
</html>
