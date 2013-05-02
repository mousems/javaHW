
public class HW_0321_B10115012_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon[] polygon = new RegularPolygon[3];
		polygon[0]= new RegularPolygon();
		polygon[1]= new RegularPolygon(6,4);
		polygon[2]= new RegularPolygon(10,4,5.6,7.8);
		
		for(int i=0; i<3; i++){
			System.out.println("Polygon "+i+" perimeter: "+polygon[i].getPerimeter() +" area:"+polygon[i].getArea());
			
			
		}
	}

}

class RegularPolygon{
	private int n;
	private double side,x,y;
	
	
	RegularPolygon(){
		n=3;
		side=1;
		x=0;
		y=0;
	}
	RegularPolygon(int a,double b){
		n=a;
		side=b;
		x=0;
		y=0;
		
	}

	RegularPolygon(int a,double b,double c,double d){
		n=a;
		side=b;
		x=c;
		y=d;
		
	}
	
	double getPerimeter(){
		return n*side;
		
	}
	double getArea(){
		return n*side*side/4/Math.tan(1.59/n);
		
	}
	
}