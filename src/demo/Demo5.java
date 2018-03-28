package demo;

public class Demo5 {
	public static void main(String[] args) {
		int[] arr={4,4,54,43,245,2342,643};
		for (int i = 0; i < arr.length-1; i++) {
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
