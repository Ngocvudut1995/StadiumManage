<%-- 
    Document   : yard
    Created on : Apr 14, 2017, 7:57:43 PM
    Author     : VuDang
--%>

<%@page import="com.dut.stadium.model.Account"%>
<%@page import="com.dut.stadium.util.MSSQLConnection"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Date"%>
<%@page import="com.dut.stadium.model.TimeSlot"%>
<%@page import="com.dut.stadium.model.YardView"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <%@include file="include/header.jsp" %>
        <link href="css/bootstrap-formhelpers.min.css" rel="stylesheet" />
        <script src="script/bootstrap-formhelpers.min.js"></script>
        <%
            YardView Model = new YardView();
            Model = Model.getID(request.getParameter("id"));
            if(session.getAttribute("userid")!=null){
                 Account account = new Account();
                 account = account.getByID(session.getAttribute("userid").toString());
                 Model.Account = account;
            }
           
        %>
        <script>
            function changeTimeSlot() {
                //     console.log($('#IDTimeSlot').val());
                if ($('#IDTimeSlot').val() > 12) {
                    $('#Price').val('<%=Model.Yard.getPrice() + 40000%>');
                } else {
                    $('#Price').val('<%=Model.Yard.getPrice()%>');
                }
            }
            function changeDateBook() {
                //   console.log(new Date($('#DateBook').val()));
                $.ajax({
                    type: "GET",
                    url: 'getTimeSlot.do?id=<%=Model.Yard.getIDYard()%>&date=' + $('#DateBook').val(),
                    contentType: "application/json; charset=utf-8",
                    success: function (data) {
                      console.log(data);
                        var s = "<option>--Chọn khung giờ--</option>";
                        for (var i = 0; i < data.length; i++) {
                            s += '<option value = "' + data[i].IDTimeSlot + '">' + data[i].TimeSlot + '</option>';
                        }
                        $('#IDTimeSlot').html(s);
                        //window.location.href = '/Home/';
                    }, error: function () {
                        alert('Some error occured');
                    }
                });
            }
            function changeCalendar(date) {
                console.log('getCalendar.do?id=<%=Model.Yard.getIDYard()%>&date=' + date);
                $.ajax({
                    type: "GET",
                    url: 'getCalendar.do?id=<%=Model.Yard.getIDYard()%>&date=' + date,
                    contentType: "application/json; charset=utf-8",
                    success: function (data) {
                        //alert('success');
                        console.log(data);
                        var s = "";
                        for (var i = 0; i < data.length; i++) {
                            s += ' <tr class="">';
                            s += '  <td><%=Model.Yard.getNameYard()%></td>';
                            s += '  <td>' + (data[i].TotalPrice + <%=Model.Yard.getPrice()%>) + '</td>';
                            s += '  <td>' + data[i].DateBook + '</td>';
                            s += '  <td>' + data[i].TimeSlot + '</td>';
                            s += '  <td>Đã đặt sân</td>';
                            s += '  </tr>';
                        }
                        $('#table_calendar').html(s);
                        //window.location.href = '/Home/';
                    }, error: function () {
                        alert('Some error occured');
                    }
                });
            }

            function EmailExisted(email) {
                console.log(email);
                $.ajax({
                    type: "GET",
                    url: 'EmailExisted.do?email=' + email,
                    contentType: "application/json; charset=utf-8",
                    success: function (data) {
                        console.log(data)
                        if (data == "True") {
                            $('#submit').prop('disabled', 'disabled');
                            swal("Thông báo", "Email đã tồn tại mời bạn đăng nhập", "error");
                            return true;
                        }
                         $('#submit').prop('disabled', false);
                        return false;
                    }, error: function () {
                        swal("Thông báo", "Đã có lỗi xảy ra", "error");
                        return true;
                    }
                });
                //return true;
            }
            console.log($('#IDTimeSlot').val());
            function bookyard() {
                var test = true;
            <% if (session.getAttribute("userid") != null) {%>
                test = false
            <%} else {%>
                test = EmailExisted($('#Email').val());
            <% }%>

                console.log(test);
                if (test !== true) {
                    console.log($('#IDTimeSlot').val());
                    var data;
                    var ListIDService = "1";
                    data = JSON.stringify({
                        
                            "IDYard": "<%=Model.Yard.getIDYard()%>",
                            "DateBook": new Date($('#DateBook').val()),
                            "IDTimeSlot": $('#IDTimeSlot').val(),
                            "Contents": $('#Contents').val(),
                            "ListIDService": ListIDService,
                            "Address": $('#Address').val(),
                            "NameAccount": $('#NameAccount').val(),
                            "Phone": $('#Phone').val(),
                            "Email": $('#Email').val()
                      


                    });
                    console.log(data);
                    $.ajax({
                        type: "POST",
                        url: 'BookYard.do',
                        contentType: "application/json; charset=utf-8",
                        data:data,
                        success: function (result) {
                            swal({
                                title: 'Thông báo',
                                text: "Bạn đã đặt sân thành công",
                                type: 'success',
                                //showCancelButton: true,
                                confirmButtonColor: '#3085d6',
                                //cancelButtonColor: '#d33',
                                confirmButtonText: 'OK!',
                                //cancelButtonText: 'No, cancel!',
                                confirmButtonClass: 'btn btn-success',
                                //cancelButtonClass: 'btn btn-danger',
                                //buttonsStyling: false
                            }).then(function () {
                                window.location.href = "yard.jsp?id=<%=Model.Yard.getIDYard()%>";
                            });
                            // alert('success');
                            //window.location.href = '/Home/';
                        }, error: function () {
                            swal("Thông báo", "Đặt sân thất bại! Vui lòng thử lại", "error");
                        }
                    });
                }

            }
        </script>
        <style type="text/css">

        </style>
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-8">
                    <div id="myCarousel" class="carousel">

                        <div class="item loginmodal-container">
                            <div style="width: 100%; position: relative">
                                <img src="<%=Model.Yard.getImage()%>" class="img-responsive" style="width: 100%" alt="Image">
                                <h2 style="position: absolute; bottom: 0px; margin-bottom: 0px; margin-right: 30px;
                                    padding-left: 20px; background: rgba(42, 40, 40, 0.69); color: white; width: 100%">
                                    Sân <%=Model.Yard.getTypeYard()%> người - <%=Model.Yard.getNameYard()%>
                                </h2>
                            </div>

                        </div>
                    </div>
                    <br>
                    <div class="loginmodal-container">
                        <fieldset>
                            <legend>Thông tin sân bóng</legend>
                            <ul class="clearfix" style="display: block; list-style-type: square;">
                                <li class="col-md-6 col-xs-12"><p>Tình trạng: Đang hoạt động</p></li>
                                <li class="col-md-6 col-xs-12"><p>Loại sân: Cỏ nhân tạo</p></li>
                                <li class="col-md-12 col-xs-12"><p>Giá: <%=Model.Yard.getPrice()%> vnđ/giờ (Sau 17h30 thêm 40000 vnđ/giờ tiền đèn chiếu sáng)</p></li>
                                <li class="col-md-6 col-xs-12"><p>Quận/Huyện: Liên Chiểu</p></li>
                            </ul>


                        </fieldset>
                    </div>
                    <br>
                    <div class="loginmodal-container">
                        <div class="panel panel-default" style="min-height: 350px">
                            <div class="panel-heading">
                                <h4>Lịch sân bóng</h4>


                            </div>
                            <div class="panel-body">
                                <div id="dtpDate" style="height: 40px;width: 30%; font-size: 16px; float: left;" data-min="today" class="bfh-datepicker" data-format="d-m-y" data-date="today"></div>
                                <table class="table" width="100%" border="1" cellpadding="0" cellspacing="0" id="table_account">
                                    <thead>

                                        <tr class="table_account info">

                                            <th>Sân bóng<a onclick="sort('name')"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                            <th>Giá tiền<a onclick="sort('birth')"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                            <th>Ngày<a onclick="sort('address')"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                            <th>Khung giờ<a onclick="sort('tel')"><i class="fa fa-sort" aria-hidden="true"></i></a></th>
                                            <th>Đã đặt<a onclick="sort('email')"><i class="fa fa-sort" aria-hidden="true"></i></a></th>

                                        </tr>
                                    </thead>
                                    <tbody id="table_calendar">

                                    </tbody>

                                </table>



                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
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
                            <div class="form-horizontal">

                                <!-- Text input-->
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="name">Họ và tên</label>
                                    <div class="col-md-8">
                                        <input id="NameAccount" name="name"
                                               type="text" placeholder="Họ và tên"
                                               class="form-control input-md" required value="<%if (Model.Account != null) {
                                                       out.print(Model.Account.getNameAccount());
                                                       ;
                                                   }%>">

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
                                        <select id="IDTimeSlot" name="selecttime" class="form-control input-md" onchange=" changeTimeSlot()">
                                            <option>--Chọn khung giờ--</option>
                                            <%for (TimeSlot item : Model.ListTimeslot) {%>
                                            <option value="<%=item.getIDTimeSlot()%>"><%=item.getTimeSlot()%></option>
                                            <%}%>

                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-4">Ngày đặt: </label>
                                    <div class="col-sm-8">
                                        <input type="date" class="form-control" id="DateBook" onblur="changeDateBook()" value="<% SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd");
                                            out.print(sdfr.format(new Date()));%>">
                                    </div>
                                </div>
                                <!-- Text input-->
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="ln">Giá</label>
                                    <div class="col-md-8">
                                        <input name="amount" readonly type="number" placeholder="" class="form-control input-md" required id="Price">
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
                                        <button id="submit" name="submit" class="btn btn-primary" onclick=" bookyard()">Đặt sân</button>
                                    </div>
                                </div>

                            </div>
                        </fieldset>

                    </div>
                </div>
            </div>
        </div>

        <script>
            $(document).ready(function () {
                changeDateBook();
                changeCalendar($('#dtpDate').val());
            <%
                    if (Model.Account != null) {%>
                $('#Address').prop('readonly', true);
                $('#NameAccount').prop('readonly', true);
                $('#Phone').prop('readonly', true);
                $('#Email').prop('readonly', true);
                $('#Address').val('<%=Model.Account.getAddress()%>');
                $('#Phone').val('<%=Model.Account.getPhone()%>');
                $('#Email').val('<%=Model.Account.getEmail()%>');
            <%}%>

                $('#dtpDate').on('change.bfhdatepicker', function (e) {
                    //Assign the value to Hidden Variable
                    changeCalendar($('#dtpDate').val());
                });
            });
        </script>

    </body>
</html>
