package com.example.resonance.utils;

/**
 *Class <code>PrintHelper.java</code> 测试的时候用于输出的帮助类.
 *
 * @author never
 * @date 2014-2-4
 */
public class PrintHelper {
	/**
	 * Title: Print
	 * Description: 静态方法，输出所在类名和内容。
	 * @param className 输出语句所在的类的名字
	 * @param out  所要输出的内容
	 */
	public static void Print(String className,String out) {
		System.out.println(className + ":" + out);
	}
}
