package com.qiaolei;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	/**
	 * 
	    * @Title: isMoble
	    * @Description: 判断手机号的正则
	    * @param @param str
	    * @param @return    参数
	    * @return boolean    返回类型
	    * @throws
	 */
	public static boolean isMoble(String str){
		
		String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(str);
		return matcher.find();
	
	}
	
	/**
	 * 
	    * @Title: isEmail
	    * @Description: 验证邮箱地址合法性
	    * @param @param str
	    * @param @return    参数
	    * @return boolean    返回类型
	    * @throws
	 */
	public static boolean isEmail(String str){
		
		String regex = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(str);
		return matcher.find();
	}
	
	/**
	 * 
	    * @Title: getRandomStr
	    * @Description: 获取n位随机的英文字符串
	    * @param @param n
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	public static String getRandomStr(int n){
		
		StringBuilder builder = new StringBuilder();
		Random random = new Random();
		
		for (int i = 0; i < n; i++) {
			char a = (char)('A'+random.nextInt(26));
			builder.append(a);
		}
		
		return builder.toString();
	}
	/**
	 * 
	    * @Title: getRandomEng
	    * @Description:获取n位随机英文和数字字符串
	    * @param @param n
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	public static String getRandomEng(int n){
		
		
		StringBuilder builder = new StringBuilder();
		Random random = new Random();
		
		for (int i = 0; i < n; i++) {
			int nextInt = random.nextInt(36);
			if(nextInt<26){
				char c = (char)('A' +  nextInt );
				builder.append(c);
			}else{
				builder.append(nextInt-26);
			}
		}
		
		return builder.toString();
		
	}
	
	
	
	
	/**
	 * 
	    * @Title: getRandomCn
	    * @Description: 生成随机中文
	    * @param @return    参数
	    * @return char    返回类型
	    * @throws
	 */
	public static char getRandomCn() {
				
		        String str = "";
		        int hightPos; //
		        int lowPos;
		        Random random = new Random();
		
		        hightPos = (176 + Math.abs(random.nextInt(39)));
		        lowPos = (161 + Math.abs(random.nextInt(93)));
		
		        byte[] b = new byte[2];
		        b[0] = (Integer.valueOf(hightPos)).byteValue();
		        b[1] = (Integer.valueOf(lowPos)).byteValue();
		
		        try {
		            str = new String(b, "GBK");
		        } catch (Exception e) {
		            e.printStackTrace();
		            System.out.println("错误");
		        }
		
		        return str.charAt(0);
			}
		
	
	/**
		 * 
		    * @Title: getRandomCn
		    * @Description: 获取随机长度为n 的 中文字符串
		    * @param @param n
		    * @param @return    参数
		    * @return String    返回类型
		    * @throws
		 */
		public static String getRandomCn(int n ) {
				
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < n; i++) {
					sb.append(getRandomCn());
				}
				return sb.toString();
			}
	
}
