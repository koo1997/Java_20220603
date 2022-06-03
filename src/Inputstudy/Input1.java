package Inputstudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Input1 {

	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:\\Users\\TJ\\Desktop\\test.txt");
		int readByte;
		while((readByte=is.read())!=-1) {
			System.out.println((char)readByte);
		}
		
		
	}

}
