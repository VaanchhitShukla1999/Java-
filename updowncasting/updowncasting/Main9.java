package updowncasting;


class Tester3
{
	int r=77;
	void disp()
	{
		System.out.println("disp");
	}
	
}
class Tista1 extends Tester3
{
	
	void uliya()
	{
		System.out.println("uliya");
	}
}

public class Main9 {
	public static void main(String[] args) {
		System.out.println("******upcasting*********");
		Tester3 d1=new Tista1();
		d1.disp();
		System.out.println(d1.r);
		
		System.out.println("******downcasting*********");
		Tista1 p1=(Tista1) d1;
		System.out.println(p1.r);
		p1.disp();
		p1.uliya();
		
	}

}

