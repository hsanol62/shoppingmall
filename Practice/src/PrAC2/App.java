package PrAC2;

public class App {
public static void main (String []args) {
System.out.println(add(10,20,30,40));
//계속 추가 가능
}
	public static int add(int ... numbers) {
		int sum = 0;
		for (int i=0; i<numbers.length; i++) {
		sum = sum + i;
		}
		return sum;
	}
}