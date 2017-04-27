<%-- 
    Document   : register
    Created on : Mar 12, 2017, 10:28:27 AM
    Author     : VuDang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="script/bootstrap.min.js" type="text/javascript"></script>
        <script src="script/jquery-1.11.3.min.js" type="text/javascript"></script>
        <style>
            .navbar-nav > li > a{
                padding-top:  5px;
                padding-bottom:  5px;
            }
        </style>
    </head>

    <body>
       
  <%@include file="include/header.jsp" %>

<style>
    label.error {
        display: inline-block;
        color: red;
        width: 200px;
    }
</style>
<script>
   
    function EmailExisted(email) {
        console.log(email);
        $.ajax({
            type: "GET",
            url: '/System/EmailExisted?email=' + email,
            contentType: "application/json; charset=utf-8",

            success: function (data) {
                //alert('success');
                if (data.result == true) {

                } else {

                }
                return data.result;

                //window.location.href = '/Home/';
            }, error: function () {
                swal("Thông báo", "Đăng nhập thất bại! Vui lòng thử lại!", "error");
            }
        });
        return true;
    }
    function register() {
        var data;

        data = JSON.stringify({

            "Birthday": new Date($('#Birthday').val()),
            "Address": $('#Address').val(),
            "NameAccount": $('#NameAccount').val(),
            "Phone": $('#Phone').val(),
            "Email": $('#Email').val(),
            "Password": $('#Password').val()
        });

        console.log(data);
        $.ajax({
            type: "POST",
            url: 'register.do',
            contentType: "application/json; charset=utf-8",
            data: "{data:" + data + "}",
            //dataType: 'json',
            //async: true,
            //processData: false,
            //cache: false,
            success: function (result) {
                swal({
                    title: 'Thông báo',
                    text: "Bạn đã đăng kí thành công",
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
                    window.location.href = "/Home";
                }
                );
            }, error: function () {
                swal("Thông báo", "Đăng kí thất bại! Vui lòng thử lại!", "error");
            }
        });
    }


</script>
<div>
    <div style="text-align: center">
        <h1>Đăng kí thành viên </h1>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6" style="margin: auto">
            <div class="panel panel-primary">
                <div class="panel-heading" style="font-weight: bold">Thông tin tài khoản đăng kí</div>
                <div class="panel-body form-horizontal">
                    <form id="form_register">
                        <div class="form-group">
                            <label class="control-label col-md-3">Họ và tên: </label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" placeholder="Nhập họ tên" id="NameAccount" name="NameAccount" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3">Ngày sinh: </label>
                            <div class="col-md-9">
                                <input type="date" class="form-control" min="1990-01-01" id="Birthday" name="Birthday" required max="@Convert.ToDateTime(DateTime.Now).ToString("yyyy-MM-dd")">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3">Số điện thoại: </label>
                            <div class="col-md-9">
                                <input type="tel" class="form-control" placeholder="Nhập số điện thoại" id="Phone" name="Phone" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3">Địa chỉ: </label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" placeholder="Nhập địa chỉ" id="Address" name="Address" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3">Email:</label>
                            <div class="col-md-9">
                                <input type="email" class="form-control" required placeholder="Nhập email" name="Email" id="Email" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3">Mật khẩu: </label>
                            <div class="col-md-9">
                                <input type="password" class="form-control" required placeholder="Nhập mật khẩu" name="Password" id="Password">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3">Nhập lại mật khẩu: </label>
                            <div class="col-md-9">
                                <input type="password" class="form-control" required placeholder="Nhập lại mật khẩu" name="RePassword" id="RePassword">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-md-9">
                                <div class="checkbox">
                                    <label><input type="checkbox"> Remember me</label>
                                </div>
                            </div>
                        </div>
                    </form>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-md-9">
                            <button id="btn_submit" class="btn btn-info" onclick="register()">Đăng kí</button>
                            <button type="reset" class="btn btn-info" onclick="document.getElementById('form_register').reset()">Hủy</button>
                        </div>
                    </div>



                </div>
            </div>

        </div>
    </div>

</div>
<script type="text/javascript">

    $(document).ready(function () {
        var response;
        $.validator.addMethod(
    "EmailExisted",
    function (value, element) {
        console.log(value);
       
        $.ajax({
            type: "GET",
            url: '/System/EmailExisted?email=' + value,
            contentType: "application/json; charset=utf-8",

            success: function (data) {
                //alert('success');
                console.log(data.result);
                response= !data.result;

                //window.location.href = '/Home/';
            }, error: function () {
                swal("Thông báo", "Đăng nhập thất bại! Vui lòng thử lại!", "error");
            }
        });
        return response;
    },
    "Email đã tồn tại"
);
        $('#btn_submit').prop('disabled', 'disabled');
        //Khi bàn phím được nhấn và thả ra thì sẽ chạy phương thức này
        $("#form_register").validate({
            onfocusout: function (element) {
                this.element(element);
            },
            rules: {
                NameAccount: "required",
                Birthday: {
                    required: true,
                    dateISO: true
                },
                Address: "required",
                Phone: "required",
                Email: {
                    required: true,
                    email: true,
                    EmailExisted:true
                },
                Password: {
                    required: true
                },
                RePassword: {
                    required: true,
                    equalTo: "#Password"
                }

            },
            messages: {
                NameAccount: "Vui lòng nhập tên tài khoản",
                Birthday: {
                    required: "Vui lòng nhập ngày sinh",
                    dateISO: "Ngày sinh không tồn tại"
                },

                Address: "Vui lòng nhập địa chỉ",
                Phone: "Vui lòng nhập số điện thoại",
                Email: {
                    required: "Vui lòng nhập email",
                    email: "Vui lòng nhập đúng định dạng email",
                    EmailExisted:"Email đã tồn tại"
                },
                Password: {
                    required: "Vui lòng nhập Mật khẩu"
                },
                RePassword: {
                    required: "Vui lòng nhập xác nhận mật khẩu",
                    equalTo: "Không trùng khớp mật khẩu"
                }
            }
        });
        $('#form_register input').on('keyup blur', function () { // fires on every keyup & blur
            if ($('#form_register').valid()) {                   // checks form for validity
                $('#btn_submit').prop('disabled', false);        // enables button
            } else {
                $('#btn_submit').prop('disabled', 'disabled');   // disables button
            }
        });
    });
</script>
    </body>
</html>
