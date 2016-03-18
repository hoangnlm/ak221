package module1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

//Ngay 14032016
public class IOUtils {
	// Doc file
	public static void readBinaryTextFile(String path) throws IOException {
			// Buoc 1: mo luong
			FileInputStream fileInputStream = new FileInputStream(path);

			// Buoc 2: doc file
			byte[] buffer = new byte[5];
			String s = "";
			int len = 0;
			while ((len = fileInputStream.read(buffer)) != -1) {
				s += new String(buffer, 0, len);
			}
			System.out.println(s);
			// Buoc 3: dong luong
			fileInputStream.close();

	}

	// Ghi file
	public static void writeBinaryTextFile(String path, String content) {
		try {
			// Buoc 1: mo luong
			FileOutputStream 	fileOutputStream = new FileOutputStream(path);

			// Buoc 2: ghi file
			fileOutputStream.write(content.getBytes());
//			fileOutputStream.flush();
//			fileOutputStream.write(new byte[]{'t','e','s','t'});

			// Buoc 3: dong luong
			fileOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Copy file
	public static void copyFile(String srcPath, String desPath) {
		// Buoc 1.1: mo luong read

		// Buoc 2.1: mo luong write

		// Buoc 1.2: read file --> byte[]
		// Buoc 2.2: byte[] --> write file

		// Buoc 1.3: close read
		// Buoc 2.3: close write

	}

	// Doc file Unicode = FileReader
	public static void readTextUnicodeFile(String path) {
		try {
			// Buoc 1
			FileReader fileReader = new FileReader(path);

			// Buoc 2
			char[] buffer = new char[7];
			int len = 0;
			String s = "";
			while ((len = fileReader.read(buffer)) != -1) {
				s += new String(buffer, 0, len);
			}
			System.out.println(s);

			// Buoc 3
			fileReader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Dung BufferInputStream
	public static void readBinaryTextFileByBuffer(String path) {
		FileInputStream fileInputStream = null;
		BufferedInputStream bufferedInputStream = null;

		try {
			// Buoc 1: mo luong
			fileInputStream = new FileInputStream(path);
			bufferedInputStream = new BufferedInputStream(fileInputStream);

			// Buoc 2: doc file
			byte[] buffer = new byte[5];
			String s = "";
			int len = 0;
			while ((len = bufferedInputStream.read(buffer)) != -1) {
				s += new String(buffer, 0, len);
			}
			System.out.println(s);
			
			// Buoc 3: dong luong
			bufferedInputStream.close();
			fileInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
