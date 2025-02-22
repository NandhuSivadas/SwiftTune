package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import DB.ConnectionClass;

public final class AdminManageBooking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Admin/SideBar.jsp");
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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Admin Dashboard</title>\n");
      out.write("    <script src=\"https://kit.fontawesome.com/a076d05399.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <style>\n");
      out.write("        /* Sidebar Styles */\n");
      out.write("        .sidebar {\n");
      out.write("            width: 250px;\n");
      out.write("            height: 100vh;\n");
      out.write("            background: rgba(20, 20, 20, 0.9);\n");
      out.write("            position: fixed;\n");
      out.write("            left: 0;\n");
      out.write("            top: 0;\n");
      out.write("            padding: 20px;\n");
      out.write("            transition: 0.3s;\n");
      out.write("            box-shadow: 0px 0px 10px rgba(0, 255, 255, 0.2);\n");
      out.write("        }\n");
      out.write("        .sidebar-title {\n");
      out.write("            color: cyan;\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-item {\n");
      out.write("            padding: 10px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-item a {\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-item i {\n");
      out.write("            margin-right: 10px;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-item:hover {\n");
      out.write("            background: rgba(0, 255, 255, 0.2);\n");
      out.write("        }\n");
      out.write("        /* Logout Button */\n");
      out.write("        .sidebar .logout {\n");
      out.write("            background: #ff4d4d;\n");
      out.write("            padding: 10px;\n");
      out.write("            display: block;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            text-align: center;\n");
      out.write("            transition: 0.3s;\n");
      out.write("        }\n");
      out.write("        .sidebar .logout:hover {\n");
      out.write("            background: #cc0000;\n");
      out.write("        }\n");
      out.write("        /* Toggle Button */\n");
      out.write("        .toggle-btn {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 20px;\n");
      out.write("            left: 270px;\n");
      out.write("            background: transparent;\n");
      out.write("            border: none;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 24px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .content {\n");
      out.write("            margin-left: 270px;\n");
      out.write("            padding: 20px;\n");
      out.write("            transition: 0.3s;\n");
      out.write("        }\n");
      out.write("        /* Sidebar Collapse */\n");
      out.write("        .collapsed {\n");
      out.write("            width: 60px;\n");
      out.write("        }\n");
      out.write("        .collapsed .nav-item a span {\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("        .collapsed .toggle-btn {\n");
      out.write("            left: 80px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"d-flex\">\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <div id=\"sidebar\" class=\"sidebar\">\n");
      out.write("            <h2 class=\"sidebar-title\">Admin Panel</h2>\n");
      out.write("            <ul class=\"nav flex-column\">\n");
      out.write("                <li class=\"nav-item\"><a href=\"dashboard.jsp\"><i class=\"fas fa-home\"></i> <span>Dashboard</span></a></li>\n");
      out.write("                <li class=\"nav-item\"><a href=\"manage_users.jsp\"><i class=\"fas fa-users\"></i> <span>Manage Users</span></a></li>\n");
      out.write("                <li class=\"nav-item\"><a href=\"manage_bikes.jsp\"><i class=\"fas fa-motorcycle\"></i> <span>Manage Bikes</span></a></li>\n");
      out.write("                <li class=\"nav-item\"><a href=\"view_reports.jsp\"><i class=\"fas fa-chart-line\"></i> <span>View Reports</span></a></li>\n");
      out.write("                <li class=\"nav-item\"><a href=\"settings.jsp\"><i class=\"fas fa-cogs\"></i> <span>Settings</span></a></li>\n");
      out.write("                <li class=\"nav-item\"><a href=\"messages.jsp\"><i class=\"fas fa-envelope\"></i> <span>Messages</span></a></li>\n");
      out.write("                <li class=\"nav-item\"><a href=\"profile.jsp\"><i class=\"fas fa-user\"></i> <span>Profile</span></a></li>\n");
      out.write("                <li class=\"nav-item\"><a href=\"logout.jsp\" class=\"logout\"><i class=\"fas fa-sign-out-alt\"></i> <span>Logout</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <!-- Content Wrapper -->\n");
      out.write("        <div id=\"content\" class=\"content\">\n");
      out.write("            <button class=\"toggle-btn\" onclick=\"toggleSidebar()\"><i class=\"fas fa-bars\"></i></button>\n");
      out.write("            <h1>Welcome to Admin Dashboard</h1>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        function toggleSidebar() {\n");
      out.write("            let sidebar = document.getElementById(\"sidebar\");\n");
      out.write("            let content = document.getElementById(\"content\");\n");
      out.write("            sidebar.classList.toggle(\"collapsed\");\n");
      out.write("            content.style.marginLeft = sidebar.classList.contains(\"collapsed\") ? \"80px\" : \"270px\";\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    ConnectionClass db = new ConnectionClass();
    String query = "SELECT booking_id, service_type, description, status FROM tbl_booking";
    ResultSet rs = db.selectCommand(query);

    if (request.getMethod().equals("POST") && request.getParameter("update") != null) {
        String bookingId = request.getParameter("booking_id");
        String newStatus = request.getParameter("update");

        String updateQuery = "UPDATE tbl_booking SET status='" + newStatus + "' WHERE booking_id=" + bookingId;
        boolean updated = db.executeCommand(updateQuery);
        response.sendRedirect(updated ? "AdminManageBooking.jsp?success=1" : "AdminManageBooking.jsp?error=1");
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <title>Admin - Manage Bookings</title>\n");
      out.write("    <style>\n");
      out.write("        .confirmed { color: green; font-weight: bold; }\n");
      out.write("        .rejected { color: red; font-weight: bold; }\n");
      out.write("        table { width: 100%; border-collapse: collapse; }\n");
      out.write("        th, td { padding: 10px; border: 1px solid black; text-align: center; }\n");
      out.write("    </style>\n");
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
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>Booking ID</th><th>Service</th><th>Description</th><th>Status</th><th>Actions</th>\n");
      out.write("        </tr>\n");
      out.write("        ");
 
        if (rs != null) {
            while (rs.next()) { 
                String status = rs.getString("status");
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( rs.getInt("booking_id") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("service_type") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("description") );
      out.write("</td>\n");
      out.write("            <td class=\"");
      out.print( status.toLowerCase() );
      out.write('"');
      out.write('>');
      out.print( status );
      out.write("</td>\n");
      out.write("            <td>\n");
      out.write("                <form method=\"POST\" style=\"display:inline;\">\n");
      out.write("                    <input type=\"hidden\" name=\"booking_id\" value=\"");
      out.print( rs.getInt("booking_id") );
      out.write("\">\n");
      out.write("                    ");
 if (status.equals("Confirmed")) { 
      out.write("\n");
      out.write("                        <button type=\"submit\" name=\"update\" value=\"Rejected\">Reject</button>\n");
      out.write("                    ");
 } else if (status.equals("Rejected")) { 
      out.write("\n");
      out.write("                        <button type=\"submit\" name=\"update\" value=\"Confirmed\">Confirm</button>\n");
      out.write("                    ");
 } else { 
      out.write("\n");
      out.write("                        <button type=\"submit\" name=\"update\" value=\"Confirmed\">Confirm</button>\n");
      out.write("                        <button type=\"submit\" name=\"update\" value=\"Rejected\">Reject</button>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        ");
 
            }
        } else { 
        
      out.write("\n");
      out.write("            <tr><td colspan=\"5\">No bookings found.</td></tr>\n");
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
