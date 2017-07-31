<html><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>OnlineShoping</title>

<link rel="stylesheet" type="text/css" href="css/onlineshoping.css">
<link rel="stylesheet" type="text/css" href="css/css.css">

<script type="text/javascript">

</script>
<script src="js/cart.js">
</script>
</head>

<style>
div.img {
    margin: 5px;
    border: 1px solid #ccc;
    float: left;
    width: 200px;
	
}

div.img:hover {
    border: 1px solid #777;
}

div.img img {
    width: 100%;
    height: 40%;
}

div.desc {
    padding: 15px;
    text-align: center;
}
</style>

<body style="background-image: url(images/5.jpg); height:90%; width: 90%; border: 1% solid black;">
<%String username=(String)request.getAttribute("username"); %>
<div class="header" ; height: 8%; width: 100%">
<h1 style="color:white">Online Shoping</h1>
</div>

<div style=width:60%>
<ul>
  <li><a href="onlineshoping.jsp">Home</a></li>
  <li><a onclick="document.getElementById('id02').style.display='block'";href="#";>Register</a></li>
  <li ><a onclick="document.getElementById('id01').style.display='block'";href="#";>Login</a>
</li>  
 
 <li class="dropdown">
    <a href="products.html" class="dropbtn">Products</a>
    <div class="dropdown-content">
      <a href="#">Mens</a>
      <a href="#">Womens</a>
    </div>
  </li>
  <li><a href="">Contact US</a></li>
    <li><a href="onlineshoping.jsp">LogOut</a></li>
</ul>
</div>
<br><br><br>
<%String address= (String)request.getAttribute("address"); %>
<%String city=(String)request.getAttribute("city"); %>
<%String state=(String)request.getAttribute("state"); %>
<%String zip=(String)request.getAttribute("zip"); %>

<div align="center" style="color:white">
<h2 style="color:white">your payment has been Sucessfull</h2><br>
<h2 style="color:white">your product will be shipped to the following address</h2>
<%=address%>,<%=city%>,<%=state%>,<%=zip%>
</div>
<br><br><br>



</body>
</html>
