package intro.dev;
import java.util.Scanner;

public class firstexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float add, sub, mul, div, mod,x,y;
		Scanner scan = new Scanner(System.in);
		 x = scan.nextInt();
		 y = scan.nextInt();
		
		add = x+y;
		sub = x-y;
		mul = x*y;
		div = x/y;
		mod = x%y;
		System.out.println("add = "+ add);
		System.out.println("sub = "+ sub);
		System.out.println("mul = "+ mul);
		System.out.println("div = "+ div);
		System.out.println("modules = "+ mod);

	    System.out.println("enter the first String(str1)");
	    String str1 = scan.nextLine();
	    
	    System.out.println("Enter the second string(str2)");
	    String str2=scan.nextLine();
	    
	    String str3=str1+str2;
	    System.out.println("the concatenated string is"+str3);
	    
	    scan.close();
	    
	    System.out.println(x>y);
	    System.out.println(x<y);
	    System.out.println(x==y);
	    System.out.println(x!=y);
	    System.out.println(x>=y);
	    System.out.print(x<=y);

	    
	}

}
