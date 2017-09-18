
package src;

import java.util.Scanner;

public class Main {
	int initialBookPrice;
	
	int discountPrice;

	int basePrice ;

	int budget ;
	public static void main(String[] args) {
		Main Obj = new Main();
		
			Obj.initialBookPrice = Obj.inputReader("Initial Book Price");
			
			Obj.discountPrice = Obj.inputReader("Discount Price");

			Obj.basePrice= Obj.inputReader("Base Price");

			Obj.budget= Obj.inputReader("Budget");
			
			if (Obj.budget < Obj.initialBookPrice) {
				System.out.printf("0 Books, $%s remaining", Obj.budget);
			} else if (Obj.budget == Obj.initialBookPrice) {
				System.out.printf("1 Book, $0 remaining");
			} else {
				System.out.println(Obj.offerFunction());
			}
			
			
		
	}
	
	public  int inputReader(String variableName) {
		System.out.printf("Please enter the %s: ",variableName);
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		int n = 0;
		while (flag) {
		    n = Integer.parseInt(scanner.next());
		    if (n >= 0) {
		        break;
		    }else{
		        System.out.printf("Please enter a valid Positive %s",variableName);
		        System.out.printf("\nPlease enter the %s: ",variableName);
		    }
		    
		}
		return n;
		
		
	}
	
	public String offerFunction() {
		int diffPrice = this.initialBookPrice - this.basePrice;
		int numberOfBooks = 0;
		int tempBudget = this.budget;
		int remaining = 0;
		for (int i = this.initialBookPrice; i >= diffPrice; i= i - this.discountPrice) {
			numberOfBooks+=1;
			tempBudget -= i;
		}
		numberOfBooks += tempBudget/this.basePrice;
		remaining = tempBudget % this.basePrice;
		return String.format(" %s books, $%s remaining", numberOfBooks,remaining);
//		System.out.printf(" %s books, %s remaining", numberOfBooks,remaining);
	}

}
