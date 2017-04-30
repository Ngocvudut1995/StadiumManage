<%-- 
    Document   : addAccount
    Created on : Apr 23, 2017, 6:41:49 PM
    Author     : VuDang
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%@include file="include/header.jsp" %>

<script>
    function addAccount() {
        var data, url;
        if ($("#Position").prop('selectedIndex') == 0) {
            data = JSON.stringify({
                "Level": $('#Level').val(),
                    "Birthday": new Date($('#Birthday').val()),
                    "Address": $('#Address').val(),
                    "NameAccount": $('#NameAccount').val(),
                    "Identification": $('#Identification').val(),
                    "Phone": $('#Phone').val(),
                    "Email": $('#Email').val()

           

            });
            url = 'customer';
        } else {
            data = JSON.stringify({
                "Position": $("#Position").prop('selectedIndex') == 1 ? 'Employee' : 'Manager',
                "Salary": $("#Salary").val(),
                    "Birthday": new Date($('#Birthday').val()),
                    "Address": $('#Address').val(),
                    "NameAccount": $('#NameAccount').val(),
                    "Identification": $('#Identification').val(),
                    "Phone": $('#Phone').val(),
                    "Email": $('#Email').val()

            });
            url = 'staff';
        }

        console.log(data);
        $.ajax({
            type: "POST",
            url: 'Create' + url+".do",
            contentType: "application/json; charset=utf-8",
            data:data,
            //dataType: 'json',
            //async: true,
            //processData: false,
            //cache: false,
            success: function(result) {
                //alert('success');
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
                   window.location.href = url+".jsp";
                });

            },
            error: function() {
                alert('Some error occured');
            }
        });
    }

    $(document).ready(function() {

        $("#form_salary").hide();
        $("#Position").on('change', function() {
            var index = $("#Position").prop('selectedIndex');
            //console.log(index);
            if (index !== 0) {
                $("#form_salary").show();
            } else {
                $("#form_salary").hide();
            }
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
                       Thêm tài khoản
                    </h4>
                </div>
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <div class="panel panel-default">
                        <div class="panel-heading" style="font-weight: bold">Thông tin tài khoản</div>
                        <div class="panel-body form-horizontal">
                            <div class="form-group">
                                <label class="control-label col-sm-4">Tên tài khoản:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="NameAccount" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Ngày sinh:</label>
                                <div class="col-sm-8">
                                    <input type="date" class="form-control" id="Birthday" max="<% SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd");out.print(sdfr.format(new Date()));%>" min="1911-01-01" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Địa chỉ:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="Address" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">CMND:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="Identification" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Số điện thoại:</label>
                                <div class="col-sm-8">
                                    <input type="tel" class="form-control" id="Phone" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Email: </label>
                                <div class="col-sm-8">
                                    <input type="email" class="form-control" id="Email" />
                                </div>
                            </div>
                         
                            <div class="form-group">
                                <label class="control-label col-sm-4">Phân quyền: </label>
                                <div class="col-sm-8">
                                    <select class="form-control" id="Position" onchange="changePosition()">
                                        <option>Khách hàng</option>
                                        <option>Nhân viên</option>
                                        <option>Quản lý</option>
                                    </select>

                                </div>
                            </div>
                            <div class="form-group" id="form_salary">
                                <label class="control-label col-sm-4">Lương:</label>
                                <div class="col-sm-8">
                                    <input type="number" id="Salary" class="form-control" />
                                </div>
                            </div>
                            <div class="form-group" style="text-align: center;">
                                <button style="margin-top: 20px" class="btn btn-primary" onclick="addAccount()">Lưu</button>
                                <input style="margin-top: 20px" class="btn btn-danger" type="reset" value="Hủy" />
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
