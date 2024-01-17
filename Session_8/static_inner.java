package Session_8;
//static is called using classname.method()
public class static_inner {
	private int i=100;
	private static int a=1;
	
	static class inner{
		int no = 111;
		
		public void get() {
			System.out.println("No = "+no);
			System.out.println(" a = "+a);
		}
	}
	public static void main(String args[]) {
		static_inner.inner i = new static_inner.inner();
		i.get();
	
	}

}
