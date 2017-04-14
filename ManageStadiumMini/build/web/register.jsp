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
        <nav class="navbar navbar-default">
            <div class="row">
                <div class="col-md-2">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#">WebSiteName</a>
                    </div>
                </div>
                <div class="col-md-10">
                    <div style="float: right; width: 100%;margin: 20px;text-align: right; margin-right: 50px">

                        <button class="btn btn-default">Đăng kí</button>
                        <button class="btn btn-default">Đăng nhập</button>
                    </div>
                    <div class="container-fluid">

                        <ul class="nav navbar-nav">
                            <li class="active"><a href="#">Trang chủ</a></li>
                            <li><a href="#">Giới thiệu</a></li>
                            <li><a href="#">Khuyến mãi</a></li>
                            <li><a href="#">Giải đấu</a></li>
                            <li><a href="#">Liên hệ</a></li>
                            <li><a href="#">Danh sách sân</a></li>
                            <li style="position: absolute;right: 54px;"><input class="form-control" style="width: 210px;height: 20px;padding:0px 0px; " type="text" placeholder="Tìm kiếm"/></li>
                        </ul>
                    </div>
                </div>
            </div>



        </nav>

        <div>
            <div style="text-align: center">
                <h1>Đăng kí thành viên </h1>
            </div>
            <div style=" width: 75%;margin: auto;"
                <div class="panel panel-default">
                    <div class="panel-heading">Thông tin tài khoản đăng kí</div>
                    <div class="panel-body">
                        <form class="form-horizontal" action="register.do" method="POST">
                            <div class="form-group">
                                <label class="control-label col-sm-2">Họ và tên: </label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" placeholder="Nhập họ tên" name="name_account">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2">Ngày sinh: </label>
                                <div class="col-sm-10">
                                    <input type="date" class="form-control" name="birthday">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2">Số điện thoại: </label>
                                <div class="col-sm-10">
                                    <input type="tel" class="form-control" placeholder="Nhập số điện thoại" name="phone">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2">Địa chỉ: </label>
                                <div class="col-sm-10"> 
                                    <input type="text" class="form-control"  placeholder="Nhập địa chỉ" name="address">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2">Email:</label>
                                <div class="col-sm-10">
                                    <input type="email" class="form-control"  placeholder="Nhập email" name="email">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2">Mật khẩu: </label>
                                <div class="col-sm-10">
                                    <input type="password" class="form-control"  placeholder="Nhập mật khẩu" name="password">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2">Nhập lại mật khẩu: </label>
                                <div class="col-sm-10"> 
                                    <input type="password" class="form-control"  placeholder="Nhập lại mật khẩu">
                                </div>
                            </div>
                            <div class="form-group"> 
                                <div class="col-sm-offset-2 col-sm-10">
                                    <div class="checkbox">
                                        <label><input type="checkbox"> Remember me</label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group"> 
                                <div class="col-sm-offset-2 col-sm-10">
                                    <button type="submit" class="btn btn-default">Đăng kí</button>
                                    <button type="reset" class="btn btn-default">Hủy</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>

            </div>

        </div>
    </body>
</html>
