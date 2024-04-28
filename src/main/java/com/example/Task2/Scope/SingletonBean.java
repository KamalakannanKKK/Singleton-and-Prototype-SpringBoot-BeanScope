package com.example.Task2.Scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonBean {

	private String Name;

	public String getName() {
		return Name;
	}

	@Value("Raju")
	public void setName(String name) {
		Name = name;
	}

	public SingletonBean() {
		System.out.println(" Singleton Bean....");
	}

	@Override
	public String toString() {
		return " [Name=" + Name + "]";
	}
	
	
}
