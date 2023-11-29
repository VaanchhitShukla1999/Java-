package updowncasting;


class Demo10
{
	int r=200;
	double z=88.8;
	
}
class Dumataka3 extends Demo10
{
	int x=100;
}

public class Main11 {
	public static void main(String[] args) {
		System.out.println("******upcasting*********");
		Demo10 d1=new Dumataka3();
		System.out.println(d1.r);
		System.out.println(d1.z);

		System.out.println("******downcasting*********");
		Dumataka3 p1=(Dumataka3) d1;
		System.out.println(p1.z);
		System.out.println(p1.r);
		System.out.println(p1.x);
	}

}
