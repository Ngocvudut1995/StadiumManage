<%-- 
    Document   : navAccount
    Created on : Apr 26, 2017, 9:39:53 PM
    Author     : VuDang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <div style="background-color: #C1C1C1; height: 40px">
                <h4 style="color: white; font-weight: bold; border-bottom: 1px solid #dedede; background-color: #36ace2; float: none; padding: 9px 20px 10px; line-height: 30px; text-transform: uppercase">Thông Tin Tài Khoản</h4>
            </div>
            <div style="padding: 20px; text-transform: uppercase">
                <div class="clearfix list-group" style="display: block; list-style-type: square;">
                    <a class="list-group-item col-md-12 col-xs-12" href="infopersonal.jsp">Thông tin cá nhân</a>
                    <a class="list-group-item col-md-12 col-xs-12" href="infoPersonalBook.jsp">Sân đã đặt của bạn</a>
                    <%if (true)
                    {%>

                        <a class="list-group-item col-md-12 col-xs-12" href="bookyard.jsp">Quản lý sân bãi đã đặt</a>
                       <% if (true)
                        {%>
                            <a class="list-group-item col-md-12 col-xs-12" href="manageyard.jsp">Quản lý sân bãi</a>
                            <a class="list-group-item col-md-12 col-xs-12" href="managebill.jsp">Quản lý hóa đơn</a>
                            <a class="list-group-item col-md-12 col-xs-12" href="customer.jsp">Quản lý tài khoản khách hàng</a>
                            <a class="list-group-item col-md-12 col-xs-12" href="staff.jsp">Quản lý tài khoản nhân viên</a>
                       <% }
                    }%>

                    <a class="list-group-item col-md-12 col-xs-12" href="home.jsp">Trở vể trang chính</a>
                </div>
            </div>