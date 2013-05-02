import java.util.Scanner;

public class HW0314_B10115012_01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] a = new double[10];
		for(int i=0;i<10;i++){
			
			a[i]=input.nextDouble();
			
		}
		
		for(int i=9;i>0;i--){
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]){
					double tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
				
				
			}
			
			
		}
		
		for(int k=0;k<10;k++){
			System.out.print(a[k]+" ");
		}
	}
}
