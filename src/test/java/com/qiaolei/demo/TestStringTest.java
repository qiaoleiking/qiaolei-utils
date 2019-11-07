package com.qiaolei.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qiaolei.StringUtils;

/*
 * 
    * @ClassName: TestStringTest
    * @Description: 测试string工具类
    * @author Administrator
    * @date 2019年11月7日
    *
 */
public class TestStringTest {
	
	@Test
	public void testIsBlank(){
		// 断言测试  （真）
		assertTrue(StringUtils.isBlank(" "));
	}
	
	@Test
	public void testIsBlank2(){
		// 断言测试  （假）
		assertTrue(StringUtils.isBlank("aaa"));
	}
	
	@Test
	public void testIsValue(){
		// 断言测试  （假）
		assertFalse(StringUtils.havaValue(""));
	}
	
	@Test
	public void testIsValue1(){
		// 断言测试  （真）
		assertTrue(StringUtils.havaValue("aaa"));
	}
	
	// 测试随机生成的字母字符串
	@Test
	public void testRandomStr(){
		String randomStr = StringUtils.getRandomStr(5);
		System.out.println(randomStr);
	}
	
	//测试随机生成的字母和数字组合
	@Test
	public void testRandomEng(){
		String randomEng = StringUtils.getRandomEng(10);
		System.out.println(randomEng);
	}
	
	
	// 测试随机中文
	@Test
	public void getRandomCn(){
		String randomCn = StringUtils.getRandomCn(5);
		System.out.println(randomCn);
	}
	
}








