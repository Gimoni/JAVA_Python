package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/html")  // = url mapping 
public class HtmlServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");		// HTML5 문서 전달. 
		out.println("<html>");
		out.println("<head>");
		out.println("<title>HtmlServlet</title>");
		out.println("</head>");
		out.println("<body style ='background-color:green';>");
		out.println("<button id='btn' style = 'background-color: lightyellow'; > Button</button>");
		out.println("<script>");
		out.println("btn.onclick = function() {");
		out.println("     alert('버튼 클릭') ");
		out.println("}");
		out.println("</script>");
		
		out.println("<hr>");
		out.println("<audio src='media/Kalimba.mp3' controls='controls'></audio>");
		out.println("<hr>");
		out.println("<video width='50%' src='media/Wildlife.mp4' controls='controls'></video>");
		out.println("</body>");
		
		out.println("</html>");
		
		
	}
	
	
	
	
	
	
	//@Override // doget : web browser에 문서를 전달함 . 어떤 것이든 전달함 //: response.setContentType : web browser에 먼저 문서의 종류를 알려줌. 
	protected void doGet2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");	// MIME
		
		PrintWriter out = response.getWriter();
//		out.println("Hello WebBrowser!");
		for (int i=0; i<10; i++) {
			out.printf("Hello WebBrowser! %02d\n" , i);
		}
		
		System.out.println("HtmlServlet..."); 
		
		
		
		
	}
}
