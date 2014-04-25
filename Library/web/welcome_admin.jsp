<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>welcome admin</title>
        <meta name="author" content="Jake Rocheleau">
        <link rel="stylesheet" type="text/css" media="all" href="jquery/styles.css">



    </head>

    <body>
        <%
            if ((session.getAttribute("userName") == null) || (session.getAttribute("userid") == "")) {
        %>
        You are not logged in<br/>
        <% response.sendRedirect("administrator.jsp"); %>
        
                <%} else {
                %>
                <div id="wrapper">
                    <center><h2>Welcome Administrator</h2></center>

                    <div id="form-container">
                        <form  action="Member_Register" method="post">
                            <center>
                                <h2> <a href="update_user.jsp">Update User Information</a></h2><br>
                                <h2><a href="delete_user.jsp">Delete User Information</a></h2><br>
                                <h2><a href="insert_book.jsp">Insert Book Details</a></h2><br>
                                <h2><a href="show_book.jsp">Show Book Details</a></h2>
                                <h2><a href="index3.jsp">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="m.jsp">Log Out</a></h2>

                            </center>

                        </form>
                    </div>
                </div>
                <% }%>

                </body>
                </html>