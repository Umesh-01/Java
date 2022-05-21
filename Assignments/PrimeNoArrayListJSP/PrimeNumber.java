package com.ece.login.service;



import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;



@WebServlet("/Primenumber")

public class Primenumber extends HttpServlet {

private static final long serialVersionUID = 1L;





 public Primenumber() {

 super();

 // TODO Auto-generated constructor stub

 }

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws

ServletException, IOException {

// TODO Auto-generated method stub

//response.getWriter().append("Served at: ").append(request.getContextPath());

 String prim=request.getParameter("num");

int primeno=Integer.parseInt(prim);

 ArrayList<Integer> al = new ArrayList<Integer>();

for (int i=0;i<=primeno;i++) {

 if (isPrime(i)) {

 al.add(i);

 }

 }

 request.setAttribute("Primenum", al);



getServletConfig().getServletContext().getRequestDispatcher("/Primenumber.jsp").forward(reque

st,response);

 }

 public static boolean isPrime(int n){

 if (n <= 1) { 

return false;

 }

 for (int i = 2; i <= Math.sqrt(n); i++) {

 if (n % i == 0) {

 return false;

 }

 }

 return true;

 }

}
