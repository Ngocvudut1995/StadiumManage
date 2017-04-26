<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="script/bootstrap.min.js" type="text/javascript"></script>
        <script src="script/jquery-1.11.3.min.js" type="text/javascript"></script>
<nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/Home" style="padding: 0px">
                  
                    <img  class="hidden-xs" src="~/Content/Logo/coollogo_com-367326.png" style="width: 100%"/>
                </a>
            </div>
            <div class="collapse navbar-collapse" id="myNavbar">
               
                    <ul class="nav navbar-nav" id="mynav">
                        <li class='@if (ViewBag.Title.Equals("Home"))
                               {
                                   @Html.Raw("active")
                                   ;
                               } '><a href="/Home">Trang chủ</a></li>
                        <li class='@if (ViewBag.Title.Equals("Home1"))
                               {
                                   @Html.Raw("active")
                                   ;
                               } '><a href="#">Giới thiệu</a></li>

                        <li class='@if (ViewBag.Title.Equals("Home1"))
                               {
                                   @Html.Raw("active")
                                   ;
                               } '><a href="#">Khuyến mãi</a></li>

                        <li class='@if (ViewBag.Title.Equals("Home1"))
                               {
                                   @Html.Raw("active")
                                   ;
                               } '><a href="#">Giải đấu</a></li>

                        <li class='@if (ViewBag.Title.Equals("Home1"))
                               {
                                   @Html.Raw("active")
                                   ;
                               } '><a href="#">Liên hệ</a></li>

                        <li class='@if (ViewBag.Title.Equals("Manage Yard"))
                               {
                                   @Html.Raw("active")
                                   ;
                               } '><a href="/Yard/Manage">Danh sách sân</a></li>
                    </ul>
                <ul class="nav navbar-nav navbar-right">
                    @if (Session["userid"] == null)
                    {
                        <li><a href="/Home/Register"><span class="glyphicon glyphicon-user"></span> Đăng kí</a></li>
                        <li><a href="/Home/Login"><span class="glyphicon glyphicon-log-in"></span> Đăng nhập</a></li>

                    }
                    else
                    {
                        <li><a href="/Home/Info"><span class="glyphicon glyphicon-user"></span> Xin Chào @Session["Name"]</a></li>
                        <li><a href="/System/Logout"><span class="glyphicon glyphicon-log-in"></span> Đăng xuất</a></li>
                   
                    }
                   
                </ul>
            </div>
        </div>
    </nav>