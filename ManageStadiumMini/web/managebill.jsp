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
     
     
    </head>
    <body>
  <%@include file="include/header.jsp" %>
<script type="text/javascript" charset="utf8" src="~/Scripts/colResizable-1.6.min.js"></script>
<link href="~/Content/bootstrap-formhelpers.min.css" rel="stylesheet" />
<script src="~/Scripts/bootstrap-formhelpers.min.js"></script>
<script>
    var CurrentSort = '@ViewBag.CurrentSort';

    function sort(sortOrder) {

        if (CurrentSort.lastIndexOf("_") > 0) {
            location.href = 'Manage?sortOrder=' + sortOrder;
        } else {
            location.href = 'Manage?sortOrder=' + sortOrder + "_desc";
        }

    }
</script>
<div class="container-fluid" style="padding: 0px;">
    <div class="row" style="padding: 0px;">
        <div class="col-md-3" style="" ng-style="">
          <%@include file="include/navAccount.jsp" %>
        </div>
        <div class="col-md-9" style="height: 100%;">
            <div>
               
                <div style="background-color: #C1C1C1; margin-bottom: 20px; height: 40px">
                    <h4 style="color: white; text-transform: uppercase; font-weight: bold; border-bottom: 1px solid #dedede;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  background-color: #36ace2; float: none; padding: 9px 20px 10px; line-height: 30px">
                        Quản lý chi phí hóa đơn
                    </h4>
                </div>
               
                <div class="col-md-12">
                    <div class="panel panel-default" style="min-height: 350px">
                        <div class="panel-heading">Chí phí hóa đơn</div>
                        <div class="panel-body">
                            <div style="width: 100%;height: 45px">
                                <div id="dtpDate" style="width: 30%;float: right;" class="bfh-datepicker" data-format="d-m-y" data-date="today"></div>
                            </div>
                            <div style="overflow: auto;white-space: nowrap;max-height: 4000px;">
                                <table class="table" width="100%" border="1" cellpadding="0" cellspacing="0" id="table_bill">
                                    <thead>
                                    <tr class="table_bill info">
                                        <th>Mã hóa đơn <a onclick=" sort('id') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Tên nhân viên <a onclick=" sort('namestaff') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Mã sân <a onclick=" sort('yard') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Tên sân <a onclick=" sort('nameyard') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Khung giờ <a onclick=" sort('tslot') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Khách hàng <a onclick=" sort('namecustomer') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Tình trạng <a onclick=" sort('status') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Giá cả <a onclick=" sort('price') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Thời gian thanh toán <a onclick=" sort('date') "> <i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                    </tr>
                                    </thead>
                                    @{
                                        double totalPrice = 0;
                                    }
                                    <tbody>
                                        @foreach (var item in Model)
                                        {
                                            double price = (1 - item.Bill.Promotion) * (item.Bill.PriceService + item.Bill.PriceYard);
                                            totalPrice += price;
                                            <tr class="table_bookyard" ondblclick="openEdit('@item.Bill.IDBill')">

                                                <td>@item.Bill.IDBill</td>
                                                <td>@item.AccountStaff.NameAccount</td>
                                                <td>@item.Bill.IDYard</td>
                                                <td>@item.Yard.NameYard</td>
                                                <td>@item.TimeSlot</td>
                                                <td>@item.AccountCustomer.NameAccount</td>
                                                <td>
                                                    @if (item.Bill.Status == true)
                                                {@Html.Raw("Đã thanh toán")}
                                                else
                                                {@Html.Raw("Chưa thanh toán")}
                                            </td>
                                            <td>@Html.Raw(price.ToString())</td>
                                            <td>@item.Bill.DatePay</td>
                                        </tr>
                                        }

                                    </tbody>

                                </table>
                            </div>

                            <div>
                                <label style="float: left">Số lượng hóa đơn : @Model.ToList().Count</label>
                                <label style="float: right">Tổng tiên: @totalPrice vnđ</label>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<script type="text/javascript">
    function openEdit(id) {
        if (id != 0) {
            location.href = 'Index/' + id;
            //console.log(id);
        }
    }

    $(document).ready(function () {
        //$("#table_bill").colResizable({
        //    liveDrag: true,
        //    gripInnerHtml: "<div class='grip'></div>",
        //    draggingClass: "dragging",
        //    resizeMode: 'overflow'
        //});
        $('#table_bill tbody tr').click(function (e) {
            console.log("sdsd");
            $('#table_bill tbody tr').removeClass('success');
            $(this).addClass('success');
        });
        $('#dtpDate').on('change.bfhdatepicker', function (e) {
            //Assign the value to Hidden Variable
            console.log($('#dtpDate').val());
        });
    });

</script>

    </div>

</div>
</body>
</html>
