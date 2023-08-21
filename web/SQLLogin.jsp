<%@page  errorPage="error.html" %>
<%@page import="dao.EmployeeDAO"%>
<%@page  session="true" %>
<html>
    <head>
        <title>Employee Record Page</title>
    </head>
   <body>
           
     
        <center>
            <form method="post" action="SQLLogin.jsp">
            <table border="1">
                <tr>
                 <th>User Id</th>
                 <td><input type="text" name="userid"></td>
                </tr>    
                <tr>
                 <th>Password</th>
                 <td><input type="password"  name="pass" ></td>
                </tr>    
                <tr>
                 <th>Database Name</th>
                 <td><input type="text" name="databasename"></td>
                </tr>    
               <tr>
            <td></td>
            <td><input type=submit value="Submit">
                <input type=reset value="Reset">
            </td>
            </tr>
 
            </table>    
            </form>    
       <% 
           String user=null,pass=null,dname=null;
           
           user=request.getParameter("userid");
           pass=request.getParameter("pass");
           dname=request.getParameter("databasename");
         if(user!=null)
         {
             if(user.equals("admin") && pass.equals("admin"))
             {
                 session.setAttribute("dname", dname);
                 response.sendRedirect("MYSQLYOG.jsp");
             }
             else
               out.println("Invalid user id or password");  
         }    
       %>     
        </center>    
        
    </body>
</html>
