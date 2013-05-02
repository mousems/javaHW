
public class HW_0321_B10115012_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle Reca = new Rectangle(4,40);
		Rectangle Recb = new Rectangle(3.5,35.9);
		
		System.out.println("Rectangle A : width:" + Reca.width + " height:" + Reca.height + " area:" + Reca.getArea() + " perimeter:" + Reca.getPerimeter());

		System.out.println("Rectangle B : width:" + Recb.width + " height:" + Recb.height + " area:" + Recb.getArea() + " perimeter:" + Recb.getPerimeter());

	}
	

}

class Rectangle{
	double width;
	double height;

	Rectangle(){
		width=1;
		height=1;
	}
	Rectangle(double a ,double b){
		width=a;
		height=b;
	}
	double getArea(){
		return width*height;
	}
	double getPerimeter(){
		return 2*(width+height);
	}
	
	
	
	
}