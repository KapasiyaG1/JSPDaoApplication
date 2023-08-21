
<%@page  errorPage="error.html" %>
<%@page import="dao.EmployeeDAO"%>
<jsp:useBean class="model.Employee" id="E">
    <jsp:setProperty name="E" property="*"></jsp:setProperty>
</jsp:useBean>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <% 
        EmployeeDAO ed=new EmployeeDAO();     
       if(ed.insertStudent(E))
           out.println("Record inserted.........");
     %>        

    </body>
</html>
