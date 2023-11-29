package updowncasting;


class Tester1
{
	int x=29;
	void disp()
	{
		System.out.println("disp");
	}
	
}
class Huliyacha extends Tester1
{
	void ho()
	{
		System.out.println("ho");
	}
}

public class Main7 {
	public static void main(String[] args) {
		System.out.println("******upcasting*********");
		Tester1 d1=new Huliyacha();
		d1.disp();
		System.out.println(d1.x);
		System.out.println("******downcasting*********");
		Huliyacha p1=(Huliyacha) d1;
		System.out.println(p1.x);
		p1.disp();
		p1.ho();
		
	}

}

