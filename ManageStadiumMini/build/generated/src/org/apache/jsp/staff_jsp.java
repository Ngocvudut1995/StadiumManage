package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dut.stadium.model.AccountStaff;

public final class staff_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("  ");
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
      out.write("<link href=\"css/bootstrap-formhelpers.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"script/bootstrap-formhelpers.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var id = null;\n");
      out.write("    function deleteStaff() {\n");
      out.write("        swal({\n");
      out.write("            title: 'Thông Báo?',\n");
      out.write("            text: \"Bạn muốn xóa tài khoản đang chọn!\",\n");
      out.write("            type: 'warning',\n");
      out.write("            showCancelButton: true,\n");
      out.write("            confirmButtonColor: '#3085d6',\n");
      out.write("            cancelButtonColor: '#d33',\n");
      out.write("            confirmButtonText: 'Yes!'\n");
      out.write("        }).then(function () {\n");
      out.write("            $.ajax({\n");
      out.write("                type: \"POST\",\n");
      out.write("                url: '/DeleteStaff?id=' + id,\n");
      out.write("                dataType: 'json',\n");
      out.write("                contentType: false,\n");
      out.write("                processData: false,\n");
      out.write("                success: function (response) {\n");
      out.write("                    swal({\n");
      out.write("                        title: 'Thông báo',\n");
      out.write("                        text: \"Bạn đã xóa thành công\",\n");
      out.write("                        type: 'success',\n");
      out.write("                        //showCancelButton: true,\n");
      out.write("                        confirmButtonColor: '#3085d6',\n");
      out.write("                        //cancelButtonColor: '#d33',\n");
      out.write("                        confirmButtonText: 'OK!',\n");
      out.write("                        //cancelButtonText: 'No, cancel!',\n");
      out.write("                        confirmButtonClass: 'btn btn-success',\n");
      out.write("                        //cancelButtonClass: 'btn btn-danger',\n");
      out.write("                        //buttonsStyling: false\n");
      out.write("                    }).then(function () {\n");
      out.write("                        window.location.href = \"staff.jsp\";\n");
      out.write("                    }\n");
      out.write("                     );\n");
      out.write("                    // alert('succes!!');\n");
      out.write("                },\n");
      out.write("                error: function (error) {\n");
      out.write("                    swal(\"Thông báo\", \"Đăng nhập thất bại! Vui lòng thử lại!\", \"error\");\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("    function openCreate() {\n");
      out.write("\n");
      out.write("        window.location.href = '/addAccount.jsp';\n");
      out.write("    }\n");
      out.write("    var CurrentSort = '@ViewBag.CurrentSort';\n");
      out.write("    function sort(sortOrder) {\n");
      out.write("\n");
      out.write("        if (CurrentSort.lastIndexOf(\"_\") > 0) {\n");
      out.write("            location.href = 'staff.jsp?sortOrder=' + sortOrder;\n");
      out.write("        } else {\n");
      out.write("            location.href = 'staff.jsp?sortOrder=' + sortOrder + \"_desc\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    function openEdit() {\n");
      out.write("        if (id != null) {\n");
      out.write("            location.href = 'editstaff.jsp?id=' + id;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function getrow(value) {\n");
      out.write("        id = value;\n");
      out.write("        //console.log(id);\n");
      out.write("    }\n");
      out.write("    $(function () {\n");
      out.write("\n");
      out.write("      \n");
      out.write("        $('#table_account tbody tr').click(function (e) {\n");
      out.write("            //console.log(\"sdsd\");\n");
      out.write("            $('#table_account tbody tr').removeClass('success');\n");
      out.write("            $(this).addClass('success');\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<div class=\"container-fluid\" style=\"padding: 0px;\">\n");
      out.write("    <div class=\"row\" style=\"padding: 0px;\">\n");
      out.write("        <div class=\"col-md-3\" style=\"\" ng-style=\"\">\n");
      out.write("            ");
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
      out.write("              \n");
      out.write("                <div style=\"background-color: #C1C1C1; margin-bottom: 20px; height: 40px\">\n");
      out.write("                    <h4 style=\"color: white; text-transform: uppercase; font-weight: bold; border-bottom: 1px solid #dedede;\n");
      out.write("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  background-color: #36ace2; float: none; padding: 9px 20px 10px; line-height: 30px\">\n");
      out.write("                        Quản lý tài khoản nhân viên\n");
      out.write("                    </h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"panel panel-default\" style=\"min-height: 350px\">\n");
      out.write("                        <div class=\"panel-heading\">Danh sách tài khoản nhân viên</div>\n");
      out.write("                        <div class=\"panel-body\" style=\"overflow: auto; white-space: nowrap; max-height: 4000px;\">\n");
      out.write("                          \n");
      out.write("                            <div style=\"overflow: auto; white-space: nowrap; max-height: 4000px;\">\n");
      out.write("                                <table class=\"table\" width=\"100%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" id=\"table_account\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr class=\"table_account info\">\n");
      out.write("\n");
      out.write("                                            <th>Tên tài khoản<a onclick=\" sort('name') \"> <i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                            <th>Ngày sinh<a onclick=\" sort('birth') \"> <i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                            <th>Địa chỉ<a onclick=\" sort('address') \"> <i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                            <th>Số điện thoại<a onclick=\" sort('tel') \"> <i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                            <th>Email<a onclick=\" sort('email') \"> <i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                            <th>CMND<a onclick=\" sort('id') \"> <i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                            <th>Thời gian đăng kí<a onclick=\" sort('create') \"> <i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                            <th>Chức vụ<a onclick=\" sort('pos') \"> <i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                            <th>Tiền lương<a onclick=\" sort('salary') \"> <i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
 
                                            AccountStaff accountStaff = new AccountStaff();
                                        for (AccountStaff item : accountStaff.getAll())
                                        {
      out.write("\n");
      out.write("                                            <tr onclick=\"getrow('");
      out.print(item.account.getIDAccount());
      out.write("')\">\n");
      out.write("\n");
      out.write("                                                <td>");
      out.print(item.account.getNameAccount());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(item.account.getBirthday());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(item.account.getAddress());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(item.account.getPhone());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(item.account.getEmail());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(item.account.getIdentification());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(item.account.getCreatedDay());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(item.getPosition());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(item.getSalary());
      out.write("</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <button class=\"btn btn-danger\" style=\"float: right; margin-left: 20px\"\n");
      out.write("                                        onclick=\"deleteStaff()\">\n");
      out.write("                                    Xóa\n");
      out.write("                                </button>\n");
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
      out.write("<input id=\"tdate\" type=\"text\" class=\"form-control\" data-provide=\"datepicker\">\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        //Attach change eventhandler\n");
      out.write("       // console.log($('#dtpDate').val() + 'sdsd');\n");
      out.write("\n");
      out.write("        //$('#dtpDate').on('show.bfhdatepicker', function(e) {\n");
      out.write("        //    //Assign the value to Hidden Variable\n");
      out.write("        //    $('#hdnSelectedDate').val($('#dtpDate').val());\n");
      out.write("        //    console.log($('#dtpDate').val() + 'sdsd');\n");
      out.write("        //});\n");
      out.write("       \n");
      out.write("    });\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
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
