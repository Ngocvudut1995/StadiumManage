<%-- 
    Document   : home
    Created on : Mar 15, 2017, 7:29:33 PM
    Author     : VuDang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
    </head>
    
        <%@include file="include/header.jsp" %>
        <div class="container">
    <div class="col-md-2"></div>
    <div class="col-md-8">
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>

            </ol>

            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src="Content/slide/slide1.jpg" alt="Chania" style="width: 100%">
                </div>

                <div class="item">
                   
                    <img src="Content/slide/slide2.jpg" alt="Chania" style="width: 100%">
                </div>

                <div class="item">
                    <img src="Content/slide/slide3.jpg" alt="Flower" style="width: 100%">
                </div>


            </div>

            <!-- Left and right controls -->
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
    </div>
</div>

<div class="container">
    <fieldset>
        <h3 style="color: rgb(7, 153, 7)">Danh sách sân 5 người</h3>
        <div class="row">
            @foreach (var item in Model.yard_5)
            {
                <div class="col-sm-3">
                    <div class="panel panel-primary">
                        <div class="panel-heading">Sân 5 Người</div>
                        <div class="panel-body">
                            <a href="/Yard/Index/@item.IDYard"><img src="~/@item.Image" class="img-responsive" style="width: 100%" alt="Image"></a>
                        </div>
                        <div class="panel-footer"><a href="/Yard/Index/@item.IDYard">@item.NameYard</a></div>
                    </div>
                </div>
            }

        </div>
    </fieldset>
    <hr>
</div><br>



<div class="container">
    <h3 style="color: rgb(7, 153, 7)">Danh sách sân 7 người</h3>
    <div class="row">
        @foreach (var item in Model.yard_7)
            {
            <div class="col-sm-3">
                <div class="panel panel-success">
                    <div class="panel-heading">Sân 7 Người</div>
                    <div class="panel-body">
                        <a href="/Yard/Index/@item.IDYard"><img src="~/@item.Image" class="img-responsive" style="width: 100%" alt="Image"></a>
                    </div>
                    <div class="panel-footer">
                        <a href="/Yard/Index/@item.IDYard">@item.NameYard</a>
                    </div>
                </div>
            </div>
        }

    </div>
</div>
    
</html>
