package problem_1_driver;

import java.util.Scanner;

import problem_1_service.PayMoney;

public class Main {
	public static void main(String[] args)  {
		//import Scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of transanction array");
		int size=sc.nextInt();

		// create transaction array
		int[] transactionArray=new int[size];

		//fill the elements transaction array
		System.out.println("enter the values of  transaction array"); 
		for (int i = 0; i < size; i++) {
			transactionArray[i]=sc.nextInt();
		}
		System.out.println("enter the total number of  target that needs to be achieved");
		int targets=sc.nextInt();

		// create an object to invoke transaction method
		PayMoney paymoney=new PayMoney();
		paymoney.transaction(transactionArray,targets);
		sc.close();
	}
}
