package demo;

public class Demo {
	public static void main(String[] args) {
		//原数组
		int[] ary={1,6,8,4,6,1,6,4,5,9};
		
		//新数组
		int[] count=new int[10];
		/*
		 * 对数组进行遍历，读取到一个值以后，在新数组对应的下标的位置的值+1
		 * 新数组中下标对应原数组中的值为0~9
		 * 对应下标的值达标是每一个元元素出现的次数
		 */
		for(int n:ary){
			count[n]++;
		}
		/*
		 * 这里需要用到下标，所有我们用
		 */
		for(int i=0;i<count.length;i++){
			System.out.println(i+"出现的次数"+count[i]);
		}
	}
}
