package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import DB.ConnectionClass;

public final class UserBookingStatus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

    // Assume user is logged in and has a session attribute 'user_id'
    Integer userId = (Integer) session.getAttribute("user_id");

    if (userId == null) {
        response.sendRedirect("Login.jsp"); // Redirect to login if not logged in
        return;
    }

    ConnectionClass db = new ConnectionClass();
    ResultSet rs = db.selectCommand("SELECT service_type, description, status, created_at FROM tbl_booking WHERE user_id=" + userId);

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <title>My Bookings</title>\n");
      out.write("    <style>\n");
      out.write("        .confirmed { color: green; font-weight: bold; }\n");
      out.write("        .rejected { color: red; font-weight: bold; }\n");
      out.write("        .pending { color: orange; font-weight: bold; }\n");
      out.write("        table { width: 100%; border-collapse: collapse; }\n");
      out.write("        th, td { padding: 10px; border: 1px solid black; text-align: left; }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <h2>My Bookings</h2>\n");
      out.write("\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>Service</th>\n");
      out.write("            <th>Description</th>\n");
      out.write("            <th>Status</th>\n");
      out.write("            <th>Booking Date</th>\n");
      out.write("        </tr>\n");
      out.write("        ");
 while (rs.next()) { 
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( rs.getString("service_type") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("description") );
      out.write("</td>\n");
      out.write("            <td>\n");
      out.write("                ");
 
                    String status = rs.getString("status");
                    String statusClass = status.equals("Confirmed") ? "confirmed" : 
                                        status.equals("Rejected") ? "rejected" : "pending";
                
      out.write("\n");
      out.write("                <span class=\"");
      out.print( statusClass );
      out.write('"');
      out.write('>');
      out.print( status );
      out.write("</span>\n");
      out.write("            </td>\n");
      out.write("            <td>");
      out.print( rs.getTimestamp("created_at") );
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </table>\n");
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
