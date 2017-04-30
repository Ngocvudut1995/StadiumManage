

<%@page import="com.dut.stadium.model.BillDetail"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
           
        <script src="script/colResizable-1.6.min.js" type="text/javascript"></script>
        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
     
     
    </head>
    <body>
  <%@include file="include/header.jsp" %>
<script type="text/javascript" charset="utf8" src="~/Scripts/colResizable-1.6.min.js"></script>
<link href="css/bootstrap-formhelpers.min.css" rel="stylesheet" />
<script src="script/bootstrap-formhelpers.min.js"></script>
<script>
   

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
                                    <%
                                        double totalPrice = 0;
                                    	int count = 0;
                                    %>
                                    
                                        <% try {
                                            BillDetail bill_deDetail = new BillDetail();
                                            for(BillDetail item:bill_deDetail.getAll())
                                        {
                                            count++;
                                            double price = (1 - item.Bill.getPromotion()) * (item.Bill.getPriceService() + item.Bill.getPriceYard());
                                            totalPrice += price;%>
                                            <tr class="table_bookyard" ondblclick="openEdit('<%=item.Bill.getIDBill()%>')" onMouseOver="this.style.color='#00F'" onMouseOut="this.style.color='#000'">   
    

                                                <td><%=item.Bill.getIDBill()%></td>
                                                <td><%=item.AccountStaff.getNameAccount()%></td>
                                                <td><%=item.Bill.getIDYard()%></td>
                                                <td><%=item.Yard.getNameYard()%></td>
                                                <td><%=item.TimeSlot%></td>
                                                <td><%=item.AccountCustomer.getNameAccount()%></td>
                                                <td>
                                                    <%if (item.Bill.isStatus() == true)
                                                {out.print("Đã thanh toán");}
                                                else
                                                {out.print("Chưa thanh toán");}%>
                                            </td>
                                            <td><%=price%></td>
                                            <td><%=item.Bill.getDatePay()%></td>
                                        </tr>
                                        <%}} catch (Exception e) {
                                            }%>

                                    

                                </table>
                            </div>

                            <div>
                                <label style="float: left">Số lượng hóa đơn : <% out.print(count); %></label>
                                <label style="float: right">Tổng tiền: <% out.print(totalPrice); %> vnđ</label>
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
            //location.href = 'Index/' + id;
            location.href = 'bill.jsp?idBill=' + id;
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
