
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="style.css">
        <link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
        <link href="css/s3slider.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/s3Slider.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $('#slider').s3Slider({
                    timeOut: 3000
                });
            });
        </script>

        <script language="javascript" type="text/javascript">
            function clearText(field)
            {
                if (field.defaultValue == field.value) field.value = '';
                else if (field.value == '') field.value = field.defaultValue;
            }
        </script>

    </head>
    <body>

        <div id="admin_header">
            
              
            <div id="header">
                <div id="logo">
                    <img src="images/logo.png" alt="Site Title" />

                </div>
                
                

            </div>
            <div id="menu-wrapper">
                <div id="menu">
                    <ul>
                        <li class="current_page"><a href="index.jsp">Home</a></li>
                        <li><a href="administrator.jsp"/>Administrator</a></li>
                        <li><a href="log.jsp"/>Login</a></li>
                        <li><a href="show_book.jsp">Book Details</a></li>
                        <li><a href="about_us.jsp">Contact Us</a></li>
                     
                    </ul>

                </div>
            </div>


            <div id="templatemo_banner_wrapper">

                <div id="templatemo_banner">

                    <div id="slider">
                        <ul id="sliderContent">
                            <li class="sliderImage">
                                <a href="#" target="_blank"><img src="gallery/01.jpg" alt="1" /></a>

                            </li>
                            <li class="sliderImage">
                                <a href="#" target="_blank"><img src="gallery/02.jpg" alt="2" /></a>
                                <span class="bottom"><strong>Project 2</strong><br />uisque eget elit quis augue pharetra feugiat.</span>
                            </li>
                            <li class="sliderImage">
                                <a href="#" target="_blank"><img src="gallery/03.jpg" alt="3" /></a>
                                <span class="bottom"><strong>Project 3</strong><br />Sed et quam vitae ipsum vulputate varius vitae semper nunc.</span>
                            </li>
                            <li class="sliderImage">
                                <a href="#" target="_blank"><img src="gallery/04.jpg" alt="4" /></a>
                                <span class="bottom"><strong></strong><br /></span>
                            </li>
                        </ul>
                        <div class="clear sliderImage"></div>
                    </div>


                    <div id="banner_content">
                        <h2>Welcome to the Public Library Online</h2>

                        <p>  
                            Public Library Online offers access to a dynamic range of fiction and non-fiction titles, 
                            from a range of renowned publishers. Simply access the books using any internet enabled 
                            device in the library, whilst you’re on the move, or from the comfort of your own home </p>
                        

                    </div>

                </div> <!-- end of banner-->

            </div> <!-- end of banner wrapper -->


            <div id="footer">
                <p>Copyright (c) 2011 sms@masud.com. All rights reserved. Design by <a href="http://www.google.com/"> shamim & masud</a>.</p>
            </div>

        </div>

    </body>
</html>
