import java.util.Date;

public class HW_0321_B10115012_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date[] date = new Date[8];
		

		for(int i=0; i<8; i++){
			date[i]=new Date();
			date[i].setTime(date[i].getTime()-(long)Math.pow(10,i+4));
		}
		
		for(int j=0; j<8; j++){
			System.out.println(date[j].toString());
		}
		
	}

}
