
public class Begin {

	public static void main(String[] args) throws InterruptedException {
	Human h1=new Human();
	Human h2=new Human();
	Human h3=new Human();
	h1.setName("Boy");
	h2.setName("Girl");
	h3.setName("Others");
	h1.start();
	h1.join();
	h2.start();
	h2.join();
	h3.start();
	h3.join();
	

	}

}
