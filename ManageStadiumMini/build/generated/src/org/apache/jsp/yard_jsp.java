package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class yard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"script/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <style type=\"text/css\">\n");
      out.write("    .loginmodal-container {\n");
      out.write("        padding: 30px;\n");
      out.write("        max-width: 350px;\n");
      out.write("        width: 100% !important;\n");
      out.write("        background-color: #F7F7F7;\n");
      out.write("        margin: 0 auto;\n");
      out.write("        border-radius: 2px;\n");
      out.write("        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("        overflow: hidden;\n");
      out.write("        font-family: roboto;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .control-label {\n");
      out.write("        text-align: left;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-7\"></div>\n");
      out.write("        <div class=\"col-md-5\">\n");
      out.write("            <div class=\"loginmodal-container\">\n");
      out.write("                <fieldset>\n");
      out.write("\n");
      out.write("                    <!-- Form Name -->\n");
      out.write("                    <legend>Thông tin liên hệ đặt sân</legend>\n");
      out.write("                    <div>\n");
      out.write("                        <span><b>Chủ sân: Trần Văn A</b></span><br>\n");
      out.write("                        <span><b>Liên hệ: 01222222222</b></span><br>\n");
      out.write("                        <span><b>Địa chỉ: 54 Nguyễn Lương Bằng</b></span><br>\n");
      out.write("                        <span><b>Email: tranvana88@gmail.com</b></span>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div>\n");
      out.write("                        <form class=\"form-horizontal\">\n");
      out.write("                            <!-- Text input-->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-md-4 control-label\" for=\"name\">Họ và tên</label>\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <input id=\"NameAccount\" name=\"name\" type=\"text\" placeholder=\"Họ và tên\" class=\"form-control input-md\" required=\"\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Text input-->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-md-4 control-label\" for=\"phone\" style=\"white-space: nowrap\">Số điện thoại</label>\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <input id=\"Phone\" name=\"phone\" type=\"tel\" placeholder=\"Số điện thoại\" class=\"form-control input-md\" required=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Text input-->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-md-4 control-label\" for=\"add\">Địa chỉ</label>\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <input id=\"Address\" name=\"add\" type=\"text\" placeholder=\"Địa chỉ\" class=\"form-control input-md\" required=\"\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Text input-->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-md-4 control-label\" for=\"email\">Email</label>\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <input id=\"Email\" name=\"email\" type=\"email\" placeholder=\"Email\" onblur=\"EmailExisted(this.value)\" class=\"form-control input-md\" required=\"\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Select Basic -->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-md-4 control-label\" for=\"selecttime\">Khung giờ</label>\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <select id=\"IDTimeSlot\" name=\"selecttime\" class=\"form-control input-md\">\n");
      out.write("                                       \n");
      out.write("                                        <option>17h30 - 18h30</option>\n");
      out.write("                                        <option>18h30 - 19h30</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\">Ngày đặt: </label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <input type=\"date\" class=\"form-control\" id=\"DateBook\" onblur=\"changeDateBook()\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Text input-->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-md-4 control-label\" for=\"ln\">Giá</label>\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <input id=\"amount\" name=\"amount\" type=\"number\" placeholder=\"\" class=\"form-control input-md\" required=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-md-4 control-label\" for=\"ln\">Nội dung</label>\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <textarea id=\"Contents\" style=\"width: 100%;\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Button -->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-md-4 control-label\" for=\"submit\"></label>\n");
      out.write("                                <div class=\"col-md-4\">\n");
      out.write("                                    <button id=\"submit\" name=\"submit\" class=\"btn btn-primary\" onclick=\"bookyard()\">Đặt sân</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </fieldset>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
