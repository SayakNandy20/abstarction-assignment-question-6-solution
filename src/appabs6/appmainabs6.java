package appabs6;

import java.util.Scanner;

import parentchildabs6.SavingsAccount;

public class appmainabs6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account no");
		int accountno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the holder name");
		String holdrename=sc.nextLine();
		System.out.println("Enter the Balance");
		double Balance=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the minimum balance");
		double minbalance=sc.nextDouble();
		sc.nextLine();
		SavingsAccount savingsaccount=new SavingsAccount(accountno,holdrename,Balance,minbalance);
		System.out.println("Account number-"+savingsaccount.getAccNumber());
		System.out.println("Interesrt ammount-"+savingsaccount.calculateInterest());

	}

}
