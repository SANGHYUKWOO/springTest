package calculator.biz;

public class Calculation {
	public void add(int x, int y) {
		int result = x+y;
		System.out.println(x+"+"+y+"="+result);
		//return x+y;
	}
	public void sub(int x, int y) {
		int result = x-y;
		System.out.println(x+"-"+y+"="+result);
		//return x-y;
	}
	public void mul(int x, int y) {
		int result = x/y;
		System.out.println(x+"/"+y+"="+result);
	}
	public void div(int x, int y) {
		int result = x*y;
		System.out.println(x+"*"+y+"="+result);
	}
}
