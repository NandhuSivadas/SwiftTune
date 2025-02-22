package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import DB.ConnectionClass;

public final class UserList_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    ConnectionClass db = new ConnectionClass();
    ResultSet rs = db.selectCommand("SELECT b.booking_id, b.service_type, b.description, b.status, b.created_at, u.user_name, u.phone FROM tbl_booking b INNER JOIN tbl_user u ON b.user_id = u.user_id");

    if (request.getParameter("update") != null) {
        String bookingId = request.getParameter("booking_id");
        String newStatus = request.getParameter("status");

        String updateQuery = "UPDATE tbl_booking SET status='" + newStatus + "' WHERE booking_id=" + bookingId;
        boolean updated = db.executeCommand(updateQuery);
        response.sendRedirect(updated ? "AdminManageBookings.jsp?success=1" : "AdminManageBookings.jsp?error=1");
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <title>Admin - Manage Bookings</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    ");
 if (request.getParameter("success") != null) { 
      out.write("\n");
      out.write("        <script>alert(\"Booking updated successfully!\");</script>\n");
      out.write("    ");
 } else if (request.getParameter("error") != null) { 
      out.write("\n");
      out.write("        <script>alert(\"Error updating booking. Try again!\");</script>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    <h2>Manage Bookings</h2>\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <tr>\n");
      out.write("            <th>Booking ID</th>\n");
      out.write("            <th>User Name</th>\n");
      out.write("            <th>Phone Number</th>\n");
      out.write("            <th>Service</th>\n");
      out.write("            <th>Description</th>\n");
      out.write("            <th>Status</th>\n");
      out.write("            <th>Actions</th>\n");
      out.write("        </tr>\n");
      out.write("        ");
 while (rs.next()) { 
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( rs.getInt("booking_id") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("user_name") );
      out.write("</td> <!-- Display User Name -->\n");
      out.write("            <td>");
      out.print( rs.getString("phone") );
      out.write("</td> <!-- Display User Phone -->\n");
      out.write("            <td>");
      out.print( rs.getString("service_type") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("description") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("status") );
      out.write("</td>\n");
      out.write("            <td>\n");
      out.write("                ");
 if (!rs.getString("status").equals("Confirmed")) { 
      out.write("\n");
      out.write("                    <form method=\"POST\" action=\"AdminManageBookings.jsp\" style=\"display:inline;\">\n");
      out.write("                        <input type=\"hidden\" name=\"booking_id\" value=\"");
      out.print( rs.getInt("booking_id") );
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" name=\"status\" value=\"Confirmed\">\n");
      out.write("                        <button type=\"submit\" name=\"update\">Confirm</button>\n");
      out.write("                    </form>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                ");
 if (!rs.getString("status").equals("Rejected")) { 
      out.write("\n");
      out.write("                    <form method=\"POST\" action=\"AdminManageBookings.jsp\" style=\"display:inline;\">\n");
      out.write("                        <input type=\"hidden\" name=\"booking_id\" value=\"");
      out.print( rs.getInt("booking_id") );
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" name=\"status\" value=\"Rejected\">\n");
      out.write("                        <button type=\"submit\" name=\"update\">Reject</button>\n");
      out.write("                    </form>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </td>\n");
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
