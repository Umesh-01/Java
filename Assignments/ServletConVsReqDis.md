**Difference between Servlet Request and Servlet Context when calling Request Dispatcher:**

When we use request.getRequestDispatcher(“url”), it means the dispatch is relative to the current HTTP request. It means this is for chaining two servlets with in the same web application. The servlet request method getRequestDispatcher() can be used for referring to local servlets within single webapp.

For example: 

RequestDispatcher reqDispObj = request.getRequestDispatcher("/home.jsp");

And when we use getServletContext().getRequestDispatcher(“url”), it means the dispatch is relative to the root of the ServletContext. It means this is for chaining two web applications with in the same server/two different servers. Servlet context based getRequestDispatcher() method can used of referring servlets from other web applications deployed on same server.

For example:

RequestDispatcher reqDispObj = getServletContext().getRequestDispatcher("/ContextRoot/home.jsp");
