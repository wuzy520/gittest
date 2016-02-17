package com.wuzy.za;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author sky
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] score = {1,1,3,2,4,8,0};
        sort(score);
        System.out.println(Arrays.toString(score));
	}
	
	public static void sort(int[] score){
		for (int i = 0; i < score.length -1; i++){    //最多做n-1趟排序
			 //对当前无序区间score[1......length-i-1]进行排序(j的范围很关键，这个范围是在逐步缩小的)  
			for(int j=i+1;j<score.length;j++){
				if(score[i]>score[j]){
					int temp=score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		
	}

}
