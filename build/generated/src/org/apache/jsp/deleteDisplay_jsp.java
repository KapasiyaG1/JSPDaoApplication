package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Employee;
import dao.EmployeeDAO;

public final class deleteDisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
  EmployeeDAO ed=new EmployeeDAO();
  Employee E=new Employee();

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("     \n");
      out.write("        ");
 
           int i;
           for(i=1;i<=5;i++)
               out.println("<br>");
        
      out.write("   \n");
      out.write("        \n");
      out.write("        <center>\n");
      out.write("            <form method=\"post\" action=\"deleteDisplay.jsp\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                 <th>Enter Employee Id for delete</th>\n");
      out.write("                 <td><input type=\"text\" name=\"txtid\"></td>\n");
      out.write("                </tr>    \n");
      out.write("               <tr>\n");
      out.write("            <td></td>\n");
      out.write("              <td><input type=submit value=\"Submit\">\n");
      out.write("                <input type=reset value=\"Reset\">\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("             ");
  
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
                     session.setAttribute("empid",id);
                   
      out.write("\n");
      out.write("                     <table border=\"1\">\n");
      out.write("                    <tr bgcolor=\"cyan\"> <th>Employee ID</th> <th>NAME</th><th>SALARY</th><th>DEPARTMENT</th></tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(E.getEmpid());
      out.write("</td>    \n");
      out.write("                        <td>");
      out.print(E.getEmpname());
      out.write("</td>      \n");
      out.write("                        <td>");
      out.print(E.getEmpsalary());
      out.write("</td>      \n");
      out.write("                        <td>");
      out.print(E.getEmpdept());
      out.write("</td>  \n");
      out.write("                        <td> \n");
      out.write("                 </form>          \n");
      out.write("                       <form method=\"post\" action=\"deleteData.jsp\"> \n");
      out.write("                           <input type=\"submit\" value=\"delete\">\n");
      out.write("                       </form> \n");
      out.write("                       </td>\n");
      out.write("                   </tr>\n");
      out.write("                  ");
   
                 }
               } 
   
             
      out.write("\n");
      out.write("            </table>    \n");
      out.write("             \n");
      out.write("            \n");
      out.write("        </center>    \n");
      out.write("        ");
      out.write("  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
