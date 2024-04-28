package com.example.Task2.Scope;

import org.springframework.stereotype.Component;

@Component
public class DefaultBean {

	public DefaultBean() {
		System.out.println("Default Bean...");
	}
}
