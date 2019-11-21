package com.hamuse.web.proxy;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	public int sum(int a , int b) {
		return a+b;
	}
	public int sub(int a , int b) {
		return a-b;
	}
	public int abs(int a) { //abs 는 절대값
		return Math.abs(a);
	}
}
