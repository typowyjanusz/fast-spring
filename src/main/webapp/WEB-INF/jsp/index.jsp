<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <link href="<c:url value="css/style.css" />" rel="stylesheet" type="text/css">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Business Solutions</title>
</head>

<body>


<a href="/logged">zaloguj ż ź ć ó ś ć</a>

<% request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
%>

<h3> ${greetings} </h3>

<h3> ${content2} </h3>

<table border="1" align="center" style="width:50%">
    <thead>
    <tr>
        <th>User Id</th>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="greetings" items="${greetings}" >
        <tr>
            <td>${beer.id}</td>
            <td>${beer.name}</td>
            <td>${beer.abv}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>


<div id="header">
    <a href="index.html" id="logo"><img src="images/logo.jpg" alt="LOGO" /></a>
    <div id="navigation">
        <ul>
            <li class="first selected"><a href="index.html">Home</a></li>
            <li><a href="about.html">About us</a></li>
            <li><a href="services.html">Services</a></li>
        </ul>
    </div>
    <div id="search">
        <form action="" method="">
            <input type="text" value="Search" class="txtfield" onblur="javascript:if(this.value==''){this.value=this.defaultValue;}" onfocus="javascript:if(this.value==this.defaultValue){this.value='';}" />
            <input type="submit" value="" class="button" />
        </form>
    </div>
</div> <!-- /#header -->
<div id="adbox">
    <div class="body">
        <div class="images">
            <img src="images/discussing2.jpg" alt="Img" class="preview" />
        </div>
        <div class="details">
            <p>
					<span>
						This website template has been designed by <a href="http://www.freewebsitetemplates.com/">Free Website Templates</a> for you, for free.
					</span>
                You can remove any link to our website from this website template, you're free to use this website template without linking back to us.
            </p>
        </div>
    </div>
    <div class="footer">
        <ul>
            <li class="selected">
                <a href="index.html"><img src="images/meeting2.jpg" alt="Img" /></a>
                <p>
                    <a href="index.html">Morbi quiseros sedquam interdum placerat</a><br/>
                    Fusce placerat tellusdiam rutrum porttitor
                </p>
            </li>
        </ul>
        <span class="bottom-shadow"></span>
    </div>
</div> <!-- /#adbox -->
<div id="contents">
    <div class="body">
        <div id="sidebar">
            <h3>Blog</h3>
            <ul>
                <li>
                    Quisque iaculis erat in velit fermentum pellentesque.
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
            </ul>
            <p>If you're having problems editing this website template, then don't hesitate to ask for help on the <a href="http://www.freewebsitetemplates.com/forum/">Forum</a>.</p>
        </div>
    </div>
</div> <!-- /#contents -->
<div id="footer">
    <ul class="contacts">
        <h3>Contact Us</h3>
        <li><span>Email</span><p>: company@email.com</p></li>
    </ul>
    <ul id="connect">
        <h3>Get Updated</h3>
        <li><a href="blog.html">Blog</a></li>
    </ul>
    <div id="newsletter">
        <p><b>Sign-up for Newsletter</b>
            In sollicitudin vulputate metus, sed commodo diam elementum nec. Sed et risus sed magna convallis adipiscing.
        </p>
        <form action="" method="">
            <input type="text" value="Name" class="txtfield" onblur="javascript:if(this.value==''){this.value=this.defaultValue;}" onfocus="javascript:if(this.value==this.defaultValue){this.value='';}" />
            <input type="text" value="Enter Email Address" class="txtfield" onblur="javascript:if(this.value==''){this.value=this.defaultValue;}" onfocus="javascript:if(this.value==this.defaultValue){this.value='';}" />
            <input type="submit" value="" class="button" />
        </form>
    </div>
    <span class="footnote">&copy; Copyright &copy; 2011. All rights reserved</span>
</div> <!-- /#footer -->
</body>
</html>