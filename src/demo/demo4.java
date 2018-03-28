package demo;

import java.io.File;
import java.io.IOException;

public class demo4 {
	public static void main(String[] args) throws IOException {

		File file=new File("demo.txt");
		//判断文件是否存在
		if(!file.exists()){
			//将它创建出来
			file.createNewFile();
			System.out.println("文件创建成功");
		}else{
			file.delete();
			System.out.println("删除成功");
			file.createNewFile();
			System.out.println("文件创建成功");
		}
	}
}
