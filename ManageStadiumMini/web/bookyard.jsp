<%-- 
    Document   : bookyard
    Created on : Apr 23, 2017, 6:44:16 PM
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
         <%@include file="include/header.jsp" %>


<link href="~/Content/bootstrap-formhelpers.min.css" rel="stylesheet" />
<script src="~/Scripts/bootstrap-formhelpers.min.js"></script>
<script type="text/javascript">

    function focusItem(IdBook,NameAccount, Phone, Address, Email, NameYard, TypeYard, Timeslot, TotalPrice, Contents, Status) {
        $('#IdBook').val(IdBook);
        $('#NameAccount').html(NameAccount);
        $('#Phone').html(Phone);
        $('#Address').html(Address);
        $('#Email').html(Email);
        $('#NameYard').html(NameYard);
        $('#TypeYard').html(TypeYard);
        $('#TimeSlot').html(Timeslot);
        $('#total_price').html(TotalPrice);
        $('#Contents').val(Contents);
        if (Status == 'False') {
            $('#Status').prop('selectedIndex', 0);

        } else {
            $('#Status').prop('selectedIndex', 1);
        }

        //console.log(id);
    }
    function Paid(id,promotion,status) {
       
            $.ajax({
                type: "POST",
                url: '/BookYard/paid?id='+id+'&promotion='+promotion+'&status='+status,
                contentType: "application/json; charset=utf-8",
                //dataType: 'json',
                //async: true,
                //processData: false,
                //cache: false,
                success: function (result) {
                    swal({
                        title: 'Thông báo',
                        text: "Bạn đã chỉnh sửa thành công",
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
                        window.location.href = "/BookYard";
                    }
                 );
                }, error: function () {
                    swal("Thông báo", "Đã xảy ra lỗi!", "error");
                }
            });
      
    }
    $(function () {

        //$("#table_bill").colResizable({
        //    liveDrag: true,
        //    gripInnerHtml: "<div class='grip'></div>",
        //    draggingClass: "dragging",
        //    resizeMode: 'overflow'
        //});
        //$('#Status').on('change', function() {
        //    if ($('#Status').prop('selectedIndex') === 1) {
        //        $('#btn_paid').prop('disabled', false);
        //    } else {
        //        $('#btn_paid').prop('disabled', true);
        //    }
        //});
        $('#table_bookyard tbody tr').click(function (e) {
            console.log("sdsd");
            $('#table_bookyard tbody tr').removeClass('success');
            $(this).addClass('success');
        });
    });

</script>

<style>
    .table_bookyard > th {
        padding-left: 10px;
        padding-right: 10px;
      
    }


</style>
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
                        Quản lý thông tin sân đã đặt
                    </h4>
                </div>
                <div class="row">
                    <div class="col-md-8">
                        <div class="panel panel-default" style="min-height: 350px">
                            <div class="panel-heading">Các sân đã đặt</div>
                            <div class="panel-body" >
                                <div style="width: 100%;height: 45px">
                                    <div id="dtpDate" style="width: 30%;float: right;" class="bfh-datepicker" data-format="d-m-y" data-date="@ViewBag.date"></div>
                                </div>
                                <div style="overflow: auto; white-space: nowrap; max-height: 400px;">
                                    <table class="table" width="100%" border="1" cellpadding="0" cellspacing="0" id="table_bookyard">
                                        <thead>
                                            <tr class="table_bookyard info">
                                                <th>Mã đặt sân <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                                <th>Mã sân <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                                <th>Tên sân <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                                <th>Khung giờ <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                                <th>Tổng giá <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                                <th>Khách hàng <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                                <th>Tình trạng <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            @foreach (var item in Model)
                                            {

                                                // var json = new JavaScriptSerializer().Serialize(item);
                                                <tr class="table_bookyard"
                                                    onclick="focusItem(@item.BookYard.IDBook, '@item.CustometAccount.NameAccount' , '@item.CustometAccount.Phone' , '@item.CustometAccount.Address' , '@item.CustometAccount.Email' , '@item.Yard.NameYard' , '@item.Yard.TypeYard' , '@item.Timeslot' , @item.TotalPrice , '@item.BookYard.Contents' , '@item.BookYard.Status' ) ">
                                                    <td>@item.BookYard.IDBook</td>
                                                    <td>@item.BookYard.IDYard</td>
                                                    <td>@item.Yard.NameYard</td>
                                                    <td>@item.Timeslot</td>
                                                    <td>@item.TotalPrice</td>
                                                    <td>@item.CustometAccount.NameAccount</td>
                                                    <td>
                                                        @if (item.BookYard.Status == false)
                                                    {@Html.Raw("Chưa thanh toán")
                                                    }
                                                    else
                                                    {@Html.Raw("Đã Thanh toán")
                                                    }
                                                </td>
                                            </tr>
                                            }

                                        </tbody>

                                    </table>
                                </div>
                              
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="panel panel-default" style="min-height: 350px">
                            <div class="panel-heading">Thông tin khách đặt</div>
                            <div class="panel-body">
                                @if (Model.ToList().Count > 0)
                                {
                                    <input id="IdBook" type="hidden" />
                                    <div class="form-group">
                                        <label class="control-label col-sm-4">Họ tên:</label>
                                        <div class="col-sm-8">
                                            <label class="control-label" id="NameAccount"></label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-4">Số ĐT:</label>
                                        <div class="col-sm-8">
                                            <label class="control-label" id="Phone"></label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-4">Địa chỉ:</label>
                                        <div class="col-sm-8">
                                            <label class="control-label" id="Address"></label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-4">Email:</label>
                                        <div class="col-sm-8">
                                            <label class="control-label" id="Email"></label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-4">Tên sân:</label>
                                        <div class="col-sm-8">
                                            <label class="control-label" id="NameYard"></label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-4">Loại sân:</label>
                                        <div class="col-sm-8">
                                            <label class="control-label" id="TypeYard"></label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-4">Khung giờ:</label>
                                        <div class="col-sm-8">
                                            <label class="control-label" id="TimeSlot"></label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-4">Giá:</label>
                                        <div class="col-sm-8">
                                            <label class="control-label" id="total_price"></label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-4" style="white-space: nowrap">Khuyến mãi:</label>
                                        <div class="col-sm-8">
                                            <input type="number" class="form-control" id="promotion" value="0" max="20" />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-4">Nội dung:</label>
                                        <div class="col-sm-8">
                                            <textarea class="form-control" rows="4" id="Contents"></textarea>
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
                                        <button id="btn_paid" style="margin-top: 20px" class="btn btn-primary" onclick=" Paid($('#IdBook').val(), $('#promotion').val(), $('#Status').prop('selectedIndex')) ">Thanh toán</button>
                                        <input style="margin-top: 20px" class="btn btn-danger" type="button" value="Hủy" />
                                    </div>
                                }
                               

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
    $(document).ready(function () {
                                    @foreach (var item in Model) {
            @:focusItem(@item.BookYard.IDBook,'@item.CustometAccount.NameAccount', '@item.CustometAccount.Phone', '@item.CustometAccount.Address', '@item.CustometAccount.Email', '@item.Yard.NameYard', '@item.Yard.TypeYard', '@item.Timeslot', @item.TotalPrice, '@item.BookYard.Contents', '@item.BookYard.Status');
            break;
        }
        //$("#table_bookyard tr:first").click(function () {
        //    console.log("sdsdg");
        //});

        //Attach change eventhandler
        $('#dtpDate').on('change.bfhdatepicker', function (e) {
            //Assign the value to Hidden Variable
            console.log($('#dtpDate').val());
            var date = new Date($('#dtpDate').val());
            console.log(date);
           window.location.href = "/BookYard/Index/" +  $('#dtpDate').val();
        });
    });
</script>

    </body>
</html>
