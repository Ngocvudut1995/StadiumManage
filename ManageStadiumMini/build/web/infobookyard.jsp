<%-- 
    Document   : infobookyard
    Created on : Apr 3, 2017, 9:45:03 AM
    Author     : VuDang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <!--        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
            
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        
              
                <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->
        <link href="css/font-awesome.min.css" rel="stylesheet"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="script/jquery-1.11.3.min.js" type="text/javascript"></script>
        <script src="script/bootstrap.min.js" type="text/javascript"></script>
        <script src="script/colResizable-1.6.min.js" type="text/javascript"></script>
        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
        <link href="css/bootstrap-formhelpers.min.css" rel="stylesheet" type="text/css"/>
        <script src="script/bootstrap-formhelpers.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            function getrow(id) {
                console.log(id);
            }
            $(function () {

                $("#table_book").colResizable({
                    liveDrag: true,
                    gripInnerHtml: "<div class='grip'></div>",
                    draggingClass: "dragging",
                    resizeMode: 'overflow'
                });
                $('#table_book tbody tr').click(function (e) {
                    console.log("sdsd");
                    $('#table_book tbody tr').removeClass('highlighted');
                    $(this).addClass('highlighted');
                });
            });
        </script>
        <script>
            $(document).ready(function () {
                //Attach change eventhandler
                $('#dtpDate').on('change.bfhdatepicker', function (e) {
                    //Assign the value to Hidden Variable
                    console.log($('#dtpDate').val());
                });
            });
        </script>
    </head>
    <body>
        <style>
            .table_bookyard > th {
                padding-left: 10px;
                padding-right: 10px;
                font-size: 16px;
            }
            .highlighted {
                background-color: red;
            }
        </style>
        <div class="container">
            <h1 style="text-align: center;">Quản lý thông tin sân đã đặt</h1>

            <div class="row">
                <div class="col-md-8">
                    <div class="panel panel-default">
                        <div class="panel-heading">Các sân đã đặt</div>
                        <div class="panel-body" style="overflow: auto;white-space: nowrap;max-height: 400px;">
                            <div id="dtpDate" style="width: 30%;float: right;"class="bfh-datepicker" data-format="d-m-y" data-date="today"></div>
                            <table class="table" width="100%" border="1" cellpadding="0" cellspacing="0" id="table_book">
                                <thead>
                                    <tr class="table_bookyard">
                                        <th>Mã đặt sân <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Mã sân <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Tên sân <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Khung giờ <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Giá cả <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Khách hàng <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Tình trạng <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr class="table_bookyard" ondblclick="getrow(1)">
                                        <th>Mã đặt sân </th>
                                        <th>Mã sân </th>
                                        <th>Tên sân </th>
                                        <th>Khung giờ </th>
                                        <th>Giá cả </th>
                                        <th>Khách hàng </th>
                                        <th>Tình trạng </th>
                                    </tr>
                                    <tr class="table_bookyard">
                                        <th>Mã đặt sân </th>
                                        <th>Mã sân </th>
                                        <th>Tên sân </th>
                                        <th>Khung giờ </th>
                                        <th>Giá cả </th>
                                        <th>Khách hàng </th>
                                        <th>Tình trạng </th>
                                    </tr>
                                    <tr class="table_bookyard">
                                        <th>Mã đặt sân </th>
                                        <th>Mã sân </th>
                                        <th>Tên sân </th>
                                        <th>Khung giờ </th>
                                        <th>Giá cả </th>
                                        <th>Khách hàng </th>
                                        <th>Tình trạng </th>
                                    </tr>
                                </tbody>

                            </table>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">Thông tin khách đặt</div>
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
                                    <label class="control-label col-sm-4" >Giá:</label>
                                    <div class="col-sm-8">
                                        <label class="control-labe">220.000vnđ</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4" >Nội dung:</label>
                                    <div class="col-sm-8">
                                        <textarea class="form-control" rows="4"></textarea>
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
                                    <input style="margin-top: 20px" class="btn btn-default" type="button" value="Hủy"/>
                                </div>
                            </form>   
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
