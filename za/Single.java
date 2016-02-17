package com.wuzy.za;

public class Single {
	
	private static Single single;
	
	private Single(){
		
	}
	
	public static synchronized final Single getInstance(){
		if(single==null){
			single = new Single();
		}
		
		return single;
	}

}
