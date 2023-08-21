<%@page  errorPage="error.html" %>
<%@page import="model.Employee"%>
<%@page import="dao.EmployeeDAO"%>
<%! 
  EmployeeDAO ed=new EmployeeDAO();
  Employee E=new Employee();
%>
<html>
    <head>
        <title>TODO supply a title</title>
        
    </head>
    <body>
      
        <%@include  file="header.jsp" %>
    
     
        <% 
           int i;
           for(i=1;i<=5;i++)
               out.println("<br>");
        %>   
        
        <center>
            <form method="post" action="SearchById.jsp">
            <table border="1">
                <tr>
                 <th>Employee Id</th>
                 <td><input type="text" name="txtid"></td>
                </tr>    
               <tr>
            <td></td>
              <td><input type=submit value="Submit">
                <input type=reset value="Reset">
            </td>
            </tr>
            </table>
             <%  
               int id;
               String str=null;
               str=request.getParameter("txtid");
               if(str!=null)
               {     
                 id=Integer.parseInt(str);
                
                 E=ed.searchById(id);
                 if(E==null)
                     out.println("Record not found........");
                 else
                 {
                   %>
                     <table border="1">
                    <tr bgcolor="cyan"> <th>Employee ID</th> <th>NAME</th><th>SALARY</th><th>DEPARTMENT</th></tr>
                    <tr>
                        <td><%=E.getEmpid()%></td>    
                        <td><%=E.getEmpname()%></td>      
                        <td><%=E.getEmpsalary()%></td>      
                        <td><%=E.getEmpdept()%></td>      
                   </tr>
                  <%   
                 }
               } 
   
             %>
            </table>    
            </form>    
            
        </center>    
        <%--   
    <%@include  file="footer.jsp" %>
      --%>  
    </body>
</html>
