package squares;

public class Squares_main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = {1,2,3,4,5,6,7,8};
		double y[] = {3,6,9,12,15,18,21,24};
		double theta[] = new double[2];
		Squares_lib slib = new Squares_lib(x,y); 
		for(int i = 0 ; i < 1000; i++) {
			theta = slib.getDx();
			System.out.println(i+":theta[0] = "+theta[0]);
			System.out.println(i+":theta[1] = "+theta[1]);
			System.out.println(i+":Objective function = "+slib.getObject());
		
		}
	}

}
