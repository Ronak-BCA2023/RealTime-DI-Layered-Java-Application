package com.ronaksoft.driver;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.ronaksoft.contoller.MainController;
import com.ronaksoft.vo.CustomerVo;

//This is play a role of client appliacation...........
//End user will interface from this layer......
//here, main method of application will be return......

public class DriverMainApp {
		public static void main(String[] args) throws Exception {
				System.out.println("Welcome to my layered application: ");
				
				//First we take input value from user..........
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Name of Customer: ");
				String name = sc.next();
				System.out.println("Enter Address of Customer: ");
				String address = sc.next();
				System.out.println("Enter Principal ammount of Customer");
				String pamt = sc.next();
				System.out.println("Enter Rate of Interest: ");
				String rate = sc.next();
				System.out.println("Enter Time : ");
				String time = sc.next();
				
				
				//String data to CustomerVo class.........
				CustomerVo vo = new CustomerVo();
				vo.setName(name);
				vo.setAddress(address);
				vo.setpAmt(pamt);
				vo.setRate(rate);
				vo.setTime(time);
				
				DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
				XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
				reader.loadBeanDefinitions("com/ronaksoft/resources/applicationContext.xml");
				MainController controller = factory.getBean("controller", MainController.class);
				String response = controller.deleteCustomerData(vo);
				System.out.println(response);
		}
}