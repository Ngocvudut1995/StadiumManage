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
            <h1 style="text-align: center;">Quản lý chi phí hóa đơn</h1>

            <div class="col-md-12">
                <div class="panel panel-default">
                    <div class="panel-heading">Chí phí hóa đơn</div>
                    <div class="panel-body" style="overflow: auto;white-space: nowrap;max-height: 4000px;">
                        <div style="width: 100%;height: 45px">
                            <div id="dtpDate" style="width: 30%;float: right;"class="bfh-datepicker" data-format="d-m-y" data-date="today"></div>
                        </div>

                        <table class="table" width="100%" border="1" cellpadding="0" cellspacing="0" id="table_bill">
                            <thead>
                                <tr class="table_bill">
                                    <th>Mã hóa đơn <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>Tên nhân viên <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>Mã sân <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>Tên sân <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>Khung giờ <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>Khách hàng <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>Tình trạng <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>Giá cả <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    <th>Thời gian thanh toán <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr class="table_bookyard" ondblclick="getrow(1)">
                                    <td>HD1001 </td>
                                    <td>Trần Văn A </td>
                                    <td>S1001A </td>
                                    <td>Sân số 5A </td>
                                    <td>17h-19h </td>
                                    <td>Nguyễn Văn A</td>
                                    <td>Đã thanh toán</td>
                                    <td>Giá cả</td>
                                    <td>15:40 20/11/2016</td>
                                </tr>
                                <tr class="table_bookyard" ondblclick="getrow(1)">
                                    <td>HD1001 </td>
                                    <td>Trần Văn A </td>
                                    <td>S1001A </td>
                                    <td>Sân số 5A </td>
                                    <td>17h-19h </td>
                                    <td>Nguyễn Văn A</td>
                                    <td>Đã thanh toán</td>
                                    <td>Giá cả</td>
                                    <td>15:40 20/11/2016</td>
                                </tr>
                                 <tr class="table_bookyard" ondblclick="getrow(1)">
                                    <td>HD1001 </td>
                                    <td>Trần Văn A </td>
                                    <td>S1001A </td>
                                    <td>Sân số 5A </td>
                                    <td>17h-19h </td>
                                    <td>Nguyễn Văn A</td>
                                    <td>Đã thanh toán</td>
                                    <td>Giá cả</td>
                                    <td>15:40 20/11/2016</td>
                                </tr>
                            </tbody>

                        </table>
                        <div>
                            <label style="float: left">Số lượng hóa đơn : 3</label>
                            <label style="float: right">Tổng tiên: 2000000vnđ</label>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
</body>
</html>
