<%-- 
    Document   : bill
    Created on : Apr 5, 2017, 6:41:43 PM
    Author     : VuDang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="script/jquery-1.11.3.min.js" type="text/javascript"></script>
        <script src="script/bootstrap.min.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="container">
            <h1 style="text-align: center;">Chi phí hóa đơn</h1>
            <div class="col-md-2"></div>
            <div class="col-md-8">
                <div class="panel panel-default" >
                    <div class="panel-heading">Chi phí hóa đơn</div>
                    <div class="panel-body">
                        <form>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Họ tên:</label>
                                <div class="col-sm-8">
                                    <label class="control-labe" >Đặng Ngọc Vũ</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Số ĐT:</label>
                                <div class="col-sm-8">
                                    <label class="control-labe" >01266555022</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Địa chỉ:</label>
                                <div class="col-sm-8">
                                    <label class="control-labe" >140 Hoàng Diệu</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Email:</label>
                                <div class="col-sm-8">
                                    <label class="control-labe" >ngocvudut1995@gmail.com</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Mã sân:</label>
                                <div class="col-sm-8">
                                    <label class="control-labe" >S10001</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Tên sân:</label>
                                <div class="col-sm-8">
                                    <label class="control-labe" >Sân 5A</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Loại sân:</label>
                                <div class="col-sm-8">
                                    <label class="control-labe" >5 người</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Khung giờ:</label>
                                <div class="col-sm-8">
                                    <label class="control-labe" >17h-19h</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Giá sân:</label>
                                <div class="col-sm-8">
                                    <label class="control-labe">220.000vnđ</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Dịch vụ:</label>
                                <div class="col-sm-8">
                                    <label class="control-labe">20.000vnđ</label>
                                </div>
                            </div>
                            
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Khuyến mãi:</label>
                                <div class="col-sm-8">
                                     <label class="control-labe">0%</label>
                                </div>
                            </div>
                             <div class="form-group">
                                <label class="control-label col-sm-4" >Tổng tiền:</label>
                                <div class="col-sm-8">
                                     <label class="control-labe">240.000vnđ</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Tình trạng:</label>
                                <div class="col-sm-8">
                                    <select class="form-control">
                                        <option>Chưa thanh toán</option>
                                        <option>Đã thanh toán</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group" style="text-align: center;">
                                <input style="margin-top: 20px" class="btn btn-default" type="button" value="Thanh toán"/> 
                                <input style="margin-top: 20px" class="btn btn-default" type="button" value="Xuất hóa đơn"/>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

        </div>
    </body>
</html>
