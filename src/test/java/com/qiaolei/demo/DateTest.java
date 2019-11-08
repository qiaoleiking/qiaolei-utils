package com.qiaolei.demo;

import java.util.Date;

import org.junit.Test;

import com.qiaolei.CmsException;
import com.qiaolei.DateUtils;

/*
 * 
    * @ClassName: DateTest
    * @Description: 日期工具类
    * @author Administrator
    * @date 2019年11月8日
    *
 */
public class DateTest {
	
	// 比较日期
	@Test
	public void testDate(){
		//大于的话返回的是正整数，等于是0，小于的话就是负整数
		System.out.println(DateUtils.compare(new Date(1996,10,04), new Date()));
	}
	
	
	//测试计算年龄
	@Test
	public void calculateAge(){
		
		int calculateAge = DateUtils.calculateAge(new Date(96,10,04));
		System.out.println(calculateAge);
		
	}
	
	// 测试到将来的一天有多少天
	@Test
	public void reamainDays() throws CmsException{
		Date date = new Date(119,11,9);
		int reamainDays = DateUtils.reamainDays(date);
		System.out.println(reamainDays);
	}
	
	
	
	
	
}















