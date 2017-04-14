<%-- 
    Document   : demoupload
    Created on : Mar 13, 2017, 7:53:58 PM
    Author     : VuDang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="script/jquery-1.11.3.min.js" type="text/javascript"></script>
        <script src="script/bootstrap.min.js" type="text/javascript"></script>

        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript">
            $(document).ready(function () {
                var files = null; // when files input changes this will be initiliazed.
                //var data = new FormData();
//        $.each(f, function(key, value)
//        {
//            data.append(key, value);
//        });
                $(function () {
                    $('#form2Submit').on('submit', uploadFile);
                });

                function uploadFile(event) {
                    event.stopPropagation();
                    event.preventDefault();
                    //var files = files;
                    //var form = document.getElementById('form2Submit');
                    // var data = new FormData(form);
                    var data = new FormData();
                    var f = $('#fileSelect')[0].files;

                   // console.log(f);
                    $.each($('#fileSelect')[0].files, function (key, value)
                    {
                        data.append(key, value);
                    });

                    //console.log(data);
                    postFilesData(data);
                }

                function postFilesData(data) {
                    $.ajax({
                        url: 'uploadfile.do',
                        type: 'POST',
                        data: data,
                        cache: false,
                        dataType: 'json',
                        processData: false,
                        contentType: false,
                        success: function (response) {
                            console.log(response);
                            //alert(response);
                            if (response.toString().lastIndexOf('true') > -1){
                                //sohinh = response.toString().split(',');
                                alert("Upload Successful");
                            }
                            else if (response.toString() == 'false') {
                                alert("Upload error");
                            }
                        },
                        error: function (response) {
                            alert('ERRORS: ');
                        }
                    });
                }
            });
        </script>
    </head>

    <body>

        <form id ="form2Submit">
            <input id="fileSelect" name="fileSelect[]" type="file" multiple accept=".jpg,.png">
            <br>
            <input type="submit" value="Submit">
        </form>
        <!--        <form method="post" action="uploadfile.do" enctype="multipart/form-data">
                    Select file to upload:
                    <input type="file" name="uploadFile" />
                    <br/><br/>
                    <input type="submit" id="upload-button" value="Upload" />
                </form>-->

    </body>
</html>
