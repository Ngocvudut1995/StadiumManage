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
            <h1 style="text-align: center;">Thông tin sân bóng</h1>
            <div class="col-md-2"></div>
            <div class="col-md-8">
                <div class="panel panel-default">
                    <div class="panel-heading">Thông tin sân bóng</div>
                    <div class="panel-body">
                        <form>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Mã sân:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Tên sân:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Loại sân:</label>
                                <div class="col-sm-8">
                                    <select class="form-control">
                                        <option>5 người</option>
                                         <option>7 người</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Tình trạng:</label>
                                <div class="col-sm-8">
                                    <select class="form-control">
                                        <option>Đang hoạt động</option>
                                         <option>Đang sửa chữa</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Thuê bóng:</label>
                                <div class="col-sm-8">
                                    <select class="form-control">
                                        <option>Có</option>
                                         <option>Không</option>
                                    </select>
                                </div>
                            </div>
                             <div class="form-group">
                                <label class="control-label col-sm-4" >Thuê áo:</label>
                                <div class="col-sm-8">
                                    <select class="form-control">
                                        <option>Có</option>
                                         <option>Không</option>
                                    </select>
                                </div>
                            </div>
                             <div class="form-group">
                                <label class="control-label col-sm-4" >Thuê giày:</label>
                                <div class="col-sm-8">
                                    <select class="form-control">
                                        <option>Có</option>
                                        <option selected="selected">Không</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4" >Giá:</label>
                                <div class="col-sm-8">
                                    <input class="form-control" type="number" ></label>
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
