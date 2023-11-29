package updowncasting;


class Sample21
{
	int r=33;
	void co()
	{
		System.out.println("co");
	}
	
}
class Hahoha extends Sample21
{
	
	void disp()
	{
		System.out.println("disp");
	}
}

public class Main12 {
	public static void main(String[] args) {
		System.out.println("******upcasting*********");
		Sample21 d1=new Hahoha();
		d1.co();
		System.out.println(d1.r);
		
		
		System.out.println("******downcasting*********");
		Hahoha p1=(Hahoha) d1;
		System.out.println(p1.r);
		p1.disp();
		p1.co();
		
	}

}

