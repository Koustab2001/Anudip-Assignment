package labtest2;
import java.util.Scanner;

public class DuplicateValue {

	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of words: "); //input the number of strings
		n=sc.nextInt();
		String[] s=new String[n];
		System.out.println("Enter the string value: "); //input the strings
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(s[i].equals(s[j]) && (i!=j))
					System.out.println("Duplicate value: "+s[j]); //printing the duplicate values


	}

}
	}
}
