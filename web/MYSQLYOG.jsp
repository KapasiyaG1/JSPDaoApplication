<%-- 
    Document   : MYSQLYOG
    Created on : Jun 17, 2022, 7:45:58 PM
    Author     : Vivek Uprit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="java.sql.*"%>
<%@page  import="connect.MyConnection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <center>   
       <font color="red" size="7">S</font>
       <font color="green" size="7">Q</font>
       <font color="black" size="7">L</font>
       <font color="blue" size="7">B</font>
       <font color="red" size="7">R</font>
       <font color="yellow" size="7">O</font>
       <font color="black" size="7">W</font>
       <font color="blue" size="7">S</font>
       <font color="red" size="7">E</font>
       <font color="green" size="7">R</font>
       <form method="post" action="MYSQLYOG.jsp">
         <textarea rows="10" cols="100" name="txtsql"></textarea>  
         <br>
         <input type="submit" value="Execute">
       </form>    
      <% 
         String sql=null,dname;
          sql=request.getParameter("txtsql");
         if(sql!=null)
         {
             dname=session.getAttribute("dname").toString();
             Class.forName("com.mysql.jdbc.Driver");
             Connection con;
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dname,"root","root");
             PreparedStatement ps;
             ResultSet rs=null;
             ResultSetMetaData rsmd=null;
             ps=con.prepareStatement(sql);
             if(sql.toUpperCase().startsWith("SELECT"))
             {
                rs=ps.executeQuery();
                rsmd=rs.getMetaData();
                out.println(rsmd.getColumnCount());
                out.println("<table border=1>");
                out.println("<tr>");
                int i;
                for(i=1;i<=rsmd.getColumnCount();i++)
                {     
                 out.println("<th>");
                 out.println(rsmd.getColumnName(i));
                 out.println("</th>");
                }  
                while(rs.next())
                {
                  out.println("<tr>");
                 for(i=1;i<=rsmd.getColumnCount();i++)
                   out.println("<td>" +rs.getString(i)+"</td>");
                  out.println("</tr>");
                }    
                
                out.println("</tr>");
                out.println("<table>");
                
             }
             else
             {
                int n=0;
                n=ps.executeUpdate();
                out.println("Query OK,"+ n+" row affected");
             }   
         }    
      %> 
       </center>
    
    </body>
</html>
