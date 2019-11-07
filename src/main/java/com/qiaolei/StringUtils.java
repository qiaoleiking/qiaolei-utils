package com.qiaolei;
/*
 * 
    * @ClassName: StringUtils
    * @Description: 字符串工具类
    * @author Administrator
    * @date 2019年11月7日
    *
 */
public class StringUtils {
	
	/**
	 * 
	    * @Title: isBlank
	    * @Description: 判断字符串是否为空
	    * @param @param str
	    * @param @return    参数
	    * @return boolean   返回类型
	    * @throws
	 */
	public static boolean isBlank(String str){
		
		return (str == null || str.trim().equals(""));
		
	}
	/**
	 * 
	    * @Title: havaValue
	    * @Description: 判断字符串是否有值，空引号也算没值
	    * @param @param str
	    * @param @return 参数
	    * @return boolean 返回类型
	    * @throws
	 */
	public static boolean havaValue(String str){
		
		return !(str == null || str.trim().equals(""));
		
	}
	
	//public 
}
