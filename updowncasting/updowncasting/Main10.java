package updowncasting;


class Cool4
{
	
	void add()
	{
		System.out.println("add");
	}
	
}
class Goolata2 extends Cool4
{
	int r=77;
	void dispu()
	{
		System.out.println("dispu");
	}
}

public class Main10 {
	public static void main(String[] args) {
		System.out.println("******upcasting*********");
		Cool4 d1=new Goolata2();
		d1.add();
		
		
		System.out.println("******downcasting*********");
		Goolata2 p1=(Goolata2) d1;
		System.out.println(p1.r);
		p1.dispu();
		p1.add();
		
	}

}

