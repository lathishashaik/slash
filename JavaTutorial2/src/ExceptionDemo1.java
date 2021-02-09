

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=9/0;// Exception by zero
		try 
		{
			int a[]=new int[6];
			int b[]=null;
			b[2]=6;
			a[6]=8;
			int i=9;
			int k=0;
			int j=i/k;
			System.out.println(j);
		}
	    catch(ArithmeticException |ArrayIndexOutOfBoundsException e)//if we want to dispaly same msg
		{
			System.out.println("error");
		//System.err.println("error");//if we want error in red
		}
//better to use Exception block as last block only as we dont know all exceptnames
		catch(Exception e) {
			System.out.println("sthg wrong");
		}

		finally 
		{
			System.out.println("bye");
		}

	}

}
