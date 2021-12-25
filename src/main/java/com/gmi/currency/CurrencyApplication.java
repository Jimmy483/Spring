package com.gmi.currency;

import com.gmi.currency.models.Bird;
import com.gmi.currency.models.Crow;
import com.gmi.currency.models.Phone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CurrencyApplication {

	public static void main(String[] args) {

		//SpringApplication.run(CurrencyApplication.class, args);
//
		ApplicationContext context= new ClassPathXmlApplicationContext("classpath*:spring.xml");
//		Bird obj=(Bird) context.getBean("crow");
//		Bird o=(Bird) context.getBean("pigeon");
//		o.cry();
//		obj.cry();
//
//		//Bean property
//		Phone phone=(Phone) context.getBean("phone");
//		System.out.println(phone.toString());

		Crow obj=(Crow)context.getBean("crow");
		obj.cry();
	}

}
