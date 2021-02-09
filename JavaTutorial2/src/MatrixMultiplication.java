import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array n=?");
		int n=sc.nextInt();
		int m1[][]=new int[n][n];
		int m2[][]=new int[n][n];
		int m[][]=new int[n][n];
		System.out.println("enter the values of matrix m1 row wise");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the values of matrix m2 row wise");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				m2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
                 //m[i][j]=0;
				for(int k=0;k<n;k++) {
					m[i][j]=m[i][j]+m1[i][k]*m2[k][j];
				}
				
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}

}
