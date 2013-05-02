import java.util.Scanner;



public class q1d {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++){
			printstar(i);
		}

		for(int i=2;i>=1;i--){
			printstar(i);
		}

	}
	

	
	public static void printstar(int n) {

		for(int i=1;i<=5;i++){
			if(n%2 ==i%2){
				if(i>=3-(n-1)*2){

					if(i<=3+(n-1)){
						System.out.print("*");

					}else{

						System.out.print(" ");
					}
				}else{

					System.out.print(" ");
					
				}
			}else{

				System.out.print(" ");
				
			}
			
		}
		System.out.print("\n");
	}
}
