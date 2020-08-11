import java.util.*;
class A
{
	public static void main(Strings[] args)
	{
	system.out.println("Enter number of minutes");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	float hr=(float)n/60;//converting minutes to hours
	//System.out.println("hours:"+hour);
	float days=hour/24;//converting hours to days
	//System.out.println("days:"+days);
	int years=(int)days/365;//converting days to years
	System.out.println("years:"+years);
	int d=(int)days%365;
	System.out.println("remaining days"+d);
	}
}