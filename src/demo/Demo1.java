package demo;

import java.util.Arrays;

/**
 * 对一个数组（由0和1组成）排序 0在前 1在后
 * 思路：自定义一个索引，只想第一个1，那么
 * 当数组中出现0，那么将0和1进行位置上的交换
 * @author dell
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		int[] ary={1,0,1,1,1,1,0,0};
		
		int index=0;//自定义索引
		/**
		 * 对ary进行遍历，碰到0，将此位置上的值变成1
		 * 同时将数组前面对应位置的1变成0（自定义索引）
		 */
		for(int i=0;i<ary.length;i++){
			if(ary[i]==0){
				ary[i]=1;
				ary[index++]=0;
				System.out.println("index:"+index);
			}
		}
		System.out.println(Arrays.toString(ary));
	}
}
