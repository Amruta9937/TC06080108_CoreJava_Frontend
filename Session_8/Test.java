package Session_8;

public class Test extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Popcorn p= new Popcorn() {
			@Override
			public void taste() {
				System.out.println("cheesy");
			}
		};
		p.taste();

	}

}
