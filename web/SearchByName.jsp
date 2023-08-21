<%-- 
    Document   : SearchByName
    Created on : Jun 16, 2022, 8:20:08 PM
    Author     : Vivek Uprit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="java.sql.*" %>
<%@page  import="connect.MyConnection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <font color="red" size="5">Search By Name</font>
        <table>
        <form>
          <tr>  
            <td>
                <textarea rows="1" cols="100" name="txtname"></textarea>
                <input type="submit" value="Search">
            </td>    
         </tr>   
        </form>
        </table>
    <table border="1">
    
    <% 
        String name=null;
        name=request.getParameter("txtname");
        if(name!=null)
        {
              Connection con=null;
              ResultSet rs=null;
              PreparedStatement ps=null;
              con=MyConnection.getConnection();
              String sql;
              sql="select * from employee where empname like '"+ name+"%'";
              ps=con.prepareStatement(sql);
              rs=ps.executeQuery();
              out.println("<tr><th>Emp id</th><th>Emp Name</th><th>Salary</th><th>Department/th></tr>");
              while(rs.next())
              {
                  out.println("<tr>");
                 out.println("<td>"+rs.getInt(1) + "</td>");
                 out.println("<td>"+rs.getString(2) + "</td>");
                 out.println("<td>"+rs.getInt(3) + "</td>");
                 out.println("<td>"+rs.getString(4) + "</td>");
               out.println("</tr>");
              }   
              
        }    
    %>
    </table>
    </center>
    </body>
</html>
