package com.wangting.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Week3 {


	
/*	public static String readTextFile(InputStream src) throws IOException {

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		byte[] b = new byte[1024];

		int a = 0;
		try {
			while ((a = src.read(b)) != -1) {
				outputStream.write(b);
			}
			return outputStream.toString("utf-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//StreamUtils.closeStream(outputStream, src);
		}

		return null;
	}*/

	
/*	public static String readTextFile(File txtFile) throws IOException {
		try {
			FileInputStream inputStream = new FileInputStream(txtFile);
			String readTextFile = readTextFile(inputStream);
			return readTextFile;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	public static void main(String[] args) throws IOException {

		
			
		
		
		List<String> readFile = FileUtils.readFile("D:\\大数据\\实训一\\内网通\\段某_\\data.txt");
		
		for (String string : readFile) {
			System.out.println(string);
			
			String[] split = string.split("\\|");
			
			
			for (int i = 0; i < split.length; i+=3) {
				Goods goods = new Goods(0, 
						split[i], 
						Double.parseDouble(split[i+1]), 
						split[i+2]);
				System.out.println(goods);
			}
			
			
			
//			goodsService.add(goods);
			
			
		}
		
		
		
		
		
		
		
			
//			String[] split = readFile.split("\\|");
//			
//			
//			for (String string : split) {
//				System.out.println(string);
//			}
//			
//			MyBean myBean = new MyBean();
//			
//			
//			for (int j = 0; j < split.length; j+=3) {
//				myBean.setName(split[j]);
//				myBean.setPrice(split[j+1]);
//				myBean.setSex(split[j+2]);
//				System.out.println(myBean);
//			}
			
			
//			MyBean bean = new MyBean();
//			bean.setName(split[0]);
//			bean.setSex(split[1]);
//			
//			
//			System.out.println(" bean is " + bean);
		
		
	}

}

class Goods{
	int id;
	String name;
	double price;
	String sex;
	public Goods(int id, String name, double price, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.sex = sex;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", sex=" + sex + "]";
	}
	
	
	
	*/
	
}
