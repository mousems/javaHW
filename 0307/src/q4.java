import java.util.Scanner;


public class q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] a = new double[10];
		for(int i=0;i<10;i++){
			a[i]=input.nextDouble();
		}
		
		double mean=0;
		for(int i=0;i<10;i++){
			mean+=a[i];
		}
		mean=mean/10;
		

		double deviation=0;
		double deviationa=0;
		double deviationb=0;

		for(int i=0;i<10;i++){
			deviationa+=Math.pow(a[i],2);
		}

		for(int i=0;i<10;i++){
			deviationb=Math.pow(mean*10,2)/10;
			
					
		}
		deviation=Math.sqrt((deviationa-deviationb)/9);
		
		
		System.out.println("Mean:"+mean+" Deviation:"+deviation);
	}
	
}
