package days26;

import java.io.File;
import java.io.FilenameFilter;

import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author 조연화
 * @오후 12:28:55 2024. 2. 5.
 * @subject	
 * @content	
 */
public class Ex02_03 {

	public static void main(String[] args) {
		String pathname = ".\\src\\days26";
		// days26 폴더 안에 있는 자바파일(.java)만 출력
		// days26 폴더 안에 있는 자바파일(.dat)만 출력
	
		File f = new File(pathname);
		/*
		File [] list = f.listFiles( new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return n.endsWith(".dat");
			}
		});
		*/
		
		File [] list = f.listFiles( (d,n) -> n.endsWith(".dat")); // 람다식
		
		for (File c : list) {
			System.out.println( c.getName() );
		}
		
		
		/* [1]
		File [] list = f.listFiles();
		for (int i = 0; i < list.length; i++) {
			if (list[i].isFile()) {
				String fileName = list[i].getName();
				int pos = fileName.indexOf(".");
				String ext = fileName.substring(pos);
				if ( ext.equals(" .dat") ) {
					System.out.println( fileName );
				}// 
			}// if
			
		}//
		*/
		
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}// main

}// class
