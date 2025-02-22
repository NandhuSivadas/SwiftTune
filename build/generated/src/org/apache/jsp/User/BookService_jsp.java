package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import DB.ConnectionClass;

public final class BookService_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/User/NavBar.jsp");
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Dashboard</title>\n");
      out.write("    <style>\n");
      out.write("        /* 🌟 Navbar Styling */\n");
      out.write("        .navbar {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("            background: linear-gradient(to right, #1e3c72, #2a5298);\n");
      out.write("            padding: 15px 30px;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.3);\n");
      out.write("        }\n");
      out.write("        .navbar .logo {\n");
      out.write("            font-size: 24px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("        .nav-links {\n");
      out.write("            list-style: none;\n");
      out.write("            display: flex;\n");
      out.write("        }\n");
      out.write("        .nav-links li {\n");
      out.write("            margin: 0 15px;\n");
      out.write("        }\n");
      out.write("        .nav-links a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #fff;\n");
      out.write("            font-size: 18px;\n");
      out.write("            padding: 8px 15px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            transition: 0.3s;\n");
      out.write("        }\n");
      out.write("        .nav-links a:hover {\n");
      out.write("            background: rgba(255, 255, 255, 0.2);\n");
      out.write("        }\n");
      out.write("        .logout-btn {\n");
      out.write("            background: red;\n");
      out.write("            padding: 8px 15px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        .logout-btn:hover {\n");
      out.write("            background: darkred;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* 🌟 Table Styling */\n");
      out.write("        .table-container {\n");
      out.write("            width: 90%;\n");
      out.write("            margin: 30px auto;\n");
      out.write("            overflow-x: auto;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            background: #ffffff;\n");
      out.write("            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.2);\n");
      out.write("            border-radius: 8px;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            padding: 12px 15px;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background: #1e3c72;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("        td {\n");
      out.write("            border-bottom: 1px solid #ddd;\n");
      out.write("        }\n");
      out.write("        tr:hover {\n");
      out.write("            background: #f1f1f1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* 🌟 Button Styling */\n");
      out.write("        .btn {\n");
      out.write("            padding: 8px 12px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 14px;\n");
      out.write("            transition: 0.3s;\n");
      out.write("        }\n");
      out.write("        .btn-primary {\n");
      out.write("            background: #007bff;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        .btn-primary:hover {\n");
      out.write("            background: #0056b3;\n");
      out.write("        }\n");
      out.write("        .btn-danger {\n");
      out.write("            background: #dc3545;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        .btn-danger:hover {\n");
      out.write("            background: #a71d2a;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* 🌟 Booking Form Styling */\n");
      out.write("        .form-container {\n");
      out.write("            width: 50%;\n");
      out.write("            margin: 30px auto;\n");
      out.write("            background: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("        .form-container h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #1e3c72;\n");
      out.write("        }\n");
      out.write("        .form-group {\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("        .form-group label {\n");
      out.write("            display: block;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("        .form-group input, \n");
      out.write("        .form-group select, \n");
      out.write("        .form-group textarea {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        .form-group textarea {\n");
      out.write("            resize: vertical;\n");
      out.write("            height: 80px;\n");
      out.write("        }\n");
      out.write("        .form-group button {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            background: #1e3c72;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 16px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: 0.3s;\n");
      out.write("        }\n");
      out.write("        .form-group button:hover {\n");
      out.write("            background: #2a5298;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- 🌟 Navbar -->\n");
      out.write("    <nav class=\"navbar\">\n");
      out.write("        <div class=\"logo\">Bike Service</div>\n");
      out.write("        <ul class=\"nav-links\">\n");
      out.write("            <li><a href=\"dashboard.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"services.jsp\">Services</a></li>\n");
      out.write("            <li><a href=\"bookings.jsp\">My Bookings</a></li>\n");
      out.write("            <li><a href=\"profile.jsp\">Profile</a></li>\n");
      out.write("            <li><a href=\"logout.jsp\" class=\"logout-btn\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write('\n');

    ConnectionClass db = new ConnectionClass();

    if (request.getParameter("book") != null) {
        String userId = request.getParameter("user_id");
        String serviceType = request.getParameter("service_type");
        String description = request.getParameter("description");

        String insertQuery = "INSERT INTO tbl_booking (user_id, service_type, description, status, created_at) VALUES ('" + userId + "', '" + serviceType + "', '" + description + "', 'Pending', NOW())";
        boolean inserted = db.executeCommand(insertQuery);

        response.sendRedirect(inserted ? "BookService.jsp?success=1" : "BookService.jsp?error=1");
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <title>Book Water Service</title>\n");
      out.write("    <style>\n");
      out.write("        /* ? Card Styling */\n");
      out.write("        .booking-card {\n");
      out.write("            width: 40%;\n");
      out.write("            margin: 50px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            background: white;\n");
      out.write("            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.2);\n");
      out.write("            border-radius: 10px;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .booking-card h2 {\n");
      out.write("            color: #1e3c72;\n");
      out.write("        }\n");
      out.write("        .booking-card label {\n");
      out.write("            display: block;\n");
      out.write("            margin: 10px 0 5px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("        .booking-card select, \n");
      out.write("        .booking-card textarea {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("        .booking-card textarea {\n");
      out.write("            height: 80px;\n");
      out.write("        }\n");
      out.write("        .booking-card button {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            background: #007bff;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 16px;\n");
      out.write("            transition: 0.3s;\n");
      out.write("        }\n");
      out.write("        .booking-card button:hover {\n");
      out.write("            background: #0056b3;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
 if (request.getParameter("success") != null) { 
      out.write("\n");
      out.write("        <script>alert(\"Booking successful! Admin will confirm soon.\");</script>\n");
      out.write("    ");
 } else if (request.getParameter("error") != null) { 
      out.write("\n");
      out.write("        <script>alert(\"Booking failed. Please try again!\");</script>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    <!-- ? Booking Card -->\n");
      out.write("    <div class=\"booking-card\">\n");
      out.write("        <h2>Book a Water Service or Part Change</h2>\n");
      out.write("        <form method=\"POST\">\n");
      out.write("            <input type=\"hidden\" name=\"user_id\" value=\"1\"> ");
      out.write("\n");
      out.write("\n");
      out.write("            <label>Service Type:</label>\n");
      out.write("            <select name=\"service_type\" required>\n");
      out.write("                <option value=\"Water Service\">Water Service</option>\n");
      out.write("                <option value=\"Part Change\">Part Change</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <label>Description (Optional):</label>\n");
      out.write("            <textarea name=\"description\"></textarea>\n");
      out.write("\n");
      out.write("            <button type=\"submit\" name=\"book\">Book Now</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
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
