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

input[type=text], select {
				width: 30%;
				padding: 12px 20px;
				margin: 5px 0;
				display: inline-block;
				border: 1px solid #ccc;
				border-radius: 4px;
				box-sizing: border-box;
			}
			input[type=number],[type=email]{
				width: 20%;
				padding: 12px 20px;
				margin: 5px 0;
				display: inline-block;
				border: 1px solid #ccc;
				border-radius: 4px;
				box-sizing: border-box;
			}
			input[type=submit] {
				width: 30%;
				background-color: lightslategray;
				color: white;
				padding: 14px 20px;
				margin: 5px 0;
				border: none;
				border-radius: 4px;
				cursor: pointer;
			}
			.creditcardBlock{
				width : 40%;
				border: 1px solid #ccc;
				border-radius: 4px;
				box-sizing: border-box;
			}
			#creditId{
				width:48%;
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

<br>

<h1 style="color:white">Payment Details</h1>
 
<%String productName=(String)request.getAttribute("ProductName"); %>
<%String productPrice=(String)request.getAttribute("ProductPrice"); %>
<%String quantity=(String)request.getAttribute("quantity"); %>
<%String user=(String)request.getAttribute("username"); %>
<%if (productName!=null)
{
%>

<div style="color:white">
hey&nbsp<%=user%>&nbspyou have following items in your cart 
<br><br>
your selected product is:<%=productName%>
<br>
No Of Products is :<%=quantity%>
<br>
Total Price is :<%=productPrice%>
<% }  %>

<h2>Enter Your Billing Address</h2>
<form action="payment" method="post">
<fieldset>
    <legend>Billing Address</legend>
    <span>Address</span><input type="text" name="address" />
    <span>City</span><input type="text" name="city" />
    <span>state</span><input type="text" name="state"/>
    <span>Postal Code</span><input type="text" name="zip"/>
</fieldset>

<h2>Credit card or Debit card</h2>	

          <input type="text" id="creditId" name="nameoncard" placeholder="Name On Card"  required /></br>
			<input type="text" id="creditId" name="creditcardnumber" placeholder="16 Digit credit card number"  required /></br>		
			<select id="months" name="month" value=this.value>
				<option value="january">January</option>
				<option value="february">February</option>
				<option value="march">March</option>
				<option value="april">April</option>
				<option value="may">May</option>
				<option value="june">June</option>
				<option value="july">July</option>
				<option value="august">August</option>
				<option value="september">September</option>
				<option value="october">October</option>
				<option value="november">November</option>
				<option value="december">December</option>
			</select>
			<input type="number"   name="year" min="2017" max="2027">
			<input type="number"   name="cvv" min="100" max="999" placeholder="cvv"></br>
			<input type="submit" value="Proceed for Payment">
			
</form>


</div>

</body>
</html>
