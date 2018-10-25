package test.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EntryPoint {
	public static void main(String[] args) {		
		 ApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");
		 BeanTest robot = (BeanTest)ctx.getBean("specificBeanName");
		 robot.showBean();
	}
}
