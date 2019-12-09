package org.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * 使用正则表达式
 * @author 123
 *
 */
public class UseReg {

	/**
	 * 查找字符串中是否包了 runoob 子串
	 * 查找字符串中是否包了 runoob 子串
	 * 查找字符串中是否包了 runoob 子串
	 */
	@Test
	public void demo1() {
		String content = "I am noob from runoob.com.";
		String pattern = ".*runoob.*";
		System.out.println("content字符串中是否包含runoob子串："+	Pattern.matches(pattern, content));
	}
	
	/**
	 * 给定字符串中找到数字串
	 */
	@Test
	public void demo2() {
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(\\D*)(\\d*)(.*)";
		// 创建Pattern对象 
		Pattern compile = Pattern.compile(pattern);
		// 创建Matcher对象 
		Matcher m = compile.matcher(line);
		if(m.find()) {
			System.out.println("Found value: " + m.group(0) ); // (\\D*)(\\d*)(.*)
	        System.out.println("Found value: " + m.group(1) ); // (\\D*)
	        System.out.println("Found value: " + m.group(2) ); // (\\d*)
	        System.out.println("Found value: " + m.group(3) ); // (.*)
		}else {
			System.out.println("没有找到");
		}
	}
	
	/**
	 * start 和 end 方法
	 */
	@Test
	public void demo3() {
		String pattern = "\\w*\\bcat\\b\\w*";
		String str = "dog cat abc";
		String str1 = "verb";
		System.out.println(Pattern.matches(pattern, str));
		System.out.println(Pattern.matches(pattern, str1));
	}
}
