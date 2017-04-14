<%-- 
    Document   : file_upload
    Created on : Mar 13, 2017, 8:43:54 PM
    Author     : VuDang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--import this two jquery-library.-->
        <script type="text/javascript" src="jquery.min.js"></script>
        <script type="text/javascript" src="jquery.form.js"></script>

        <!--script to display the preview of uploaded image-->
        <script type="text/javascript" >
            $(document).ready(function ()
            {
                $('#photoimg').change(function ()
                {
                    $("#imageform").ajaxForm(
                            {
                                target: '#preview'
                            }).submit();
                });
            });
        </script>

        <!--Form to upload file or image-->
        <form action="ajax_upload.jsp" id="imageform" method="post" enctype="multipart/form-data">

            Upload image from your computer<input type="file" id="photoimg" name="photoimg"/>

        </form>


        //div to display uploaded file
        <div id='preview'></div>
    </body>
</html>
