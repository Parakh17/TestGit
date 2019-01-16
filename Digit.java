import java.util.*;
class Digit
{
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	int i, d, r=0, a;
	char s;
	do {
	System.out.println("Enter 5 digit number: ");
	int n = consoleInput.nextInt();
	if (n>9999 && n<=99999)
	{
	for(i=n; i>0; i=i/10)
	{
	d=n%10;
	r=(r*10)+d;
	}
	for(i=r; i>0; i=i/10)
	{
	a=r%10;
	System.out.print(+a);
	System.out.print("   ");
	a=0;
	}
	}
	else
	System.out.println("Enter digit again");
	System.out.print("\nDo you want to repeat the program Y/N: ");
	s = consoleInput.next().charAt(0);
	}while(s != 'N');
	}
}