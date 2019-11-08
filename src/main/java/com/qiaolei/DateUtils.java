package com.qiaolei;

import java.util.Calendar;
import java.util.Date;

/*
 * 
    * @ClassName: DateUtils
    * @Description: 日期工具类
    * @author Administrator
    * @date 2019年11月8日
    *
 */
public class DateUtils {
	
	/**
	 * 
	    * @Title: compare
	    * @Description:比价日期
	    * @param @param date
	    * @param @return    参数
	    * @return int    返回类型
	    * @throws
	 */
	public static int compare(Date date1,Date date2){
		
		if(date1 == null || date2 == null){
			throw new RuntimeException("参数不能为空");
		}
		
		return date1.compareTo(date2);
	}
	
	/**
	 * 
	    * @Title: calculateAge
	    * @Description: 计算年龄
	    * @param @param birthday
	    * @param @return    参数
	    * @return int    返回类型
	    * @throws
	 */

	public static int calculateAge(Date birthday){
		
		if(birthday.compareTo(new Date()) > 0){
			throw new RuntimeException("给定的生日不能大于当前日期 " +birthday );
		}
		
		// 计算生日的年，月，日
		Calendar calender = Calendar.getInstance();
		calender.setTime(birthday);
		
		int bdYear = calender.get(Calendar.YEAR);
		int bdMonth = calender.get(Calendar.MONTH);
		int bdDay = calender.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("bdYear:"+bdYear+"bdMonth:"+bdMonth+"bdDay:"+bdDay);
		
		
		//计算当前的年月日
		calender.setTime(new Date());
		int currentYear = calender.get(Calendar.YEAR);
		int currentMonth = calender.get(Calendar.MONTH);
		int currentDay = calender.get(Calendar.DAY_OF_MONTH);
		System.out.println("currentYear:"+currentYear+"currentMonth:"+currentMonth+"currentDay:"+currentDay);
		
		int age = currentYear - bdYear;
		
		if(currentMonth < bdMonth ){
			age--;
		}else if(currentMonth == bdMonth && currentDay < bdDay){
			age--;
		}
		return age;
		
	}
	
	
}
