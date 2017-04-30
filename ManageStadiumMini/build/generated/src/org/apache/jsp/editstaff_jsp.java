package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dut.stadium.model.AccountStaff;

public final class editstaff_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write(" \n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write(" <script src=\"script/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"css/sweetalert2.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <script src=\"script/sweetalert2.min.js\"></script>\n");
      out.write("    <script src=\"script/jquery.validate.min.js\"></script>\n");
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
          
                     if (session.getAttribute("userid")== null)

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
      out.write("                        <li><a href=\"infopersonal.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Xin Chào ");
      out.print(session.getAttribute("userid"));
      out.write("</a></li>\n");
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
      out.write("        ");

            AccountStaff Model = new AccountStaff();
            Model = Model.getByID(request.getParameter("id"));
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            format_date_picker = function (date) {\n");
      out.write("                var today = new Date(date);\n");
      out.write("                var dd = today.getDate();\n");
      out.write("                var mm = today.getMonth() + 1;\n");
      out.write("                var yyyy = today.getFullYear();\n");
      out.write("                if (dd < '10') {\n");
      out.write("                    dd = '0' + dd;\n");
      out.write("                }\n");
      out.write("                if (mm < '10') {\n");
      out.write("                    mm = '0' + mm;\n");
      out.write("                }\n");
      out.write("                var format = yyyy + '-' + mm + '-' + dd;\n");
      out.write("\n");
      out.write("                // console.log(format);\n");
      out.write("                return format;\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            function update_staff() {\n");
      out.write("\n");
      out.write("                var data = JSON.stringify({\n");
      out.write("                    \"Position\": $('#Position').prop('selectedIndex') == 0 ? 'Manager' : 'Employee',\n");
      out.write("                    \"Salary\": $('#Salary').val(),\n");
      out.write("\n");
      out.write("                    \"IDAccount\": $('#IDAccount').val(),\n");
      out.write("                    \"Birthday\": $('#Birthday').val(),\n");
      out.write("                    \"Address\": $('#Address').val(),\n");
      out.write("                    \"NameAccount\": $('#NameAccount').val(),\n");
      out.write("                    \"Identification\": $('#Identification').val(),\n");
      out.write("                    \"Phone\": $('#Phone').val(),\n");
      out.write("                    \"Email\": $('#Email').val()\n");
      out.write("\n");
      out.write("                });\n");
      out.write("                console.log(data);\n");
      out.write("                $.ajax({\n");
      out.write("                    type: \"POST\",\n");
      out.write("                    url: 'UpdateStaff.do',\n");
      out.write("                    contentType: \"application/json; charset=utf-8\",\n");
      out.write("                    data: data,\n");
      out.write("                    success: function (result) {\n");
      out.write("                        console.log(result)\n");
      out.write("                        if (result == 'True') {\n");
      out.write("                            swal({\n");
      out.write("                                title: 'Thông báo',\n");
      out.write("                                text: \"Bạn đã chỉnh sửa thành công\",\n");
      out.write("                                type: 'success',\n");
      out.write("                                //showCancelButton: true,\n");
      out.write("                                confirmButtonColor: '#3085d6',\n");
      out.write("                                //cancelButtonColor: '#d33',\n");
      out.write("                                confirmButtonText: 'OK!',\n");
      out.write("                                //cancelButtonText: 'No, cancel!',\n");
      out.write("                                confirmButtonClass: 'btn btn-success',\n");
      out.write("                                //cancelButtonClass: 'btn btn-danger',\n");
      out.write("                                //buttonsStyling: false\n");
      out.write("                            }).then(function () {\n");
      out.write("                                window.location.href = 'staff.jsp';\n");
      out.write("                            }\n");
      out.write("                            );\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("\n");
      out.write("                    },\n");
      out.write("                    error: function () {\n");
      out.write("                        //alert('Some error occured');\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            $('#form_edit').on('submit', function () {\n");
      out.write("                console.log('sdsd');\n");
      out.write("                update_staff();\n");
      out.write("            });\n");
      out.write("            $(document).ready(function () {\n");
      out.write("\n");
      out.write("                //Attach change eventhandler\n");
      out.write("                var positon = '");
      out.print(Model.getPosition());
      out.write("';\n");
      out.write("                console.log(positon);\n");
      out.write("\n");
      out.write("                if (positon == 'Employee') {\n");
      out.write("                    $(\"#Position\").prop('selectedIndex', 1);\n");
      out.write("                } else if (positon == 'Manager') {\n");
      out.write("                    $(\"#Position\").prop('selectedIndex', 0);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\" style=\"padding: 0px;\">\n");
      out.write("            <div class=\"row\" style=\"padding: 0px;\">\n");
      out.write("                <div class=\"col-md-3\" style=\"\" ng-style=\"\">\n");
      out.write("                    ");
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
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9\" style=\"height: 100%;\">\n");
      out.write("                    <div>\n");
      out.write("\n");
      out.write("                        <div style=\"background-color: #C1C1C1; margin-bottom: 20px; height: 40px\">\n");
      out.write("                            <h4 style=\"color: white; text-transform: uppercase; font-weight: bold; border-bottom: 1px solid #dedede;\n");
      out.write("                                background-color: #36ace2; float: none; padding: 9px 20px 10px; line-height: 30px\">\n");
      out.write("                                Chỉnh sửa thông tin tài khoản nhân viên\n");
      out.write("                            </h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-2\"></div>\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <div class=\"panel panel-default\">\n");
      out.write("                                <div class=\"panel-heading\" style=\"font-weight: bold\">Thông tin tài khoản</div>\n");
      out.write("                                <div class=\"panel-body form-horizontal\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <input type=\"hidden\" id=\"IDAccount\" value=\"");
      out.print(Model.account.getIDAccount());
      out.write("\" />\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label col-sm-4\">Tên tài khoản:</label>\n");
      out.write("                                        <div class=\"col-sm-8\">\n");
      out.write("\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"NameAccount\" value=\"");
      out.print(Model.account.getNameAccount());
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label col-sm-4\">Ngày sinh:</label>\n");
      out.write("                                        <div class=\"col-sm-8\">\n");
      out.write("\n");
      out.write("                                            <input type=\"date\" class=\"form-control\" id=\"Birthday\" value=\"");
      out.print(Model.account.getBirthday());
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label col-sm-4\">Địa chỉ:</label>\n");
      out.write("                                        <div class=\"col-sm-8\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"Address\" value=\"");
      out.print(Model.account.getAddress());
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label col-sm-4\">CMND:</label>\n");
      out.write("                                        <div class=\"col-sm-8\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"Identification\" value=\"");
      out.print(Model.account.getIdentification());
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label col-sm-4\">Số điện thoại:</label>\n");
      out.write("                                        <div class=\"col-sm-8\">\n");
      out.write("                                            <input type=\"tel\" class=\"form-control\" id=\"Phone\" value=\"");
      out.print(Model.account.getPhone());
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label col-sm-4\">Email: </label>\n");
      out.write("                                        <div class=\"col-sm-8\">\n");
      out.write("                                            <input type=\"email\" class=\"form-control\" id=\"Email\" value=\"");
      out.print(Model.account.getEmail());
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label col-sm-4\">Thời gian đăng kí:</label>\n");
      out.write("                                        <div class=\"col-sm-8\">\n");
      out.write("                                            <input readonly type=\"date\" class=\"form-control\" id=\"CreatedDay\" value=\"");
      out.print(Model.account.getCreatedDay());
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label col-sm-4\">Chức vụ: </label>\n");
      out.write("                                        <div class=\"col-sm-8\">\n");
      out.write("                                            <select class=\"form-control\" id=\"Position\" id=\"Position\">\n");
      out.write("                                                <option>Quản lý</option>\n");
      out.write("                                                <option>Nhân viên</option>\n");
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label col-sm-4\">Lương:</label>\n");
      out.write("                                        <div class=\"col-sm-8\">\n");
      out.write("                                            <input type=\"number\" id=\"Salary\" class=\"form-control\" value=\"");
      out.print(Model.getSalary());
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\" style=\"text-align: center;\">\n");
      out.write("                                        <button style=\"margin-top: 20px\" class=\"btn btn-primary\" onclick=\"update_staff()\">Lưu</button>\n");
      out.write("                                        <input style=\"margin-top: 20px\" class=\"btn btn-danger\" type=\"reset\" value=\"Hủy\" />\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
