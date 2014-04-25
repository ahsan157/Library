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
            <center><h2>Insert Email ID For Delete Information</h2></center>
		
		<div id="form-container">
			<form  action="delete_user" method="post">
				
				<center>
				<div class="row">
					<label for="username">Enter  User Email ID:</label>
					<input type="text"  name="email" class="reg-input tiny" autocomplete="off" tabindex="1">
				</div>
                                
				
                            &nbsp;  <input type="submit" value="Delete" name="submit" id="submit" class="sub-btn" tabindex="11">
                                </center>
                            </form>
		</div>
	</div>

</body>
</html>