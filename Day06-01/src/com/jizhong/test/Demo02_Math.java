package com.jizhong.test;
/**
 * 
 * 数学类
 */
public class Demo02_Math {
	public static void main(String[] args) {
//		System.out.println(Math.PI);
		
		//数学类中大部分方法都是静态方法
		//静态方法可以直接通过类名来调用
		/**
		 * double pow (double a, double b)
		 * 计算a的b次方
		 */
//		System.out.println(Math.pow(2, 2));
		
		/**
		 * double ceil (double numvalue)：向上取整
		 * 	向上取整：在整数位 + 1，小数点后删除
		 */
//		System.out.println(Math.ceil(2.11111));
		/**
		 * double floor (double numvalue) ：向下取整
		 * 	向下取整：直接把小数点后全部删掉，只保留整数位
		 */
//		System.out.println(Math.floor(2.999999));
		
		/**
		 * long round (double numvalue) ：四舍五入
		 */
//		System.out.println(Math.round(2.5));
		/**
		 * random()：获取随机数
		 * 	0~1：含0不含1
		 */
//		System.out.println(Math.random());//0.6420754112499478  0.020519168367601037
		/**
		 	1、生成一个0-300之间的随机数
			2、生成一个300-500之间的随机数
			3、生成一个300-500之间的随机整数 
		 */
		//1、生成一个0-300之间的随机数 0 300
//		for(int i = 0;i< 100;i++){
//			System.out.println(Math.floor(Math.random() * 301));//1 51 233
//		}
		//2、生成一个300-500之间的随机数 200.999999
		//区间随机值：
		//	最小值 + Math.floor((最大值 - 最小值 + 1) * Math.random())
		//300+0 ~ 300+200 300 ~ 500
//		for(int i = 0;i< 100;i++){
//			System.out.println((int)(300 + Math.floor((500-300 + 1) * Math.random())));//0~200
//		}
		
	}
}
