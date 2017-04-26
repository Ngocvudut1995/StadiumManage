package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/include/header.jsp");
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
      out.write("<!--         <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"script/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>-->\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("        ");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"/Home\" style=\"padding: 0px\">\n");
      out.write("                  \n");
      out.write("                    <img  class=\"hidden-xs\" src=\"~/Content/Logo/coollogo_com-367326.png\" style=\"width: 100%\"/>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("               \n");
      out.write("                    <ul class=\"nav navbar-nav\" id=\"mynav\">\n");
      out.write("                        <li class='@if (ViewBag.Title.Equals(\"Home\"))\n");
      out.write("                               {\n");
      out.write("                                   @Html.Raw(\"active\")\n");
      out.write("                                   ;\n");
      out.write("                               } '><a href=\"/Home\">Trang ch?</a></li>\n");
      out.write("                        <li class='@if (ViewBag.Title.Equals(\"Home1\"))\n");
      out.write("                               {\n");
      out.write("                                   @Html.Raw(\"active\")\n");
      out.write("                                   ;\n");
      out.write("                               } '><a href=\"#\">Gi?i thi?u</a></li>\n");
      out.write("\n");
      out.write("                        <li class='@if (ViewBag.Title.Equals(\"Home1\"))\n");
      out.write("                               {\n");
      out.write("                                   @Html.Raw(\"active\")\n");
      out.write("                                   ;\n");
      out.write("                               } '><a href=\"#\">Khuy?n mãi</a></li>\n");
      out.write("\n");
      out.write("                        <li class='@if (ViewBag.Title.Equals(\"Home1\"))\n");
      out.write("                               {\n");
      out.write("                                   @Html.Raw(\"active\")\n");
      out.write("                                   ;\n");
      out.write("                               } '><a href=\"#\">Gi?i ??u</a></li>\n");
      out.write("\n");
      out.write("                        <li class='@if (ViewBag.Title.Equals(\"Home1\"))\n");
      out.write("                               {\n");
      out.write("                                   @Html.Raw(\"active\")\n");
      out.write("                                   ;\n");
      out.write("                               } '><a href=\"#\">Liên h?</a></li>\n");
      out.write("\n");
      out.write("                        <li class='@if (ViewBag.Title.Equals(\"Manage Yard\"))\n");
      out.write("                               {\n");
      out.write("                                   @Html.Raw(\"active\")\n");
      out.write("                                   ;\n");
      out.write("                               } '><a href=\"/Yard/Manage\">Danh sách sân</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    @if (Session[\"userid\"] == null)\n");
      out.write("                    {\n");
      out.write("                        <li><a href=\"/Home/Register\"><span class=\"glyphicon glyphicon-user\"></span> ??ng kí</a></li>\n");
      out.write("                        <li><a href=\"/Home/Login\"><span class=\"glyphicon glyphicon-log-in\"></span> ??ng nh?p</a></li>\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        <li><a href=\"/Home/Info\"><span class=\"glyphicon glyphicon-user\"></span> Xin Chào @Session[\"Name\"]</a></li>\n");
      out.write("                        <li><a href=\"/System/Logout\"><span class=\"glyphicon glyphicon-log-in\"></span> ??ng xu?t</a></li>\n");
      out.write("                   \n");
      out.write("                    }\n");
      out.write("                   \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("    <div class=\"col-md-2\"></div>\n");
      out.write("    <div class=\"col-md-8\">\n");
      out.write("        <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <!-- Indicators -->\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("\n");
      out.write("            </ol>\n");
      out.write("\n");
      out.write("            <!-- Wrapper for slides -->\n");
      out.write("            <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                <div class=\"item active\">\n");
      out.write("                    <img src=\"Content/slide/slide1.jpg\" alt=\"Chania\" style=\"width: 100%\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                   \n");
      out.write("                    <img src=\"Content/slide/slide2.jpg\" alt=\"Chania\" style=\"width: 100%\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"Content/slide/slide3.jpg\" alt=\"Flower\" style=\"width: 100%\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Left and right controls -->\n");
      out.write("            <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <fieldset>\n");
      out.write("        <h3 style=\"color: rgb(7, 153, 7)\">Danh sách sân 5 người</h3>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            @foreach (var item in Model.yard_5)\n");
      out.write("            {\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">Sân 5 Người</div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <a href=\"/Yard/Index/@item.IDYard\"><img src=\"~/@item.Image\" class=\"img-responsive\" style=\"width: 100%\" alt=\"Image\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-footer\"><a href=\"/Yard/Index/@item.IDYard\">@item.NameYard</a></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </fieldset>\n");
      out.write("    <hr>\n");
      out.write("</div><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h3 style=\"color: rgb(7, 153, 7)\">Danh sách sân 7 người</h3>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        @foreach (var item in Model.yard_7)\n");
      out.write("            {\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <div class=\"panel panel-success\">\n");
      out.write("                    <div class=\"panel-heading\">Sân 7 Người</div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <a href=\"/Yard/Index/@item.IDYard\"><img src=\"~/@item.Image\" class=\"img-responsive\" style=\"width: 100%\" alt=\"Image\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-footer\">\n");
      out.write("                        <a href=\"/Yard/Index/@item.IDYard\">@item.NameYard</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    \n");
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