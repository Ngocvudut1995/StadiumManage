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

    <body class="container">
       
@{
    ViewBag.Title = "Login";
}
<style>
    label.error {
        display: inline-block;
        color: red;
        width: 200px;
    }
</style>
@*<style type="text/css">
        .loginmodal-container {
            padding: 30px;
            max-width: 350px;
            width: 100% !important;
            background-color: #F7F7F7;
            margin: 0 auto;
            border-radius: 2px;
            box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
            overflow: hidden;
            font-family: roboto;
        }

            .loginmodal-container h1 {
                text-align: center;
                font-size: 1.8em;
                font-family: roboto;
            }

            .loginmodal-container input[type=submit], input[type=button] {
                width: 100%;
                display: block;
                margin-bottom: 10px;
                position: relative;
            }

            .loginmodal-container input[type=text], input[type=password] {
                height: 44px;
                font-size: 16px;
                width: 100%;
                margin-bottom: 10px;
                -webkit-appearance: none;
                background: #fff;
                border: 1px solid #d9d9d9;
                border-top: 1px solid #c0c0c0;
                /* border-radius: 2px; */
                padding: 0 8px;
                box-sizing: border-box;
                -moz-box-sizing: border-box;
            }

                .loginmodal-container input[type=text]:hover, input[type=password]:hover {
                    border: 1px solid #b9b9b9;
                    border-top: 1px solid #a0a0a0;
                    -moz-box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
                    -webkit-box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
                    box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
                }

        .loginmodal {
            text-align: center;
            font-size: 14px;
            font-family: 'Arial', sans-serif;
            font-weight: 700;
            height: 36px;
            padding: 0 8px;
            border-radius: 3px;
            -webkit-user-select: none;
            user-select: none;
        }

        .loginmodal-submit {
            /* border: 1px solid #3079ed; */
            border: 0px;
            color: #fff;
            text-shadow: 0 1px rgba(0, 0, 0, 0.1);
            background-color: #4d90fe;
            padding: 17px 0px;
            font-family: roboto;
            font-size: 14px;
            /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#4787ed)); */
        }

        .loginmodal-button {
            /* border: 1px solid #3079ed; */
            border: 0px;
            color: #fff;
            text-shadow: 0 1px rgba(0, 0, 0, 0.1);
            background-color: #4d90fe;
            padding: 17px 0px;
            font-family: roboto;
            font-size: 14px;
            /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#4787ed)); */
        }


        .loginmodal-submit:hover {
            /* border: 1px solid #2f5bb7; */
            border: 0px;
            text-shadow: 0 1px rgba(0, 0, 0, 0.3);
            background-color: #357ae8;
            /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#357ae8)); */
        }

        .loginmodal-button:hover {
            /* border: 1px solid #2f5bb7; */
            border: 0px;
            text-shadow: 0 1px rgba(0, 0, 0, 0.3);
            background-color: #357ae8;
            /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#357ae8)); */
        }
    </style>*@
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
              
                
               
                @*<input type="email" id="Email" placeholder="Email">
            <input type="password" id="Password" placeholder="Password">
            <input type="button" class="login loginmodal-submit" value="Login" onclick="login()">
            <input type="button" class="login loginmodal-submit" value="Cancel">*@


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

        </div>
    </body>
</html>
