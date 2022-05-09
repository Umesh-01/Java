<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Auction | JSP | Servlet</title>

<style>
.cont {
	margin-top: 60px;
	margin-bottom: 50px;
}

.auction {
	color: black;
	background-color: #00e676;
	text-align: center;
	width: 600px;
	margin: auto;
	font-size: 30px;
	padding-top: 10px;
	padding-bottom: 10px;
	height: 30px;
	font-style: italic;
	font-weight: bold;
}

.stud-form {
	margin-top: 10px;
}

.bid-btn {
	width: 8em;
	height: 2.5em;
	background-color: white;
	color: #00e676;
	border-radius: 3px;
	cursor: pointer;
	border: 2px solid orange;
	margin-left: 400px;
}

body {
	background-color: #007BFF;
}

input {
	width: 18em;
	height: 2.1em;
	border-radius: 5px;
	border: none;
}

.bid-btn:hover {
	background-color: #00e676;
	color: white;
}

input {
	caret-color: red;
}

input[type="checkbox"].check {
	margin-left: 0px;
}

.ErrorHeading {
	margin-left: 600px;
	font-size: 25px;
}

span {
	font-size: 35px;
	font-weight: bold;
}

font {
	font-size: 20px;
}
</style>
</head>
<body>


	<%
    
       List l=(List)session.getAttribute("errors");
       
    %>


	<div class="cont">
		<div class="auction">Welcome to AP Auctions .Please Enter Bid.</div>
	</div>

	<%
   
          if(l!=null)
          {
        
        	if(l.contains("Data Incomplete"))
        	{
        		%>
	<p align="center">
		<span style="color: red;">Required Data Missing !</span><span>
			Enter and Resubmit!</span>
	</p>



	<% 	
        	}
          }
        %>

	<form action="bid" method="get" align="center" class="stud-form">
		<table align="center">
			<tr>

				<td style="font-size: 1.5em" class="itid">Item ID:</td>
				<td><input type="text" name="itemid"></td>
				<td>
					<%
          if(l!=null)
          {
        	if(l.contains("1"))
        	{
        		%> <font color="red">*RequiredField !</font> <% 	
        	}
          }
        %>
				</td>
			</tr>

			<tr>

				<td style="font-size: 1.5em">Item Name:</td>
				<td><input type="text" name="itemname"></td>

				<td>
					<%
          if(l!=null)
          {
        	if(l.contains("2"))
        	{
        		%> <font color="red">*RequiredField !</font> <% 	
        	}
          }
        %>
				</td>

			</tr>
			<tr>

				<td style="font-size: 1.5em">Your Name:</td>
				<td><input type="text" name="username"></td>
				<td>
					<%
          if(l!=null)
          {
        	if(l.contains("3"))
        	{
        		%> <font color="red">*RequiredField !</font> <% 	
        	}
          }
        %>
				</td>
			</tr>
			<tr>

				<td style="font-size: 1.5em">Your Email Address:</td>
				<td><input type="email" name="useremail"></td>
				<td>
					<%
          if(l!=null)
          {
        	if(l.contains("4"))
        	{
        		%> <font color="red">*RequiredField !</font> <% 	
        	}
          }
        %>
				</td>
			</tr>

			<tr>

				<td style="font-size: 1.5em">Amount Bid:</td>
				<td><input type="text" name="bidamount"></td>
				<td>
					<%
          if(l!=null)
          {
        	if(l.contains("5"))
        	{
        		%> <font color="red">*RequiredField !</font> <% 	
        	}
          }
        %>
				</td>
			</tr>


			<tr>
				<td style="font-size: 1.5em">Auto-increment bid to match other
					bidders ?:</td>
				<td><input type="checkbox" name="isautoinc" class="check"></td>
			</tr>
		</table>
		<br> <span><input type="submit" value="SubmitBid"
			class="bid-btn"></span>

	</form>

</body>
</html>
