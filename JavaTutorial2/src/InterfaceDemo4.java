//Abstract class->both Define & declare
//Interference->only declare but after 1.8 can also define methods 
//issue with multiple Inheritance****NOTES**(c)
//static methods in interface
interface Demo{
	int num=2;//variable in interface is bydefault CONSTANT(FINAL var)
	void abc();
	default void display() {//define methods by default keyword
		System.out.println("In show");
	}
	//******
	static void showw() {
		System.out.println("hi");
	}
}

class DemoImp implements Demo{
	public void abc() {
		System.out.println("in abc");
	}
	//@Override
	public void display() {
		System.out.println("in new show");
	}
}
public class InterfaceDemo4 {

	public static void main(String[] args) {
		Demo obj=new DemoImp();
		obj.abc();
		obj.display();//Execute with & without overiding
//Inorder to call staticmethod in interface we neednot want to create method
		Demo.showw();

	}

}
