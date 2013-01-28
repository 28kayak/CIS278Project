import java.util.Scanner;

public class VarifyCard
{

	
	public static void main(String[] args) 
	{
		int cardNum;
		int digit[] = new int[8];
		Scanner scan = new Scanner(System.in);
		System.out.println("digit.length =" + digit.length);
		System.out.println("digit.length -1 =" + (digit.length-1));
		System.out.println("Enter your 8 digit number");
		cardNum = scan.nextInt();
		int index;
		for(index = 7; index >= 0; --index)
		{
			digit[index] =(int)(cardNum/Math.pow(10, index))%10;
			System.out.printf("\ndigit[%d] = %d",index,digit[index]);
		}
		int i=0;
		int oddSum = 0;
		int evenSum = 0;
		int count =0;
		
		 // •Starting from the rightmost digit,  form the sum of every other digit. 
		//calculate sum of even index
		for(i = 0; i < digit.length -1; i+=2)
		{
			
			System.out.printf("\ndigit[%d] = %d",i,digit[i]);
			evenSum += digit[i];
			
			System.out.printf("\nEvenSum = %d",evenSum);
		}
		System.out.printf("\nResult of evenSum = %d\n",evenSum);
		//•	Double each of the digits that were not included in the preceding  step. 
		//Add all digits of the resulting numbers
		//double and add each odd index of array
		int oddDigit[] = new int[8];
		int doubleing = 0;
		int oddSum2 = 0;
		int doubleingSum =0;
		//loop for odd index
		for(count = 1; count <= 7; count+=2)
		{
			
			System.out.printf("\ndigit[%d] = %d",count,digit[count]);
			doubleing = (int)(2* digit[count]);
			oddSum = (int) doubleing / 10; 
			oddSum2 = (int) doubleing % 10;
			doubleingSum += oddSum + oddSum2;
			System.out.printf("\noddSum = %d",oddSum);
			System.out.printf("\noddSum2 = %d",oddSum2);
			System.out.printf("\ndoubleingSum = %d\n",doubleingSum);
			
		}
		int finalResult = doubleingSum + evenSum;
		
		if(finalResult %10 == 0)
		{
			System.out.printf("\nthis card number is valid: %d ", cardNum );
		}
		else
		{
			System.out.printf("\nthis card number is invalid %d", cardNum);
		}
		
	}//main

}//class
