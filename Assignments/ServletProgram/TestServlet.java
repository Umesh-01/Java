package com.ece.login.service;



import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;



/**

* Servlet implementation class TestServlet

*/

@WebServlet("/TestServlet")

public class TestServlet extends HttpServlet {

private static final long serialVersionUID = 1L;



protected void doGet(HttpServletRequest request, HttpServletResponse response) throws

ServletException, IOException {

PrintWriter pw=response.getWriter();



response.setContentType("text/html");

String iname=request.getParameter("name");

String ipassword=request.getParameter("pwd");

if((iname.equals("madhu"))&&(ipassword.equals("madhu")))

pw.println("My first servlet program");

else

pw.println("error");

}

}Te
