package demo;

public class Person {
	public static void main(String[] args) {
		int[] arr={2,1,5,6,8,4,3,656,2154,545};
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		for(int num:arr){
			System.out.println(num);
		}
	}
}
