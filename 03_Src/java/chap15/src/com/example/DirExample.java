package com.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DirExample {
	
	//Files class
	public static void main(String[] args) throws IOException {
		
		// file copy. // copy override copyoption- replace_existing
		Files.copy(Paths.get("object.bin"), Paths.get("xxx.bin"), StandardCopyOption.REPLACE_EXISTING);
		
		System.out.println("End...");
	}
	
	public static void main3(String[] args) {
		File d = new File("D:\\02_Software");			// 이스케이프 처리해줘야 함 역슬래시 추가. 
		System.out.println(Arrays.toString(d.list()));		// 문자열로 리스트 가져옴. 
		
		File[] files = d.listFiles(); // file의 배열로 files를 가져옴
		
		DecimalFormat df = new DecimalFormat("###, ###, ###, ###");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		
		for (var f : files) {		//  : Dir/file을 구분해서 포멧팅 설정 - 출력 
			System.out.printf("%20s %5s %10s %s\n",
					sf.format(f.lastModified()), 
					f.isDirectory() ? "<DIR>" : " ",
					f.isDirectory() ? "     " : df.format(f.length()),
					f.getName());
		}
			
	}
	
	
	// File class
	public static void main2(String[] args) {
		File d = new File("D:\\");			// 이스케이프 처리해줘야 함 역슬래시 추가. 
		
		System.out.println(Arrays.toString(d.list()));		// 문자열로 리스트 가져옴. 
		
		File[] files = d.listFiles(); // file의 배열로 files를 가져옴
		
		DecimalFormat df = new DecimalFormat("###, ###, ###, ###");
		
		for (var f : files) {		//  : Dir/file을 구분해서 포멧팅 설정 - 출력 
			if (f.isDirectory())
				System.out.printf("<DIR> %10s %s\n", " ", f.getName());
			else {
				System.out.printf("      %10s %s\n", df.format(f.length()), f.getName());
			}
				
		}
		
		
		
		
		
	}
}
