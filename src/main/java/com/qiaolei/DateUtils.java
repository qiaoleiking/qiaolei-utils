package com.qiaolei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
	
	/**
	 * 
	    * @Title: getDateByFullMonth
	    * @Description: 3.4.8给定时间对象，设定到该月最一天的23时59分59秒999毫秒
	    * @param @param src
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static Date getDateByFullMonth(Date src){
		//TODO 实现代码
			Calendar c =  Calendar.getInstance();
			c.setTime(src);
			c.add(Calendar.MONTH, 1);
			c.set(Calendar.DAY_OF_MONTH, 1);
			c.set(Calendar.HOUR, 0);
			c.set(Calendar.MINUTE, 0);
			c.set(Calendar.SECOND, 0);
			c.add(Calendar.SECOND, -1);
			return c.getTime();
		}
	
	
	/** 
	* 生成随机时间 
	* @param beginDate 
	* @param endDate 
	* @return 
	*/ 
	public static Date randomDate(String beginDate,String  endDate ){  
	 
	try {  
	 
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
	 
	Date start = format.parse(beginDate);//构造开始日期  
	 
	Date end = format.parse(endDate);//构造结束日期  
	 
	//getTime()表示返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。  
	 
	if(start.getTime() >= end.getTime()){  
	 
	return null;  
	 
	}  
	 
	long date = random(start.getTime(),end.getTime());  
	 
	return new Date(date);  
	 
	} catch (Exception e) {  
	 
	e.printStackTrace();  
	 
	}  
	 
	return null;  
	 
	}  
	 
	private static long random(long begin,long end){  
	 
	long rtn = begin + (long)(Math.random() * (end - begin));  
	 
	//如果返回的是开始时间和结束时间，则递归调用本函数查找随机值  
	 
	if(rtn == begin || rtn == end){  
	 
	return random(begin,end);  
	 
	}  
	 
	return rtn;  
	 
	}
	
	
	/**
	 * 
	    * @Title: transformDate
	    * @Description: 转换日期到指定格式的字符串
	    * @param @param date
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	
	public static String transformDate(Date date){
		SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
		return s.format(date);
	}
	/**
	 * 
	    * @Title: plusDate
	    * @Description: 在指定的年后加
	    * @param @param date
	    * @param @param num
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static Date plusDate(Date date,int num){
		
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(calendar.YEAR,50);
		Date time = calendar.getTime();
		return time;
		
	}

}
