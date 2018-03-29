package cn.tcast.test;



public class Test1 {
	public static void main(String[] args) {
		
		run(7);
	}
	
	public static class run1{
		
	}
	
	public static void run(int a){
		// a代表行数
		// 一半的行数
		int row = (a+1)/2;
		
		// i代表上半部分行号
		for (int i = 1; i <= row; i++) {
			// 该行的空格数
			for(int j = 1; j <= row - i; j++){
				System.out.print(" ");
			}
			// 该行的*数
			for(int k = 1; k <= 2*i - 1; k++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		// 下半部分的行号
		for (int n = row - 1; n >= 1; n--) {
			// 空格数
			for (int m = 1; m <= row - n; m++) {
				System.out.print(" ");
			}
			// 星数
			for (int b = 1; b <= 2*n - 1  ; b++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	
		
	}
	
	
}
