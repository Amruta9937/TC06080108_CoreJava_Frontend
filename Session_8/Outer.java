package Session_8;

import Session_8.static_inner.inner;

public class Outer {
	private static int no=100;
	
	protected class inner{
		int no=1000;
		public void getNo() {
			int no=10;
			System.out.println("No = "+no);
			System.out.println("Inner No = "+this.no);
			System.out.println("Outer No = "+ Outer.no);
		}
	}
//	public void get() {
//		inner i = new inner();
//		i.getNo();
//	}
	
	
	public static void main(String[] args) {
//		Outer o = new Outer();
//		inner i =o.new inner();			//methods cannot be called without the help 
//		i.getNo();									// of outer class 
//		o.get();
		inner i = new Outer().new inner();
		i.getNo();
		
		
	}		

}
