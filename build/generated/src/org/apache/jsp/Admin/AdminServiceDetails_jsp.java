package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class AdminServiceDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Admin - Service Details</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("<body class=\"bg-light\">\n");
      out.write("\n");
      out.write("<div class=\"container mt-5\">\n");
      out.write("    <h2 class=\"text-center text-primary\">Search Service Details</h2>\n");
      out.write("    \n");
      out.write("    <!-- Search Form -->\n");
      out.write("    <form method=\"post\" class=\"d-flex justify-content-center mt-3\">\n");
      out.write("        <input type=\"text\" name=\"bike_registration\" class=\"form-control w-50\" placeholder=\"Enter Bike Registration No.\" required>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary ms-2\">Search</button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    ");

    String bikeReg = request.getParameter("bike_registration");
    if (bikeReg != null && !bikeReg.trim().isEmpty()) {
        String query = "SELECT * FROM tbl_service WHERE bike_registration='" + bikeReg + "' ORDER BY service_date DESC";
        ResultSet rs = con.selectCommand(query);

        if (rs == null) { 

      out.write("\n");
      out.write("            <div class=\"mt-4 text-center text-danger\">\n");
      out.write("                <h5>Error fetching service records. Please try again.</h5>\n");
      out.write("            </div>\n");

        } else {

      out.write("\n");
      out.write("    <div class=\"mt-4\">\n");
      out.write("        <h4 class=\"text-center text-success\">Service Details for ");
      out.print( bikeReg );
      out.write("</h4>\n");
      out.write("        <table class=\"table table-bordered table-striped mt-3\">\n");
      out.write("            <thead class=\"table-dark\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Service Date</th>\n");
      out.write("                    <th>Service Type</th>\n");
      out.write("                    <th>Status</th>\n");
      out.write("                    <th>Cost</th>\n");
      out.write("                    <th>Action</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    boolean hasRecords = false;
                    while (rs.next()) {
                        hasRecords = true;
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( rs.getString("service_date") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs.getString("service_type") );
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <form method=\"post\" action=\"UpdateServiceStatus.jsp\">\n");
      out.write("                            <input type=\"hidden\" name=\"service_id\" value=\"");
      out.print( rs.getString("service_id") );
      out.write("\">\n");
      out.write("                            <select name=\"status\" class=\"form-select\">\n");
      out.write("                                <option value=\"Pending\" ");
      out.print( "Pending".equals(rs.getString("status")) ? "selected" : "" );
      out.write(">Pending</option>\n");
      out.write("                                <option value=\"Finished\" ");
      out.print( "Finished".equals(rs.getString("status")) ? "selected" : "" );
      out.write(">Finished</option>\n");
      out.write("                                <option value=\"Cancelled\" ");
      out.print( "Cancelled".equals(rs.getString("status")) ? "selected" : "" );
      out.write(">Cancelled</option>\n");
      out.write("                            </select>\n");
      out.write("                    </td>\n");
      out.write("                    <td>₹");
      out.print( rs.getString("cost") );
      out.write("</td>\n");
      out.write("                    \n");
      out.write("                    <td>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success btn-sm\">Update</button>\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                    if (!hasRecords) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"6\" class=\"text-center text-danger\">No service records found!</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");

        } // End of if (rs != null)
    } // End of if (bikeReg != null && !bikeReg.trim().isEmpty())

      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"text-center mt-3\">\n");
      out.write("        <a href=\"AdminDashboard.jsp\" class=\"btn btn-secondary\">Back to Dashboard</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");

    String success = request.getParameter("success");
    String error = request.getParameter("error");
    String msg = request.getParameter("msg");

      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    window.onload = function() {\n");
      out.write("        ");
 if (success != null) { 
      out.write("\n");
      out.write("            alert(\"✅ Service status updated successfully!\");\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("        ");
 if (error != null) { 
      out.write("\n");
      out.write("            alert(\"❌ Error: ");
      out.print( (msg != null) ? msg : "Failed to update service status." );
      out.write("\");\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    };\n");
      out.write("</script>\n");
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
