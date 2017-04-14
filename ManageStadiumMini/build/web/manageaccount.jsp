<%-- 
    Document   : managebill
    Created on : Apr 5, 2017, 7:13:32 PM
    Author     : VuDang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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

                $("#table_bill").colResizable({
                    liveDrag: true,
                    gripInnerHtml: "<div class='grip'></div>",
                    draggingClass: "dragging",
                    resizeMode: 'overflow'
                });
                $('#table_bill tbody tr').click(function (e) {
                    console.log("sdsd");
                    $('#table_bill tbody tr').removeClass('highlighted');
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
         <style>
            .table_bill > th,td {
                padding-left: 10px;
                padding-right: 10px;
                font-size: 16px;
            }
            .highlighted {
                background-color: red;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1 style="text-align: center;">Quản lý tài khoản</h1>

            <div class="col-md-12">
                <div class="panel panel-default">
                    <div class="panel-heading">Quản lý tài khoản</div>
                    <div class="panel-body" >
                        <div style="width: 100%;height: 45px">
                            <div id="dtpDate" style="width: 30%;float: right;"class="bfh-datepicker" data-format="d-m-y" data-date="today"></div>
                        </div>
                        <div style="overflow: scroll;white-space: nowrap;max-height: 4000px;">
                            <table  class="table" width="100%" border="1" cellpadding="0" cellspacing="0" id="table_bill">
                            <thead>
                                <tr class="table_bill">
                                    <th>Mã tài khoản<a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>Tên tài khoản<a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>Ngày sinh<a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>Địa chỉ<a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>Số điện thoại<a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>Email<a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>CMND<a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>Thời gian đăng kí<a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>Phân quyền<a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>Tiền lương<a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr class="table_bookyard" ondblclick="getrow(1)">
                                    <%
                                        for(int i= 0;i<10;i++){
                                            
                                        }
                                    %>
                                    <td>TK1001</td>
                                    <td>Đặng Ngọc Vũ</td>
                                    <td>29/04/1995</td>
                                    <td>140 Hoàng Diệu</td>
                                    <td>01266555022</td>
                                    <td>ngocvudut1995@gmail.com</td>
                                    <td>201694551</td>
                                    <td>01/01/2017</td>
                                    <td>Nhân viên</td>
                                    <td>4500000</td>
                                </tr>
                              <tr class="table_bookyard" ondblclick="getrow(1)">
                                    <td>TK1001</td>
                                    <td>Đặng Ngọc Vũ</td>
                                    <td>29/04/1995</td>
                                    <td>140 Hoàng Diệu</td>
                                    <td>01266555022</td>
                                    <td>ngocvudut1995@gmail.com</td>
                                    <td>201694551</td>
                                    <td>01/01/2017</td>
                                    <td>Nhân viên</td>
                                    <td>4500000</td>
                                </tr>
                                <tr class="table_bookyard" ondblclick="getrow(1)">
                                    <td>TK1001</td>
                                    <td>Đặng Ngọc Vũ</td>
                                    <td>29/04/1995</td>
                                    <td>140 Hoàng Diệu</td>
                                    <td>01266555022</td>
                                    <td>ngocvudut1995@gmail.com</td>
                                    <td>201694551</td>
                                    <td>01/01/2017</td>
                                    <td>Nhân viên</td>
                                    <td>4500000</td>
                                </tr>
                            </tbody>

                        </table>
                        </div>
                        
                        <div>
                            <button class="btn btn-default" style="float: right; margin-left: 20px">Xóa</button>
                          <button class="btn btn-default" style="float: right;margin-left: 20px">Sửa</button>
                            <button class="btn btn-default" style="float: right;margin-left: 20px">Thêm</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
</body>
</html>
