package leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(123456789));

	}
	  public static int reverse(int x) {
	        boolean flag = false;
		if (x < 0) {
			x = 0 - x;
			flag = true;
		}
	 
		int res = 0;
		int p = x;
	 try{
		while (p > 0) {
		    if(res!=0 && Integer.MAX_VALUE/res<10)
		    return 0;
			int mod = p % 10;
			p = p / 10;
			res = res * 10 + mod;
		}
	 }catch(Exception e){
	     System.out.println(e);
	 }
	 
		if (flag) {
			res = 0 - res;
		}
	 
		return res;
	    }

}
