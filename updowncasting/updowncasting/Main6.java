package updowncasting;


class Cola1
{
	int f=10;
	
}
class Chungacha extends Cola1
{
	int d=23;
}

public class Main6 {
	public static void main(String[] args) {
		System.out.println("******upcasting*********");
		Cola1 d1=new Chungacha();
		System.out.println(d1.f);
		System.out.println("******downcasting*********");
		Chungacha p1=(Chungacha) d1;
		System.out.println(p1.f);
		System.out.println(p1.d);
	}

}
