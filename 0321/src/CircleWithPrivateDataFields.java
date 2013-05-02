
public class CircleWithPrivateDataFields {
	double radius;
	
	CircleWithPrivateDataFields(double x){
		radius=x;
	}
	
	public double getArea(){
		return Math.pow(radius,2)*3.1415926;
		
	}
	
	public double getRadius(){
		return radius;
	}
}
