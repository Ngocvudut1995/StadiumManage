package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dut.stadium.model.Yard;

public final class edityard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");
      out.write(" \n");
      out.write("<link href=\"css/Site.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write(" <script src=\"script/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/sweetalert2.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"script/sweetalert2.min.js\"></script>\n");
      out.write("        <script src=\"script/jquery.validate.min.js\"></script>\n");
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
      out.print(session.getAttribute("name"));
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
      out.write("\n");
      out.write(" <script src=\"tinymce/js/tinymce/jquery.tinymce.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"tinymce/js/tinymce/tinymce.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script>tinymce.init({selector: 'textarea'});</script>\n");

    String id = request.getParameter("id");
      Yard Model = new Yard();
      String Insert;
    if(id != null){
      
        Model = Model.getByID(id);
        Insert = "edit";
    }else{
        Model.setIDYard(Model.getIDTuTang());
        Model.setStatus("activiting");
        Model.setTypeYard("5");
        Model.setPrice(150000);
         Model.setNameYard("");
        Model.setDecription("");
         Insert = "add";
    }

      out.write("\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("        //Attach change eventhandler\n");
      out.write("\n");
      out.write("        var status = '");
      out.print(Model.getStatus());
      out.write("';\n");
      out.write("        var type = '");
      out.print(Model.getTypeYard());
      out.write("';\n");
      out.write("        console.log(status + \",\" + type);\n");
      out.write("\n");
      out.write("        if (status == 'activiting') {\n");
      out.write("            $(\"#Status\").prop('selectedIndex', 0);\n");
      out.write("        } else if (status == 'reparing') {\n");
      out.write("            $(\"#Status\").prop('selectedIndex', 1);\n");
      out.write("        }\n");
      out.write("        if (type == '5') {\n");
      out.write("            $(\"#TypeYard\").prop('selectedIndex', 0);\n");
      out.write("        } else if (type == '7') {\n");
      out.write("            $(\"#TypeYard\").prop('selectedIndex', 1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("\n");
      out.write("               \n");
      out.write("\n");
      out.write("    function upload() {\n");
      out.write("        //console.log(\"sdasdad\");\n");
      out.write("        var formData = new FormData();\n");
      out.write("        var totalFiles = document.getElementById(\"FileUpload\").files.length;\n");
      out.write("        for (var i = 0; i < totalFiles; i++) {\n");
      out.write("            var file = document.getElementById(\"FileUpload\").files[i];\n");
      out.write("\n");
      out.write("            formData.append(\"FileUpload\", file);\n");
      out.write("        }\n");
      out.write("        console.log(FormData);\n");
      out.write("        $.ajax({\n");
      out.write("                        url: 'uploadfile.do',\n");
      out.write("                        type: 'POST',\n");
      out.write("                        data: formData,\n");
      out.write("                        cache: false,\n");
      out.write("                        dataType: 'json',\n");
      out.write("                        processData: false,\n");
      out.write("                        contentType: false,\n");
      out.write("                        success: function (response) {\n");
      out.write("                            console.log(response);\n");
      out.write("                            //alert(response);\n");
      out.write("                            if (response.toString().lastIndexOf('true') > -1){\n");
      out.write("                                //sohinh = response.toString().split(',');\n");
      out.write("                                alert(\"Upload Successful\");\n");
      out.write("                            }\n");
      out.write("                            else if (response.toString() == 'false') {\n");
      out.write("                                alert(\"Upload error\");\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        error: function (response) {\n");
      out.write("                            alert('ERRORS: ');\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("//        $.ajax({\n");
      out.write("//            type: \"POST\",\n");
      out.write("//            url: 'uploadfile.do?id=");
      out.print(Model.getIDYard());
      out.write("',\n");
      out.write("//            data: formData,\n");
      out.write("//            dataType: 'json',\n");
      out.write("//            contentType: \"multipart/form-data\",\n");
      out.write("//            processData: false,\n");
      out.write("//            success: function(response) {\n");
      out.write("//                swal({\n");
      out.write("//                    title: 'Thông báo',\n");
      out.write("//                    text: \"Bạn đã chỉnh sửa thành công\",\n");
      out.write("//                    type: 'success',\n");
      out.write("//                    //showCancelButton: true,\n");
      out.write("//                    confirmButtonColor: '#3085d6',\n");
      out.write("//                    //cancelButtonColor: '#d33',\n");
      out.write("//                    confirmButtonText: 'OK!',\n");
      out.write("//                    //cancelButtonText: 'No, cancel!',\n");
      out.write("//                    confirmButtonClass: 'btn btn-success',\n");
      out.write("//                    //cancelButtonClass: 'btn btn-danger',\n");
      out.write("//                    //buttonsStyling: false\n");
      out.write("//                }).then(function() {\n");
      out.write("//                        window.location.href = \"/manageyard.jsp\";\n");
      out.write("//                    }\n");
      out.write("//                );\n");
      out.write("//                // alert('succes!!');\n");
      out.write("//            },\n");
      out.write("//            error: function(error) {\n");
      out.write("//                swal(\"Thông báo\", \"Cập nhật thất bại! Vui lòng thử lại!\", \"error\");\n");
      out.write("//            }\n");
      out.write("//        });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function updateYard() {\n");
      out.write("        console.log((tinyMCE.get('Decription').getContent()));\n");
      out.write("        var data = JSON.stringify({\n");
      out.write("            \"IDYard\": $('#IDYard').val(),\n");
      out.write("            \"NameYard\": $('#NameYard').val(),\n");
      out.write("            \"Status\": $(\"#Status\").prop('selectedIndex') == 0 ? 'activiting' : 'reparing',\n");
      out.write("            \"TypeYard\": $(\"#TypeYard\").prop('selectedIndex') == 0 ? '5' : '7',\n");
      out.write("            \"Price\": $('#Price').val(),\n");
      out.write("            \"Decription\": tinyMCE.get('Decription').getContent()\n");
      out.write("        });\n");
      out.write("        console.log(data);\n");
      out.write("        $.ajax({\n");
      out.write("            type: \"POST\",\n");
      out.write("            url: '");
      out.print(Insert);
      out.write("Yard.do',\n");
      out.write("            contentType: \"application/json; charset=utf-8\",\n");
      out.write("            data: data,\n");
      out.write("            success: function(data) {\n");
      out.write("                //alert('success');\n");
      out.write("                console.log(data.result);\n");
      out.write("                if (data == \"False\") {\n");
      out.write("                    swal(\"Thông báo\", \"Đã xảy ra lỗi thêm thất bại!\", \"error\");\n");
      out.write("                } else {\n");
      out.write("                   upload();\n");
      out.write("                }\n");
      out.write("             \n");
      out.write("                //window.location.href = '/Accounts/Customer';\n");
      out.write("            },\n");
      out.write("            error: function() {\n");
      out.write("                //alert('Some error occured');\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<div class=\"container-fluid\" style=\"padding: 0px;\">\n");
      out.write("    <div class=\"row\" style=\"padding: 0px;\">\n");
      out.write("        <div class=\"col-md-3\" style=\"\" ng-style=\"\">\n");
      out.write("           ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"background-color: #C1C1C1; height: 40px\">\n");
      out.write("    <h4 style=\"color: white; font-weight: bold; border-bottom: 1px solid #dedede; background-color: #36ace2; float: none; padding: 9px 20px 10px; line-height: 30px; text-transform: uppercase\">Thông Tin Tài Khoản</h4>\n");
      out.write("</div>\n");
      out.write("<div style=\"padding: 20px; text-transform: uppercase\">\n");
      out.write("    <div class=\"clearfix list-group\" style=\"display: block; list-style-type: square;\">\n");
      out.write("        <a class=\"list-group-item col-md-12 col-xs-12\" href=\"infopersonal.jsp\">Thông tin cá nhân</a>\n");
      out.write("        <a class=\"list-group-item col-md-12 col-xs-12\" href=\"infoPersonalBook.jsp\">Sân đã đặt của bạn</a>\n");
      out.write("        ");
  if (session.getAttribute("role") != null) {
                            if (Integer.parseInt(session.getAttribute("role").toString()) < 3) {
      out.write("\n");
      out.write("\n");
      out.write("        <a class=\"list-group-item col-md-12 col-xs-12\" href=\"bookyard.jsp\">Quản lý sân bãi đã đặt</a>\n");
      out.write("        ");
 if (Integer.parseInt(session.getAttribute("role").toString()) < 2) {
      out.write("\n");
      out.write("        <a class=\"list-group-item col-md-12 col-xs-12\" href=\"manageyard.jsp\">Quản lý sân bãi</a>\n");
      out.write("        <a class=\"list-group-item col-md-12 col-xs-12\" href=\"managebill.jsp\">Quản lý hóa đơn</a>\n");
      out.write("        <a class=\"list-group-item col-md-12 col-xs-12\" href=\"customer.jsp\">Quản lý tài khoản khách hàng</a>\n");
      out.write("        <a class=\"list-group-item col-md-12 col-xs-12\" href=\"staff.jsp\">Quản lý tài khoản nhân viên</a>\n");
      out.write("        ");
 }
                               }
                           }
      out.write("\n");
      out.write("\n");
      out.write("        <a class=\"list-group-item col-md-12 col-xs-12\" href=\"home.jsp\">Trở vể trang chính</a>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-9\" style=\"height: 100%;\">\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <div style=\"background-color: #C1C1C1; margin-bottom: 20px; height: 40px\">\n");
      out.write("                    <h4 style=\"color: white; text-transform: uppercase; font-weight: bold; border-bottom: 1px solid #dedede;\n");
      out.write("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  background-color: #36ace2; float: none; padding: 9px 20px 10px; line-height: 30px\">\n");
      out.write("                        Chỉnh sửa thông tin sân bóng\n");
      out.write("                    </h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\"></div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\"><b>Thông tin sân bóng</b></div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\">Mã sân:</label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"IDYard\" value=\"");
      out.print(Model.getIDYard());
      out.write("\" readonly />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\">Tên sân:</label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"NameYard\" value=\"");
      out.print(Model.getNameYard());
      out.write("\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\">Loại sân:</label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <select class=\"form-control\" id=\"TypeYard\">\n");
      out.write("                                        <option>5 người</option>\n");
      out.write("                                        <option>7 người</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\">Tình trạng:</label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <select class=\"form-control\" id=\"Status\">\n");
      out.write("                                        <option>Đang hoạt động</option>\n");
      out.write("                                        <option>Đang sửa chữa</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\">Hình ảnh:</label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <input type=\"file\" class=\"form-control\" id=\"FileUpload\" multiple />\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\">Giá:</label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <input class=\"form-control\" type=\"number\" id=\"Price\" value=\"");
      out.print(Model.getPrice());
      out.write("\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\">Mô tả</label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <textarea id=\"Decription\">");
      out.print(Model.getDecription());
      out.write("</textarea>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\" style=\"text-align: center;\">\n");
      out.write("                                <button style=\"margin-top: 20px\" class=\"btn btn-primary\" onclick=\"updateYard()\">Lưu</button>\n");
      out.write("                                <button style=\"margin-top: 20px\" class=\"btn btn-warning\" onclick=\"reset_form()\">Reset</button>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
