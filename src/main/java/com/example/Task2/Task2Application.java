package com.example.Task2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.Task2.Scope.DefaultBean;
import com.example.Task2.Scope.PrototypeBean;
import com.example.Task2.Scope.SingletonBean;

@SpringBootApplication
public class Task2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(Task2Application.class, args);
		
		//Default Bean
		DefaultBean defaultbean =context.getBean(DefaultBean.class);
		System.out.println(defaultbean.hashCode());
		
		DefaultBean defaultbean1 =context.getBean(DefaultBean.class);
		System.out.println(defaultbean1.hashCode()+"\n");
		
		//Singleton Bean
		SingletonBean singletonbean=context.getBean(SingletonBean.class);
		System.out.println(singletonbean.hashCode());
		System.out.println(singletonbean);
		singletonbean.setName("Kamal");
		System.out.println(singletonbean +"\n");
		
		
		SingletonBean singletonbean1=context.getBean(SingletonBean.class);
		System.out.println(singletonbean1.hashCode());
		System.out.println(singletonbean1);
		singletonbean.setName("Ashok");
		System.out.println(singletonbean1+"\n");
		
		SingletonBean singletonbean2=context.getBean(SingletonBean.class);
		System.out.println(singletonbean2.hashCode());
		System.out.println(singletonbean2+"\n");
		
		//Prototype Bean
		PrototypeBean prototypebean=context.getBean(PrototypeBean.class);
		System.out.println(prototypebean.hashCode());
		System.out.println(prototypebean);
		prototypebean.setName("Kamal");
		System.out.println(prototypebean+"\n");
		
		PrototypeBean prototypebean1=context.getBean(PrototypeBean.class);
		System.out.println(prototypebean1.hashCode());
		System.out.println(prototypebean1+"\n");
		
		PrototypeBean prototypebean2=context.getBean(PrototypeBean.class);
		System.out.println(prototypebean2.hashCode());
		
		
	}

}
