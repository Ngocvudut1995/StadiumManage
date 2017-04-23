<%-- 
    Document   : managebill
    Created on : Apr 5, 2017, 7:13:32 PM
    Author     : VuDang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
 <link href="css/font-awesome.min.css" rel="stylesheet"/>
           <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="script/jquery-1.11.3.min.js" type="text/javascript"></script>
        <script src="script/bootstrap.min.js" type="text/javascript"></script>
        <script src="script/colResizable-1.6.min.js" type="text/javascript"></script>
        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
      
    </head>
    <body>
        
@model IEnumerable<StadiumManage.Models.Yard>
@{
    ViewBag.Title = "Manage Yard";
}
<script type="text/javascript" charset="utf8" src="~/Scripts/colResizable-1.6.min.js"></script>
<link href="~/Content/bootstrap-formhelpers.min.css" rel="stylesheet" />
<script src="~/Scripts/bootstrap-formhelpers.min.js"></script>
<script type="text/javascript">
    var id = 0;
    function openCreate() {
        id = 0;
        location.href = 'Edit';
    }
    function openEdit() {
        if (id === 0) {
            location.href = 'Edit';
        } else {
            location.href = 'Edit/' + id;
        }
    }
        function getrow(value) {
            id = value;
        //console.log(id);
    }
    $(function () {

        //$("#table_yard").colResizable({
        //    liveDrag: true,
        //    gripInnerHtml: "<div class='grip'></div>",
        //    draggingClass: "dragging",
        //    resizeMode: 'overflow'
        //});
        $('#table_yard tbody tr').click(function (e) {
            console.log("sdsd");
            $('#table_yard tbody tr').removeClass('success');
            $(this).addClass('success');
        });
    });
</script>
<script>
    $(document).ready(function() {
        //Attach change eventhandler
        $('#dtpDate').on('change.bfh-datepicker', function(e) {
            //Assign the value to Hidden Variable
            console.log($('#dtpDate').val());
        });
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
                    <a class="list-group-item col-md-12 col-xs-12" href="">Sân đã đặt của bạn</a>
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
                       Quản lý sân bóng
                    </h4>
                </div>

                <div class="col-md-12">
                    <div class="panel panel-default" style="min-height: 350px">
                        <div class="panel-heading">Danh sách sân bóng</div>
                        <div class="panel-body" style="overflow: auto;white-space: nowrap;max-height: 4000px;">


                            <table class="table" width="100%" border="1" cellpadding="0" cellspacing="0" id="table_yard">
                                <thead>
                                    <tr class="table_yard info">
                                        <th>Mã sân <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Tên sân <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Loại sân <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Tình trạng <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Giá cả <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>

                                    </tr>
                                </thead>
                                <tbody>
                                    @foreach (var item in Model)
                                    {
                                        <tr class="table_bookyard" onclick="getrow('@item.IDYard')">
                                            <td>@item.IDYard</td>
                                            <td>@item.NameYard</td>
                                            <td>@item.TypeYard</td>
                                            <td>@item.Status</td>
                                            <td>@item.Price</td>
                                        </tr>
                                    }

                                </tbody>

                            </table>
                            <div>
                                <button class="btn btn-danger" style="float: right; margin-left: 20px">Xóa</button>
                                <button class="btn btn-warning" style="float: right; margin-left: 20px"
                                        onclick="openEdit()">
                                    Sửa
                                </button>
                                <button class="btn btn-primary" style="float: right; margin-left: 20px"
                                        onclick="openCreate()">
                                    Thêm
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>
