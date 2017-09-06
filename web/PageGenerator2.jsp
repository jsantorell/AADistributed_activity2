<%-- 
    Document   : PageGenerator2
    Created on : Sep 4, 2017, 11:34:58 AM
    Author     : jerem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<link rel='stylesheet' href='css/style.css' type='text/css'/>");
    out.println("<title>Whats Up</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>What Up:</h1>");
    out.println("<p><a href='pager'>pager</a>  ||  ");
    out.println("<a href='PageGenerator2.jsp'>pager2</a></p>");
    out.println("<table>");
    out.println("<tr><td>C1R1</td><td>C2R1</td><td>C3R1</td></tr>");
    out.println("<tr><td>C1R2</td><td>C2R2</td><td>C3R2</td></tr>");
    out.println("<tr><td>C1R3</td><td>C2R3</td><td>C3R3</td></tr>");
    out.println("</table>");
    out.println("</body>");
    out.println("</html>");

%>



