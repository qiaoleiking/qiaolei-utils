/*import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;*/

//package com.qiaolei.demo;
//
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.GregorianCalendar;
//import java.util.Locale;
//import java.util.Random;
//
//import org.junit.Test;
//@ContextConfiguration("classpath:spring-beans.xml")
// @RunWith(SpringRunner.class)
//import com.qiaolei.CmsException;
//import com.qiaolei.DateUtils;
//import com.qiaolei.NumberUtils;
//
///*
// * 
//    * @ClassName: DateTest
//    * @Description: 日期工具类
//    * @author Administrator
//    * @date 2019年11月8日
//    *
// */
//public class DateTest {
//	
//	// 比较日期
//	@Test
//	public void testDate(){
//		//大于的话返回的是正整数，等于是0，小于的话就是负整数
//		System.out.println(DateUtils.compare(new Date(1996,10,04), new Date()));
//	}
//	
//	
//	//测试计算年龄
//	@Test
//	public void calculateAge(){
//		
//		int calculateAge = DateUtils.calculateAge(new Date(96,10,04));
//		System.out.println(calculateAge);
//		
//	}
//	
//	// 测试到将来的一天有多少天
//	@Test
//	public void reamainDays() throws CmsException{
//		Date date = new Date(119,11,9);
//		int reamainDays = DateUtils.reamainDays(date);
//		System.out.println(reamainDays);
//	}
//	
//	//判断是否为今天
//	@Test
//	public void isToday(){
//		boolean today = DateUtils.isToday(new Date(96,10,04));
//		System.out.println(today);
//	}
//	
//	//测试是否在本周方法
//	@Test
//	public void isWeek(){
//		
//		boolean thisWeek = DateUtils.isThisWeek(new Date());
//		System.out.println(thisWeek);
//	}
//	
//	
//	@Test
//	public void randomDate(){
//		
////		Date randomDate = DateUtils.randomDate("1980-01-01", "2019-11-17");
////		String transformDate = DateUtils.transformDate(randomDate);
////		System.out.println("+++++++++++"+transformDate);
////
////		Date plusDate = DateUtils.plusDate(randomDate, 50);
////		String transformDate1 = DateUtils.transformDate(plusDate);
////		System.out.println(transformDate1);
//		
//		
//		for (int i = 0; i < 10; i++) {
//			int randamNum = NumberUtils.randamNum(11);
//			System.out.println(randamNum);
//		}
//		
//		
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}
