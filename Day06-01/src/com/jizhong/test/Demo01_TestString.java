package com.jizhong.test;

public class Demo01_TestString {
	public static void main(String[] args) {
		String s = new String("Hello world!!!");
		s = "Hello world!!!123456";
		
		//在字符串缓冲区中的操作，不会新创建字符串对象，完全在特定的一片区域内执行
		//字符串缓冲区提高了字符串的执行效率
		//StringBuilder sbl = new StringBuilder();：
		/**
		 * StringBuilder与StringBuffer两个对象作用与使用方式完全一样
		 * 	区别：
		 * 		StringBuilder：线程不安全，执行效率更高
		 * 		StringBuffer：线程安全，执行效率更低
		 * 
		 *  注意：
		 *  	一般项目中没有多线程，除非一些特殊情况用到多线程。
		 *  	所以说一般单线程程序推荐使用StringBuilder对象来做字符串缓冲区
		 */
		StringBuffer sbf = new StringBuffer("hello");//hello + 16
		//append(str):向字符串缓冲区中追加新的字符串
		sbf.append("World~~~");
		
		//insert(offset,str)：在指定索引位置插入数据
		/**
		 * offset：偏移量，插入字符串位置（索引位置）
		 * str：被插入的字符串
		 */
		sbf.insert(5, " ");
		//reverse()：将此字符序列用其反转形式取代(翻转原有字符串序列)
//		sbf.reverse();
		
		//hello world~~~
		//delete(int start,int end):
		/**
		 * start：从哪个位置开始删除
		 * end：结束位置 end-1的索引位置
		 * 
		 * 删除内容含头（start）不含尾（end）
		 */
		sbf.delete(0, 6);
		
		//replace(int start, int end, String s)
		/**
		 * 替换字符串
		 * start，end：从start位置开始，到end位置结束替换为新的字符串
		 * s：新字符串
		 */
		//World~~~
		sbf.replace(0, 5, "Hello");
		
		//toString()：将字符串缓冲区转换为一个字符串对象
		String newStr = sbf.toString();
		System.out.println(newStr);
	}
}
