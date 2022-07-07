package me.eun;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.eun.model.Demo;

public class RootConfigTest {

	@Test
	@Ignore
	public void test01() {
		ApplicationContext context
		   = new AnnotationConfigApplicationContext(RootConfig.class);
		Demo bean1 = context.getBean("demo1",Demo.class);
		Demo bean2 = context.getBean("demo2",Demo.class);
		System.out.println(bean1.getName());  //생성자이용 
		System.out.println(bean2.getName());  //세터 이용
	}
	
	@Test
	@Ignore
	public void test02() {
		String path = "classpath:security/security-context.xml";
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext(path);
		Demo bean1 = ctx.getBean("demo1",Demo.class);
		Demo bean2 = ctx.getBean("demo2",Demo.class);
		System.out.println(bean1.getName());  //생성자이용 
		System.out.println(bean2.getName());  //세터 이용
	}
	
	@Test
	public void test03() {
		String path = "file:src\\main\\webapp\\WEB-INF\\spring\\demo-context.xml";
						//"file:src/main/webapp/WEB-INF/spring/demo-context.xml"; \\이것을 /이렇게 해도 된다
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext(path);
		Demo bean3 = ctx.getBean("demo3",Demo.class);
		System.out.println(bean3.getName());
		
	}
	
}
	

