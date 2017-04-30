package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import com.dut.stadium.model.BillDetail;

public final class bill_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          ");
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
      out.write("    \n");
      out.write("<script>\n");
      out.write("\n");
      out.write("    $(document).ready(function() {\n");
      out.write("        var price = (1 - @Model.Bill.Promotion) * (@Model.Bill.PriceYard + @Model.Bill.PriceService);\n");
      out.write("        console.log(price);\n");
      out.write("        $('#total_price').html(price + ' vnđ');\n");
      out.write("        var status = '@Model.Bill.Status';\n");
      out.write("        if (status == 'True') {\n");
      out.write("            $(\"#Status\").prop('selectedIndex', 1);\n");
      out.write("        } else if (status == 'False') {\n");
      out.write("            $(\"#Status\").prop('selectedIndex', 0);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\t\n");
      out.write("\t");
 
		String maHD = request.getParameter("idBill");
		String tenKH = "";
		String soDT = "";
		String diaChi = "";
		String email = "";
		String maSan = "";
		String tenSan = "";
		String loaiSan = "";
		String khungGio = "";
		String giaSan = "";
		String giaDV = "";
		String khuyenMai = ""; 
		String tongTien = "";
		String trangThai1 = "";
		String trangThai2 = "";
		try {
			BillDetail bill_deDetail = new BillDetail();
			for(BillDetail item:bill_deDetail.getAll())
			{
				if(item.Bill.getIDBill().equals(maHD)){
					double price = (1 - item.Bill.getPromotion()) * (item.Bill.getPriceService() + item.Bill.getPriceYard());
					tenKH = item.AccountCustomer.getNameAccount();
					soDT = item.AccountCustomer.getPhone();
					diaChi = item.AccountCustomer.getAddress();
					email = item.AccountCustomer.getEmail();
					maSan = item.Bill.getIDYard();
					tenSan = item.Yard.getNameYard();
					loaiSan = item.Yard.getTypeYard();
					khungGio = item.TimeSlot;
					giaSan = item.Bill.getPriceYard() + "";
					giaDV = item.Bill.getPriceService() + "";
					khuyenMai = item.Bill.getPromotion() + "";
					tongTien = price + "";
					if(item.Bill.isStatus()){
						trangThai1 = "Đã thanh toán";
						trangThai2 = "Chưa thanh toán";
					}
					else{
						trangThai1 = "Chưa thanh toán";
						trangThai2 = "Đã thanh toán";
					}
				}
			}
		}
		catch(Exception ex){
			
		}
	
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\" style=\"padding: 0px;\">\n");
      out.write("    <div class=\"row\" style=\"padding: 0px;\">\n");
      out.write("        <div class=\"col-md-3\" style=\"\" ng-style=\"\">\n");
      out.write("          ");
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
if (Integer.parseInt(session.getAttribute("role").toString()) < 3)
                    {
      out.write("\n");
      out.write("\n");
      out.write("                        <a class=\"list-group-item col-md-12 col-xs-12\" href=\"bookyard.jsp\">Quản lý sân bãi đã đặt</a>\n");
      out.write("                       ");
 if (Integer.parseInt(session.getAttribute("role").toString()) < 2)
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
      out.write("             \n");
      out.write("                <div style=\"background-color: #C1C1C1; margin-bottom: 20px; height: 40px\">\n");
      out.write("                    <h4 style=\"color: white; text-transform: uppercase; font-weight: bold; border-bottom: 1px solid #dedede;\n");
      out.write("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  background-color: #36ace2; float: none; padding: 9px 20px 10px; line-height: 30px\">\n");
      out.write("                        Chi phí hóa đơn\n");
      out.write("                    </h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\"></div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">Chi tiết chi phí hóa đơn</div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                        \n");
      out.write("                            <form action=\"bill2.jsp\" method=\"post\">\n");
      out.write("                            \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\">Khách Hàng:</label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <label class=\"control-labe\">");
 out.print(tenKH); 
      out.write("</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\">Số ĐT:</label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <label class=\"control-labe\">");
 out.print(soDT); 
      out.write("</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\">Địa chỉ:</label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <label class=\"control-labe\">");
 out.print(diaChi); 
      out.write("</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\">Email:</label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <label class=\"control-labe\">");
 out.print(email); 
      out.write("</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\">Mã sân:</label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <label class=\"control-labe\">");
 out.print(maSan); 
      out.write("</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\">Tên sân:</label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <label class=\"control-labe\">");
 out.print(tenSan); 
      out.write("</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\">Loại sân:</label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <label class=\"control-labe\">");
 out.print(loaiSan); 
      out.write(" người</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\">Khung giờ:</label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <label class=\"control-labe\">");
 out.print(khungGio); 
      out.write("</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\">Giá sân:</label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <label class=\"control-labe\">");
 out.print(giaSan); 
      out.write(" vnđ</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\">Dịch vụ:</label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <label class=\"control-labe\">");
 out.print(giaDV); 
      out.write(" vnđ</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\">Khuyến mãi:</label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <label class=\"control-labe\">");
 out.print(khuyenMai); 
      out.write(" %</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\">Tổng tiền:</label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <label class=\"control-labe\" id=\"total_price\">");
 out.print(tongTien); 
      out.write("</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\">Tình trạng:</label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <select class=\"form-control\" id=\"Status\">\n");
      out.write("                                            <option>");
 out.print(trangThai1); 
      out.write("</option>\n");
      out.write("                                            <option>");
 out.print(trangThai2); 
      out.write("</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\" style=\"text-align: center;\">                              \t\n");
      out.write("\t\t\t\t\t\t\t\t\t<input style=\"margin-top: 20px\" class=\"btn btn-primary\" type=\"submit\" value=\"Thanh toán\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"maHD\" value=\"");
 out.print(maHD); 
      out.write("\">\n");
      out.write("                                    <input style=\"margin-top: 20px\" class=\"btn btn-info\" type=\"button\" value=\"Xuất hóa đơn\" />\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </form>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t\n");
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
