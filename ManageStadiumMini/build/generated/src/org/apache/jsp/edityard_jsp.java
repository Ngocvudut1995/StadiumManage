package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edityard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"script/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 style=\"text-align: center;\">Thông tin sân bóng</h1>\n");
      out.write("            <div class=\"col-md-2\"></div>\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\">Thông tin sân bóng</div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <form>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\">Mã sân:</label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\" >Tên sân:</label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\" >Loại sân:</label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <select class=\"form-control\">\n");
      out.write("                                        <option>5 người</option>\n");
      out.write("                                         <option>7 người</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\" >Tình trạng:</label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <select class=\"form-control\">\n");
      out.write("                                        <option>Đang hoạt động</option>\n");
      out.write("                                         <option>Đang sửa chữa</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\" >Thuê bóng:</label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <select class=\"form-control\">\n");
      out.write("                                        <option>Có</option>\n");
      out.write("                                         <option>Không</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\" >Thuê áo:</label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <select class=\"form-control\">\n");
      out.write("                                        <option>Có</option>\n");
      out.write("                                         <option>Không</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\" >Thuê giày:</label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <select class=\"form-control\">\n");
      out.write("                                        <option>Có</option>\n");
      out.write("                                         <option>Không</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\" >Giá:</label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <input class=\"form-control\" type=\"number\" ></label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\" style=\"text-align: center;\">\n");
      out.write("                                <input style=\"margin-top: 20px\" class=\"btn btn-default\" type=\"button\" value=\"Lưu\"/> \n");
      out.write("                                 <input style=\"margin-top: 20px\" class=\"btn btn-default\" type=\"button\" value=\"Hủy\"/> \n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
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
