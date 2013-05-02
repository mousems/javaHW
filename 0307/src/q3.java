import java.util.Scanner;



public class q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Numbers:");
		int max=0;
		int maxcount=0;
		int i;
		boolean stop = false;
		
		while(!stop){
			i=input.nextInt();
			
			if(i>max){
				maxcount=0;
				max=i;
			}else if(i==max){
				maxcount++;
			}
			
			
			if(i==0){
				stop=true;
			}
			
		}
		System.out.println("MAX:"+max+" MAX count:"+maxcount);

	}
	

	
}
