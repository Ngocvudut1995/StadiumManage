<%-- 
    Document   : yard
    Created on : Apr 14, 2017, 7:57:43 PM
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
    <body>
       <style type="text/css">
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

    .control-label {
        text-align: left;
    }
</style>
<div class="container">
    <div class="row">
        <div class="col-md-7"></div>
        <div class="col-md-5">
            <div class="loginmodal-container">
                <fieldset>

                    <!-- Form Name -->
                    <legend>Thông tin liên hệ đặt sân</legend>
                    <div>
                        <span><b>Chủ sân: Trần Văn A</b></span><br>
                        <span><b>Liên hệ: 01222222222</b></span><br>
                        <span><b>Địa chỉ: 54 Nguyễn Lương Bằng</b></span><br>
                        <span><b>Email: tranvana88@gmail.com</b></span>
                    </div>
                    <hr>
                    <div>
                        <form class="form-horizontal">
                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="name">Họ và tên</label>
                                <div class="col-md-8">
                                    <input id="NameAccount" name="name" type="text" placeholder="Họ và tên" class="form-control input-md" required="">

                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="phone" style="white-space: nowrap">Số điện thoại</label>
                                <div class="col-md-8">
                                    <input id="Phone" name="phone" type="tel" placeholder="Số điện thoại" class="form-control input-md" required="">
                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="add">Địa chỉ</label>
                                <div class="col-md-8">
                                    <input id="Address" name="add" type="text" placeholder="Địa chỉ" class="form-control input-md" required="">

                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="email">Email</label>
                                <div class="col-md-8">
                                    <input id="Email" name="email" type="email" placeholder="Email" onblur="EmailExisted(this.value)" class="form-control input-md" required="">

                                </div>
                            </div>

                            <!-- Select Basic -->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="selecttime">Khung giờ</label>
                                <div class="col-md-8">
                                    <select id="IDTimeSlot" name="selecttime" class="form-control input-md">
                                       
                                        <option>17h30 - 18h30</option>
                                        <option>18h30 - 19h30</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Ngày đặt: </label>
                                <div class="col-sm-8">
                                    <input type="date" class="form-control" id="DateBook" onblur="changeDateBook()">
                                </div>
                            </div>
                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="ln">Giá</label>
                                <div class="col-md-8">
                                    <input id="amount" name="amount" type="number" placeholder="" class="form-control input-md" required="">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-md-4 control-label" for="ln">Nội dung</label>
                                <div class="col-md-8">
                                    <textarea id="Contents" style="width: 100%;"></textarea>
                                </div>
                            </div>
                            <!-- Button -->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="submit"></label>
                                <div class="col-md-4">
                                    <button id="submit" name="submit" class="btn btn-primary" onclick="bookyard()">Đặt sân</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </fieldset>

            </div>
        </div>
    </div>
</div>
    </body>
</html>
