package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.EmployeeDAO;

public final class InsertEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.jsp");
  }

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
      			"error.html", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Employee Record Page</title>\n");
      out.write("        <script language=\"javascript\">\n");
      out.write("            function validate()\n");
      out.write("            {\n");
      out.write("                var name,salary;\n");
      out.write("                name=document.getElementById(\"EMPNAME\").value;\n");
      out.write("                salary=document.getElementById(\"EMPSALARY\").value;\n");
      out.write("                \n");
      out.write("                if(name==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Name Can't be left blank\");\n");
      out.write("                    document.getElementById(\"EMPNAME\").focus();   \n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(name!=\"\")\n");
      out.write("                {\n");
      out.write("                     var asc;\n");
      out.write("                     for(i=0;i<name.length;i++)\n");
      out.write("                    {\n");
      out.write("                           asc=name.charCodeAt(i);\n");
      out.write("                           \n");
      out.write("                          if(!((asc>=65 && asc<=90) || asc==32 || (asc>=97 && asc<=122)))\n");
      out.write("                          {\n");
      out.write("                            alert(\"Only Character allowed in Name...\");\n");
      out.write("                            document.getElementById(\"EMPNAME\").focus();   \n");
      out.write("                            document.getElementById(\"EMPNAME\").select();   \n");
      out.write("                             return false;\n");
      out.write("                          }\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                }    \n");
      out.write("                \n");
      out.write("//                if(name!=\"\")\n");
      out.write("//                {\n");
      out.write("//                    var valid=\"abcdefghijklmnopqrstuvwxyzABCDEFGYHIJKLMNOPQRSTUVWXYZ \"\n");
      out.write("//                    for(i=0;i<name.length;i++)\n");
      out.write("//                    {\n");
      out.write("//                       n=name.charAt(i);\n");
      out.write("//                       if(valid.indexOf(n)==-1)\n");
      out.write("//                       {\n");
      out.write("//                           alert(\"Only Character allowed in Name...\");\n");
      out.write("//                           document.getElementById(\"EMPNAME\").focus();   \n");
      out.write("//                           document.getElementById(\"EMPNAME\").select();   \n");
      out.write("//                           return false;\n");
      out.write("//                       }\n");
      out.write("//                    }\n");
      out.write("//                }\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                if(salary==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Salary Can't be left blank\");\n");
      out.write("                    document.getElementById(\"EMPSALARY\").focus();   \n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(salary!=\"\")\n");
      out.write("                {\n");
      out.write("                    var valid=\"0123456789\"\n");
      out.write("                    for(i=0;i<salary.length;i++)\n");
      out.write("                    {\n");
      out.write("                       n=salary.charAt(i);\n");
      out.write("                       if(valid.indexOf(n)==-1)\n");
      out.write("                       {\n");
      out.write("                           alert(\"Only Number allowed in salary...\");\n");
      out.write("                           document.getElementById(\"EMPSALARY\").focus();   \n");
      out.write("                           document.getElementById(\"EMPSALARY\").select();   \n");
      out.write("                           return false;\n");
      out.write("                       }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                if(salary<0 || salary>150000)\n");
      out.write("                {\n");
      out.write("                    alert(\"Salary is not in range\");\n");
      out.write("                    document.getElementById(\"EMPSALARY\").focus();   \n");
      out.write("                    document.getElementById(\"EMPSALARY\").select();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
 
           int i;
           for(i=1;i<=5;i++)
               out.println("<br>");
        
      out.write("   \n");
      out.write("     \n");
      out.write("     \n");
      out.write("        <center>\n");
      out.write("            <form method=\"post\" action=\"InsertData.jsp\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                 <th>Employee Id</th>\n");
      out.write("                 <td><input type=\"text\" id=\"EMPID\" name=\"empid\" readonly=\"readonly\" value=");
      out.print(EmployeeDAO.autoIncr());
      out.write("></td>\n");
      out.write("                </tr>    \n");
      out.write("                <tr>\n");
      out.write("                 <th>Employee Name</th>\n");
      out.write("                 <td><input type=\"text\" id=\"EMPNAME\" name=\"empname\" ></td>\n");
      out.write("                </tr>    \n");
      out.write("                <tr>\n");
      out.write("                 <th>Employee Salary</th>\n");
      out.write("                 <td><input type=\"text\" id=\"EMPSALARY\" name=\"empsalary\"></td>\n");
      out.write("                </tr>    \n");
      out.write("               <tr>\n");
      out.write("                 <th>Department</th>\n");
      out.write("                 <td>\n");
      out.write("                     <select name=\"empdept\" id=\"EMPDEPT\">\n");
      out.write("                        <option>Computer</option>\n");
      out.write("                        <option>HR</option>\n");
      out.write("                        <option>Sales</option>\n");
      out.write("                        <option>Account</option>\n");
      out.write("                        </select>\n");
      out.write("                 </td>\n");
      out.write("                </tr>     \n");
      out.write("               <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td><input type=submit value=\"Submit\" onclick=\"return validate();\">\n");
      out.write("                <input type=reset value=\"Reset\">\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write(" \n");
      out.write("            </table>    \n");
      out.write("            </form>    \n");
      out.write("        </center>    \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("           <A href=\"FrontPage.jsp\">Home</A> \n");
      out.write("            <A href=\"AboutUs.jsp\">AboutUs</A> \n");
      out.write("            <A href=\"Contact Us.jsp\">Contact Us</A> \n");
      out.write("            <A href=\"About Indore.jsp\">About Indore</A> \n");
      out.write("            <A href=\"About Online.jsp\">About Online</A> \n");
      out.write("            <A href=\"About Raj Mohalla.jsp\">About Raj Mohalla</A> \n");
      out.write("        </center>    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
