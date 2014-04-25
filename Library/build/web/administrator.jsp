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
                        alert("Insert User Name and Password");
                        document.F1.user_name.focus;
                        return false;
                    }
                }
                

                return true;
            }
        </SCRIPT>

  
</head>

<body>  
	<div id="wrapper">
            <center><h2>Enter As Administrator</h2></center>
		
		<div id="form-container">
			<form  name=F1 onSubmit="return dil(this)" action="welcome_admin" method="post">
				
				
				<div class="row">
                                 &nbsp; &nbsp;  &nbsp;	<label for="username">Enter a Username &rarr;</label>
				<input type="text" id="username" name="user_name" class="reg-input tiny" autocomplete="off" tabindex="1">
				</div>                                                             														
				<div class="row">
				 &nbsp; &nbsp;  &nbsp;		<label for="password">Choose a Password &rarr;</label>
					<input type="password" name="admin_password" class="reg-input tiny" autocomplete="off" tabindex="2">
				</div>
				
				<%
                                if (request.getAttribute("error") != null) {

                            %>
                            <center><h1 style="color: red;">User Name Password error!!</h1></center>
                            <%                                }
                            %>
				
                            
                            <center> <p> &nbsp;</p> <input type="submit" value="Sign In!" name="submit" id="submit" class="sub-btn" tabindex="11"></center>
			<h1><left><a href="index.jsp">Go Home</left><h1>
                        </form
                       
		</div>
	</div>
        
</body>
</html>