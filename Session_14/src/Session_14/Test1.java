package Session_14;

public class Test1 {

	public static void main(String[] args) {

		ThreadGroup g1= new ThreadGroup("tg");
		Thread t1= new Thread(g1,"First Thread");  //5
		Thread t2= new Thread(g1,"second Thread"); //5
		System.out.println(g1.getMaxPriority());  //10
		//args
		g1.setMaxPriority(3);
		Thread t3= new Thread(g1,"third Thread");  //3
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
	}

}
