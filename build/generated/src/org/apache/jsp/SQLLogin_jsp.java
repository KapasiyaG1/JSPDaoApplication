package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.EmployeeDAO;

public final class SQLLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Employee Record Page</title>\n");
      out.write("    </head>\n");
      out.write("   <body>\n");
      out.write("           \n");
      out.write("     \n");
      out.write("        <center>\n");
      out.write("            <form method=\"post\" action=\"SQLLogin.jsp\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                 <th>User Id</th>\n");
      out.write("                 <td><input type=\"text\" name=\"userid\"></td>\n");
      out.write("                </tr>    \n");
      out.write("                <tr>\n");
      out.write("                 <th>Password</th>\n");
      out.write("                 <td><input type=\"password\"  name=\"pass\" ></td>\n");
      out.write("                </tr>    \n");
      out.write("                <tr>\n");
      out.write("                 <th>Database Name</th>\n");
      out.write("                 <td><input type=\"text\" name=\"databasename\"></td>\n");
      out.write("                </tr>    \n");
      out.write("               <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td><input type=submit value=\"Submit\">\n");
      out.write("                <input type=reset value=\"Reset\">\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write(" \n");
      out.write("            </table>    \n");
      out.write("            </form>    \n");
      out.write("       ");
 
           String user=null,pass=null,dname=null;
           
           user=request.getParameter("userid");
           pass=request.getParameter("pass");
           dname=request.getParameter("databasename");
         if(user!=null)
         {
             if(user.equals("admin") && pass.equals("admin"))
             {
                 session.setAttribute("dname", dname);
                 response.sendRedirect("MYSQLYOG.jsp");
             }
             else
               out.println("Invalid user id or password");  
         }    
       
      out.write("     \n");
      out.write("        </center>    \n");
      out.write("        \n");
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
