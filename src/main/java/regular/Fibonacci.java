package regular;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibonacci(1));

	}
	public static int fibonacci(int num){
		if(num<=1){
			return 1;
		}
		return num+fibonacci(num-1);

	}
	
}
