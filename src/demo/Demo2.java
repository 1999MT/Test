package demo;

public class Demo2 {
	public static void main(String[] args) {
		String s=new String("hello");
		String t=new String("hello");
		char c[]={'h','e','l','l','o'};
		boolean a1=s.equals(t);
		boolean a2=t.equals(c);
		boolean a3= s==t;
		boolean a4=t.equals(new String("hello"));
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
	}
}
