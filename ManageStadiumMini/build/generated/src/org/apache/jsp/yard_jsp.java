package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dut.stadium.model.Account;
import com.dut.stadium.util.MSSQLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Date;
import com.dut.stadium.model.TimeSlot;
import com.dut.stadium.model.YardView;

public final class yard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("        <link href=\"css/bootstrap-formhelpers.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"script/bootstrap-formhelpers.min.js\"></script>\n");
      out.write("        ");

            YardView Model = new YardView();
            Model = Model.getID(request.getParameter("id"));
            if(session.getAttribute("userid")!=null){
                 Account account = new Account();
                 account = account.getByID(session.getAttribute("userid").toString());
                 Model.Account = account;
            }
           
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function changeTimeSlot() {\n");
      out.write("                //     console.log($('#IDTimeSlot').val());\n");
      out.write("                if ($('#IDTimeSlot').val() > 12) {\n");
      out.write("                    $('#Price').val('");
      out.print(Model.Yard.getPrice() + 40000);
      out.write("');\n");
      out.write("                } else {\n");
      out.write("                    $('#Price').val('");
      out.print(Model.Yard.getPrice());
      out.write("');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function changeDateBook() {\n");
      out.write("                //   console.log(new Date($('#DateBook').val()));\n");
      out.write("                $.ajax({\n");
      out.write("                    type: \"GET\",\n");
      out.write("                    url: 'getTimeSlot.do?id=");
      out.print(Model.Yard.getIDYard());
      out.write("&date=' + $('#DateBook').val(),\n");
      out.write("                    contentType: \"application/json; charset=utf-8\",\n");
      out.write("                    success: function (data) {\n");
      out.write("                      console.log(data);\n");
      out.write("                        var s = \"<option>--Chọn khung giờ--</option>\";\n");
      out.write("                        for (var i = 0; i < data.length; i++) {\n");
      out.write("                            s += '<option value = \"' + data[i].IDTimeSlot + '\">' + data[i].TimeSlot + '</option>';\n");
      out.write("                        }\n");
      out.write("                        $('#IDTimeSlot').html(s);\n");
      out.write("                        //window.location.href = '/Home/';\n");
      out.write("                    }, error: function () {\n");
      out.write("                        alert('Some error occured');\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            function changeCalendar(date) {\n");
      out.write("                console.log(date);\n");
      out.write("                $.ajax({\n");
      out.write("                    type: \"GET\",\n");
      out.write("                    url: 'getCalendar.do?id=");
      out.print(Model.Yard.getIDYard());
      out.write("&date=' + date,\n");
      out.write("                    contentType: \"application/json; charset=utf-8\",\n");
      out.write("                    success: function (data) {\n");
      out.write("                        //alert('success');\n");
      out.write("                        console.log(data);\n");
      out.write("                        var s = \"\";\n");
      out.write("                        for (var i = 0; i < data.length; i++) {\n");
      out.write("                            s += ' <tr class=\"\">';\n");
      out.write("                            s += '  <td>");
      out.print(Model.Yard.getNameYard());
      out.write("</td>';\n");
      out.write("                            s += '  <td>' + (data[i].TotalPrice + ");
      out.print(Model.Yard.getPrice());
      out.write(") + '</td>';\n");
      out.write("                            s += '  <td>' + data[i].DateBook + '</td>';\n");
      out.write("                            s += '  <td>' + data[i].Timeslot + '</td>';\n");
      out.write("                            s += '  <td>Đã đặt sân</td>';\n");
      out.write("                            s += '  </tr>';\n");
      out.write("                        }\n");
      out.write("                        $('#table_calendar').html(s);\n");
      out.write("                        //window.location.href = '/Home/';\n");
      out.write("                    }, error: function () {\n");
      out.write("                        alert('Some error occured');\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function EmailExisted(email) {\n");
      out.write("                console.log(email);\n");
      out.write("                $.ajax({\n");
      out.write("                    type: \"GET\",\n");
      out.write("                    url: 'EmailExisted.do?email=' + email,\n");
      out.write("                    contentType: \"application/json; charset=utf-8\",\n");
      out.write("                    success: function (data) {\n");
      out.write("                        console.log(data)\n");
      out.write("                        if (data == \"True\") {\n");
      out.write("                            $('#submit').prop('disabled', 'disabled');\n");
      out.write("                            swal(\"Thông báo\", \"Email đã tồn tại mời bạn đăng nhập\", \"error\");\n");
      out.write("                            return true;\n");
      out.write("                        }\n");
      out.write("                         $('#submit').prop('disabled', false);\n");
      out.write("                        return false;\n");
      out.write("                    }, error: function () {\n");
      out.write("                        swal(\"Thông báo\", \"Đã có lỗi xảy ra\", \"error\");\n");
      out.write("                        return true;\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                //return true;\n");
      out.write("            }\n");
      out.write("            console.log($('#IDTimeSlot').val());\n");
      out.write("            function bookyard() {\n");
      out.write("                var test = true;\n");
      out.write("            ");
 if (session.getAttribute("userid") != null) {
      out.write("\n");
      out.write("                test = false\n");
      out.write("            ");
} else {
      out.write("\n");
      out.write("                test = EmailExisted($('#Email').val());\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                console.log(test);\n");
      out.write("                if (test !== true) {\n");
      out.write("                    console.log($('#IDTimeSlot').val());\n");
      out.write("                    var data;\n");
      out.write("                    var ListIDService = \"1\";\n");
      out.write("                    data = JSON.stringify({\n");
      out.write("                        \n");
      out.write("                            \"IDYard\": \"");
      out.print(Model.Yard.getIDYard());
      out.write("\",\n");
      out.write("                            \"DateBook\": new Date($('#DateBook').val()),\n");
      out.write("                            \"IDTimeSlot\": $('#IDTimeSlot').val(),\n");
      out.write("                            \"Contents\": $('#Contents').val(),\n");
      out.write("                            \"ListIDService\": ListIDService,\n");
      out.write("                            \"Address\": $('#Address').val(),\n");
      out.write("                            \"NameAccount\": $('#NameAccount').val(),\n");
      out.write("                            \"Phone\": $('#Phone').val(),\n");
      out.write("                            \"Email\": $('#Email').val()\n");
      out.write("                      \n");
      out.write("\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("                    console.log(data);\n");
      out.write("                    $.ajax({\n");
      out.write("                        type: \"POST\",\n");
      out.write("                        url: 'BookYard.do',\n");
      out.write("                        contentType: \"application/json; charset=utf-8\",\n");
      out.write("                        data:data,\n");
      out.write("                        success: function (result) {\n");
      out.write("                            swal({\n");
      out.write("                                title: 'Thông báo',\n");
      out.write("                                text: \"Bạn đã đặt sân thành công\",\n");
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
      out.write("                                window.location.href = \"yard.jsp?id=");
      out.print(Model.Yard.getIDYard());
      out.write("\";\n");
      out.write("                            });\n");
      out.write("                            // alert('success');\n");
      out.write("                            //window.location.href = '/Home/';\n");
      out.write("                        }, error: function () {\n");
      out.write("                            swal(\"Thông báo\", \"Đặt sân thất bại! Vui lòng thử lại\", \"error\");\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div id=\"myCarousel\" class=\"carousel\">\n");
      out.write("\n");
      out.write("                        <div class=\"item loginmodal-container\">\n");
      out.write("                            <div style=\"width: 100%; position: relative\">\n");
      out.write("                                <img src=\"");
      out.print(Model.Yard.getImage());
      out.write("\" class=\"img-responsive\" style=\"width: 100%\" alt=\"Image\">\n");
      out.write("                                <h2 style=\"position: absolute; bottom: 0px; margin-bottom: 0px; margin-right: 30px;\n");
      out.write("                                    padding-left: 20px; background: rgba(42, 40, 40, 0.69); color: white; width: 100%\">\n");
      out.write("                                    Sân ");
      out.print(Model.Yard.getTypeYard());
      out.write(" người - ");
      out.print(Model.Yard.getNameYard());
      out.write("\n");
      out.write("                                </h2>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"loginmodal-container\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <legend>Thông tin sân bóng</legend>\n");
      out.write("                            <ul class=\"clearfix\" style=\"display: block; list-style-type: square;\">\n");
      out.write("                                <li class=\"col-md-6 col-xs-12\"><p>Tình trạng: Đang hoạt động</p></li>\n");
      out.write("                                <li class=\"col-md-6 col-xs-12\"><p>Loại sân: Cỏ nhân tạo</p></li>\n");
      out.write("                                <li class=\"col-md-12 col-xs-12\"><p>Giá: ");
      out.print(Model.Yard.getPrice());
      out.write(" vnđ/giờ (Sau 17h30 thêm 40000 vnđ/giờ tiền đèn chiếu sáng)</p></li>\n");
      out.write("                                <li class=\"col-md-6 col-xs-12\"><p>Quận/Huyện: Liên Chiểu</p></li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </fieldset>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"loginmodal-container\">\n");
      out.write("                        <div class=\"panel panel-default\" style=\"min-height: 350px\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h4>Lịch sân bóng</h4>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div id=\"dtpDate\" style=\"height: 40px;width: 30%; font-size: 16px; float: left;\" data-min=\"today\" class=\"bfh-datepicker\" data-format=\"d-m-y\" data-date=\"today\"></div>\n");
      out.write("                                <table class=\"table\" width=\"100%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" id=\"table_account\">\n");
      out.write("                                    <thead>\n");
      out.write("\n");
      out.write("                                        <tr class=\"table_account info\">\n");
      out.write("\n");
      out.write("                                            <th>Sân bóng<a onclick=\"sort('name')\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                            <th>Giá tiền<a onclick=\"sort('birth')\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                            <th>Ngày<a onclick=\"sort('address')\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                            <th>Khung giờ<a onclick=\"sort('tel')\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                            <th>Đã đặt<a onclick=\"sort('email')\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody id=\"table_calendar\">\n");
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("\n");
      out.write("                                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"loginmodal-container\">\n");
      out.write("                        <fieldset>\n");
      out.write("\n");
      out.write("                            <!-- Form Name -->\n");
      out.write("                            <legend>Thông tin liên hệ đặt sân</legend>\n");
      out.write("                            <div>\n");
      out.write("                                <span><b>Chủ sân: Trần Văn A</b></span><br>\n");
      out.write("                                <span><b>Liên hệ: 01222222222</b></span><br>\n");
      out.write("                                <span><b>Địa chỉ: 54 Nguyễn Lương Bằng</b></span><br>\n");
      out.write("                                <span><b>Email: tranvana88@gmail.com</b></span>\n");
      out.write("                            </div>\n");
      out.write("                            <hr>\n");
      out.write("                            <div class=\"form-horizontal\">\n");
      out.write("\n");
      out.write("                                <!-- Text input-->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-4 control-label\" for=\"name\">Họ và tên</label>\n");
      out.write("                                    <div class=\"col-md-8\">\n");
      out.write("                                        <input id=\"NameAccount\" name=\"name\"\n");
      out.write("                                               type=\"text\" placeholder=\"Họ và tên\"\n");
      out.write("                                               class=\"form-control input-md\" required value=\"");
if (Model.Account != null) {
                                                       out.print(Model.Account.getNameAccount());
                                                       ;
                                                   }
      out.write("\">\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Text input-->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-4 control-label\" for=\"phone\" style=\"white-space: nowrap\">Số điện thoại</label>\n");
      out.write("                                    <div class=\"col-md-8\">\n");
      out.write("                                        <input id=\"Phone\" name=\"phone\" type=\"tel\" placeholder=\"Số điện thoại\" class=\"form-control input-md\" required=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Text input-->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-4 control-label\" for=\"add\">Địa chỉ</label>\n");
      out.write("                                    <div class=\"col-md-8\">\n");
      out.write("                                        <input id=\"Address\" name=\"add\" type=\"text\" placeholder=\"Địa chỉ\" class=\"form-control input-md\" required=\"\">\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Text input-->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-4 control-label\" for=\"email\">Email</label>\n");
      out.write("                                    <div class=\"col-md-8\">\n");
      out.write("                                        <input id=\"Email\" name=\"email\" type=\"email\" placeholder=\"Email\" onblur=\"EmailExisted(this.value)\" class=\"form-control input-md\" required=\"\">\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Select Basic -->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-4 control-label\" for=\"selecttime\">Khung giờ</label>\n");
      out.write("                                    <div class=\"col-md-8\">\n");
      out.write("                                        <select id=\"IDTimeSlot\" name=\"selecttime\" class=\"form-control input-md\" onchange=\" changeTimeSlot()\">\n");
      out.write("                                            <option>--Chọn khung giờ--</option>\n");
      out.write("                                            ");
for (TimeSlot item : Model.ListTimeslot) {
      out.write("\n");
      out.write("                                            <option value=\"");
      out.print(item.getIDTimeSlot());
      out.write('"');
      out.write('>');
      out.print(item.getTimeSlot());
      out.write("</option>\n");
      out.write("                                            ");
}
      out.write("\n");
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\">Ngày đặt: </label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <input type=\"date\" class=\"form-control\" id=\"DateBook\" onblur=\"changeDateBook()\" value=\"");
 SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd");
                                            out.print(sdfr.format(new Date()));
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Text input-->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-4 control-label\" for=\"ln\">Giá</label>\n");
      out.write("                                    <div class=\"col-md-8\">\n");
      out.write("                                        <input name=\"amount\" readonly type=\"number\" placeholder=\"\" class=\"form-control input-md\" required id=\"Price\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-4 control-label\" for=\"ln\">Nội dung</label>\n");
      out.write("                                    <div class=\"col-md-8\">\n");
      out.write("                                        <textarea id=\"Contents\" style=\"width: 100%;\"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Button -->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-4 control-label\" for=\"submit\"></label>\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <button id=\"submit\" name=\"submit\" class=\"btn btn-primary\" onclick=\" bookyard()\">Đặt sân</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </fieldset>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                changeDateBook();\n");
      out.write("                changeCalendar($('#dtpDate').val());\n");
      out.write("            ");

                    if (Model.Account != null) {
      out.write("\n");
      out.write("                $('#Address').prop('readonly', true);\n");
      out.write("                $('#NameAccount').prop('readonly', true);\n");
      out.write("                $('#Phone').prop('readonly', true);\n");
      out.write("                $('#Email').prop('readonly', true);\n");
      out.write("                $('#Address').val('");
      out.print(Model.Account.getAddress());
      out.write("');\n");
      out.write("                $('#Phone').val('");
      out.print(Model.Account.getPhone());
      out.write("');\n");
      out.write("                $('#Email').val('");
      out.print(Model.Account.getEmail());
      out.write("');\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("                $('#dtpDate').on('change.bfhdatepicker', function (e) {\n");
      out.write("                    //Assign the value to Hidden Variable\n");
      out.write("                    changeCalendar($('#dtpDate').val());\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
