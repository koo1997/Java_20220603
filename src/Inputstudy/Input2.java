package Inputstudy;

import java.io.FileInputStream;
import java.io.InputStream;

public class Input2 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\TJ\\Desktop\\test.txt");
		int readByte;
		byte[] readBytes = new byte[2];//배열길이가 txt파일 바이트수보다 작을시 배열수만큼 반복한다 
										//ex)byte[10] txt파일 바이트수 20 = 10 10
		while((readByte=is.read(readBytes))!=-1	) {
			System.out.println(readByte);
		}
		
	}

}
