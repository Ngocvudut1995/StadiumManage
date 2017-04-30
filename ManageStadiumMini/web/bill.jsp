<%-- 
    Document   : bill
    Created on : Apr 5, 2017, 6:41:43 PM
    Author     : VuDang
--%>

<%@ page import="java.sql.*,java.util.*" %>
<%@page import="com.dut.stadium.model.BillDetail"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="script/jquery-1.11.3.min.js" type="text/javascript"></script>
        <script src="script/bootstrap.min.js" type="text/javascript"></script>
    </head>
    <body>
          <%@include file="include/header.jsp" %>
    
<script>

    $(document).ready(function() {
        var price = (1 - @Model.Bill.Promotion) * (@Model.Bill.PriceYard + @Model.Bill.PriceService);
        console.log(price);
        $('#total_price').html(price + ' vnđ');
        var status = '@Model.Bill.Status';
        if (status == 'True') {
            $("#Status").prop('selectedIndex', 1);
        } else if (status == 'False') {
            $("#Status").prop('selectedIndex', 0);
        }

    });

</script>
	
	<% 
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
	%>

<div class="container-fluid" style="padding: 0px;">
    <div class="row" style="padding: 0px;">
        <div class="col-md-3" style="" ng-style="">
          <%@include file="include/navAccount.jsp" %>
        </div>
        <div class="col-md-9" style="height: 100%;">
            <div>
             
                <div style="background-color: #C1C1C1; margin-bottom: 20px; height: 40px">
                    <h4 style="color: white; text-transform: uppercase; font-weight: bold; border-bottom: 1px solid #dedede;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  background-color: #36ace2; float: none; padding: 9px 20px 10px; line-height: 30px">
                        Chi phí hóa đơn
                    </h4>
                </div>
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <div class="panel panel-default">
                        <div class="panel-heading">Chi tiết chi phí hóa đơn</div>
                        <div class="panel-body">
                        
                            <form action="bill2.jsp" method="post">
                            
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Khách Hàng:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe"><% out.print(tenKH); %></label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Số ĐT:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe"><% out.print(soDT); %></label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Địa chỉ:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe"><% out.print(diaChi); %></label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Email:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe"><% out.print(email); %></label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Mã sân:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe"><% out.print(maSan); %></label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Tên sân:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe"><% out.print(tenSan); %></label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Loại sân:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe"><% out.print(loaiSan); %> người</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Khung giờ:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe"><% out.print(khungGio); %></label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Giá sân:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe"><% out.print(giaSan); %> vnđ</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Dịch vụ:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe"><% out.print(giaDV); %> vnđ</label>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="control-label col-sm-4">Khuyến mãi:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe"><% out.print(khuyenMai); %> %</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Tổng tiền:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe" id="total_price"><% out.print(tongTien); %></label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Tình trạng:</label>
                                    <div class="col-sm-8">
                                        <select class="form-control" id="Status">
                                            <option><% out.print(trangThai1); %></option>
                                            <option><% out.print(trangThai2); %></option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group" style="text-align: center;">                              	
									<input style="margin-top: 20px" class="btn btn-primary" type="submit" value="Thanh toán" />
									<input type="hidden" name="maHD" value="<% out.print(maHD); %>">
                                    <input style="margin-top: 20px" class="btn btn-info" type="button" value="Xuất hóa đơn" />
                                </div>
                                
                            </form>
                            
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
</div>

	

    </body>
</html>
