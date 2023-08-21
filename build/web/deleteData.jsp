<%-- 
    Document   : deleteData
    Created on : Jun 13, 2022, 7:49:05 PM
    Author     : Vivek Uprit
--%>

<%@page import="dao.EmployeeDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="header.jsp" %>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
    <center>    
   <% 
         int id;
        id=Integer.parseInt(session.getAttribute("empid").toString());
        
        EmployeeDAO ed=new EmployeeDAO();
        if(ed.deleteById(id))
            out.println("Record delted..........");
   %>
   </center>    
    </body>
</html>
