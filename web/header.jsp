
<%@page  errorPage="error.html" %>
<% 
  if(session.isNew())
      response.sendRedirect("index.jsp");
%>
<html>
    <head>
        <title>TODO supply a title</title>
        <script language="javascript">
            history.forward();
        </script>        
    </head>
    <body>
        <A href="signout.jsp">Signout</A>   
        <center>
           <A href="FrontPage.jsp">Home</A> 
            <A href="InsertEmployee.jsp">Insert Record</A> 
            <A href="SearchById.jsp">Search Record By Id</A> 
            <A href="deleteDisplay.jsp">Delete Record By Id</A> 
            <A href="SearchAllData.jsp">Search All Record</A> 
            <A href="updateSearch.jsp">Update Record</A> 
        </center>    
    </body>
</html>
