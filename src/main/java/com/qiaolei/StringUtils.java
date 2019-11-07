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

	public static boolean isBlank(String str){
		
		return (str == null || str.trim().equals(""));
		
	}
	
}
