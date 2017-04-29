package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dut.stadium.model.Yard;

public final class manageyard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/include/header.jsp");
    _jspx_dependants.add("/include/navAccount.jsp");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write(" <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\"/>\n");
      out.write("           <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"script/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/colResizable-1.6.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("  ");
      out.write(" \n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write(" <script src=\"script/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("       \n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"home.jsp\" style=\"padding: 0px\">\n");
      out.write("                  \n");
      out.write("                    <img  class=\"hidden-xs\" src=\"Content/Logo/coollogo_com-367326.png\" style=\"width: 100%\"/>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("               \n");
      out.write("                    <ul class=\"nav navbar-nav\" id=\"mynav\">\n");
      out.write("                        <li class='");
if (true)
                               {
                                   out.print("active");
                                  
                               } 
      out.write("'><a href=\"home.jsp\">Trang chủ</a></li>\n");
      out.write("                        <li class='");
if (false)
                               {
                                   out.print("active");
                                  
                               } 
      out.write("'><a href=\"#\">Giới thiệu</a></li>\n");
      out.write("\n");
      out.write("                        <li class='");
if (false)
                               {
                                   out.print("active");
                                  
                               } 
      out.write("'><a href=\"#\">Khuyến mãi</a></li>\n");
      out.write("\n");
      out.write("                        <li class='");
if (false)
                               {
                                   out.print("active");
                                  
                               } 
      out.write("'><a href=\"#\">Giải đấu</a></li>\n");
      out.write("\n");
      out.write("                        <li class='");
if (false)
                               {
                                   out.print("active");
                                  
                               } 
      out.write("'><a href=\"#\">Liên hệ</a></li>\n");
      out.write("\n");
      out.write("                        <li class='");
if (false)
                               {
                                   out.print("active");
                                  
                               } 
      out.write("'><a href=\"#\">Danh sách sân</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    ");
if (true)
                    {
      out.write("\n");
      out.write("                        <li><a href=\"register.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Đăng kí</a></li>\n");
      out.write("                        <li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Đăng nhập</a></li>\n");
      out.write("\n");
      out.write("                    ");
}
                    else
                    {
      out.write("\n");
      out.write("                        <li><a href=\"infopersonal.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Xin Chào @Session[\"Name\"]</a></li>\n");
      out.write("                        <li><a href=\"logout.do\"><span class=\"glyphicon glyphicon-log-in\"></span> Đăng xuất</a></li>\n");
      out.write("                   \n");
      out.write("                   ");
 }
      out.write("\n");
      out.write("                   \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>");
      out.write("\n");
      out.write("<script type=\"text/javascript\" charset=\"utf8\" src=\"~/Scripts/colResizable-1.6.min.js\"></script>\n");
      out.write("<link href=\"~/Content/bootstrap-formhelpers.min.css\" rel=\"stylesheet\" />\n");
      out.write("<script src=\"~/Scripts/bootstrap-formhelpers.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var id = 0;\n");
      out.write("    function openCreate() {\n");
      out.write("        id = 0;\n");
      out.write("        location.href = 'Edit';\n");
      out.write("    }\n");
      out.write("    function openEdit() {\n");
      out.write("        if (id === 0) {\n");
      out.write("            location.href = 'Edit';\n");
      out.write("        } else {\n");
      out.write("            location.href = 'Edit/' + id;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("        function getrow(value) {\n");
      out.write("            id = value;\n");
      out.write("        //console.log(id);\n");
      out.write("    }\n");
      out.write("    $(function () {\n");
      out.write("\n");
      out.write("        //$(\"#table_yard\").colResizable({\n");
      out.write("        //    liveDrag: true,\n");
      out.write("        //    gripInnerHtml: \"<div class='grip'></div>\",\n");
      out.write("        //    draggingClass: \"dragging\",\n");
      out.write("        //    resizeMode: 'overflow'\n");
      out.write("        //});\n");
      out.write("        $('#table_yard tbody tr').click(function (e) {\n");
      out.write("            console.log(\"sdsd\");\n");
      out.write("            $('#table_yard tbody tr').removeClass('success');\n");
      out.write("            $(this).addClass('success');\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("        //Attach change eventhandler\n");
      out.write("        $('#dtpDate').on('change.bfh-datepicker', function(e) {\n");
      out.write("            //Assign the value to Hidden Variable\n");
      out.write("            console.log($('#dtpDate').val());\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<div class=\"container-fluid\" style=\"padding: 0px;\">\n");
      out.write("    <div class=\"row\" style=\"padding: 0px;\">\n");
      out.write("        <div class=\"col-md-3\" style=\"\" ng-style=\"\">\n");
      out.write("             ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <div style=\"background-color: #C1C1C1; height: 40px\">\n");
      out.write("                <h4 style=\"color: white; font-weight: bold; border-bottom: 1px solid #dedede; background-color: #36ace2; float: none; padding: 9px 20px 10px; line-height: 30px; text-transform: uppercase\">Thông Tin Tài Khoản</h4>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"padding: 20px; text-transform: uppercase\">\n");
      out.write("                <div class=\"clearfix list-group\" style=\"display: block; list-style-type: square;\">\n");
      out.write("                    <a class=\"list-group-item col-md-12 col-xs-12\" href=\"infopersonal.jsp\">Thông tin cá nhân</a>\n");
      out.write("                    <a class=\"list-group-item col-md-12 col-xs-12\" href=\"infoPersonalBook.jsp\">Sân đã đặt của bạn</a>\n");
      out.write("                    ");
if (true)
                    {
      out.write("\n");
      out.write("\n");
      out.write("                        <a class=\"list-group-item col-md-12 col-xs-12\" href=\"bookyard.jsp\">Quản lý sân bãi đã đặt</a>\n");
      out.write("                       ");
 if (true)
                        {
      out.write("\n");
      out.write("                            <a class=\"list-group-item col-md-12 col-xs-12\" href=\"manageyard.jsp\">Quản lý sân bãi</a>\n");
      out.write("                            <a class=\"list-group-item col-md-12 col-xs-12\" href=\"managebill.jsp\">Quản lý hóa đơn</a>\n");
      out.write("                            <a class=\"list-group-item col-md-12 col-xs-12\" href=\"customer.jsp\">Quản lý tài khoản khách hàng</a>\n");
      out.write("                            <a class=\"list-group-item col-md-12 col-xs-12\" href=\"staff.jsp\">Quản lý tài khoản nhân viên</a>\n");
      out.write("                       ");
 }
                    }
      out.write("\n");
      out.write("\n");
      out.write("                    <a class=\"list-group-item col-md-12 col-xs-12\" href=\"home.jsp\">Trở vể trang chính</a>\n");
      out.write("                </div>\n");
      out.write("            </div>");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-9\" style=\"height: 100%;\">\n");
      out.write("            <div>\n");
      out.write("                <div style=\"background-color: #C1C1C1; margin-bottom: 20px; height: 40px\">\n");
      out.write("                    <h4 style=\"color: white; text-transform: uppercase; font-weight: bold; border-bottom: 1px solid #dedede;\n");
      out.write("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  background-color: #36ace2; float: none; padding: 9px 20px 10px; line-height: 30px\">\n");
      out.write("                       Quản lý sân bóng\n");
      out.write("                    </h4>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"panel panel-default\" style=\"min-height: 350px\">\n");
      out.write("                        <div class=\"panel-heading\">Danh sách sân bóng</div>\n");
      out.write("                        <div class=\"panel-body\" style=\"overflow: auto;white-space: nowrap;max-height: 4000px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <table class=\"table\" width=\"100%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" id=\"table_yard\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr class=\"table_yard info\">\n");
      out.write("                                        <th>Mã sân <a href=\"#\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                        <th>Tên sân <a href=\"#\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                        <th>Loại sân <a href=\"#\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                        <th>Tình trạng <a href=\"#\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                        <th>Giá cả <a href=\"#\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");
 
                                        Yard yard = new Yard();
                                    for(Yard item : yard.getAll()){
                                        
      out.write("\n");
      out.write("                                  \n");
      out.write("                                        <tr class=\"table_bookyard\" onclick=\"getrow('");
      out.print(item.getIDYard());
      out.write("')\">\n");
      out.write("                                            <td>");
      out.print(item.getIDYard());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getNameYard());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getTypeYard());
      out.write(" người</td>\n");
      out.write("                                            <td>");
      out.print(item.getStatus());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getPrice());
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                   ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                            <div>\n");
      out.write("                                <button class=\"btn btn-danger\" style=\"float: right; margin-left: 20px\">Xóa</button>\n");
      out.write("                                <button class=\"btn btn-warning\" style=\"float: right; margin-left: 20px\"\n");
      out.write("                                        onclick=\"openEdit()\">\n");
      out.write("                                    Sửa\n");
      out.write("                                </button>\n");
      out.write("                                <button class=\"btn btn-primary\" style=\"float: right; margin-left: 20px\"\n");
      out.write("                                        onclick=\"openCreate()\">\n");
      out.write("                                    Thêm\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
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
