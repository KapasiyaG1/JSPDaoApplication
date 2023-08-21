package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import connect.MyConnection;

public final class MYSQLYOG_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <center>   \n");
      out.write("       <font color=\"red\" size=\"7\">S</font>\n");
      out.write("       <font color=\"green\" size=\"7\">Q</font>\n");
      out.write("       <font color=\"black\" size=\"7\">L</font>\n");
      out.write("       <font color=\"blue\" size=\"7\">B</font>\n");
      out.write("       <font color=\"red\" size=\"7\">R</font>\n");
      out.write("       <font color=\"yellow\" size=\"7\">O</font>\n");
      out.write("       <font color=\"black\" size=\"7\">W</font>\n");
      out.write("       <font color=\"blue\" size=\"7\">S</font>\n");
      out.write("       <font color=\"red\" size=\"7\">E</font>\n");
      out.write("       <font color=\"green\" size=\"7\">R</font>\n");
      out.write("       <form method=\"post\" action=\"MYSQLYOG.jsp\">\n");
      out.write("         <textarea rows=\"10\" cols=\"100\" name=\"txtsql\"></textarea>  \n");
      out.write("         <br>\n");
      out.write("         <input type=\"submit\" value=\"Execute\">\n");
      out.write("       </form>    \n");
      out.write("      ");
 
         String sql=null;
         sql=request.getParameter("txtsql");
         if(sql!=null)
         {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con;
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root","root");
             PreparedStatement ps;
             ResultSet rs=null;
             ResultSetMetaData rsmd=null;
             ps=con.prepareStatement(sql);
             if(sql.toUpperCase().startsWith("SELECT"))
             {
                rs=ps.executeQuery();
                rsmd=rs.getMetaData();
                out.println(rsmd.getColumnCount());
                out.println("<table border=1>");
                out.println("<tr>");
                int i;
                for(i=1;i<=rsmd.getColumnCount();i++)
                {     
                 out.println("<th>");
                 out.println(rsmd.getColumnName(i));
                 out.println("</th>");
                }  
                while(rs.next())
                {
                  out.println("<tr>");
                 for(i=1;i<=rsmd.getColumnCount();i++)
                   out.println("<td>" +rs.getString(i)+"</td>");
                  out.println("</tr>");
                }    
                
                out.println("</tr>");
                out.println("<table>");
                
             }
             else
             {
                int n=0;
                n=ps.executeUpdate();
                out.println("Query OK,"+ n+" row affected");
             }   
         }    
      
      out.write(" \n");
      out.write("       </center>\n");
      out.write("    \n");
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
