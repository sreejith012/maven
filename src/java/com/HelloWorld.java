// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 10/19/2016 12:53:01 PM
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   HelloWorld.java

package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet
{

    public HelloWorld()
    {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        String color = request.getParameter("color");
        PrintWriter out = response.getWriter();
        out.println((new StringBuilder("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n<html> \n<head> \n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"> \n<title> My first jsp </title> \n</head> \n<body> \n<font size=\"12px\" color=\"")).append(color).append("\">").append("Hello World").append("</font> \n").append("</body> \n").append("</html>").toString());
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        super.doPost(req, resp);
        doGet(req, resp);
    }

    private static final long serialVersionUID = 1L;
}
