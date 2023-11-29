package updowncasting;


class Cool
{
	void add()
	{
		System.out.println("add");
	}
	
}
class Goolata extends Cool
{
	void dispu()
	{
		System.out.println("dispu");
	}
}

public class Main3 {
	public static void main(String[] args) {
		System.out.println("******upcasting*********");
		Cool d1=new Goolata();
		d1.add();
		System.out.println("******downcasting*********");
		Goolata p1=(Goolata) d1;
		p1.dispu();
		p1.add();
		
	}

}

