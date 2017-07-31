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
    border: 3px solid #ccc;
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
<%if (username!=null)
{
%>

<div align="center" style="color:white">
<h2 style="color:white">welcome </h2>
<%=username%>
</div>
<% }  %>
<br><br>
<form action="prod1">
<div class="img">
  <a target="_blank" href="">
    <img src="images/prod1.jpg" alt="Trolltunga Norway" width="100%" height="100%">
  </a></br>
  <label style="color:white"name="productName"> Rolex </label><br>
  <label style="color:white">Select Quantity : </label><select id="rolexid" onchange="selectRolex(this.value)">
	<option value=1>1</option>
	<option value=2>2</option>
	<option value=3>3</option>
  </select></br>
   <label style="color:white" value="20" id="rolexlabel">Rolex Watch  Price:$20 </label>
  <div class="desc"><button  class="button2" type="button" style="color:blue" onclick="clickRolex()" >ADD TO CART</button></div>
</div>
</form>
<form action="prod2">
<div class="img">
  <a target="_blank" href="">
    <img src="images/prod2.jpg" alt="Forest" width="100%" height="100%">
  </a>
  </br>
  <label style="color:white"name="productName"> NikeShoes </label><br>
<label style="color:white">Select Quantity : </label><select id="nikeid" onchange="selectNike(this.value)">
	<option value=1>1</option>
	<option value=2>2</option>
	<option value=3>3</option>
  </select></br>
   <label style="color:white" id="nikelabel"> Nike Shoes Price:$30 </label>
  <div class="desc"><button class="button2" type="button" style="color:blue" onclick="clickNike()">ADD TO CART</button></div>
</div>
</form>
<form action="prod3">
<div class="img">
  <a target="_blank" href="">
    <img src="images/prod3.jpg" alt="Northern Lights" width="100%" height="100%">
  </a>
  </br>
  <label style="color:white"name="productName"> DELL Laptop </label><br>
 <label style="color:white">Select Quantity : </label><select id="dellid" onchange="selectDell(this.value)">
	<option value=1>1</option>
	<option value=2>2</option>
	<option value=3>3</option>
  </select></br>
  <label style="color:white" id="delllabel"> Dell  Price: $40 </label>
  <div class="desc"><button class="button2" type="button"  style="color:blue" onclick="clickDell()">ADD TO CART</input></div>
</div>
</form>
<form action="prod4">
<div class="img">
  <a target="_blank" href="">
    <img src="images/prod4.jpg" alt="Mountains" width="100%" height="100%">
  </a>
  </br>
  <label style="color:white" name="productName"> Music Album </label><br>
<label style="color:white">Select Quantity : </label><select id="musicid" onchange="selectMusic(this.value)">
	<option value=1>1</option>
	<option value=2>2</option>
	<option value=3>3</option>
  </select></br>
   <label style="color:white" id="musiclabel"> Music  Price: $50 </label>
  <div class="desc"><button class="button2" type="button" style="color:blue" onclick="clickMusic()">ADD TO CART</button></div>
</div>
</form>

<div class="img" id="displaycart" style="display:none">
  <form action="cart" method="post">
  </br>
 <input type="hidden" id="hname" name="productName"></input>
  <input type="hidden" id="hprice" name="productPrice" > </input>
  <input type="hidden" id="hquantity"name="quantity" ></input>
	<p style="color:white" id="displayName" name="pName" value="pName" ></p> </br>
    <p style="color:white" id="displayQuantity" name="pquantity" value="quantity"></p></br>
	<p style="color:white" id="displayPrice" name="pPrice" value="pprice"></p>
<input type="hidden" id="uname" name="username" value=<%=username%> ></input>
  <input name="submit" type="submit" value="checkout"></input>
</form>
</div>

</body>
</html>
