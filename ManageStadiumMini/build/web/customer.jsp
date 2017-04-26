<%-- 
    Document   : staff
    Created on : Apr 23, 2017, 6:41:10 PM
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

<script src="~/Scripts/jquery-ui-1.12.1.min.js"></script>
<link href="~/Content/bootstrap-formhelpers.min.css" rel="stylesheet"/>
<script src="~/Scripts/bootstrap-datepicker.min.js"></script>
<script src="~/Scripts/bootstrap-formhelpers.min.js"></script>
<link href="~/Content/bootstrap-datepicker3.min.css" rel="stylesheet" />

<script src="~/Scripts/moment.min.js"></script>

<script type="text/javascript">
    var datepicker = $.fn.datepicker.noConflict(); // return $.fn.datepicker to previously assigned value
    $.fn.bootstrapDP = datepicker;
    var id = null;
    function deleteStaff() {
        swal({
            title: 'Thông Báo?',
            text: "Bạn muốn xóa tài khoản đang chọn!",
            type: 'warning',
            showCancelButton: true,
            confirmButtonColor: '#3085d6',
            cancelButtonColor: '#d33',
            confirmButtonText: 'Yes!'
        }).then(function () {
            $.ajax({
                type: "POST",
                url: '/Accounts/DeleteStaff?id=' + id,
                dataType: 'json',
                contentType: false,
                processData: false,
                success: function (response) {
                    swal({
                        title: 'Thông báo',
                        text: "Bạn đã xóa thành công",
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
                        window.location.href = "/Accounts/Staff";
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
    function openCreate() {

        window.location.href = '/Accounts/Add';
    }
    var CurrentSort = '@ViewBag.CurrentSort';
    function sort(sortOrder) {

        if (CurrentSort.lastIndexOf("_") > 0) {
            location.href = 'Staff?sortOrder=' + sortOrder;
        } else {
            location.href = 'Staff?sortOrder=' + sortOrder + "_desc";
        }

    }
    function openEdit() {
        if (id != null) {
            location.href = 'EditStaff/' + id;
        }
    }

    function getrow(value) {
        @*$('#myVar').val(id);
        @ViewBag.IDAccount = $('#myVar').val();*@
        id = value;
        //console.log(id);
    }
    $(function () {

        //$("#table_bill").colResizable({
        //    liveDrag: true,
        //    gripInnerHtml: "<div class='grip'></div>",
        //    draggingClass: "dragging",
        //    resizeMode: 'overflow'
        //});
        $('#table_account tbody tr').click(function (e) {
            //console.log("sdsd");
            $('#table_account tbody tr').removeClass('success');
            $(this).addClass('success');
        });
    });
</script>
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
                        Quản lý tài khoản nhân viên
                    </h4>
                </div>
                <div class="col-md-12">
                    <div class="panel panel-default" style="min-height: 350px">
                        <div class="panel-heading">Danh sách tài khoản nhân viên</div>
                        <div class="panel-body" style="overflow: auto; white-space: nowrap; max-height: 4000px;">
                           
                            <div style="overflow: auto; white-space: nowrap; max-height: 4000px;">
                                <table class="table" width="100%" border="1" cellpadding="0" cellspacing="0" id="table_account">
                                    <thead>
                                        <tr class="table_account info">

                                            <th>Tên tài khoản<a onclick=" sort('name') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                            <th>Ngày sinh<a onclick=" sort('birth') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                            <th>Địa chỉ<a onclick=" sort('address') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                            <th>Số điện thoại<a onclick=" sort('tel') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                            <th>Email<a onclick=" sort('email') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                            <th>CMND<a onclick=" sort('id') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                            <th>Thời gian đăng kí<a onclick=" sort('create') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                            <th>Chức vụ<a onclick=" sort('pos') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                            <th>Tiền lương<a onclick=" sort('salary') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        @foreach (var item in Model)
                                        {
                                            <tr onclick=" getrow('@item._account.IDAccount') ">

                                                <td>@item._account.NameAccount</td>
                                                <td>@item._account.Birthday</td>
                                                <td>@item._account.Address</td>
                                                <td>@item._account.Phone</td>
                                                <td>@item._account.Email</td>
                                                <td>@item._account.Identification</td>
                                                <td>@item._account.CreatedDay</td>
                                                <td>@item.Position</td>
                                                <td>@item.Salary</td>
                                            </tr>
                                        }

                                    </tbody>

                                </table>
                            </div>

                            <div>
                                <button class="btn btn-danger" style="float: right; margin-left: 20px"
                                        onclick="deleteStaff()">
                                    Xóa
                                </button>
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

<input id="tdate" type="text" class="form-control" data-provide="datepicker">

<script>
    $(document).ready(function () {
        //Attach change eventhandler
        console.log($('#dtpDate').val() + 'sdsd');

        //$('#dtpDate').on('show.bfhdatepicker', function(e) {
        //    //Assign the value to Hidden Variable
        //    $('#hdnSelectedDate').val($('#dtpDate').val());
        //    console.log($('#dtpDate').val() + 'sdsd');
        //});
        $('#tdate').datepicker({
            format: 'dd/mm/yyyy',
            todayBtn: "linked"
        });
    });

</script>

    </body>
</html>
