<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

    <link href="classpath:/static/bootstrap/css/bootstrap.min.css"
          rel="stylesheet" media="screen" />

    <link href="<c:url value="classpath:app.css" />" rel="stylesheet" type="text/css" media="screen" />
    <link href="<c:url value="css/animate.css" />" rel="stylesheet" type="text/css" media="screen" />

    <script src="js/jquery.min.js"></script>

    <title>index</title>
</head>
<body>

<div class="container" >
    <!-- Static navbar -->
    <div class="navbar navbar-inverse" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
            <div class="navbar-collapse collapse" style="height: 1px;">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span> Home</a></li>
                    <li><a href="#">Features</a></li>
                    <li><a href="">Pricing</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Products<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Latest Products</a></li>
                            <li><a href="#">Popular Products</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Membership<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Personal Membership</a></li>
                            <li><a href="#">Premium Membership</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Offers</a></li>
                    <li><a href="#">Gallery</a></li>
                    <li><a href="#">About Us</a></li>
                    <li><a href="#">Contact</a></li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Dropdown <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                        </ul>
                    </li>
                </ul>
            </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
    </div>
</div> <!-- /container -->

<div id="contents">
    <div class="body">
        <div id="sidebar">
            <h3>Blog</h3>
            <ul>
                <li>
                    Quisque iaculis erat in velit fermentum pellentesque.
                    <span>Sept. 21 | by Nullam <a href="blog.html">8</a></span>
                </li>
                <li>
                    Semper. Cras eu elit velit. Nullam vel eros turpis.
                    <span>Sept. 21 | by Nullam <a href="blog.html">8</a></span>
                </li>
                <li>
                    Aenean id erat elit, quis venenatis erat.
                    Cras ornare orci vitae metus
                    <span>Sept. 21 | by Nullam <a href="blog.html">8</a></span>
                </li>
                <li>
                    Vivamus euismod dictum purus ac semper.
                    Etiam sed elit id ante commodo
                    <span>Sept. 21 | by Nullam <a href="blog.html">8</a></span>
                </li>
                <li>
                    Fusce ac quam nibh, at pharetra dolor.
                    In quis odio arcu, vel laoreet eros.
                    Nam vel sem dui.
                    <span>Sept. 21 | by Nullam <a href="blog.html">8</a></span>
                </li>
            </ul>
        </div>
        <div id="main">
            <span>This website template has been designed by <a href="http://www.freewebsitetemplates.com/">Free Website Templates</a> for you, for free. You can replace all this text with your own text.</span>
            <ul>
                <li>
                    <a href=""><img src="images/globe.jpg" alt="Img" /><h3>Lorem ipsum dolor sit amet</h3></a>
                    <p>Donec venenatis, mauris in blandit tempor, sem tellus vehicula lorem</p>
                </li>
                <li>
                    <a href=""><img src="images/tools.jpg" alt="Img" /><h3>Proin condiment porttitor ultrices</h3></a>
                    <p>Cras tristique faucibus sagittis. Praesent pulvinar, dolor in posuere vulputate</p>
                </li>
                <li>
                    <a href=""><img src="images/check.jpg" alt="Img" /><h3>Quisque consequat</h3></a>
                    <p>Sed vitae massa at turpis mollis aliquam sed vitae tellus integer arcu</p>
                </li>
                <li>
                    <a href=""><img src="images/graph.jpg" alt="Img" /><h3>Class aptent taciti sociosqu</h3></a>
                    <p>Nam quis arcu erat ultricies volutpat leo, in molestie est laoreet eu</p>
                </li>
            </ul>
            <p>If you're having problems editing this website template, then don't hesitate to ask for help on the <a href="http://www.freewebsitetemplates.com/forum/">Forum</a>.</p>
        </div>
    </div>
</div> <!-- /#contents -->

<a href="/logged">zaloguj ż ź ć ó ś ć</a>

<% request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
%>

<h3> ${greetings} </h3>

<h3> ${content2} </h3>

<div class="container section-wrapper">
    <div class="section-content">
        <!-- EXPERIENCE START -->
        <div class="row">
            <div class="col-md-10 col-md-offset-1">
                <h3 class="text-center text-yellow">
                    MY WORK EXPERIENCE
                </h3>
                <div class="panel-group timeline" id="experience">
                    <div class="timeline-item">
                        <div class="timeline-year">
                            <span class="timeline-year">2014 - Now</span>
                        </div>
                        <!-- //.timeline-year -->
                        <div class="timeline-btn">
                            <a href="#exp1" data-toggle="collapse" data-parent="#experience"></a>
                        </div>
                        <!-- //.timeline-btn -->
                        <div class="panel">
                            <div class="panel-heading">
                                <div class="panel-title">
                                    <h4>Endeca Developer - Comp Name - Location</h4>
                                </div>
                                <!-- //.panel-title -->
                            </div>
                            <!-- //.panel-heading -->
                            <div id="exp1" class="panel-collapse collapse in">
                                <div class="panel-body">
                                    <p>
                                        Responsibilities:


                                        Your roles and responsibilities goes here                                              </p>
                                </div>
                                <!-- //.panel-body -->
                            </div>
                            <!-- //.panel-collapse -->
                        </div>
                        <!-- //.panel -->
                    </div>
                    <!-- //.timeline-item -->
                    <div class="timeline-item animated bounceInUp">
                        <div class="timeline-year">
                            <span class="timeline-year">2013 - 2014</span>
                        </div>
                        <!-- //.timeline-year -->
                        <div class="timeline-btn">
                            <a href="#exp2" class="collapsed" data-toggle="collapse" data-parent="#experience"></a>
                        </div>
                        <!-- //.timeline-btn -->
                        <div class="panel">
                            <div class="panel-heading">
                                <div class="panel-title">
                                    <h4>Associate - Comp Name</h4>
                                </div>
                                <!-- //.panel-title -->
                            </div>
                            <!-- //.panel-heading -->
                            <div id="exp2" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <p>
                                        Technologies Worked On:


                                        Your roles and responsibilities goes here
                                    </p>
                                </div>
                                <!-- //.panel-body -->
                            </div>
                            <!-- //.panel-collapse -->
                        </div>
                        <!-- //.panel -->
                    </div>
                    <!-- //.timeline-item -->
                    <div class="timeline-item animated bounceInUp">
                        <div class="timeline-year">
                            <span class="timeline-year">2011 - 2013</span>
                        </div>
                        <!-- //.timeline-year -->
                        <div class="timeline-btn">
                            <a href="#exp3" class="collapsed" data-toggle="collapse" data-parent="#experience"></a>
                        </div>
                        <!-- //.timeline-btn -->
                        <div class="panel">
                            <div class="panel-heading">
                                <div class="panel-title">
                                    <h4>Programmer Analyst - Comp Name</h4>
                                </div>
                                <!-- //.panel-title -->
                            </div>
                            <!-- //.panel-heading -->
                            <div id="exp3" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <p>
                                        Technologies Worked On:


                                        Your roles and responsibilities goes here
                                    </p>
                                </div>
                                <!-- //.panel-body -->
                            </div>
                            <!-- //.panel-collapse -->
                        </div>
                        <!-- //.panel -->
                    </div>
                    <!-- //.timeline-item -->
                    <div class="timeline-item animated bounceInUp">
                        <div class="timeline-year">
                            <span class="timeline-year">2010 - 2011</span>
                        </div>
                        <!-- //.timeline-year -->
                        <div class="timeline-btn">
                            <a href="#exp4" class="collapsed" data-toggle="collapse" data-parent="#experience"></a>
                        </div>
                        <!-- //.timeline-btn -->
                        <div class="panel">
                            <div class="panel-heading">
                                <div class="panel-title">
                                    <h4>Programmer Analyst Trainee - Comp Name</h4>
                                </div>
                                <!-- //.panel-title -->
                            </div>
                            <!-- //.panel-heading -->
                            <div id="exp4" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <p>
                                        Responsibilities:


                                        Your roles and responsibilities goes here
                                    </p>
                                </div>
                                <!-- //.panel-body -->
                            </div>
                            <!-- //.panel-collapse -->
                        </div>
                        <!-- //.panel -->
                    </div>
                    <!-- //.timeline-item -->
                </div>
                <!-- //.panel-group -->
            </div>
            <!-- //.col-md-10 -->
        </div>
        <!-- //EXPERIENCE END -->
    </div>
    <!-- //.section-content -->
</div>
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="webjars/jquery/2.1.4/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="js/app.js" type="text/javascript"></script>


</body>
</html>