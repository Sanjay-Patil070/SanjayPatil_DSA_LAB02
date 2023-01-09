package problem_2_driver;

import java.util.Scanner;

import problem_2_service.CurrencyCounter;
import problem_2_service.MergeSort;

public class Main {
	public static void main(String[] args) {
		
		//import Scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of currency denomination");
		int size=sc.nextInt();
		int[] currencyArray=new int[size];

		//fill the elements into currency array
		System.out.println("enter the values of denominations"); 
		for (int i = 0; i < size; i++) {
			currencyArray[i]=sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount=sc.nextInt();

		//sorting the array using merge sort
		MergeSort ms=new MergeSort();
		ms.sort(currencyArray,0,currencyArray.length-1);

		//create an object to invoke count method
		CurrencyCounter currencycounter=new CurrencyCounter();
		currencycounter.count(currencyArray,amount);
		sc.close();
	}
}
