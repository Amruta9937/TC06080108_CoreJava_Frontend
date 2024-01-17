package Session_8;

public class method_local_inner_class {
	private int i=10;
	
	public void get() {
		class inner{
			int no = 111;
			public void get() {
				System.out.println("No "+ no);
			}
		}
		inner i = new inner();
		i.get();
	}
	public static void main(String[] args) {
		method_local_inner_class m =new method_local_inner_class();
		m.get();
	}

}
