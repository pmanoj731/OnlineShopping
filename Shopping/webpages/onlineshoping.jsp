<html><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>OnlineShoping</title>

<link rel="stylesheet" type="text/css" href="css/onlineshoping.css">
<link rel="stylesheet" type="text/css" href="css/css.css">

<script type="text/javascript">
function myFunction() {
    document.getElementById("display").style.display = 'block';
}
// Get the modal
var modal = document.getElementById('id01');
var modal = document.getElementById('id02');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}

</script>
<script src="js/ajax.js">
</script>
</head>



<body style="background-image: url(images/4.jpg); height:90%; width: 90%; border: 1% solid black;">

<div class="header" ; height: 8%; width: 100%">
<h1>Online Shoping</h1>
</div>

<div style=width:60%>
<ul>
  <li><a href="onlineshoping.jsp">Home</a></li>
  <li><a onclick="document.getElementById('id02').style.display='block'";href="#";>Register</a></li>
  <li ><a onclick="document.getElementById('id01').style.display='block'";href="#";>Login</a>
</li>  
 
 <li class="dropdown">
    <a href="#" class="dropbtn">Products</a>
    <div class="dropdown-content">
      <a href="#">Mens</a>
      <a href="#">Womens</a>
    </div>
  </li>
  <li><a href="">Contact US</a></li>
</ul>

<form>
  <input type="text" name="search " placeholder="Search for products"/>
  <input type="submit" name="submit" style= "width:13%;height:7%" onclick />
</form>
</div>

<!--Login page div-->

<div id="id01" class="modal">
  
  <form class="modal-content animate" action="controller">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
      
    </div>

    <div class="container" >
      <label><b>Username</b></label>
      <input width=10% name="id" id="userid" type="text" placeholder="Enter Username" onblur="doesUseridExists()">
      <div id="ajaxresponsefield" style="color:red"> </div>
      <label><b>Password</b></label>
      <input type="password" name="pwd" id="pwd" placeholder="Enter Password"><b></b>
        
      <button name="submit" type="submit">Login</button>
      <input type="checkbox" checked="checked"> Remember me
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
      <span class="psw">Forgot <a href="#">password?</a></span>
    </div>
  </form>
</div>

<!--Register page div-->

<div id="id02" class="modal" height: 50%;>
  
  <form class="modal-content animate" action="Register">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal">&times;</span>
      
    </div>

    <div class="container" >
      
      <label><b>FirstName</b></label>
      <input width=10% name="firstname" id="userid" type="text" placeholder="Enter FirstName" >
      <label><b>Lastname</b></label>
      <input width=10% name="lastname" id="userid" type="text" placeholder="Enter LastName" >
      <label><b>Email</b></label>
      <input width=10% name="emailID" id="userid" type="text" placeholder="Enter Email" >
      <label><b>Username</b></label>
      <input width=10% name="regid" id="userid" type="text" placeholder="Enter Username">
      <div id="ajaxresponsefield" style="color:red"> </div>
      <label><b>Password</b></label>
      <input type="password" input name="pwd" placeholder="Enter Password"><b></b>
      <label><b>ConfirmPassword</b></label>
      <input type="password" input name="pwd" placeholder="Confirm Password"><b></b>
        
      <button name="submit" type="submit">Register</button>
      
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id02').style.display='none'" class="cancelbtn">Cancel</button>

    </div>
  </form>
</div>

</body>
</html>
