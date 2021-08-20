import java.util.ArrayList;
import java.util.Scanner;

public class stringrev
{
	public static void main(String args[])
	{
		ArrayList<String> arrli = new ArrayList<>();
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the size of string array : ");
		int n = sc.nextInt();
		System.out.println("enter the strings");
		for(int i=0;i<n;i++) {
			arrli.add(sc.next());
		}
		System.out.println("Reversed Strings : ");
		for(int j=arrli.size()-1;j>=0;j--) {
			System.out.println(arrli.get(j));
	}
}
}