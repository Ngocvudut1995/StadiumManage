<%-- 
    Document   : managebill2
    Created on : Apr 30, 2017, 5:54:13 PM
    Author     : VuDang
--%>

<%@page import="com.dut.stadium.model.BillDetail"%>
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
      
    </div>
</div>
    </body>
</html>
