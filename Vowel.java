import java.util.*;
class Vowel 
{
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	System.out.println("Enter any character:");
	char c = consoleInput.next().charAt(0);
	if(c>='a' && c<='z' || c>='A' && c<='Z')
	{
	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
	System.out.println("Vowel");
	else
	System.out.println("Consonant");
	}
	else
	System.out.println("Invalid character entered.");
	}
}