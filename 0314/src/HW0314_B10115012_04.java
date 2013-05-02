import java.util.Scanner;
public class HW0314_B10115012_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		// -1=null  0=O   1=X
		int[][] table={{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
		
		char[] player={'O','X'};
		int now_player=0;
		boolean finish=false;
		while(!finish){

			printtable(table);
			int c,r;
			System.out.print("Enter a row(0,1 or 2) for player "+player[now_player]+" :");
			r=input.nextInt();
			System.out.print("Enter a colume(0,1 or 2) for player "+player[now_player]+" :");
			c=input.nextInt();
			if(table[r][c]==-1){

				table[r][c]=now_player;
				
				if(now_player==0){
					now_player=1;
				}else{
					now_player=0;
				}
				
			}
			if(checktable(table)!=-1){

				printtable(table);
				switch(checktable(table)){
				case 0:
					System.out.println("O Player Win!");
					break;
				case 1:
					System.out.println("X Player Win!");
					break;
				}
				
				finish=true;
				
			}
			
		}
		
		
	}
	
	
	public static void printtable(int[][] table){
		System.out.println("-------------");
		
		for(int j=0; j<3; j++){

			System.out.print("|");
			for(int i=0; i<3; i++){
				System.out.print(" ");
				
				switch (table[j][i]){
					case -1:
						System.out.print(" ");
						break;
					case 0:
						System.out.print("O");
						break; 
					case 1:
						System.out.print("X");
						break; 
				}
				
				
				
				System.out.print(" |");
			}
			
			System.out.println("\n-------------");
		}

		
		
	}

	public static int checktable(int[][] table){
		int ans=-1;//0 O win     1 X win
		
		
		// check |s
		for(int i=0; i<2; i++){
			if(table[i][0]!=-1){
				if(table[i][0]==table[i][1] && table[i][1]==table[i][2]){
					
					return table[i][0];
				}
			}
		}
		
		
		
		// check -s

		for(int i=0; i<2; i++){
			if(table[0][i]!=-1){
				if(table[0][i]==table[1][i] && table[1][i]==table[2][i]){
					
					return table[0][i];
				}
			}
		}
		
		
		// check \
		if(table[0][0]!=-1){
			if(table[0][0]==table[1][1] && table[1][1]==table[2][2]){
				
				return table[0][0];
			}
		}
		
		// check /

		if(table[0][2]!=-1){
			if(table[0][2]==table[1][1] && table[1][1]==table[2][0]){
				
				return table[0][2];
			}
		}
		
		// check /
		
		
		return ans;
	}
}
