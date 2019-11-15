package com.wangting.test;

import org.junit.Test;

import com.wangting.utils.NumberUtil;

public class TestString {
/*	
	@Test
	public  void testtoHtml() {
		String src =" ����\r\n����\r����";
		String html = StringUtils.toHtml(src);
		System.out.println("html is " + html);
	}
	
	@Test
	public  void testisPhone() {
		String mobile ="13014511111";
		 StringUtils.isMobile(mobile);
		System.out.println(StringUtils.isMobile(mobile));
	}*/
	
	
//	(2)	在工具包工程src/test/java下测试百分比工具方法。
//	传入参数51和68，返回75，即75%。
//	传入参数20和100，返回20，即20%。
//	传入参数1和3，返回33，即33%。（4分）
	@Test
	public void test1() {
		NumberUtil.getPercent(51, 68);
		System.out.println("传入参数51和68返回结果是："+NumberUtil.getPercent(51, 68)+"%");
	}
	@Test
	public void test2() {
		NumberUtil.getPercent(20, 100);
		System.out.println("传入参数20和100返回结果是："+NumberUtil.getPercent(20, 100)+"%");
	}
	@Test
	public void test3() {
		NumberUtil.getPercent(1, 3);
		System.out.println("传入参数1和3返回结果是："+NumberUtil.getPercent(1, 3)+"%");
	}
}
