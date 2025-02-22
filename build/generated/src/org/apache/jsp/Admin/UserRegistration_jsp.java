package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class UserRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>User Registration</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");

    if (request.getParameter("btnsubmit") != null) {
        String name = request.getParameter("txtname");
        String email = request.getParameter("txtemail");
        String bikeReg = request.getParameter("txtbikereg");
        String password = request.getParameter("txtpassword");
        String phone = request.getParameter("txtphone");
        String address = request.getParameter("txtaddress");

        // Debugging: Print query before execution
        String insQry = "INSERT INTO tbl_user (user_name, email, bike_registration, user_password, phone, address) VALUES ('" + name + "', '" + email + "', '" + bikeReg + "', '" + password + "', '" + phone + "', '" + address + "')";
        out.println("<p>Executing Query: " + insQry + "</p>");

        if (con.executeCommand(insQry)) {

      out.write("\n");
      out.write("        <script>\n");
      out.write("            alert(\"User Registered Successfully\");\n");
      out.write("            window.location = \"UserRegistration.jsp\";\n");
      out.write("        </script>\n");

        } else {
            out.println("<p style='color:red;'>Query execution failed!</p>");
        }
    }

      out.write("\n");
      out.write("\n");
      out.write("<h1 align=\"center\">User Registration</h1>\n");
      out.write("<form>\n");
      out.write("    <table align=\"center\">\n");
      out.write("        <tr>\n");
      out.write("            <td>Name</td>\n");
      out.write("            <td><input type=\"text\" name=\"txtname\" placeholder=\"Enter Name\" required></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Email</td>\n");
      out.write("            <td><input type=\"email\" name=\"txtemail\" placeholder=\"Enter Email\" required></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Bike Registration</td>\n");
      out.write("            <td><input type=\"text\" name=\"txtbikereg\" placeholder=\"Enter Bike Registration\" required></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Password</td>\n");
      out.write("            <td><input type=\"password\" name=\"txtpassword\" placeholder=\"Enter Password\" required></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Phone</td>\n");
      out.write("            <td><input type=\"text\" name=\"txtphone\" placeholder=\"Enter Phone\" required></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Address</td>\n");
      out.write("            <td><textarea name=\"txtaddress\" placeholder=\"Enter Address\" required></textarea></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"2\" align=\"center\"><input type=\"submit\" name=\"btnsubmit\" value=\"Register\"></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</form>\n");
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
