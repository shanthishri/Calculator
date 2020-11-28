import java.io.*;

class StringCalculator 
{
	public static void main(String args[]) throws IOException
	{
		String num;
		int sum=0;
		DataInputStream d1 = new DataInputStream(System.in);
		
		try {
	
            System.out.println("Enter number: ");
		    num = d1.readLine();
		    sum = Add(num);
            System.out.println("Sum of numbers is: "+sum);
        }
        catch(NumberFormatException e)
       {
    	   System.out.println("sum is 0");
       } 
	}

	static int Add(String x) 
	{
		int sum =0;
        int len = x.length();
        
        String[] arrOfStr = x.split(",", len); 
  
        for (String a : arrOfStr) 
        {
			sum = sum + Integer.parseInt(a);
        }
          
		return sum;
	}
}
