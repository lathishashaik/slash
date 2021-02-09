//Types of Interface
//1.Normal(more than 1 method)
//2.Single abstract method-Functional Interface(SAM interface)
//3.Marker interface(donot have any method)eg:Serializable interface

interface Abc{
	void show1();
}
public class InterfaceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   /*Abc obj1=new Abc() 
					        {
								public void show1() {
									System.out.println("Anything!!!");
								}
					        };
		 same as below*/
Abc obj1=()->System.out.println("Anything");//Lambda exp workswith //2.only
           obj1.show1();
	}

}
