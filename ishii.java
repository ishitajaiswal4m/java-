import java.util.*;
class ishii{
  public static void main(String args[])
  {
	   int sum=0;
	   ArrayList<Integer> l=new ArrayList<Integer>();
	 System.out.println("enter the input ");
	   Scanner s=new Scanner(System.in);
	   while(s.hasNextInt())
	   {
		   l.add(s.nextInt());
	   }
	   for(int i=0;i<l.size(); i++)
	   {
		   sum=sum+l.get(i);
	   }
	  System.out.println("sum"+sum);
  }
 }
 
	   
	   