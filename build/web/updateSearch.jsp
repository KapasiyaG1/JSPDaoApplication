<%@page import="model.Employee"%>
<%@page import="dao.EmployeeDAO"%>
    <%@include  file="header.jsp" %>
<%! 
  EmployeeDAO ed=new EmployeeDAO();
  Employee E=new Employee();
%>
<html>
    <head>
        <title>TODO supply a title</title>
        
    </head>
    <body>
      
        
     
        <% 
           int i;
           for(i=1;i<=5;i++)
               out.println("<br>");
        %>   
        
        <center>
            <form method="post" action="updateSearch.jsp">
            <table border="1">
                <tr>
                 <th>Employee Id for Update</th>
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
                  </form>         
                     <form method="post" action="UpdateData.jsp">  
                         <td><%=E.getEmpid()%><input type="hidden" name="empid" value=<%=E.getEmpid()%>></td>       
                        <td><input type="text" name="empname" value=<%=E.getEmpname()%>></td>      
                        <td><input type="text" name="empsalary" value=<%=E.getEmpsalary()%>></td>      
                        <td><input type="text" name="empdept" value=<%=E.getEmpdept()%>></td>      
                        <td><input type="submit"  value="Update"></td>      
                     </form>   
                   </tr>
                  <%   
                 }
               } 
   
             %>
            </table>    
             
            
        </center>    
        <%--   
    <%@include  file="footer.jsp" %>
      --%>  
    </body>
</html>
