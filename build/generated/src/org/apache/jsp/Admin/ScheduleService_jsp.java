package org.apache.jsp.Admin;

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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Schedule Bike Service</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");

    if (request.getParameter("btnsubmit") != null) {
        String bikeReg = request.getParameter("txtbikereg");
        String serviceDate = request.getParameter("txtdate");
        String serviceType = request.getParameter("txtservice");

        // Check if the bike registration number exists
        String checkQry = "SELECT * FROM tbl_user WHERE bike_registration='" + bikeReg + "'";
        ResultSet rs = con.selectCommand(checkQry);

        if (rs.next()) {
            // Insert service request
            String insQry = "INSERT INTO tbl_service (bike_registration, service_date, service_type, status) VALUES ('" + bikeReg + "', '" + serviceDate + "', '" + serviceType + "', 'Pending')";
            if (con.executeCommand(insQry)) {

      out.write("\n");
      out.write("            <script>\n");
      out.write("                alert(\"Service Scheduled Successfully\");\n");
      out.write("                window.location = \"ScheduleService.jsp\";\n");
      out.write("            </script>\n");

            } else {
                out.println("<p style='color:red;'>Failed to schedule service!</p>");
            }
        } else {
            out.println("<p style='color:red;'>Bike registration number not found!</p>");
        }
    }

      out.write("\n");
      out.write("\n");
      out.write("<h1 align=\"center\">Schedule Bike Service</h1>\n");
      out.write("<form>\n");
      out.write("    <table align=\"center\">\n");
      out.write("        <tr>\n");
      out.write("            <td>Bike Registration</td>\n");
      out.write("            <td><input type=\"text\" name=\"txtbikereg\" placeholder=\"Enter Bike Registration\" required></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Service Date</td>\n");
      out.write("            <td><input type=\"date\" name=\"txtdate\" required></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Service Type</td>\n");
      out.write("            <td>\n");
      out.write("                <select name=\"txtservice\" required>\n");
      out.write("                    <option value=\"General Service\">General Service</option>\n");
      out.write("                    <option value=\"Oil Change\">Oil Change</option>\n");
      out.write("                    <option value=\"Brake Service\">Brake Service</option>\n");
      out.write("                    <option value=\"Full Inspection\">Full Inspection</option>\n");
      out.write("                </select>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"2\" align=\"center\"><input type=\"submit\" name=\"btnsubmit\" value=\"Schedule Service\"></td>\n");
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
