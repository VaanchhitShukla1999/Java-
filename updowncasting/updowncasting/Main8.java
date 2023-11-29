package updowncasting;


class Cool2
{
	
	void disp()
	{
		System.out.println("disp");
	}
	
}
class Dinga extends Cool2
{
	int x=10;
	void tata()
	{
		System.out.println("tata");
	}
}

public class Main8 {
	public static void main(String[] args) {
		System.out.println("******upcasting*********");
		Cool2 d1=new Dinga();
		d1.disp();
		
		System.out.println("******downcasting*********");
		Dinga p1=(Dinga) d1;
		System.out.println(p1.x);
		p1.disp();
		p1.tata();
		
	}

}

