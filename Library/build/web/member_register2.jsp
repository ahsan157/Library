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
			<form  name=F1 onSubmit="return dil(this)" action="Member_Register" method="post">
				
				
				<div class="row">
	
                                <label for="fathername">Enter  user name &rarr;</label>
		
				<input type="text" id="username" name="user_name" class="reg-input tiny" autocomplete="off" tabindex="1">
				</div>
                                
                                
                                <div class="row">
					<label for="fathername">Enter  Father name &rarr;</label>
					<input type="text" id="fathername" name="father_name" class="reg-input tiny" autocomplete="off" tabindex="2">
				</div>
				
				<div class="row">
					<label for="email">E-mail Address &rarr;</label>
					<input type="email" id="email" name="email" class="reg-input" autocomplete="off" tabindex="3">
				</div>
				
				<div class="row">
					<label for="email2">Re-type E-mail Address &rarr;</label>
					<input type="email" id="email2" name="email2" class="reg-input" autocomplete="off" tabindex="4">
				</div>
				
				<div class="row">
					<label for="password">Choose a Password &rarr;</label>
					<input type="password" name="password" class="reg-input tiny" autocomplete="off" tabindex="5">
				</div>
				
				<div class="row">
					<label for="password">Re-type your Password &rarr;</label>
					<input type="password" name="repassword"  class="reg-input tiny" autocomplete="off" tabindex="6">
				</div>
				
				<div class="row">
					<label for="gender">Gender(optional) &rarr;</label>
					<select name="gender" id="gender" class="sel-input" tabindex="7">
						<option value="0" selected="selected"></option>
						<option value="1">Boy</option>
						<option value="2">Girl</option>
						<option value="3">Undeclared</option>
					</select>
					<div class="note"><span id="note-gender">Feel free to share, or don't!</span></div>
				</div>
				
				<div class="row">
					<label for="birthday">Your Birthday(optional) &rarr;</label>
					<select name="birthday-mm" id="birthday-mm" tabindex="8">
						<option value="00">Month</option>
						<option value="01">01</option>
						<option value="02">02</option>
						<option value="03">03</option>
						<option value="04">04</option>
						<option value="05">05</option>
						<option value="06">06</option>
						<option value="07">07</option>
						<option value="08">08</option>
						<option value="09">09</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
					</select>
					<select name="birthday-dd" id="birthday-dd" tabindex="9">
						<option value="00">Day</option>
						<option value="01">01</option>
						<option value="02">02</option>
						<option value="03">03</option>
						<option value="04">04</option>
						<option value="05">05</option>
						<option value="06">06</option>
						<option value="07">07</option>
						<option value="08">08</option>
						<option value="09">09</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
						<option value="13">13</option>
						<option value="14">14</option>
						<option value="15">15</option>
						<option value="16">16</option>
						<option value="17">17</option>
						<option value="18">18</option>
						<option value="19">19</option>
						<option value="20">20</option>
						<option value="21">21</option>
						<option value="22">22</option>
						<option value="23">23</option>
						<option value="24">24</option>
						<option value="25">25</option>
						<option value="26">26</option>
						<option value="27">27</option>
						<option value="28">28</option>
						<option value="29">29</option>
						<option value="30">30</option>
						<option value="31">31</option>
					</select>
					<select name="birthday-yyyy" id="birthday-yyyy" tabindex="10">
						<option value="0000">Year</option>
                                                <option value="2005">2005</option>
                                                <option value="2004">2004</option>
						<option value="2003">2003</option>
						<option value="2002">2002</option>
						<option value="2001">2001</option>
						<option value="2000">2000</option>
						<option value="1999">1999</option>
						<option value="1998">1998</option>
						<option value="1997">1997</option>
						<option value="1996">1996</option>
						<option value="1995">1995</option>
						<option value="1994">1994</option>
						<option value="1993">1993</option>
						<option value="1992">1992</option>
						<option value="1991">1991</option>
						<option value="1990">1990</option>
						<option value="1989">1989</option>
						<option value="1988">1988</option>
						<option value="1987">1987</option>
						<option value="1986">1986</option>
						<option value="1985">1985</option>
						<option value="1984">1984</option>
						<option value="1983">1983</option>
						<option value="1982">1982</option>
						<option value="1981">1981</option>
						<option value="1980">1980</option>
						<option value="1979">1979</option>
						<option value="1978">1978</option>
						<option value="1977">1977</option>
						<option value="1976">1976</option>
						<option value="1975">1975</option>
						<option value="1974">1974</option>
						<option value="1973">1973</option>
						<option value="1972">1972</option>
						<option value="1971">1971</option>
						<option value="1970">1970</option>
						<option value="1969">1969</option>
						<option value="1968">1968</option>
						<option value="1967">1967</option>
						<option value="1966">1966</option>
						<option value="1965">1965</option>
						<option value="1964">1964</option>
						<option value="1963">1963</option>
						<option value="1962">1962</option>
						<option value="1961">1961</option>
						<option value="1960">1960</option>
						<option value="1959">1959</option>
						<option value="1958">1958</option>
						<option value="1957">1957</option>
						<option value="1956">1956</option>
						<option value="1955">1955</option>
						<option value="1954">1954</option>
						<option value="1953">1953</option>
						<option value="1952">1952</option>
						<option value="1951">1951</option>
						<option value="1950">1950</option>
						<option value="1949">1949</option>
						<option value="1948">1948</option>
						<option value="1947">1947</option>
						<option value="1946">1946</option>
						<option value="1945">1945</option>
						<option value="1944">1944</option>
						<option value="1943">1943</option>
						<option value="1942">1942</option>
						<option value="1941">1941</option>
						<option value="1940">1940</option>
						<option value="1939">1939</option>
						<option value="1938">1938</option>
						<option value="1937">1937</option>
						<option value="1936">1936</option>
						<option value="1935">1935</option>
						<option value="1934">1934</option>
						<option value="1933">1933</option>
						<option value="1932">1932</option>
						<option value="1931">1931</option>
						<option value="1930">1930</option>
						<option value="1929">1929</option>
						<option value="1928">1928</option>
						<option value="1927">1927</option>
						<option value="1926">1926</option>
						<option value="1925">1925</option>
						<option value="1924">1924</option>
						<option value="1923">1923</option>
						<option value="1922">1922</option>
						<option value="1921">1921</option>
					</select>
				</div>
				
                            <center><input type="submit" value="Sign Up!" name="submit" id="submit" class="sub-btn" tabindex="11"></center>
			<h1><left><a href="index.jsp">Go Home</left><h1>
                        </form>
		</div>
	</div>

</body>
</html>