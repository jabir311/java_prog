package emp1;

//class hcf {
//	public static void main(String args[]) {
//		int num1 = 36, num2 = 60, hcf = 0;
//		for (int i = 1; i <= num1 && i <= num2; i++) {
//			if (num1 % i == 0 && num2 % i == 0) {
//				hcf = i;
//			}
//		}
//		System.out.print("this is " + hcf);
//	}
//}
//class hcf
//{
//  public static void main (String[]args)
//  {
//    int base = 5, x = 3;
//    System.out.println ("Required Power is " + power (base, x));
//  }
//  static int power (int base, int x)
//  {
//    if (x == 0)     //Base Condition
//      return 1;
//    return (base * power (base, x - 1));
//  }
//}
//import java.util.Scanner;
//class problemsolving
//{
//public static void main (String[]args)
//{
//	Scanner scan = new Scanner(System.in);
//	
//	int arr[]= {12,13,1,10,34,10};
//	
//	int max=arr[0];
//	for(int i=0; i<arr.length; i++) {
//		if(max<arr[i]) {
//			max=arr[i];
//		}
//	}
//	
//	System.out.println("The largest element of the array is " + max);
//}
//}
import java.util.Scanner;
class problemsolving
{
public static void main (String[]args) 
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Ask me the word i'll tell you it's a vowels or consonant");
	char c = scan.nextLine().charAt(0);

    //checking for vowels    
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
    {
        System.out.println(c + " is a vowel ");  // condition true input is vowel
    }
    else
    {
        System.out.println(c + " is a consonant ");  // condition true input is consonant
    }
}
}