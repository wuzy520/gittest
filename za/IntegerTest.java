package com.wuzy.za;

import java.util.concurrent.atomic.AtomicInteger;

public class IntegerTest {

	public static void main(String[] args) {
		AtomicInteger a = new AtomicInteger(0);
        int i = a.getAndIncrement();
        int j = a.get();
        System.out.println(i);
        System.out.println(j);
	}

}
