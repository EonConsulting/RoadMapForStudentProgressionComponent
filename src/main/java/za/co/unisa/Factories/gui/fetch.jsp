<%-- 
    Document   : fetch
    Created on : Jan 7, 2017, 10:19:56 AM
    Author     : Mufaro Benedict
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
<%@ page import="testFactory.gui.FORM" %>
<% FORM fjsp = new FORM();
String got = fjsp.returning();
out.println(got);
%>

<!-- below is the list output on jsp -->
<%@ page import="testFactory.gui.LIST" %>
<% LIST ljsp = new LIST();
String got = ljsp.returning();
out.println(got);
%>

</body>

</html>