<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Guided Registration Form - Vandelay Design Demo</title>
  <meta name="author" content="Jake Rocheleau">
  <link rel="stylesheet" type="text/css" media="all" href="jquery/styles.css">
  
</head>

<body>
	<div id="wrapper">
            <center><h2>Developer of this project </h2></center>
		
		<div id="form-container">
                    <center>	
			<div class="row">
				
					<h1>
                                            Masud Rana</br>
                                            ID:IT09043</br>
                                            Dept. of ICT</br>
                                            Mbstu<br>
                                            cell no:01722868635</br></br></br></br>
                                        
                                        </h1>
				
                            <h1>
                                           S M Shamim</br>
                                            ID:IT09050</br>
                                            Dept. of ICT</br>
                                            Mbstu<br>
                                         cell no:01727175648</br>
                                        </h1>
				</div>
                                
                                
                               
			 <%if ((session.getAttribute("userName") == null) || (session.getAttribute("userName") == "")){ %>
                        <li><td><form action="index.jsp" method="post">

                        <input type=submit value="Home"> 
                        &nbsp;&nbsp;&nbsp; 
                    </form> </td></li>
        <% }else if (( session.getAttribute("userName").equals("sms"))){ %>
                            <td><form action="index3.jsp" method="post">

                        <input type=submit value="Home"> 
                        &nbsp;&nbsp;&nbsp; 
                    </form> </td><% }else { %>
                <td><form action="index2.jsp" method="post">

                        <input type=submit value="Home"> 
                        &nbsp;&nbsp;&nbsp; 
                    </form> </td>
                 <% } %>

                        
		</div>
	</div>

</body>
</html>