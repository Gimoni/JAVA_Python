package com.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
// 보조 스트림을 사용해서 프로그램 언어 바이트 스트림을 문자 스트림을 변환 . InputStreamReader 
public class DownloadExample3 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.soen.kr/");
		var conn = (HttpURLConnection)url.openConnection();
		
		InputStream in = conn.getInputStream();
		InputStreamReader r = new InputStreamReader(in, "euc-kr");
		
		while(true) {
			int ch = r.read();
			if (ch<0) 
				break;
			System.out.print((char)ch);
		}
		
		System.out.println("End....");
	}
}
