package io;

import java.io.File;
import java.io.FileWriter;

public class Test {

	public static void main(String[] args) {
		String txt="테스트";
		String filName ="C:\\test11.txt";
		
		
		try {
			File file =new File(filName);
			FileWriter fe =new FileWriter(file,true);
			fe.write(txt);
			fe.flush();
			fe.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
