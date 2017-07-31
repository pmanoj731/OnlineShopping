		function doesUseridExists()
	{
		xmlHttp=GetXmlHttpObject()
		var uid=document.getElementById("userid").value;
		var url="controller";  
		xmlHttp.open("POST",url,true); // 3) Configure HTTP server request
		xmlHttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");// 4) set header values
		xmlHttp.send("uid="+uid); // 5) post data
		xmlHttp.onreadystatechange  = function(){
			if (xmlHttp.readyState == 4) {
				 if(xmlHttp.status == 200) {
					 
				
				/*	// New JSON changes on javascript
					 var response= xmlHttp.responseText; 
					 var parsedJsonRes=JSON.parse(response);
					 if(parsedJsonRes.userid_check=="not_exists")
					  document.getElementById("ajaxresponsefield").innerHTML="LOGIN FAILED:USERID NOT FOUND";
		*/
		//ajax
				  
					 var response= xmlHttp.responseText; 
					 console.log("before entering if block responseText is : "+response);
					 	if(response=="failed"){
					 		console.log("response==failed : "+response);
					 		document.getElementById("ajaxresponsefield").innerHTML="USERID NOT FOUND";
					 	}else if(uid==""){
					 		console.log("uid==  : "+response);
					 		document.getElementById("ajaxresponsefield").innerHTML="USERID is must";
					 	}else {
					 		console.log("else{ }");
					 		document.getElementById("ajaxresponsefield").innerHTML="";
					 	}
					 	
					 }
					 else {  alert("ajax call failed");}}
			
		}; // 6) call back function
	}

	function checkLoginUId()
	{
		
	
	
	}
	
	
	function GetXmlHttpObject()
	{ var xmlHttp=null;
	try { // create xhttp object in following browser Firefox, Opera 8.0+, Safari
	  xmlHttp=new XMLHttpRequest(); }
	catch (e)
	 {// create xhttp object in Internet Explorer browser 
	  try{  xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");    }
	  catch (e) {  xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");    }
	 } return xmlHttp;
	}
	
	
