
	function selectRolex(value){
		if(value=="2"){
			document.getElementById("rolexlabel").innerHTML="Rolex Watch  Price : $"+(20*2);
		}else if(value=="3"){
			document.getElementById("rolexlabel").innerHTML="Rolex Watch  Price : $"+(20*3);
		}else if(value=="1"){
			document.getElementById("rolexlabel").innerHTML="Rolex Watch  Price : $"+(20);
		}
	}
	function clickRolex(){
		var quantity= document.getElementById("rolexid").value;
		var productPrice=document.getElementById("rolexlabel").value;
		var productName="Rolex Watch";
		console.log("product quantity "+quantity);
		if(quantity=="2"){
			document.getElementById("displaycart").style.display="block";
			document.getElementById("displayName").innerHTML=" Product Selected :"+productName;
			document.getElementById("displayQuantity").innerHTML="Total Quantity : "+quantity;
			document.getElementById("displayPrice").innerHTML="Total Price : $"+(20*2);
			document.getElementById("hname").value=productName;
			document.getElementById("hprice").value=(20*2);
			document.getElementById("hquantity").value=quantity;

		}else if(quantity=="3"){
			document.getElementById("displaycart").style.display="block";
			document.getElementById("displayName").innerHTML=" Product Selected :"+productName;
			document.getElementById("displayQuantity").innerHTML="Total Quantity : "+quantity;
			document.getElementById("displayPrice").innerHTML="Total Price : $"+(20*3);
			document.getElementById("hname").value=productName;
			document.getElementById("hprice").value=(20*3);
			document.getElementById("hquantity").value=quantity;
		}else if(quantity=="1"){
			document.getElementById("displaycart").style.display="block";
			document.getElementById("displayName").innerHTML=" Product Selected :"+productName;
			document.getElementById("displayQuantity").innerHTML="Total Quantity : "+quantity;
			document.getElementById("displayPrice").innerHTML="Total Price : $"+(20);
			document.getElementById("hname").value=productName;
			document.getElementById("hprice").value=(20);
			document.getElementById("hquantity").valueL=quantity;
		}
		
	}
	
	function selectNike(value){
		if(value=="2"){
			document.getElementById("nikelabel").innerHTML=" Nike Shoes Price: $"+(30*2);
		}else if(value=="3"){
			document.getElementById("nikelabel").innerHTML=" Nike Shoes Price: $"+(30*3);
		}else if(value=="1"){
			document.getElementById("nikelabel").innerHTML=" Nike Shoes Price: $"+(30);
		}
	}
	
	function clickNike(){
		var quantity= document.getElementById("nikeid").value;
		var productPrice=document.getElementById("nikelabel").value;
		var productName="nike shoes";
		console.log("product quantity "+quantity);
		if(quantity=="2"){
			document.getElementById("displaycart").style.display="block";
			document.getElementById("displayName").innerHTML=" Product Selected :"+productName;
			document.getElementById("displayQuantity").innerHTML="Total Quantity : "+quantity;
			document.getElementById("displayPrice").innerHTML="Total Price : $"+(30*2);
			document.getElementById("hname").value=productName;
			document.getElementById("hprice").value=(30*2);
			document.getElementById("hquantity").value=quantity;
		}else if(quantity=="3"){
			document.getElementById("displaycart").style.display="block";
			document.getElementById("displayName").innerHTML=" Product Selected :"+productName;
			document.getElementById("displayQuantity").innerHTML="Total Quantity : "+quantity;
			document.getElementById("displayPrice").innerHTML="Total Price : $"+(30*3);
			document.getElementById("hname").value=productName;
			document.getElementById("hprice").value=(30*3);
			document.getElementById("hquantity").value=quantity;
		}else if(quantity=="1"){
			document.getElementById("displaycart").style.display="block";
			document.getElementById("displayName").innerHTML=" Product Selected :"+productName;
			document.getElementById("displayQuantity").innerHTML="Total Quantity : "+quantity;
			document.getElementById("displayPrice").innerHTML="Total Price : $"+(30);
			document.getElementById("hname").value=productName;
			document.getElementById("hprice").value=(30);
			document.getElementById("hquantity").value=quantity;
		}
		
	}
	
	function selectDell(value){
		if(value=="2"){
			document.getElementById("delllabel").innerHTML="Dell  Price: $"+(40*2);
		}else if(value=="3"){
			document.getElementById("delllabel").innerHTML="Dell  Price: $"+(40*3);
		}else if(value=="1"){
			document.getElementById("delllabel").innerHTML="Dell  Price: $"+(40);
		}
	}
	
	function clickDell(){
		var quantity= document.getElementById("dellid").value;
		var productPrice=document.getElementById("delllabel").value;
		var productName="dell laptop";
		console.log("product quantity "+quantity);
		if(quantity=="2"){
			document.getElementById("displaycart").style.display="block";
			document.getElementById("displayName").innerHTML=" Product Selected :"+productName;
			document.getElementById("displayQuantity").innerHTML="Total Quantity : "+quantity;
			document.getElementById("displayPrice").innerHTML="Total Price : $"+(40*2);
			document.getElementById("hname").value=productName;
			document.getElementById("hprice").value=(40*2);
			document.getElementById("hquantity").value=quantity;
		}else if(quantity=="3"){
			document.getElementById("displaycart").style.display="block";
			document.getElementById("displayName").innerHTML=" Product Selected :"+productName;
			document.getElementById("displayQuantity").innerHTML="Total Quantity : "+quantity;
			document.getElementById("displayPrice").innerHTML="Total Price : $"+(40*3);
			document.getElementById("hname").value=productName;
			document.getElementById("hprice").value=(40*3);
			document.getElementById("hquantity").value=quantity;
		}else if(quantity=="1"){
			document.getElementById("displaycart").style.display="block";
			document.getElementById("displayName").innerHTML=" Product Selected :"+productName;
			document.getElementById("displayQuantity").innerHTML="Total Quantity : "+quantity;
			document.getElementById("displayPrice").innerHTML="Total Price : $"+(40);
			document.getElementById("hname").value=productName;
			document.getElementById("hprice").value=(40);
			document.getElementById("hquantity").value=quantity;
		}
		
	}
	
	function selectMusic(value){
		if(value=="2"){
			document.getElementById("musiclabel").innerHTML="Music  Price: $"+(50*2);
		}else if(value=="3"){
			document.getElementById("musiclabel").innerHTML="Music  Price: $"+(50*3);
		}else if(value=="1"){
			document.getElementById("musiclabel").innerHTML="Music  Price: $"+(50);
		}
	}
	
	function clickMusic(){
		var quantity= document.getElementById("musicid").value;
		var productPrice=document.getElementById("musiclabel").value;
		var productName="music album";
		console.log("product quantity "+quantity);
		if(quantity=="2"){
			document.getElementById("displaycart").style.display="block";
			document.getElementById("displayName").innerHTML=" Product Selected :"+productName;
			document.getElementById("displayQuantity").innerHTML="Total Quantity : "+quantity;
			document.getElementById("displayPrice").innerHTML="Total Price : $"+(50*2);
			document.getElementById("hname").value=productName;
			document.getElementById("hprice").value=(50*2);
			document.getElementById("hquantity").value=quantity;
		}else if(quantity=="3"){
			document.getElementById("displaycart").style.display="block";
			document.getElementById("displayName").innerHTML=" Product Selected :"+productName;
			document.getElementById("displayQuantity").innerHTML="Total Quantity : "+quantity;
			document.getElementById("displayPrice").innerHTML="Total Price : $"+(50*3);
			document.getElementById("hname").value=productName;
			document.getElementById("hprice").valueL=(50*3);
			document.getElementById("hquantity").value=quantity;
		}else if(quantity=="1"){
			document.getElementById("displaycart").style.display="block";
			document.getElementById("displayName").innerHTML=" Product Selected :"+productName;
			document.getElementById("displayQuantity").innerHTML="Total Quantity : "+quantity;
			document.getElementById("displayPrice").innerHTML="Total Price : $"+(50);
			document.getElementById("hname").valueL=productName;
			document.getElementById("hprice").value=(50*2);
			document.getElementById("hquantity").value=quantity;
		}
		
	}
