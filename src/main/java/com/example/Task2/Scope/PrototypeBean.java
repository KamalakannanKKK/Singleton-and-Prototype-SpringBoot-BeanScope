package com.example.Task2.Scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {
	private String Name;

	public String getName() {
		return Name;
	}

	@Value("Raju")
	public void setName(String name) {
		Name = name;
	}

	public PrototypeBean() {
		System.out.println("Prototype Bean...");
	}

	@Override
	public String toString() {
		return " [Name=" + Name + "]";
	}

}
