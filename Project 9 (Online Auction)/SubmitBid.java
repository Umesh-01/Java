package com.auction.servlets;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/bid")
public class SubmitBid extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Boolean isAutoInc = false;
		HttpSession session = request.getSession();
		int itemID = 0;
		List lt = new LinkedList();
		lt.add("Data Incomplete");
		String itemid = request.getParameter("itemid");
		if (itemid.length() == 0) {

			lt.add("1");
		} else {

			itemID = Integer.parseInt(request.getParameter("itemid"));
		}

		String itemName = request.getParameter("itemname");
		String userName = request.getParameter("username");
		String userEmail = request.getParameter("useremail");
		String bidAmt = request.getParameter("bidamount");
		double bidAmount = 0;
		if (!(bidAmt.length() == 0))
			bidAmount = Double.parseDouble(request.getParameter("bidamount"));

		String checkAutoInc = request.getParameter("isautoinc");
		if (checkAutoInc == null)
			isAutoInc = false;
		else
			isAutoInc = true;

		if (itemName.length() == 0) {
			lt.add("2");
		}
		if (userName.length() == 0) {
			lt.add("3");
		}
		if (userEmail.length() == 0) {
			lt.add("4");
		}
		if (bidAmt.length() == 0) {
			lt.add("5");
		}
		if (!lt.isEmpty() && lt.size() > 1) {

			session.setAttribute("errors", lt);

			response.sendRedirect("index.jsp");

		} 
		else {
			session.setAttribute("itemid", itemID);
			session.setAttribute("itemname", itemName);
			session.setAttribute("username", userName);
			session.setAttribute("useremail", userEmail);
			session.setAttribute("bidamount", bidAmount);
			session.setAttribute("isautoinc", isAutoInc);
			response.sendRedirect("showdetails.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
