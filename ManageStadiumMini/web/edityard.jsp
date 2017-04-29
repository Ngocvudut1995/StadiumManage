<%-- 
    Document   : bill
    Created on : Apr 5, 2017, 6:41:43 PM
    Author     : VuDang
--%>

<%@page import="com.dut.stadium.model.Yard"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
       <%@include file="include/header.jsp" %>

 <script src="tinymce/js/tinymce/jquery.tinymce.min.js" type="text/javascript"></script>
        <script src="tinymce/js/tinymce/tinymce.min.js" type="text/javascript"></script>
        <script>tinymce.init({selector: 'textarea'});</script>
<%
    String id = request.getParameter("id");
      Yard Model = new Yard();
      String Insert;
    if(id != null){
      
        Model = Model.getByID(id);
        Insert = "edit";
    }else{
        Model.setIDYard(Model.getIDTuTang());
        Model.setStatus("activiting");
        Model.setTypeYard("5");
        Model.setPrice(150000);
         Model.setNameYard("");
        Model.setDecription("");
         Insert = "add";
    }
%>
<script>
    $(document).ready(function() {
        //Attach change eventhandler

        var status = '<%=Model.getStatus()%>';
        var type = '<%=Model.getTypeYard()%>';
        console.log(status + "," + type);

        if (status == 'activiting') {
            $("#Status").prop('selectedIndex', 0);
        } else if (status == 'reparing') {
            $("#Status").prop('selectedIndex', 1);
        }
        if (type == '5') {
            $("#TypeYard").prop('selectedIndex', 0);
        } else if (type == '7') {
            $("#TypeYard").prop('selectedIndex', 1);
        }


    });

    function upload() {
        //console.log("sdasdad");
        var formData = new FormData();
        var totalFiles = document.getElementById("FileUpload").files.length;
        for (var i = 0; i < totalFiles; i++) {
            var file = document.getElementById("FileUpload").files[i];

            formData.append("FileUpload", file);
        }
        $.ajax({
            type: "POST",
            url: '/uploadyard.do?id=<%=Model.getIDYard()%>',
            data: formData,
            dataType: 'json',
            contentType: false,
            processData: false,
            success: function(response) {
                swal({
                    title: 'Thông báo',
                    text: "Bạn đã chỉnh sửa thành công",
                    type: 'success',
                    //showCancelButton: true,
                    confirmButtonColor: '#3085d6',
                    //cancelButtonColor: '#d33',
                    confirmButtonText: 'OK!',
                    //cancelButtonText: 'No, cancel!',
                    confirmButtonClass: 'btn btn-success',
                    //cancelButtonClass: 'btn btn-danger',
                    //buttonsStyling: false
                }).then(function() {
                        window.location.href = "/manageyard.jsp";
                    }
                );
                // alert('succes!!');
            },
            error: function(error) {
                swal("Thông báo", "Đăng nhập thất bại! Vui lòng thử lại!", "error");
            }
        });
    }

    function updateYard() {
        console.log((tinyMCE.get('Decription').getContent()));
        var data = JSON.stringify({
            "IDYard": $('#IDYard').val(),
            "NameYard": $('#NameYard').val(),
            "Address": $('#Address').val(),
            "Status": $("#Status").prop('selectedIndex') == 0 ? 'activiting' : 'reparing',
            "TypeYard": $("#TypeYard").prop('selectedIndex') == 0 ? '5' : '7',
            "Price": $('#Price').val(),
            "Decription": tinyMCE.get('Decription').getContent()
        });
        console.log(data);
        $.ajax({
            type: "POST",
            url: '/<%=Insert%>yard/',
            contentType: "application/json; charset=utf-8",
            data: "{data:" + data + "}",
            //dataType: 'json',
            //async: true,
            //processData: false,
            //cache: false,
            success: function(data) {
                //alert('success');
                console.log(data.result);
                if (data.result == "existed") {
                    swal("Thông báo", "Tên sân đã tồn tại", "error");
                } else {
                   upload();
                }
             
                //window.location.href = '/Accounts/Customer';
            },
            error: function() {
                //alert('Some error occured');
            }
        });

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
                        Chỉnh sửa thông tin sân bóng
                    </h4>
                </div>
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <div class="panel panel-default">
                        <div class="panel-heading"><b>Thông tin sân bóng</b></div>
                        <div class="panel-body">

                            <div class="form-group">
                                <label class="control-label col-sm-4">Mã sân:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="IDYard" value="<%=Model.getIDYard()%>" readonly />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Tên sân:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="NameYard" value="<%=Model.getNameYard()%>" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Loại sân:</label>
                                <div class="col-sm-8">
                                    <select class="form-control" id="TypeYard">
                                        <option>5 người</option>
                                        <option>7 người</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Tình trạng:</label>
                                <div class="col-sm-8">
                                    <select class="form-control" id="Status">
                                        <option>Đang hoạt động</option>
                                        <option>Đang sửa chữa</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Hình ảnh:</label>
                                <div class="col-sm-8">
                                    <input type="file" class="form-control" id="FileUpload" multiple />
                                    
                                </div>
                            </div>
                            

                            <div class="form-group">
                                <label class="control-label col-sm-4">Giá:</label>
                                <div class="col-sm-8">
                                    <input class="form-control" type="number" id="Price" value="<%=Model.getPrice()%>" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-4">Mô tả</label>
                                <div class="col-sm-8">
                                    <textarea id="Decription"><%=Model.getDecription()%></textarea>
                                </div>
                            </div>
                            <div class="form-group" style="text-align: center;">
                                <button style="margin-top: 20px" class="btn btn-primary" onclick="updateYard()">Lưu</button>
                                <button style="margin-top: 20px" class="btn btn-warning" onclick="reset_form()">Reset</button>
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
