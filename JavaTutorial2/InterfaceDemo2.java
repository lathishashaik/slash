

interface Abc{
	void show1();
}
class Implementor implements Abc{
	public void show1() {
		System.out.println("Anything");
	}
}
public class InterfaceDemo2 {
//Interface concept+Anonymous concept
	public static void main(String[] args) {
		Abc obj=new Implementor();
		obj.show1();
//Abc obj=new Abc();Error as it is obj we can't instantiate so we will write
//implementation part  & there will be no need of another cls Implementor
		Abc obj1=new Abc() 
		                  {
							public void show1() {
								System.out.println("Anything!!!");
							}
		                  };
         obj1.show1();
	}

}
