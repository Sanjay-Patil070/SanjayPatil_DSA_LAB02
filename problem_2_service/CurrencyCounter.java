package problem_2_service;

public class CurrencyCounter {
	public void count(int[] currencyArray, int amount) {
		int size=currencyArray.length;
		
		// create note count array
		int[] noteCount=new int[size];

		//use try catch block to avoid Zero denomination currency
		try {
			//fill the note count array according to formula
			for(int i=size-1; i>=0; i--) {
				if(amount>=currencyArray[i]) {
					noteCount[i]=amount/currencyArray[i];
					amount=amount % currencyArray[i];
				}
			}

			if(amount>0) {
				System.out.println("exact amount cannot be given with the highest denomination");
			}
			else {
				System.out.println("Your payment approach in order to give minimum number of notes will be");
				for (int i=size-1; i>=0; i--) {
					if(noteCount[i]!=0) {
						System.out.println(currencyArray[i]+" "+":"+" "+noteCount[i]);
					}
				}
			}
		}catch(ArithmeticException e) {
			System.out.println("notes of denomination 0 is invalid");
		}
	}
}
