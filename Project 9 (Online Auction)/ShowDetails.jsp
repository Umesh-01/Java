<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users Bid Status</title>
<style>
body
{
 background-color: #76ff03;
 
}
  .itemname
  {
  background-color: black;
  color:white;
   width:13.8em;
    height:1.6em;
    border-radius: 5px;
    border:none;
    margin:auto;
    padding-top:0.5em;
  }
  h2
  {
   padding-top:0.5em;
    width:18em;
    height:1.5em;
    border:none;
    margin:auto;
    background-color:gold;
    border:2px solid #00e676;
  }
</style>
</head>
<body>
       <h1 align="center" style="font-weight: bold;font-size: 40px;">Bid Submitted</h1>
       
    <h3 align="center">Your bid is now active.If your bid is successful 
          you will be notified within 24 hrs of close of bidding.
       </h3>
 
     <h1 align="center" class="itemname">${itemname}</h1>
     <h2 align="center">Item ID: ${itemid}</h2> 
     <h2 align="center">Name: ${username}</h2>
     <h2 align="center">Email Address: ${useremail}</h2>
     <h2 align="center">Bid-Price: ${bidamount}</h2>
     <h2 align="center">Auto-increment Price: ${isautoinc}</h2> 

</body>
</html>
