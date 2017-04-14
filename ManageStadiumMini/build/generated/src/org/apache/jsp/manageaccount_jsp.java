package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manageaccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\"/>\n");
      out.write("           <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"script/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/colResizable-1.6.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap-formhelpers.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"script/bootstrap-formhelpers.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function getrow(id) {\n");
      out.write("                console.log(id);\n");
      out.write("            }\n");
      out.write("            $(function () {\n");
      out.write("\n");
      out.write("                $(\"#table_bill\").colResizable({\n");
      out.write("                    liveDrag: true,\n");
      out.write("                    gripInnerHtml: \"<div class='grip'></div>\",\n");
      out.write("                    draggingClass: \"dragging\",\n");
      out.write("                    resizeMode: 'overflow'\n");
      out.write("                });\n");
      out.write("                $('#table_bill tbody tr').click(function (e) {\n");
      out.write("                    console.log(\"sdsd\");\n");
      out.write("                    $('#table_bill tbody tr').removeClass('highlighted');\n");
      out.write("                    $(this).addClass('highlighted');\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                //Attach change eventhandler\n");
      out.write("                $('#dtpDate').on('change.bfhdatepicker', function (e) {\n");
      out.write("                    //Assign the value to Hidden Variable\n");
      out.write("                    console.log($('#dtpDate').val());\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("         <style>\n");
      out.write("            .table_bill > th,td {\n");
      out.write("                padding-left: 10px;\n");
      out.write("                padding-right: 10px;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("            .highlighted {\n");
      out.write("                background-color: red;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 style=\"text-align: center;\">Quản lý tài khoản</h1>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\">Quản lý tài khoản</div>\n");
      out.write("                    <div class=\"panel-body\" >\n");
      out.write("                        <div style=\"width: 100%;height: 45px\">\n");
      out.write("                            <div id=\"dtpDate\" style=\"width: 30%;float: right;\"class=\"bfh-datepicker\" data-format=\"d-m-y\" data-date=\"today\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <table style=\"overflow: scroll;white-space: nowrap;max-height: 4000px;\" class=\"table\" width=\"100%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" id=\"table_bill\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr class=\"table_bill\">\n");
      out.write("                                    <th>Mã tài khoản<a href=\"#\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                    <th>Tên tài khoản<a href=\"#\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                    <th>Ngày sinh<a href=\"#\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                    <th>Địa chỉ<a href=\"#\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                    <th>Số điện thoại<a href=\"#\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                    <th>Email<a href=\"#\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                    <th>CMND<a href=\"#\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                    <th>Thời gian đăng kí<a href=\"#\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                    <th>Phân quyền<a href=\"#\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                    <th>Tiền lương<a href=\"#\"><i class=\"fa fa-sort\" aria-hidden=\"true\"></i></a></th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr class=\"table_bookyard\" ondblclick=\"getrow(1)\">\n");
      out.write("                                    <td>TK1001</td>\n");
      out.write("                                    <td>Đặng Ngọc Vũ</td>\n");
      out.write("                                    <td>29/04/1995</td>\n");
      out.write("                                    <td>140 Hoàng Diệu</td>\n");
      out.write("                                    <td>01266555022</td>\n");
      out.write("                                    <td>ngocvudut1995@gmail.com</td>\n");
      out.write("                                    <td>201694551</td>\n");
      out.write("                                    <td>01/01/2017</td>\n");
      out.write("                                    <td>Nhân viên</td>\n");
      out.write("                                    <td>4500000</td>\n");
      out.write("                                </tr>\n");
      out.write("                              <tr class=\"table_bookyard\" ondblclick=\"getrow(1)\">\n");
      out.write("                                    <td>TK1001</td>\n");
      out.write("                                    <td>Đặng Ngọc Vũ</td>\n");
      out.write("                                    <td>29/04/1995</td>\n");
      out.write("                                    <td>140 Hoàng Diệu</td>\n");
      out.write("                                    <td>01266555022</td>\n");
      out.write("                                    <td>ngocvudut1995@gmail.com</td>\n");
      out.write("                                    <td>201694551</td>\n");
      out.write("                                    <td>01/01/2017</td>\n");
      out.write("                                    <td>Nhân viên</td>\n");
      out.write("                                    <td>4500000</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"table_bookyard\" ondblclick=\"getrow(1)\">\n");
      out.write("                                    <td>TK1001</td>\n");
      out.write("                                    <td>Đặng Ngọc Vũ</td>\n");
      out.write("                                    <td>29/04/1995</td>\n");
      out.write("                                    <td>140 Hoàng Diệu</td>\n");
      out.write("                                    <td>01266555022</td>\n");
      out.write("                                    <td>ngocvudut1995@gmail.com</td>\n");
      out.write("                                    <td>201694551</td>\n");
      out.write("                                    <td>01/01/2017</td>\n");
      out.write("                                    <td>Nhân viên</td>\n");
      out.write("                                    <td>4500000</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <button class=\"btn btn-default\" style=\"float: right; margin-left: 20px\">Xóa</button>\n");
      out.write("                          <button class=\"btn btn-default\" style=\"float: right;margin-left: 20px\">Sửa</button>\n");
      out.write("                            <button class=\"btn btn-default\" style=\"float: right;margin-left: 20px\">Thêm</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
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
