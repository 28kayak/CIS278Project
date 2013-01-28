import java.util.Scanner;

public class VarifyCard
{

	
	public static void main(String[] args) 
	{
		int cardNum;
		int digit[] = new int[8];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your 8 digit number");
		cardNum = scan.nextInt();
		int index;
		for(index = 7; index >= 0; --index)
		{
			digit[index] =(int)(cardNum/Math.pow(10, index))%10;
			System.out.printf("\ndigit[%d] = %d",index,digit[index]);
		}
		//System.out.printf("\ndigit[0] = %d",digit[0]);
		
		int i=0;
		int oddSum = 0;
		int evenSum = 0;
		int count =0;
		System.out.println("\nfor looping");
		
		 // •Starting from the rightmost digit,  form the sum of every other digit. 
		//calculate sum of even index
		for(i = 0; i < digit.length -1; i+=2)
		{
			
			System.out.printf("\ndigit[%d] = %d",i,digit[i]);
			evenSum += digit[i];
			//System.out.printf("\nAfter calc\ndigit[%d] = %d",i,digit[i]);
			//
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
			/*
			//oddDigit[count] =(int) (2 * digit[count]);//Substitute odd-index
			oddSum = (int) (oddDigit[count]/10);
			oddSum2 = (int)(oddDigit[count]%10);
			System.out.printf("\noddSum = %d\n",oddSum);
		    System.out.printf("the reminder  = %d\n",oddSum2);
		
		*/
		}
		int finalResult = doubleingSum + evenSum;
		System.out.printf("the result = %d", finalResult );
		if(finalResult %10 == 0)
		{
			System.out.printf("\nthis card number is valid: %d ", cardNum );
		}
		else
		{
			System.out.printf("\nthis card number is invalid %d", cardNum);
		}
		/*
		for(int counter = 0; counter < oddDigit.length-1 ; counter +=2)
		{
			System.out.println(oddDigit[counter]);
		}
		System.out.printf("\nResult of oddSum = %d",oddSum);
		
		
		System.out.printf("\nResult of oddSum = %d",oddSum);
		*/
	}//main

}//class
