<%-- 
    Document   : managebill
    Created on : Apr 5, 2017, 7:13:32 PM
    Author     : VuDang
--%>

<%@page import="com.dut.stadium.model.Yard"%>
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
<script type="text/javascript">
    var id = 0;
    function openCreate() {
        id = 0;
        location.href = 'edityard';
    }
    function openEdit() {
        if (id === 0) {
            location.href = 'edityard';
        } else {
            location.href = 'edityard?id=' + id;
        }
    }
        function getrow(value) {
            id = value;
        //console.log(id);
    }
    $(function () {

        //$("#table_yard").colResizable({
        //    liveDrag: true,
        //    gripInnerHtml: "<div class='grip'></div>",
        //    draggingClass: "dragging",
        //    resizeMode: 'overflow'
        //});
        $('#table_yard tbody tr').click(function (e) {
            console.log("sdsd");
            $('#table_yard tbody tr').removeClass('success');
            $(this).addClass('success');
        });
    });
</script>
<script>
    $(document).ready(function() {
        //Attach change eventhandler
        $('#dtpDate').on('change.bfh-datepicker', function(e) {
            //Assign the value to Hidden Variable
            console.log($('#dtpDate').val());
        });
    });
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
                       Quản lý sân bóng
                    </h4>
                </div>

                <div class="col-md-12">
                    <div class="panel panel-default" style="min-height: 350px">
                        <div class="panel-heading">Danh sách sân bóng</div>
                        <div class="panel-body" style="overflow: auto;white-space: nowrap;max-height: 4000px;">


                            <table class="table" width="100%" border="1" cellpadding="0" cellspacing="0" id="table_yard">
                                <thead>
                                    <tr class="table_yard info">
                                        <th>Mã sân <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Tên sân <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Loại sân <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Tình trạng <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                        <th>Giá cả <a href="#"><i class="fa fa-sort" aria-hidden="true"></i></a></th>

                                    </tr>
                                </thead>
                                <tbody>
                                    <% 
                                        Yard yard = new Yard();
                                    for(Yard item : yard.getAll()){
                                        %>
                                  
                                        <tr class="table_bookyard" onclick="getrow('<%=item.getIDYard()%>')">
                                            <td><%=item.getIDYard()%></td>
                                            <td><%=item.getNameYard()%></td>
                                            <td><%=item.getTypeYard()%> người</td>
                                            <td><%=item.getStatus()%></td>
                                            <td><%=item.getPrice()%></td>
                                        </tr>
                                   <% }%>

                                </tbody>

                            </table>
                            <div>
                                <button class="btn btn-danger" style="float: right; margin-left: 20px">Xóa</button>
                                <button class="btn btn-warning" style="float: right; margin-left: 20px"
                                        onclick="openEdit()">
                                    Sửa
                                </button>
                                <button class="btn btn-primary" style="float: right; margin-left: 20px"
                                        onclick="openCreate()">
                                    Thêm
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>
