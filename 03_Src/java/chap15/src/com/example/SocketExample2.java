package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SocketExample2 {
	// PrintStream 개념. 확인. 
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("www.soen.kr", 80); // io checked exception/ 도메인 DNS에 ip 확인/ ip의 http의 80 port로 접속.
		OutputStream out =s.getOutputStream();
		PrintWriter w = new PrintWriter(out);
		
		// http 언어 요청
		w.println("GET /lecture/ccpp/clecintro.htm HTTP/1.1");		// protocol 요청
		w.println("Host: www.soen.kr");
		w.println();
		w.println();
		w.flush();
		
		InputStream in = s.getInputStream(); 	//
		// reader 또는 scanner로 바이트 코드 변환하여 가져옴. 
		Scanner scan =new Scanner(in, "euc-kr");
		
		while (true) {
			try {
				System.out.println(scan.nextLine());
			} catch (NoSuchElementException e) { //상황에  따른 exception 처리. 
				break;
			}
		}
		
		System.out.println("End..");
	}
}
