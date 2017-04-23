    <%-- 
    Document   : editstaff
    Created on : Apr 23, 2017, 6:38:10 PM
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
       <script>
    format_date_picker = function(date) {
        var today = new Date(date);
        var dd = today.getDate();
        var mm = today.getMonth() + 1;
        var yyyy = today.getFullYear();
        if (dd < '10') {
            dd = '0' + dd;
        }
        if (mm < '10') {
            mm = '0' + mm;
        }
        var format = yyyy + '-' + mm + '-' + dd;

        // console.log(format);
        return format;
    };

    function update_staff() {

        var data = JSON.stringify({
            "Position": $('#Position').prop('selectedIndex') == 0 ? 'Manager' : 'Employee',
            "Salary": $('#Salary').val(),
            "_account": {
                "IDAccount": $('#IDAccount').val(),
                "Birthday": new Date($('#Birthday').val()),
                "Address": $('#Address').val(),
                "NameAccount": $('#NameAccount').val(),
                "Identification": $('#Identification').val(),
                "Phone": $('#Phone').val(),
                "Email": $('#Email').val()

            }
        });
        console.log(data);
        $.ajax({
            type: "PUT",
            url: '/Accounts/UpdateStaff/',
            contentType: "application/json; charset=utf-8",
            data: "{data:" + data + "}",
            //dataType: 'json',
            //async: true,
            //processData: false,
            //cache: false,
            success: function(result) {
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
                }).then(function() {
                        window.location.href = '/Accounts/Staff';
                    }
                );

            },
            error: function() {
                //alert('Some error occured');
            }

        });
    }


    $('#form_edit').on('submit', function() {
        console.log('sdsd');
        update_staff();
    });
    $(document).ready(function() {

        //Attach change eventhandler
        var positon = '@Model.Position';
        console.log(positon);

        if (positon == 'Employee') {
            $("#Position").prop('selectedIndex', 1);
        } else if (positon == 'Manager') {
            $("#Position").prop('selectedIndex', 0);
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
                        Chỉnh sửa thông tin tài khoản nhân viên
                    </h4>
                </div>
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <div class="panel panel-default">
                        <div class="panel-heading" style="font-weight: bold">Thông tin tài khoản</div>
                        <div class="panel-body form-horizontal">


                            <input type="hidden" id="IDAccount" value="@Model._account.IDAccount" />
                            <div class="form-group">
                                <label class="control-label col-sm-4">Tên tài khoản:</label>
                                <div class="col-sm-8">
                                    @*@Html.EditorFor(model => model._account.NameAccount, new { htmlAttributes = new { @class = "form-control" } })*@
                                    <input type="text" class="form-control" id="NameAccount" value="@Model._account.NameAccount" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Ngày sinh:</label>
                                <div class="col-sm-8">
                                    @*@Html.EditorFor(model => model._account.Birthday, new { htmlAttributes = new { @class = "form-control", @type = "date", @value = Model._account.Birthday.ToString("yyyy-MM-dd") } })*@
                                    <input type="date" class="form-control" id="Birthday" value="@if (Model._account.Birthday != null)
                                                                                                 {
                                                                                                    @Html.Raw(Convert.ToDateTime(Model._account.Birthday).ToString("yyyy-MM-dd")) 
                                                                                                 }" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Địa chỉ:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="Address" value="@Model._account.Address" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">CMND:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="Identification" value="@Model._account.Identification" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Số điện thoại:</label>
                                <div class="col-sm-8">
                                    <input type="tel" class="form-control" id="Phone" value="@Model._account.Phone" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Email: </label>
                                <div class="col-sm-8">
                                    <input type="email" class="form-control" id="Email" value="@Model._account.Email" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Thời gian đăng kí:</label>
                                <div class="col-sm-8">
                                    <input readonly type="date" class="form-control" id="CreatedDay" value="@Convert.ToDateTime(Model._account.CreatedDay).ToString("yyyy-MM-dd")" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Chức vụ: </label>
                                <div class="col-sm-8">
                                    <select class="form-control" id="Position" id="Position">
                                        <option>Quản lý</option>
                                        <option>Nhân viên</option>

                                    </select>

                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Lương:</label>
                                <div class="col-sm-8">
                                    <input type="number" id="Salary" class="form-control" value="@Model.Salary" />
                                </div>
                            </div>
                            <div class="form-group" style="text-align: center;">
                                <button style="margin-top: 20px" class="btn btn-primary" onclick="update_staff()">Lưu</button>
                                <input style="margin-top: 20px" class="btn btn-danger" type="reset" value="Hủy" />
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