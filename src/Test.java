
public class Test {

	public static void main(String[] args)throws InterruptedException {
    MSOffice m1=new MSOffice();
	MSOffice m2=new MSOffice();
	MSOffice m3=new MSOffice();
	
	m1.setName("typing");
	m2.setName("spellCheck");
	m3.setName("saving");

	m1.start();
	m1.join();
	m2.start();
	m2.join();
	m3.start();
	m3.join();
	}

}
