package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class ScheduleService_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      DB.ConnectionClass con = null;
      synchronized (_jspx_page_context) {
        con = (DB.ConnectionClass) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <title>My Scheduled Services</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("<body class=\"bg-light\">\n");
      out.write("\n");

    // Assuming the user is logged in and bike registration is stored in session
    String bikeReg = (String) session.getAttribute("bike_registration");

    if (bikeReg == null) {
        response.sendRedirect("Login.jsp"); // Redirect if user is not logged in
    }

    String query = "SELECT * FROM tbl_service WHERE bike_registration='" + bikeReg + "'";
    ResultSet rs = con.selectCommand(query);

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container mt-5\">\n");
      out.write("    <h2 class=\"text-center text-primary\">My Scheduled Services</h2>\n");
      out.write("    \n");
      out.write("    <table class=\"table table-bordered table-striped mt-4\">\n");
      out.write("        <thead class=\"table-dark\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Service Date</th>\n");
      out.write("                <th>Service Type</th>\n");
      out.write("                <th>Status</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            ");

                boolean hasRecords = false;
                while (rs.next()) {
                    hasRecords = true;
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( rs.getString("service_date") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("service_type") );
      out.write("</td>\n");
      out.write("                <td><span class=\"badge bg-info\">");
      out.print( rs.getString("status") );
      out.write("</span></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
                if (!hasRecords) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"3\" class=\"text-center text-danger\">No scheduled services found!</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
