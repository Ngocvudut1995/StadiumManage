<%-- 
    Document   : bill
    Created on : Apr 5, 2017, 6:41:43 PM
    Author     : VuDang
--%>

<%@ page import="java.sql.*,java.util.*" %>
<%@page import="com.dut.stadium.util.MSSQLConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="script/jquery-1.11.3.min.js" type="text/javascript"></script>
        <script src="script/bootstrap.min.js" type="text/javascript"></script>
    </head>
    <body>
    	<%
    		String maHD = request.getParameter("maHD");
    		MSSQLConnection db = new MSSQLConnection();
    		boolean b = db.execute("update bill set Status = '1' where IDBill = '" + maHD + "'");
    		if(b){
    			response.sendRedirect("bill.jsp?idBill=" + maHD);
    			out.print("Cap nhat thanh cong!");
    		}
    		
    	%>
    </body>
</html>
