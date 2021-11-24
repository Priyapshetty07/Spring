package com.xworkz.Smartwatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmartWatchTester {

	public static void main(String[] args) {

		/*
		 * SmartWatch smartWatch = new SmartWatch(); smartWatch.brand = "Apple";
		 * smartWatch.size = 44; smartWatch.price = 52000.500; smartWatch.color =
		 * "gray";
		 */

		/*
		 * System.out.println("SmartWatch: " + smartWatch.brand);
		 * System.out.println("SmartWatch: " + smartWatch.size);
		 * System.out.println("SmartWatch: " + smartWatch.price);
		 * System.out.println("SmartWatch: " + smartWatch.color);
		 * smartWatch.displayMessage(); smartWatch.displayTime();
		 */

		/*
		 * SmartWatch smartWatch2 = new SmartWatch("Apple i5", 40, 44500.500, "Black");
		 * System.out.println("SmartWatch2: " + smartWatch.brand);
		 * System.out.println("SmartWatch2: " + smartWatch.size);
		 * System.out.println("SmartWatch2: " + smartWatch.price);
		 * System.out.println("SmartWatch2: " + smartWatch.color);
		 */

//        smartWatch = null;
//        smartWatch2 = null;
		// or
		// System.gc();

		/*
		 * SmartWatch smartWatch3 = new SmartWatch(); smartWatch3.setBrand("Apple-i7");
		 * smartWatch3.setColor("Pink"); smartWatch3.setPrice(40500.001);
		 * smartWatch3.setSize(44);
		 */

		String springconfigFile = "Spring.xml";
		ApplicationContext springContainer = new ClassPathXmlApplicationContext(springconfigFile);
		System.out.println("invoked springcontainer:" + springContainer.hashCode());
	}

}
