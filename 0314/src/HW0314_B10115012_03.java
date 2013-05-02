
public class HW0314_B10115012_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double[][] points ={{-1,0,3},{-1,-1,-1},{4,1,1,},{2,0.5,9},{3.5,2,-1},{3,1.5,3},{-1.5,4,2},{5.5,4,-0.5}};
		double ans=countdistance(points,0,1);
		
		
		int[][] ansij={{0,1},{0,0}};
		int anscount = 1;
		
		
		
		for(int i=0; i<points.length-1; i++){
			for(int j=i+1; j<points.length; j++){
				double ansnow=countdistance(points,i,j);
				if(ansnow<ans){
					ans=ansnow;
					ansij[0][0]=i;
					ansij[0][1]=j;
				}else if(ansnow==ans){
					anscount++;
					ansij[1][0]=i;
					ansij[1][1]=j;
					
				}
				
				
			}
			
		}

		System.out.println("point " + ansij[0][0] + "&" + ansij[0][1] + ", point " +ansij[1][0] + "&" + ansij[1][1] );
		
	}

	public static double countdistance(double points[][],int i, int j){
		double distance;
		distance=Math.sqrt(Math.pow(points[i][0]-points[j][0],2)+Math.pow(points[i][1]-points[j][1],2)+Math.pow(points[i][2]-points[j][2],2));
		return distance;
		
		
	}
}
