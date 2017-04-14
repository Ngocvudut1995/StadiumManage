package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"script/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("            .navbar-nav > li > a{\n");
      out.write("                padding-top:  5px;\n");
      out.write("                padding-bottom:  5px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"container\">\n");
      out.write("        <nav class=\"navbar navbar-default\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\">WebSiteName</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-10\">\n");
      out.write("                    <div style=\"float: right; width: 100%;margin: 20px;text-align: right; margin-right: 50px\">\n");
      out.write("\n");
      out.write("                        <button class=\"btn btn-default\">Đăng kí</button>\n");
      out.write("                        <button class=\"btn btn-default\">Đăng nhập</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li class=\"active\"><a href=\"#\">Trang chủ</a></li>\n");
      out.write("                            <li><a href=\"#\">Giới thiệu</a></li>\n");
      out.write("                            <li><a href=\"#\">Khuyến mãi</a></li>\n");
      out.write("                            <li><a href=\"#\">Giải đấu</a></li>\n");
      out.write("                            <li><a href=\"#\">Liên hệ</a></li>\n");
      out.write("                            <li><a href=\"#\">Danh sách sân</a></li>\n");
      out.write("                            <li style=\"position: absolute;right: 54px;\"><input class=\"form-control\" style=\"width: 210px;height: 20px;padding:0px 0px; \" type=\"text\" placeholder=\"Tìm kiếm\"/></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <div style=\"text-align: center\">\n");
      out.write("                <h1>Đăng kí thành viên </h1>\n");
      out.write("            </div>\n");
      out.write("            <div style=\" width: 75%;margin: auto;\"\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\">Thông tin tài khoản đăng kí</div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <form class=\"form-horizontal\" action=\"register.do\" method=\"POST\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-2\">Họ và tên: </label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Nhập họ tên\" name=\"name_account\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-2\">Ngày sinh: </label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"date\" class=\"form-control\" name=\"birthday\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-2\">Số điện thoại: </label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"tel\" class=\"form-control\" placeholder=\"Nhập số điện thoại\" name=\"phone\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-2\">Địa chỉ: </label>\n");
      out.write("                                <div class=\"col-sm-10\"> \n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"Nhập địa chỉ\" name=\"address\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-2\">Email:</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"email\" class=\"form-control\"  placeholder=\"Nhập email\" name=\"email\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-2\">Mật khẩu: </label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"password\" class=\"form-control\"  placeholder=\"Nhập mật khẩu\" name=\"password\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-2\">Nhập lại mật khẩu: </label>\n");
      out.write("                                <div class=\"col-sm-10\"> \n");
      out.write("                                    <input type=\"password\" class=\"form-control\"  placeholder=\"Nhập lại mật khẩu\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\"> \n");
      out.write("                                <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                    <div class=\"checkbox\">\n");
      out.write("                                        <label><input type=\"checkbox\"> Remember me</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\"> \n");
      out.write("                                <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-default\">Đăng kí</button>\n");
      out.write("                                    <button type=\"reset\" class=\"btn btn-default\">Hủy</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
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
