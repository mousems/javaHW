import java.util.Scanner;


public class HW0314_B10115012_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int count=input.nextInt();
		
		int[] list=new int[count];
		int pivot=input.nextInt();
		list[count-1]=pivot;
		
		for(int a=0; a<count-1; a++){
			list[a]=input.nextInt();
		}
		
		int i=-1;
		
		
		for(int j=i+1; j<count-2; j++){
			if(list[j]<=pivot){
				exchangelist(list,j,i+1);
				i++;
			}
		}
		exchangelist(list,i+1,count-1);
				
			
			
		printlist(list,count);
		

	}
	
	
	public static void printlist(int list[], int count){
		for(int i=0; i<count ;i++){
			System.out.print(list[i]+" ");
		}
		System.out.print("\n");
		
	}

	public static void exchangelist(int list[], int i, int j){
		int c=list[i];
		list[i]=list[j];
		list[j]=c;
		
	}
}
