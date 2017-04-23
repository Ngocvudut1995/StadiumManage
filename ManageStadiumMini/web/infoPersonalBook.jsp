<%-- 
    Document   : infoPersonalBook
    Created on : Apr 23, 2017, 6:40:36 PM
    Author     : VuDang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       @using WebGrease
@model IEnumerable<StadiumManage.Models.BookYardDetail>
@{
    ViewBag.Title = "InforPersonalBook";
}
<link href="~/Content/bootstrap-formhelpers.min.css" rel="stylesheet" />
<script src="~/Scripts/bootstrap-formhelpers.min.js"></script>
<script>
    var idbookSelect = '';
    function cancelBook() {
        swal({
            title: 'Thông Báo?',
            text: "Bạn muốn hủy lần đặt sân này!",
            type: 'warning',
            showCancelButton: true,
            confirmButtonColor: '#3085d6',
            cancelButtonColor: '#d33',
            confirmButtonText: 'Yes!'
        }).then(function () {
            $.ajax({
                type: "POST",
                url: '/BookYard/Delete?id=' + idbookSelect,
                dataType: 'json',
                contentType: false,
                processData: false,
                success: function (response) {
                    swal({
                        title: 'Thông báo',
                        text: "Bạn đã hủy thành công",
                        type: 'success',
                        //showCancelButton: true,
                        confirmButtonColor: '#3085d6',
                        //cancelButtonColor: '#d33',
                        confirmButtonText: 'OK!',
                        //cancelButtonText: 'No, cancel!',
                        confirmButtonClass: 'btn btn-success',
                        //cancelButtonClass: 'btn btn-danger',
                        //buttonsStyling: false
                    }).then(function () {
                        window.location.href = "/Accounts/InforPersonalBook";
                    }
                     );
                    // alert('succes!!');
                },
                error: function (error) {
                    swal("Thông báo", "Đăng nhập thất bại! Vui lòng thử lại!", "error");
                }
            });
        });
    }
    function popupInfo(IDBook,NameYard,Timeslot,TypeYard,TotalPrice,DateBook,Status,ListIDService) {
        // console.log("sdsd");
        idbookSelect = IDBook;
        $('#NameYard').html(NameYard);
        $('#TypeYard').html(TypeYard);
        $('#TimeSlot').html(Timeslot);
        $('#Price').html(TotalPrice);
        $('#DateBook').html(DateBook);
        if (Status == "False") {
            $('#Status').html("Chưa thanh toán");
        } else {
            $('#Status').html("Đã thành toán");
        }
        var parts =DateBook.split('/');
        //please put attention to the month (parts[0]), Javascript counts months from 0:
        // January - 0, February - 1, etc
        var datebook = new Date(parts[2], parts[1] - 1, parts[0]);
        
        var today = new Date();
        console.log(datebook + "-" + today);
        if (datebook.getTime() < today.getTime()) {
            console.log("disable");
            $('#cancelBook').prop("disabled", true);

        } else {
            console.log("abled")
            $('#cancelBook').prop("disabled", false);
        }
        var split = ListIDService.split(',');
        for (var i = 0; i < split.length; i++) {
            if (split[i] === '1') {
                $('#RentWater').prop('checked', true);
            } else (split[i] === '2')
            {
                $('#RentLight').prop('checked', true);
            }
        }
        $('#my-modal').modal('show');

        //var data = $(this).serializeObject();
        //json_data = JSON.stringify(data);
        //$("#results").text(json_data);
        //$(".modal-body").text(json_data);

        //// $("#results").text(data);

        //ev.preventDefault();
    }
</script>
<div class="container-fluid" style="padding: 0px;">
    <div class="row" style="padding: 0px;">
        <div class="col-md-3" style="" ng-style="">
            <div style="background-color: #C1C1C1; height: 40px">
                <h4 style="color: white; font-weight: bold; border-bottom: 1px solid #dedede; background-color: #36ace2; float: none; padding: 9px 20px 10px; line-height: 30px; text-transform: uppercase">Thông Tin Tài Khoản</h4>
            </div>
            <div style="padding: 20px; text-transform: uppercase">
                <div class="clearfix list-group" style="display: block; list-style-type: square;">
                    <a class="list-group-item col-md-12 col-xs-12" href="/Accounts/InforPersonalBook">Thông tin cá nhân</a>
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


                    }@*<div class="list-group-item col-md-12 col-xs-12 dropdown" style="padding: 0px;">
                            <button class="list-group-item btn btn-lg dropdown-toggle" type="button" data-toggle="dropdown"
                                    style="font-size: 14px; text-transform: uppercase; text-align: left; width: 100%">
                                Quản lý tài khoản<span class="glyphicon glyphicon-list" style="float: right"></span>
                            </button>
                            <ul class="dropdown-menu dropdown-menu-right" role="menu">

                                <li role="presentation"><a role="menuitem" tabindex="-1" href="/Accounts/Customer">Quản lý tài khoản khách hàng</a></li>
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="/Accounts/Staff">Quản Lý tài khoản nhân viên</a></li>



                            </ul>


                        </div>*@<a class="list-group-item col-md-12 col-xs-12">Trở vể trang chính</a>
                </div>
            </div>
        </div>
        <div class="col-md-9" style="height: 100%;">
            <div style="background-color: #C1C1C1; margin-bottom: 20px; height: 40px">
                <h4 style="color: white; text-transform: uppercase; font-weight: bold; border-bottom: 1px solid #dedede;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  background-color: #36ace2; float: none; padding: 9px 20px 10px; line-height: 30px">
                    Danh sách các sân đã đặt của bạn
                </h4>
            </div>
            <div class="col-md-12 panel" style="min-height: 400px">
                @*<div style="width: 100%; height: 45px;margin-top: 10px">
                    
                </div>*@
                @foreach (var item in Model)
                {
                <div class="panel panel-default">
                    <div class="panel-heading" style="text-transform: uppercase; position: relative; cursor: pointer"
                          onclick="popupInfo('@item.BookYard.IDBook','@item.Yard.NameYard','@item.Timeslot','@item.Yard.TypeYard','@item.TotalPrice','@item.BookYard.DateBook.Date.ToString("dd/MM/yyyy")','@item.BookYard.Status.ToString()','@item.BookYard.ListIDService')">
                        @item.Yard.NameYard - Ngày @item.BookYard.DateBook.Date.ToString("dd/MM/yyyy")
                    <button class="btn btn-info" style="height: 100%; top: 0px; position: absolute; right: 0px" ng-click="show=1" ng-show="show==0"><span class="glyphicon glyphicon-chevron-down"></span></button>
                            @*<button class="btn btn-info" style="height: 100%; top: 0px; position: absolute; right: 0px" ng-click="show=0" ng-show="show==1"><span class="glyphicon glyphicon-chevron-up"></span></button>*@
                    </div>
                    @*<div class="panel-body" ng-show="show==1">

                            <ul class="clearfix" style="display: block; list-style-type: square;">
                                <li class="col-md-6 col-xs-12"><b>Tài khoản đăng tin:</b> <a>{{item.Name_Customer}}</a></li>
                                <li class="col-md-6 col-xs-12"><b>Ngày đăng tin:</b>{{format_date(item.bds._ModifyDate)}} </li>

                                <li class="col-md-6 col-xs-12">
                                    <b>Ngày hết hạn:</b> {{format_date(item.bds._ExpireDate)}}
                                </li>
                                <li class="col-md-6 col-xs-12"><b>Diện tích:</b> {{item.bds._Acreage}}</li>
                                <li class="col-md-6 col-xs-12"><b>Giá:</b> {{item.bds._Price_detail}} <span ng-if="item.bds._IDType < 44">triệu</span><span ng-if="item.bds._IDType >= 44">triệu/tháng</span></li>
                                <li class="col-md-6 col-xs-12">
                                    <b>Vị trí:</b> {{ item.bds._NumberHouse }} {{ item.bds._Street }}, Phường {{ item.bds._Ward }}, Quận {{ item.bds._Trousers }}, TP Đà Nẵng
                                </li>
                                <li class="col-md-6 col-xs-12">
                                    <b>Loại dự án:</b> <span ng-if="item.bds._IDType < 44">Bán </span>
                                    <span ng-if="item.bds._IDType >= 44">Bán </span><span style="text-transform: lowercase">{{item.bds._TypeName}}</span>
                                </li>
                                <li class="col-md-12 col-xs-12">
                                    <b>Mô tả:</b>
                                    <p ng-bind-html="item.bds._Decription">

                                    </p>
                                </li>
                                <li class="col-md-12 col-xs-12">
                                    <p>
                                        <b>Hình ảnh bìa</b>:
                                    </p>
                                    <div class="col-md-3">
                                        <img style="width: 100%" ng-src="{{ app }}/{{ item.bds._Image }}"/>
                                    </div>
                                </li>
                                <li class="col-md-12 col-xs-12">
                                    <p>
                                        <b>Hình ảnh chi tiết:</b>
                                    </p>

                                    <div class="col-md-3" style="margin-bottom: 10px" ng-repeat="item in item.bds._Images_detail">
                                        <img style="width: 100%" ng-src="{{app}}/{{item.Anh}}"/>
                                    </div>
                                </li>
                            </ul>
                            <button class="btn btn-sm btn-info" style="float: right; margin-left: 10px" ng-click="duyet_bai(item._IDPost)" ng-hide="(taikhoan.admin != true)">Duyệt</button>
                            <button class="btn btn-sm btn-info" style="float: right; margin-left: 10px" ng-click="huy_bai(item._IDPost)">Hủy</button>

                        </div>*@
                </div>
                }
            </div>



        </div>
    </div>
</div>
<!-- Modal -->
<div class="modal fade" id="my-modal" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">×</button>
                <h4 class="modal-title">Thông tin sân đã đặt</h4>
            </div>
            <div class="modal-body">
                <ul class="clearfix" style="display: block; list-style-type: square;">
                    <li class="col-md-6 col-xs-12"><b>Tên sân:</b> <a id="NameYard"></a></li>
                    <li class="col-md-6 col-xs-12"><b>Khung giờ:</b><span id="TimeSlot"></span> </li>

                    <li class="col-md-6 col-xs-12">
                        <b>Loại sân:</b> <span id="TypeYard"></span>
                    </li>
                    <li class="col-md-6 col-xs-12"><b>Giá:</b> <span id="Price"></span></li>
                    <li class="col-md-6 col-xs-12"><b>Ngày đặt:</b> <span id="DateBook"></span></li>
                    <li class="col-md-6 col-xs-12"><b>Tình trạng:</b> <span id="Status"></span></li>
                   
                    <li class="col-md-12 col-xs-12">
                        <b>Dịch vụ: </b> &nbsp;
                        <input type="checkbox" id="RentWater" readonly=""/> Nước &nbsp; &nbsp;
                        <input type="checkbox" id="RentLight" readonly=""/> Đèn
                    </li>
                </ul>
                
            </div>
            <div class="modal-footer">
                <button type="button" id="cancelBook" class="btn btn-danger" onclick="cancelBook()">Hủy đặt sân</button>
                @*<button type="button" id="updateBook" class="btn btn-info" onclick="uploadBook()">Lưu</button>*@
                <button type="button" class="btn btn-default" data-dismiss="modal">Đóng</button>
            </div>
        </div>

    </div>
</div>
@*<div id="my-modal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 id="myModalLabel">Modal header</h3>
    </div>
    <div class="modal-body">
        <p>One fine body…</p>
    </div>
    <div class="modal-footer">
        <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
        <button class="btn btn-primary">Save changes</button>
    </div>
</div>*@
<script>
    $(document).ready(function () {
         
        //$("#table_bookyard tr:first").click(function () {
        //    console.log("sdsdg");
        //});

        
        //Attach change eventhandler
        $('#dtpDate').on('change.bfhdatepicker', function (e) {
            //Assign the value to Hidden Variable
            console.log($('#dtpDate').val());
            var date = new Date($('#dtpDate').val());
            console.log(date);
            // window.location.href = "/BookYard/Index/" +  $('#dtpDate').val();
        });
    });
</script>

    </body>
</html>
