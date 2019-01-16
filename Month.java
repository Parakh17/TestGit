import java.util.*;
public class Month
{
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	System.out.print("Enter any number from 1 to 12 and to exit program enter 0");
	int a;
	do
	{
	a = consoleInput.nextInt();
	if(a==1)
	System.out.print("January");
	else if(a==2)
	System.out.print("Feburary");
	else if(a==3)
	System.out.print("March");
	else if(a==4)
	System.out.print("April");
	else if(a==5)
	System.out.print("May");
	else if(a==6)
	System.out.print("June");
	else if(a==7)
	System.out.print("July");
	else if(a==8)
	System.out.print("August");
	else if(a==9)
	System.out.print("September");
	else if(a==10)
	System.out.print("October");
	else if(a==11)
	System.out.print("November");
	else if(a==12)
	System.out.print("December");
	else
	System.out.print("Enter correct number");
	}while(a>0);
	}
}