package updowncasting;


class Demo1
{
	double z=10.89;
	
}
class Dumtaka extends Demo1
{
	int x=23;
}

public class Main4 {
	public static void main(String[] args) {
		System.out.println("******upcasting*********");
		Demo1 d1=new Dumtaka();
		System.out.println(d1.z);
		System.out.println("******downcasting*********");
		Dumtaka p1=(Dumtaka) d1;
		System.out.println(p1.x);
		System.out.println(p1.z);
	}

}
