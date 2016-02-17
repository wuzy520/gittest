package com.wuzy.za;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int[] arry = {1,3,5,7,9,10};
		System.out.println(search(arry,9));

	}
	
	public static int search(int[] ary,int desc){
		//设置一个最小位置
		int low=0;
		//设置一个最大位置
		int high=ary.length-1;
		
		while(low<=high){
			int middle = (low+high)/2;
			if(desc==ary[middle]){
				return middle;
			}else if(desc < ary[middle]){
			   high = middle-1; 
			}else{
				low = middle+1;
			}
			
		}

		return -1;
	}

}
