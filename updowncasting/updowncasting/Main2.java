package updowncasting;


class Tester
{
	int r=200;
	
}
class Tista extends Tester
{
	void uliya()
	{
		System.out.println("uliya");
	}
}

public class Main2 {
	public static void main(String[] args) {
		System.out.println("******upcasting*********");
		Tester d1=new Tista();
		System.out.println(d1.r);
		System.out.println("******downcasting*********");
		Tista p1=(Tista) d1;
		p1.uliya();
		System.out.println(p1.r);
	}

}
