
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="library.css">
    </head>
    <body>
        <div id="header">
        </div>

        <div id="menu">
            <ul>
                <li class="current_page"><a href="#">Home</a></li>
                <li><a href="administrator.jsp"/>Administrator</a></li>
                <li><a href="member_register.jsp"/>Member</a></li>
                <li><a href="#">Book Details</a></li>
                <li><a href="#">About Us</a></li>
                <li><a href="#">Contact Us</a></li>
            </ul>
        </div>

    <div id="right">
        
         <div>
            <h3>Sign Up </h3>
           <form>
            <table>
                <tr>
                    <td>User Name :</td>
                    <td><input type="text" name="user_name"></td>
                </tr>
                <br>
                <tr>
                    <td>E-mail:</td>
                    <td><input type="email" name="email"></td>
                </tr>
                <br>
                <tr>
                    <td>password:</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <br>
                <tr>
                    <td>&nbsp;</td>
                    <td><input type="submit" value="submit"></td>
                </tr>
            </table>
           </form>
        </div>
    </div>
    
    <div id="footer">
        
    </div>

</body>
</html>

