package com.qiaolei;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

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
	 * 常量计算一天的毫秒数
	 */
	static final long millionSecondsPerDay = 1000 * 60 * 60 * 24;
	
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
	
	
	/**
	 * 
	    * @Title: reamainDays
	    * @Description: 计算到将来的一个日期 还剩余多少天
	    * @param @param futureDate
	    * @param @return
	    * @param @throws CmsException    参数
	    * @return int    返回类型
	    * @throws
	 */
	public static int reamainDays(Date futureDate) throws CmsException{
		
		/*
		 * 判断输入的日期   如果小于当前日期则认为不合法
		 */
		if(futureDate.compareTo(new Date()) < 0){
			throw new CmsException("未来的日期不能小于当前日期 : "+futureDate);
		}
		
		
		// 计算有多少天
		int day = (int) ((futureDate.getTime() - new Date().getTime())/millionSecondsPerDay);
		
		return day;
		
	}
	
	/**
	 * 
	    * @Title: isToday
	    * @Description: 判断是否为今天
	    * @param @return    参数
	    * @return boolean    返回类型
	    * @throws
	 */
	public static boolean isToday(Date date){
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		String format = simpleDateFormat.format(date);
		
		
		String format2 = simpleDateFormat.format(new Date());
		
		return format.equals(format2);
		
	}
	
	
	/**
	 * 
	    * @Title: isThisWeek
	    * @Description:判断是否在本周
	    * @param @param date
	    * @param @return    参数
	    * @return boolean    返回类型
	    * @throws
	 */
	public static boolean isThisWeek(Date date) {

		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

		Calendar firstDayOfWeek = Calendar.getInstance(Locale.getDefault());

		firstDayOfWeek.setFirstDayOfWeek(Calendar.MONDAY);

		int day = firstDayOfWeek.get(Calendar.DAY_OF_WEEK);

		firstDayOfWeek.add(Calendar.DATE, -day + 1 + 1);// 后面的+1是因为从周日开始

		// 本周一的日期

		System.out.println(format.format(firstDayOfWeek.getTime()));

		Calendar lastDayOfWeek = Calendar.getInstance(Locale.getDefault());

		lastDayOfWeek.setFirstDayOfWeek(Calendar.MONDAY);

		day = lastDayOfWeek.get(Calendar.DAY_OF_WEEK);

		lastDayOfWeek.add(Calendar.DATE, 7 - day + 1);

		// 本周星期天的日期

		System.out.println(format.format(lastDayOfWeek.getTime()));

		return (date.getTime() < lastDayOfWeek.getTime().getTime()
				&& date.getTime() > firstDayOfWeek.getTime().getTime());

	}
	
	
	
	
	
	
	
	
	
	
}
