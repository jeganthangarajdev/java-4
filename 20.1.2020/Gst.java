/*public class Gst
{
   public static void main(String args[]) 
    { 
	
	   int x = 101; 
       int y = 120; 
      =(((y - x) * 100) / x); 
         System.out.print(" GST = "  +  gst (x, y) + "%"); 
    } 
} */

import java.util.Scanner;

public class Gst
{

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		int x,y=100,gst;
		System.out.println("enter amt");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		gst=x*18/y;
		if(gst)
		{
			
			System.out.println("correct");
		}
		else
		{
			System.out.println("wrong");
		}
		
		
	}

}
