package updowncasting;


class Cola13
{
	int f=33;
	void disp()
	{
		System.out.println("disp");
	}
	
}
class Chungacha1 extends Cola13
{
	int d=44;
}

public class Main13 {
	public static void main(String[] args) {
		System.out.println("******upcasting*********");
		Cola13 d1=new Chungacha1();
		d1.disp();
		System.out.println(d1.f);
		
		
		System.out.println("******downcasting*********");
		Chungacha1 p1=(Chungacha1) d1;
		System.out.println(p1.d);
		System.out.println(p1.f);
		p1.disp();
		
	}

}


