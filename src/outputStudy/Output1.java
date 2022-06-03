package outputStudy;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Output1 {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:\\Users\\TJ\\Desktop\\test.txt");
		byte[] data = "HEll1".getBytes();
		for(int i =0;i<data.length;i++) {
			os.write(data[i]);
			
		}
		
	}

}
