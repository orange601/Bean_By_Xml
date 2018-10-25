package test.bean;

import org.springframework.stereotype.Component;

@Component("specificBeanName")
public class BeanTest {
	public void showBean(){
		System.out.println("빈출력");
	}
}
