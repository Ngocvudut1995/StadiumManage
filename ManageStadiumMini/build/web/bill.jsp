<%-- 
    Document   : bill
    Created on : Apr 5, 2017, 6:41:43 PM
    Author     : VuDang
--%>

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
      @model StadiumManage.Models.BillDetail
@{
    ViewBag.Title = "Index";
}
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
<div class="container-fluid" style="padding: 0px;">
    <div class="row" style="padding: 0px;">
        <div class="col-md-3" style="" ng-style="">
            <div style="background-color: #C1C1C1; height: 40px">
                <h4 style="color: white; font-weight: bold; border-bottom: 1px solid #dedede; background-color: #36ace2; float: none; padding: 9px 20px 10px; line-height: 30px; text-transform: uppercase">Thông Tin Tài Khoản</h4>
            </div>
            <div style="padding: 20px; text-transform: uppercase">
                <div class="clearfix list-group" style="display: block; list-style-type: square;">
                    <a class="list-group-item col-md-12 col-xs-12" href="">Thông tin cá nhân</a>
                    <a class="list-group-item col-md-12 col-xs-12" href="/Accounts/InforPersonalBook">Sân đã đặt của bạn</a>
                    @if (Convert.ToInt16(Session["Role"].ToString()) < 3)
                    {

                        <a class="list-group-item col-md-12 col-xs-12" href="/BookYard">Quản lý sân bãi đã đặt</a>
                        if (Convert.ToInt16(Session["Role"].ToString()) < 2)
                        {
                            <a class="list-group-item col-md-12 col-xs-12" href="/Yard/Manage">Quản lý sân bãi</a>
                            <a class="list-group-item col-md-12 col-xs-12" href="/Bill/Manage">Quản lý hóa đơn</a>
                            <a class="list-group-item col-md-12 col-xs-12" href="/Accounts/Customer">Quản lý tài khoản khách hàng</a>
                            <a class="list-group-item col-md-12 col-xs-12" href="/Accounts/Staff">Quản lý tài khoản nhân viên</a>
                        }


                    }

                    @*<div class="list-group-item col-md-12 col-xs-12 dropdown" style="padding: 0px;">
                            <button class="list-group-item btn btn-lg dropdown-toggle" type="button" data-toggle="dropdown"
                                    style="font-size: 14px; text-transform: uppercase; text-align: left; width: 100%">
                                Quản lý tài khoản<span class="glyphicon glyphicon-list" style="float: right"></span>
                            </button>
                            <ul class="dropdown-menu dropdown-menu-right" role="menu">

                                <li role="presentation"><a role="menuitem" tabindex="-1" href="/Accounts/Customer">Quản lý tài khoản khách hàng</a></li>
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="/Accounts/Staff">Quản Lý tài khoản nhân viên</a></li>



                            </ul>


                        </div>*@
                    <a class="list-group-item col-md-12 col-xs-12">Trở vể trang chính</a>
                </div>
            </div>
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
                            <form>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Khách Hàng:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe">@Model.AccountCustomer.NameAccount</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Số ĐT:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe">@Model.AccountCustomer.Phone</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Địa chỉ:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe">@Model.AccountCustomer.Address</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Email:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe">@Model.AccountCustomer.Email</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Mã sân:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe">@Model.Bill.IDYard</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Tên sân:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe">@Model.Yard.NameYard</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Loại sân:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe">@Model.Yard.TypeYard người</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Khung giờ:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe">@Model.TimeSlot</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Giá sân:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe">@Model.Bill.PriceYard vnđ</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Dịch vụ:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe">@Model.Bill.PriceService vnđ</label>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="control-label col-sm-4">Khuyến mãi:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe">@Model.Bill.Promotion %</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Tổng tiền:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe" id="total_price"></label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Tình trạng:</label>
                                    <div class="col-sm-8">
                                        <select class="form-control" id="Status">
                                            <option>Chưa thanh toán</option>
                                            <option>Đã thanh toán</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group" style="text-align: center;">
                                    @*<input style="margin-top: 20px" class="btn btn-primary" type="button" value="Thanh toán" />*@
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
