package com.jizhong.test;

import java.util.Random;

public class Demo03_Random {
	public static void main(String[] args) {
		Random r = new Random();
		//nextInt(int n)：生成一个小于n的值，并且该值是大于0的 ，0~n 含头不含尾
//		for(int i = 0;i < 100;i++){
//			System.out.println(r.nextInt(11));//0~n含头不含尾
//		}
//		
		//挖金币 10% 100~200金币 80% 1~10金币 10% 10~90金币
		//伪随机数
		//概率
//		1  2  3  4  5  6  7  8  9  10
//		10       80                  10 100%
		for(int i = 0;i < 10;i++){
			int p = r.nextInt(10) + 1; //1~100：概率
			if (p == 1) {//1 10% 100~200金币
				System.out.println(100 + (int)((200-100 + 1) * Math.random()) + "金币");
			}else if (p < 9) { //2 ~ 9 80% 1~10金币
				System.out.println(1 + (int)((10-1 + 1) * Math.random()) + "金币");
			}else {//10% 10~90金币
				System.out.println(10 + (int)((90-10 + 1) * Math.random()) + "金币");
			}
		}
		
	}
}
