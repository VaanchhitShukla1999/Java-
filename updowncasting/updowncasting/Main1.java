package updowncasting;


class Sample
{
	void disp()
	{
		System.out.println("disp");
	}
	
}
class Ampules extends Sample
{
	void tata()
	{
		System.out.println("tata");
	}
}

public class Main1 {
	public static void main(String[] args) {
		System.out.println("******upcasting*********");
		Sample d1=new Ampules();
		d1.disp();
		System.out.println("******downcasting*********");
		Ampules p1=(Ampules) d1;
		p1.disp();
		p1.tata();
	}

}
