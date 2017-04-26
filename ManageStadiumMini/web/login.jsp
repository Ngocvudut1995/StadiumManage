<%-- 
    Document   : login
    Created on : Mar 15, 2017, 7:17:54 PM
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
    </head>
    }

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
    function login() {
        data = JSON.stringify({

            "Email": ($('#Email').val()),
            "Password": $('#Password').val()
        });
        $.ajax({
            type: "POST",
            url: '/System/Login/',
            contentType: "application/json; charset=utf-8",
            data: "{data:" + data + "}",
            success: function (data) {
                //alert('success');
                if (data.result == true) {
                    swal({
                        title: 'Thông báo',
                        text: "Bạn đã đăng nhập thành công",
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
                   
                } else {
                    swal("Thông báo", "Đăng nhập thất bại! Vui lòng thử lại!", "error");
                }
                //return data.result;

                //window.location.href = '/Home/';
            }, error: function () {
                window.location.href = "/Home/Login";
            }
        });
    }
</script>
<div class="container">
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6">
            <div class="jumbotron">
                <h2 class="well" align="center">Thông tin đăng nhập</h2><br>
                <form id="form_login">
                    <div class="form-group">
                        <label for="email">Email address:</label>
                        <input style="width: 100%" type="email" class="form-control" name="Email" id="Email" required>
                    </div>
                    <div class="form-group">
                        <label for="pwd">Password:</label>
                        <input style="width: 100%" type="password" name="Password" class="form-control" id="Password" required>
                    </div>
                </form>
                    <div style="text-align: center">
                        <button id="btn_submit" class="btn btn-info" onclick="login()">Login</button>
                        <button type="reset" class="btn btn-info" onclick="document.getElementById('form_login').reset()">Cancel</button>
                    </div>
              
                
               
               

                <!-- <div class="login-help">
            <a href="#">Register</a> - <a href="#">Forgot Password</a>
        </div> -->
            </div>
        </div>
    </div>
   
</div>

<script type="text/javascript">

    $(document).ready(function () {
        $('#btn_submit').prop('disabled', 'disabled');
        //Khi bàn phím được nhấn và thả ra thì sẽ chạy phương thức này
        $("#form_login").validate({
            onfocusout: function (element) {
                this.element(element);
            },
            rules: {
                
                Email: {
                    required: true,
                    email: true
                },
                Password: {
                    required: true
                }
               

            },
            messages: {
                
                Email: {
                    required: "Vui lòng nhập email",
                    email: "Vui lòng nhập đúng định dạng email"
                },
                Password: {
                    required: "Vui lòng nhập Mật khẩu"
                }
            }
        });
        $('#form_login input').on('keyup blur', function () { // fires on every keyup & blur
            if ($('#form_login').valid()) {                   // checks form for validity
                $('#btn_submit').prop('disabled', false);        // enables button
            } else {
                $('#btn_submit').prop('disabled', 'disabled');   // disables button
            }
        });
    });
</script>





    </body>
</html>
