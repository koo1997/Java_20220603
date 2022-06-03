package Inputstudy;

import java.io.FileInputStream;
import java.io.InputStream;

public class Input3 {

	public static void main(String[] args) throws Exception{
		int a=1;//배열시작점
		int b=5;//시작점부터 개수
		InputStream is = new FileInputStream("C:\\Users\\TJ\\Desktop\\test.txt");
		int readByte;
		byte[] readBytes = new byte[10];
		int readBytes1 = is.read(readBytes,a,b);
		System.out.println(readBytes1);
	}

}
