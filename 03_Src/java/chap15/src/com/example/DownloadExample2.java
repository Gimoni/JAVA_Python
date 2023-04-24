package com.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
// 인터넷에서의 이미지 다운로드. 
public class DownloadExample2 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.w3schools.com/html/img_girl.jpg");
		
		var conn = (HttpsURLConnection)url.openConnection();
		
		InputStream in = conn.getInputStream();
		
		FileOutputStream img = new FileOutputStream("img/img_girl.jpg");
		
		
	
		while(true) {
			int b = in.read();
			if (b<0)
				break;
			System.out.println((byte)b);
			img.write(b);
		}
		img.close();
		
		conn.disconnect();
		System.out.println("End....");
	}
}
