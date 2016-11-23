import java.util.Scanner;
class prime
{
	void show()
	{
	System.out.println("enter the number:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int flag=0;
	for(int i=2;i<a;i++)
		{
		if(a%i==0)
			{
				System.out.println("number is prime");
			
			flag=1;
			break;
		}
		}
			if(flag==0)
				{
					System.out.println("number is not prime");
				}
}
}
class n
{
public static void main(String ar[])
{
prime o=new prime();
o.show();
}
}


			
		
		
	
	
