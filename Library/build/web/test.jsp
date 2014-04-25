<%-- 
    Document   : test
    Created on : Jun 2, 2013, 5:58:13 AM
    Author     : sms
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
        <form action="Upload" method="post" enctype="multipart/form-data">
         Upload file:
        <input type="file" name="file">
        <input type="submit" value="send">
        </form>
    </body>
</html>
