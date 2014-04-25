
<%@ page language="java" import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<html>
    <head>
        <title>Data Page</title>
        <style type="text/css">

            .modalDialog {
                position: fixed;
                font-family: Arial, Helvetica, sans-serif;
                top: 0;
                right: 0;
                bottom: 0;
                left: 0;
                background: rgba(0,0,0,.5);
                z-index: 99999;
                opacity:0;
                -webkit-transition: opacity 400ms ease-in;
                -moz-transition: opacity 400ms ease-in;
                transition: opacity 400ms ease-in;
                pointer-events: none;
            }
            .modalDialog:target {
                opacity:1;
                pointer-events: auto;
            }

            .modalDialog > div {
                width: 400px;
                position: relative;
                margin: 10% auto;
                padding: 5px 20px 13px 20px;
                border-radius: 10px;
                background: #fff;
                background: -moz-linear-gradient(#fff, #999);
                background: -webkit-linear-gradient(#fff, #999);
                background: -o-linear-gradient(#fff, #999);
            }
        </style>
    </head> 
    <body>
    <center>


        <table>
            <tr> 
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
                <td><form action="show_book.jsp" method="post">
                        <strong>Book Name:</strong>
                        <input type="" name="book_name">
                        <input type=submit value="Search"> 
                    </form> </td> 
                <td>
                    <form action="show_book.jsp" method="post">
                        <strong>Writer Name:</strong>
                        <input type="" name="writer_name">
                        <input type=submit value="Search">                  

                    </form>
                </td>
                <td>
                    <form action="show_book.jsp" method="post">
                        &nbsp;&nbsp;&nbsp; 
                        <input type=submit value="Show All">                  

                    </form>  

                </td>
            </tr><br> 
        </table>

    </center>
    <center>
        <table border="3" >
            <br>
            <tr>

                <td width="119"><b>Book ID</b></td>
                <td width="168"><b>Writer Name</b></td>
                <td width="168"><b>Book Name</b></td>
                <td width="168"><b>Download</b></td>
                <td width="168"><b>Read</b></td>
            </tr>

            <%
                String p = null;
                try {


                    String user = "root";
                    String password = "123";
                    String database = "test";
                    Connection con;
                    String url = "jdbc:mysql://localhost:3306/" + database + "?useUnicode=true&amp;characterEncoding=UTF8;";
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    con = DriverManager.getConnection(url, user, password);
                    Statement stms = con.createStatement();
                    //String bookName=request.getParameter("search");
                    String m = request.getParameter("book_name");
                    String n = request.getParameter("writer_name");

                    String sql;
                    if (m != null) {
                        sql = "select book_id,writter_name,book_name,location from book_details where book_name='" + m + "'";
                    } else if (n != null) {
                        sql = "select book_id,writter_name,book_name,location from book_details where writter_name='" + n + "'";
                    } else {
                        sql = "select book_id,writter_name,book_name,location from book_details";
                    }
                    ResultSet rs = stms.executeQuery(sql);
                    PrintWriter ou = response.getWriter();



                    try {

                        while (rs.next()) {

                            //Add records into data list
                            // dataList.add(rs.getInt("serial"));
                            // dataList.add(rs.getString("book_id"));
                            //// dataList.add(rs.getString("writter_name"));
                            //dataList.add(rs.getString("book_name"));
                            //dataList.add(rs.getString("location"));

            %>
            <tr>

                <td width="168"><%out.print(rs.getString("book_id"));%></td>
                <td width="168"><%out.print(rs.getString("writter_name"));%></td>
                <td width="168"><%out.print(rs.getString("book_name"));%></td>
                <% p = rs.getString("location");%>

                <%--for download--%>
                <%if ((session.getAttribute("userName") == null) || (session.getAttribute("userid") == "")) {%>

                <td><a href="#openModal"value="<%out.print(p);%>"><%out.print(p);%></a></td>


            <% } else {%> <form method="" action="download1">
                <td><input type="submit" name="id" value=<%out.print(p);%>></td>
            </form> 
            <% }%>
            <%--for read--%>
            <%if ((session.getAttribute("userName") == null) || (session.getAttribute("userid") == "")) {%>

            <td><a href="#openModal1"value="<%out.print(p);%>"><%out.print(p);%></a></td>


            <% } else {%> <form method="" action="read">
                <td><input type="submit" name="id" value=<%out.print(p);%>></td>
            </form> 
            <% }%>
            </tr>

            <%

                    }


                } catch (Exception e) {
                }

            %>
            <%-- 
               <form method="" action="download1">
                            <td><input type="submit" name="id" value=<%out.print(rs.getString("location"));%>></td>
                        </form> 
            --%>

            <%
                } catch (Exception e) {
                }%>    



        </table>
    </center>
    <div id="openModal" class="modalDialog">
        <div>

            <%request.getParameter("id");%>

            <a href="#close" title="Close" class="close">X</a>
            <form method="Get" action="m2.jsp" enctype="multipart/form-data">

                <td>Please Login First</br></br></td>
                <td>User Name</td>            

                <td><td><input type="hidden" name="id" value="<% out.print(p);%>" /></td></td>
                <td><input type="text" name="user_name" value="" /></td></br>
                <td>password</td>
                <td><input type="password" name="pass" value="" /></td>
                <td><input type="submit" value="submit"/></td>

            </form>
        </div>
    </div>

    <div id="openModal1" class="modalDialog">
        <div>

            <%request.getParameter("id");%>

            <a href="#close" title="Close" class="close">X</a>
            <form method="Get" action="read" enctype="multipart/form-data">

                <td>Please Login First</br></br></td>
                <td>User Name</td>            

                <td><td><input type="hidden" name="id" value="<% out.print(p);%>" /></td></td>
                <td><input type="text" name="user_name" value="" /></td></br>
                <td>password</td>
                <td><input type="password" name="pass" value="" /></td>
                <td><input type="submit" value="submit"/></td>

            </form>
        </div>
    </div>

</body>
</html>
