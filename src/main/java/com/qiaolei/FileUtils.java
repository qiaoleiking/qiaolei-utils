package com.qiaolei;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**-
 * 
    * @ClassName: FileUtils
    * @Description: 读取文件的工具类
    * @author Administrator
    * @date 2019年11月9日
    *
 */
public class FileUtils {

	
	
	/**
	 * 
	    * @Title: readFile
	    * @Description: 解析字符文件的实体类
	    * @param @param fileName
	    * @param @return
	    * @param @throws Exception    参数
	    * @return List<String>    返回类型
	    * @throws
	 */
	
	
	public static List<String> readFile(String fileName) throws Exception{
		
		List<String> lines = new ArrayList();
		File file = new File(fileName);
		
		FileInputStream stream = new FileInputStream(file);
		
		InputStreamReader in = new InputStreamReader(stream,"gbk");
		
		BufferedReader reader = new BufferedReader(in);
		
		String str = "";
		
		while((str = reader.readLine()) != null){
			//System.out.println(str);
			lines.add(str);
		}
		
		return lines;
	}
	
}
