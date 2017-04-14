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
            <h1 style="text-align: center;">Thông tin tài khoản</h1>
            <div class="col-md-2"></div>
            <div class="col-md-8">
                <div class="panel panel-default">
                    <div class="panel-heading">Thông tin tài khoản</div>
                    <div class="panel-body">
                        <form>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Mã tài khoản:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Tên tài khoản:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Ngày sinh:</label>
                                <div class="col-sm-8">
                                    <input type="date" class="form-control"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Địa chỉ:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >CMND:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control"/>
                                </div>
                            </div>
                             <div class="form-group">
                                <label class="control-label col-sm-4" >Số điện thoại:</label>
                                <div class="col-sm-8">
                                    <input type="tel" class="form-control"/>
                                </div>
                            </div>
                             <div class="form-group">
                                <label class="control-label col-sm-4" >Email: </label>
                                <div class="col-sm-8">
                                    <input type="email" class="form-control"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Thời gian đăng kí:</label>
                                <div class="col-sm-8">
                                    <input type="date" class="form-control"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Phân quyền: </label>
                                <div class="col-sm-8">
                                    <select class="form-control">
                                        <option>Khách hàng</option>
                                        <option>Nhân viên</option>
                                        <option>Quản lý</option>
                                    </select>
                                        
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Lương:</label>
                                <div class="col-sm-8">
                                    <input type="number" class="form-control"/>
                                </div>
                            </div>
                            <div class="form-group" style="text-align: center;">
                                <input style="margin-top: 20px" class="btn btn-default" type="submit" value="Lưu"/> 
                                 <input style="margin-top: 20px" class="btn btn-default" type="reset" value="Hủy"/> 
                            </div>
                        </form>
                    </div>
                </div>
            </div>

        </div>
    </body>
</html>
