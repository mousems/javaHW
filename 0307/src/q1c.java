import java.util.Scanner;



public class q1c {
	public static void main(String[] args) {

		for(int i=1;i<=5;i+=2){
			printstar(i);
			System.out.print("\n");
		}

		for(int i=3;i>=1;i-=2){
			printstar(i);
			System.out.print("\n");
		}
	}
	
	public static void printstar(int n) {

		int a;
		int b;
		b=n;
		a=(5-b)/2;
		for(int i=0;i<a;i++){
			System.out.print(" ");
		}
		for(int i=0;i<b;i++){
			System.out.print("*");
		}
	}
}
