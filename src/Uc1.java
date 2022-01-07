
	import java.util.Scanner;

	public class Uc1 {
		
		public static void main(String [] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter X1 value :-");
			int x1=sc.nextInt();
			System.out.println("Enter Y1 value :-");
			int y1=sc.nextInt();
			System.out.println("Enter X2 value :-");
			int x2=sc.nextInt();
			System.out.println("Enter Y2 value :-");
			int y2=sc.nextInt();
			int xLength=(x1-x2)*(x1-x2);
			int yLength=(y1-y2)*(y1-y2);
			Uc1 uc=new Uc1();
			uc.Length(xLength,yLength);
		}

		public void Length(int xLength,int yLength) {
			double length=Math.sqrt (xLength)+(yLength);
			System.out.println("X and Y lie length is :- "+length);
			}
		}

