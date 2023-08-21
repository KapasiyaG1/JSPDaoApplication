<%@page  errorPage="error.html" %>
<%@page import="dao.EmployeeDAO"%>
<html>
    <head>
        <title>Employee Record Page</title>
        <script language="javascript">
            function validate()
            {
                var name,salary;
                name=document.getElementById("EMPNAME").value;
                salary=document.getElementById("EMPSALARY").value;
                
                if(name=="")
                {
                    alert("Name Can't be left blank");
                    document.getElementById("EMPNAME").focus();   
                    return false;
                }
                if(name!="")
                {
                     var asc;
                     for(i=0;i<name.length;i++)
                    {
                           asc=name.charCodeAt(i);
                           
                          if(!((asc>=65 && asc<=90) || asc==32 || (asc>=97 && asc<=122)))
                          {
                            alert("Only Character allowed in Name...");
                            document.getElementById("EMPNAME").focus();   
                            document.getElementById("EMPNAME").select();   
                             return false;
                          }
                    }
                    
                }    
                
//                if(name!="")
//                {
//                    var valid="abcdefghijklmnopqrstuvwxyzABCDEFGYHIJKLMNOPQRSTUVWXYZ "
//                    for(i=0;i<name.length;i++)
//                    {
//                       n=name.charAt(i);
//                       if(valid.indexOf(n)==-1)
//                       {
//                           alert("Only Character allowed in Name...");
//                           document.getElementById("EMPNAME").focus();   
//                           document.getElementById("EMPNAME").select();   
//                           return false;
//                       }
//                    }
//                }
                
                
                if(salary=="")
                {
                    alert("Salary Can't be left blank");
                    document.getElementById("EMPSALARY").focus();   
                    return false;
                }
                if(salary!="")
                {
                    var valid="0123456789"
                    for(i=0;i<salary.length;i++)
                    {
                       n=salary.charAt(i);
                       if(valid.indexOf(n)==-1)
                       {
                           alert("Only Number allowed in salary...");
                           document.getElementById("EMPSALARY").focus();   
                           document.getElementById("EMPSALARY").select();   
                           return false;
                       }
                    }
                }
                if(salary<0 || salary>150000)
                {
                    alert("Salary is not in range");
                    document.getElementById("EMPSALARY").focus();   
                    document.getElementById("EMPSALARY").select();
                    return false;
                }
                
                return true;
            }
        </script>
    </head>
    <body>
           
        <%@include  file="header.jsp" %>
       
        <% 
           int i;
           for(i=1;i<=5;i++)
               out.println("<br>");
        %>   
     
     
        <center>
            <form method="post" action="InsertData.jsp">
            <table border="1">
                <tr>
                 <th>Employee Id</th>
                 <td><input type="text" id="EMPID" name="empid" readonly="readonly" value=<%=EmployeeDAO.autoIncr()%>></td>
                </tr>    
                <tr>
                 <th>Employee Name</th>
                 <td><input type="text" id="EMPNAME" name="empname" ></td>
                </tr>    
                <tr>
                 <th>Employee Salary</th>
                 <td><input type="text" id="EMPSALARY" name="empsalary"></td>
                </tr>    
               <tr>
                 <th>Department</th>
                 <td>
                     <select name="empdept" id="EMPDEPT">
                        <option>Computer</option>
                        <option>HR</option>
                        <option>Sales</option>
                        <option>Account</option>
                        </select>
                 </td>
                </tr>     
               <tr>
            <td></td>
            <td><input type=submit value="Submit" onclick="return validate();">
                <input type=reset value="Reset">
            </td>
            </tr>
 
            </table>    
            </form>    
        </center>    
        <%@include  file="footer.jsp" %>
    </body>
</html>
