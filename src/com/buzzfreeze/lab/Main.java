package com.buzzfreeze.lab;

public class Main {
	
	public static void main (String[] args) {
		IProductFrontPage []  products = new IProductFrontPage[5];
		products[0] = new Product("1000", "iPhone", "", "�������� 10 ����ͧ");
		products[1] = new Course("10000", "���¹�","", "Oak", 30, 5);
		products[2] = new Course("10000", "���¹","", "Oak", 30, 5);
		products[3] = new Product("1000", "iPhone", "", "�������� 10 ����ͧ");
		products[4] = new Course("10000", "���¹","", "Oak", 30, 5);
		
		
		for (int i = 0; i < products.length; i++) {
			System.out.println("<div>" + products[i].getTile() + "</div>");
			System.out.println("<div>" + products[i].getTile() + "</div>");
			System.out.println("<div>" + products[i].getTile() + "</div>");
			System.out.println("<div>" + products[i].getTile() + "</div>");
			System.out.println("<div>" + products[i].getTile() + "</div>");
		}
	}

}
