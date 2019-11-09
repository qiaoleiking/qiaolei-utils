package com.qiaolei.demo;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.qiaolei.FileUtils;
import com.qiaolei.StringUtils;

public class FileTest {
	
	@Test
	public void testFile() throws Exception{
		
		List<String> readFile = FileUtils.readFile("C://Users//Administrator//Desktop//aaa.txt");
		for (String string : readFile) {
			System.out.println(string);
		}
	}
}
