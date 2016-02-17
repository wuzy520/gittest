package com.wuzy.za;

import java.util.Arrays;

public class InsertSearch {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(search(new int[]{1,4,2,6,4,8,0})));

	}
	
	public static int[] search(int[] a){
		 //直接插入排序
		//{1,4,2,6,4,8,0}
        for (int i = 1; i < a.length; i++) {
            //待插入元素
            int temp = a[i];
            int j;
            for (j = i-1; j>=0; j--) {
                //将大于temp的往后移动一位
                if(a[j]>temp){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = temp;
        }
        
        return a;
	}

}
