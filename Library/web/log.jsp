<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Guided Registration Form - Vandelay Design Demo</title>
        <meta name="author" content="Jake Rocheleau">
        <link rel="stylesheet" type="text/css" media="all" href="jquery/styles.css">
        <SCRIPT LANGUAGE="JavaScript">
            function dil(form)
            {
                for (var i = 0; i < form.elements.length; i++)
                {
                    if (form.elements[i].value == "")
                    {
                        alert("Fill out all Fields");
                        document.F1.user_name.focus;
                        return false;
                    }
                }
                if (!isNaN(document.F1.user_name.value))
                {
                    alert("User Name  must  be  char's & can't be null");
                    document.F1.user_name.value = "";
                    document.F1.user_name.focus();
                    return false;
                }
                if (!isNaN(document.F1.email.value))
                {

                    alert("User Name  must  be  char's & can't be null");

                    document.F1.email.value = "";
                    document.F1.email.focus();
                    return false;

                }
                
                if (document.F1.email.value != document.F1.email2.value)
                {
                    alert("Email Does Not Match ");
                    document.F1.email2.value = "";
                    document.F1.email2.focus();
                    return false;
                }
                if (document.F1.password.value != document.F1.repassword.value)
                {
                    alert("Password Does Not Match ");
                    document.F1.repassword.value = "";
                    document.F1.repassword.focus();
                    return false;
                }

                return true;
            }
        </SCRIPT>


    </head>

    <body>
        <div id="wrapper">
            <center><h2>Register Now and Join the Site!</h2></center>

            <div id="form-container">
                <form  name=F1 onSubmit="return dil(this)" action="Welcome_member" method="post">


                    <div class="row">

                        <div class="row">
                            &nbsp; &nbsp;  &nbsp;	<label for="username">Enter a Username &rarr;</label>
                            <input type="text" id="username" name="user_name" class="reg-input tiny" autocomplete="off" tabindex="1">
                        </div>                                                             														
                        <div class="row">
                            &nbsp; &nbsp;  &nbsp;		<label for="password">Choose a Password &rarr;</label>
                            <input type="password" name="admin_password" class="reg-input tiny" autocomplete="off" tabindex="2">
                        </div>
                    </div>
                    	<%
                                if (request.getAttribute("error") != null) {

                            %>
                            <center><h1 style="color: red;">User Name Password error!!</h1></center>
                            <%                                }
                            %>
			
                    
                    <div class="row">
                        <center>
                            <input type="submit" value="Sign In!" name="submit" id="submit" class="sub-btn" tabindex="11">
                        </center>
                        
                       
                        
                        

                    </div>       
                </form><table><tr><td><h1>
                                <a href="index.jsp">Go Home</a><h1>
                                </td> 
                                <td>&nbsp; &nbsp;  &nbsp;  &nbsp;&nbsp; &nbsp;  &nbsp;  &nbsp;&nbsp; &nbsp;  &nbsp;  &nbsp;&nbsp; &nbsp;  &nbsp;  &nbsp;&nbsp; &nbsp;  &nbsp;  &nbsp;&nbsp; &nbsp;  &nbsp;  &nbsp;&nbsp; &nbsp;  &nbsp;  &nbsp;&nbsp; &nbsp;  &nbsp;  &nbsp;</td>
                                </td>
                                <td>&nbsp; &nbsp;  &nbsp;  &nbsp;&nbsp; &nbsp;  &nbsp;  &nbsp;&nbsp; &nbsp;  &nbsp;  &nbsp;&nbsp; &nbsp;  &nbsp;  &nbsp;&nbsp; &nbsp;  &nbsp;  &nbsp;&nbsp; &nbsp;  &nbsp;  &nbsp;&nbsp; &nbsp;  &nbsp;  &nbsp;&nbsp; &nbsp;  &nbsp;  &nbsp;</td>
                                <td>
                                        <h1>    <a href="member_register2.jsp">Sign Up</a> </h1>
                        </td></tr></table>
            </div>
        </div>

    </body>
</html>