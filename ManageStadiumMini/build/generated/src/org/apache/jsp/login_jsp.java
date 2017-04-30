package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("  ");
      out.write(" \n");
      out.write("<link href=\"../css/Site.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write(" <script src=\"../script/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../script/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"../css/sweetalert2.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"../script/sweetalert2.min.js\"></script>\n");
      out.write("        <script src=\"../script/jquery.validate.min.js\"></script>\n");
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
      out.write("<style>\n");
      out.write("    label.error {\n");
      out.write("        display: inline-block;\n");
      out.write("        color: red;\n");
      out.write("        width: 200px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function login() {\n");
      out.write("        data = JSON.stringify({\n");
      out.write("\n");
      out.write("            \"Email\": ($('#Email').val()),\n");
      out.write("            \"Password\": $('#Password').val()\n");
      out.write("        });\n");
      out.write("        console.log(data);\n");
      out.write("        $.ajax({\n");
      out.write("            type: \"POST\",\n");
      out.write("            url: 'login.do',\n");
      out.write("            contentType: \"application/json; charset=utf-8\",\n");
      out.write("            data: data,\n");
      out.write("            success: function (data) {\n");
      out.write("                //alert('success');\n");
      out.write("                if (data == 'True') {\n");
      out.write("                    swal({\n");
      out.write("                        title: 'Thông báo',\n");
      out.write("                        text: \"Bạn đã đăng nhập thành công\",\n");
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
      out.write("                        window.location.href = \"home.jsp\";\n");
      out.write("                    }\n");
      out.write("                 );\n");
      out.write("                   \n");
      out.write("                } else {\n");
      out.write("                    swal(\"Thông báo\", \"Đăng nhập thất bại! Vui lòng thử lại!\", \"error\");\n");
      out.write("                }\n");
      out.write("                //return data.result;\n");
      out.write("\n");
      out.write("                //window.location.href = '/Home/';\n");
      out.write("            }, error: function () {\n");
      out.write("                //window.location.href = \"login.jsp\";\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-3\"></div>\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <h2 class=\"well\" align=\"center\">Thông tin đăng nhập</h2><br>\n");
      out.write("                <form id=\"form_login\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"email\">Email address:</label>\n");
      out.write("                        <input style=\"width: 100%\" type=\"email\" class=\"form-control\" name=\"Email\" id=\"Email\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"pwd\">Password:</label>\n");
      out.write("                        <input style=\"width: 100%\" type=\"password\" name=\"Password\" class=\"form-control\" id=\"Password\" required>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                    <div style=\"text-align: center\">\n");
      out.write("                        <button id=\"btn_submit\" class=\"btn btn-info\" onclick=\"login()\">Login</button>\n");
      out.write("                        <button type=\"reset\" class=\"btn btn-info\" onclick=\"document.getElementById('form_login').reset()\">Cancel</button>\n");
      out.write("                    </div>\n");
      out.write("              \n");
      out.write("                \n");
      out.write("               \n");
      out.write("               \n");
      out.write("\n");
      out.write("                <!-- <div class=\"login-help\">\n");
      out.write("            <a href=\"#\">Register</a> - <a href=\"#\">Forgot Password</a>\n");
      out.write("        </div> -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $('#btn_submit').prop('disabled', 'disabled');\n");
      out.write("        //Khi bàn phím được nhấn và thả ra thì sẽ chạy phương thức này\n");
      out.write("        $(\"#form_login\").validate({\n");
      out.write("            onfocusout: function (element) {\n");
      out.write("                this.element(element);\n");
      out.write("            },\n");
      out.write("            rules: {\n");
      out.write("                \n");
      out.write("                Email: {\n");
      out.write("                    required: true,\n");
      out.write("                    email: true\n");
      out.write("                },\n");
      out.write("                Password: {\n");
      out.write("                    required: true\n");
      out.write("                }\n");
      out.write("               \n");
      out.write("\n");
      out.write("            },\n");
      out.write("            messages: {\n");
      out.write("                \n");
      out.write("                Email: {\n");
      out.write("                    required: \"Vui lòng nhập email\",\n");
      out.write("                    email: \"Vui lòng nhập đúng định dạng email\"\n");
      out.write("                },\n");
      out.write("                Password: {\n");
      out.write("                    required: \"Vui lòng nhập Mật khẩu\"\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("        $('#form_login input').on('keyup blur', function () { // fires on every keyup & blur\n");
      out.write("            if ($('#form_login').valid()) {                   // checks form for validity\n");
      out.write("                $('#btn_submit').prop('disabled', false);        // enables button\n");
      out.write("            } else {\n");
      out.write("                $('#btn_submit').prop('disabled', 'disabled');   // disables button\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
