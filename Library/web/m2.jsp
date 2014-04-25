


<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Download Demo</title>
        <meta name="author" content="Jake Rocheleau">
        <link rel="stylesheet" type="text/css" media="all" href="jquery/styles.css">

    </head>

    <body>
        <div id="wrapper">
            <center><h2>You are permitted for downloading <% out.print(request.getParameter("id"));%></h2></center>

            <div id="form-container">
                <form   action="download1" method="Get">

                    <div class="row">

                        <input type="hidden" name="id" value="<% out.print(request.getParameter("id"));%>">
                        
                    </div>




                    <center><input type="submit" value="Dodnload!" name="submit" id="submit" class="sub-btn" tabindex="11"></center>
                    <h1><left><a href="show_book.jsp">Go Home</left><h1>
                </form>
            </div>
        </div>

    </body>
</html>

