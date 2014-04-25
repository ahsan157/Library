<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="style.css">
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
    <body id="ab">

        <div id="admin_header">  
            <div>                                          
        
            <form name=F1 onSubmit="return dil(this)" action="Member_Register" >
               <center>
                <table id="member_table" >
                    <tr>
                        <td><h2><b>Please Insert The</b></h2></td>
                        <td><h2><b>Following Information</b></h2></td>
                    </tr>
                    <tr>
                        <td>Name:</td>
                        <td><input type="text" name="user_name"></td>
                    </tr>
                    <tr>
                        <td>Father Name:</td>
                        <td><input type="text" name="father_name"></td>
                    </tr>

                    <tr>
                        <td>E-Mail:</td>
                        <td><input type="email" name="email"></td>
                    </tr>

                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="password"></td>
                    </tr>

                    <tr>
                        <td>Re-Type Password:</td>
                        <td><input type="password" name="repassword"></td>
                    </tr>

                    <tr>
                        <td>Address:</td>
                        <td><textarea rows="3" cols="20" name="address"></textarea>
                    </tr>
                    <tr>
                        <td>Select Your Designation:</td>
                        <td>
                            <select name="sms">
                                <option>Student</option>
                                <option>Lecturer</option>
                                <option>Assistant Professor</option>
                                <option>Associate Professor</option>
                                <option>Professor</option>


                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="submit"></td>
                        <td><input type="reset" value="clear"></td>
                    </tr>
                </table>
               </center>
            </form>
        

            </div>

        </div>>
        

    </body>
</html>

    



































