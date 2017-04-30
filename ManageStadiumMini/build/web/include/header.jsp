<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<link href="css/Site.css" rel="stylesheet" type="text/css"/>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
 <script src="script/jquery-1.11.3.min.js" type="text/javascript"></script>
        <script src="script/bootstrap.min.js" type="text/javascript"></script>
        <link href="css/font-awesome.min.css" rel="stylesheet" />
        <link href="css/sweetalert2.min.css" rel="stylesheet" />
        <script src="script/sweetalert2.min.js"></script>
        <script src="script/jquery.validate.min.js"></script>
<nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="home.jsp" style="padding: 0px">
                  
                    <img  class="hidden-xs" src="Content/Logo/coollogo_com-367326.png" style="width: 100%"/>
                </a>
            </div>
            <div class="collapse navbar-collapse" id="myNavbar">
               
                    <ul class="nav navbar-nav" id="mynav">
                        <li class='<%if (true)
                               {
                                   out.print("active");
                                  
                               } %>'><a href="home.jsp">Trang chủ</a></li>
                        <li class='<%if (false)
                               {
                                   out.print("active");
                                  
                               } %>'><a href="#">Giới thiệu</a></li>

                        <li class='<%if (false)
                               {
                                   out.print("active");
                                  
                               } %>'><a href="#">Khuyến mãi</a></li>

                        <li class='<%if (false)
                               {
                                   out.print("active");
                                  
                               } %>'><a href="#">Giải đấu</a></li>

                        <li class='<%if (false)
                               {
                                   out.print("active");
                                  
                               } %>'><a href="#">Liên hệ</a></li>

                        <li class='<%if (false)
                               {
                                   out.print("active");
                                  
                               } %>'><a href="#">Danh sách sân</a></li>
                    </ul>
                <ul class="nav navbar-nav navbar-right">
                    <%          
                     if (session.getAttribute("userid")== null)

                    {%>
                        <li><a href="register.jsp"><span class="glyphicon glyphicon-user"></span> Đăng kí</a></li>
                        <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Đăng nhập</a></li>

                    <%}
                    else
                    {%>
                        <li><a href="infopersonal.jsp"><span class="glyphicon glyphicon-user"></span> Xin Chào <%=session.getAttribute("name")%></a></li>
                        <li><a href="logout.do"><span class="glyphicon glyphicon-log-in"></span> Đăng xuất</a></li>
                   
                   <% }%>
                   
                </ul>
            </div>
        </div>
    </nav>