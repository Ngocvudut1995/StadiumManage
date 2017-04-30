<%-- 
    Document   : upload
    Created on : Apr 30, 2017, 10:38:49 PM
    Author     : VuDang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="script/jquery-1.11.3.min.js" type="text/javascript"></script>
    </head>
   
    <body>
         <center>
        <form method="post" action="uploadFile" enctype="multipart/form-data">
            Select file to upload:
            <input type="file" name="uploadFile" />
            <br/><br/>
            <input type="submit" value="Upload" />
        </form>
            
    </center>
    </body>
</html>
