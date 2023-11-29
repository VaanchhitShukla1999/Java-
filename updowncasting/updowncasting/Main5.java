package updowncasting;


class Sample2
{
	void co()
	{
		System.out.println("co");
	}
	
}
class Guleyaluu extends Sample2
{
	void disp()
	{
		System.out.println("disp");
	}
}

public class Main5 {
	public static void main(String[] args) {
		System.out.println("******upcasting*********");
		Sample2 d1=new Guleyaluu();
		d1.co();
		System.out.println("******downcasting*********");
		Guleyaluu p1=(Guleyaluu) d1;
		p1.disp();
		p1.co();
		
	}

}

