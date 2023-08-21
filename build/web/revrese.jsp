


<html>
    <head>
       <title>JSP PAGE For Reverse of Number</title>
    </head>
    <body>
        <center>
<table border=1>
<form method=post action=revrese.jsp>
<tr>
<th>Enter A number</th>
<td><input type=text name=txtno></td>
</tr>
<tr>
<tr>
<td></td>
<td><input type=submit value="Submit">
<input type=reset value="Reset">
</td>
</tr>
</form>
    
</table>
<% 
      String str=null;
    int n,r,s=0;
      str=request.getParameter("txtno");
      if(str!=null)
      {
         n=Integer.parseInt(str);
         while(n!=0)
         {
           r=n%10;
           s=s*10+r;
           n=n/10;
         }
         out.println("<font color=red>Reverse is" +s+"</font>");
      }    
      
%>            
</center>            
    </body>
</html>
