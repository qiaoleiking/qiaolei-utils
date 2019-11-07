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
}








