package com.wuzy.za;

import java.util.Arrays;

public class SelectSearch {

	public static void main(String[] args) {
       System.out.println(Arrays.toString(search(new int[]{1,5,8,3,2,6})));
	}
	
	public static int[] search(int[] a){
		  //简单的选择排序
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int n=i; //最小数的索引
            for(int j=i+1;j<a.length;j++){
                if(a[j]<min){  //找出最小的数
                    min = a[j];
                    n = j;
                }
            }
            a[n] = a[i];
            a[i] = min;
            
        }
        
        return a;
	}

}
