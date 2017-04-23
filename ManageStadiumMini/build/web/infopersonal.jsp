<%-- 
    Document   : infopersonal
    Created on : Apr 23, 2017, 6:39:00 PM
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
       @model StadiumManage.Models.Account
@{
    ViewBag.Title = "Info Account";
}
<script>
    function popup_changePass() {
        $('#my-modal').modal('show');
    }
    function changePassWord() {
        $.ajax({
            type: "PUT",
            url: '/Accounts/ChangePassword/',
            contentType: "application/json; charset=utf-8",
            data: "{pass:" + $('#Password').val() + "}",
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
                        window.location.href = '/Accounts/InforPersonal';
                    }
                );

            },
            error: function () {
                swal("Thông báo", "Đã có lỗi xảy ra! Vui lòng thử lại!", "error");
            }
        });
    }
    function update_account() {

        var data = JSON.stringify({

            "IDAccount": $('#IDAccount').val(),
            "Birthday": new Date($('#Birthday').val()),
            "Address": $('#Address').val(),
            "NameAccount": $('#NameAccount').val(),
            "Identification": $('#Identification').val(),
            "Phone": $('#Phone').val(),
            "Email": $('#Email').val()
        });
        console.log(data);
        $.ajax({
            type: "PUT",
            url: '/Accounts/UpdatePersonal/',
            contentType: "application/json; charset=utf-8",
            data: "{data:" + data + "}",
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
                        window.location.href = '/Accounts/InforPersonal';
                    }
                );

            },
            error: function () {
                swal("Thông báo", "Đã có lỗi xảy ra! Vui lòng thử lại!", "error");
            }
        });
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


                        </div>*@<a class="list-group-item col-md-12 col-xs-12">Trở vể trang chính</a>
                </div>
            </div>
        </div>
        <div class="col-md-9" style="height: 100%;">
            <div>

                <div style="background-color: #C1C1C1; margin-bottom: 20px; height: 40px">
                    <h4 style="color: white; text-transform: uppercase; font-weight: bold; border-bottom: 1px solid #dedede;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  background-color: #36ace2; float: none; padding: 9px 20px 10px; line-height: 30px">
                        Chỉnh sửa thông tin tài khoản khách hàng
                    </h4>
                </div>
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <div class="panel panel-default">
                        <div class="panel-heading" style="font-weight: bold">Thông tin tài khoản</div>
                        <div class="panel-body form-horizontal">

                            <input type="hidden" id="IDAccount" value="@Model.IDAccount" />
                            <div class="form-group">
                                <label class="control-label col-sm-4">Tên tài khoản:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="NameAccount" value="@Model.NameAccount" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Ngày sinh:</label>
                                <div class="col-sm-8">
                                    <input type="date" class="form-control" id="Birthday" value="@Model.Birthday.ToString("yyyy-MM-dd")" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Địa chỉ:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="Address" value="@Model.Address" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">CMND:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="Identification" value="@Model.Identification" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Số điện thoại:</label>
                                <div class="col-sm-8">
                                    <input type="tel" class="form-control" id="Phone" value="@Model.Phone" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Email: </label>
                                <div class="col-sm-8">
                                    <input type="email" class="form-control" id="Email" value="@Model.Email" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Thời gian đăng kí:</label>
                                <div class="col-sm-8">
                                    <input type="date" class="form-control" id="CreatedDay" readonly value="@Convert.ToDateTime(Model.CreatedDay).ToString("yyyy-MM-dd")" />
                                </div>
                            </div>
                            <div class="form-group" style="text-align: center;">
                                
                                <button style="margin-top: 20px" class="btn btn-warning" onclick="popup_changePass()">Thay đổi mật khẩu</button>
                                <button style="margin-top: 20px" class="btn btn-primary" onclick="update_account()">Lưu</button>
                                <input style="margin-top: 20px" class="btn btn-danger" type="reset" value="Hủy"/>
                            </div>

                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="my-modal" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">×</button>
                <h4 class="modal-title">Thay đổi mật khẩu</h4>
            </div>
            <div class="modal-body form-horizontal">
                <form id="form_changepass">
                    <div class="form-group">
                        <label class="control-label col-sm-4">Mật khẩu mới: </label>
                        <div class="col-sm-8">
                            <input type="password" class="form-control" id="Password" name="Password" />
                        </div>
                    </div>
                <div class="form-group">
                    <label class="control-label col-sm-4">Nhập lại mật khẩu mới: </label>
                    <div class="col-sm-8">
                        <input type="password" class="form-control" id="RePassword" name="RePassword"/>
                    </div>
                </div>
                    </form>
</div>
            <div class="modal-footer">
                <button type="button" id="btn_submit" class="btn btn-primary" onclick=" changePassWord() ">Thay đổi mật khẩu</button>
                @*<button type="button" id="updateBook" class="btn btn-info" onclick="uploadBook()">Lưu</button>*@
                <button type="button" class="btn btn-default" data-dismiss="modal">Đóng</button>
            </div>
        </div>

    </div>
</div>
<script type="text/javascript">

    $(document).ready(function () {
        $('#btn_submit').prop('disabled', 'disabled');
        //Khi bàn phím được nhấn và thả ra thì sẽ chạy phương thức này
        $("#form_changepass").validate({
            onfocusout: function (element) {
                this.element(element);
            },
            rules: {
                Password: {
                    required: true
                },
                RePassword: {
                    required: true,
                    equalTo: "#Password"
                }

            },
            messages: {
                Password: {
                    required: "Vui lòng nhập Mật khẩu"
                },
                RePassword: {
                    required: "Vui lòng nhập xác nhận mật khẩu",
                    equalTo: "Không trùng khớp mật khẩu"
                }
            }
        });
        $('#form_changepass input').on('keyup blur', function () { // fires on every keyup & blur
            if ($('#form_changepass').valid()) {                   // checks form for validity
                $('#btn_submit').prop('disabled', false);        // enables button
            } else {
                $('#btn_submit').prop('disabled', 'disabled');   // disables button
            }
        });
    });
</script>
    </body>
</html>
