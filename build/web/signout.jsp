<%-- 
    Document   : signout
    Created on : Jun 10, 2022, 10:32:48 PM
    Author     : Vivek Uprit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <% 
            session.invalidate();
            session=null;
            response.sendRedirect("index.jsp");
          %>
    </body>
</html>
