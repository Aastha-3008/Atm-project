package ATM;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.*;

public class Account {
	private int customerId;
	private int pinNumber;
	private double checkingBalance;
	private double savingBalance;
	Scanner input= new Scanner(System.in);
	NumberFormat moneyFormat= NumberFormat.getCurrencyInstance(Locale.US);
   public void setCustomerId(int customerId)
   {
	   this.customerId=customerId;
   }
   public int getCustomerId() {
	   return this.customerId;
   }
   public void setPinNumber(int pinNumber)
   {
	   this.pinNumber=pinNumber;
	   
   }
   public int getPinNumber() {
	   return this.pinNumber;
   }
   public double getCheckingBalance() {
	   return checkingBalance;
   }
   public double getSavingBalance() {
	   return savingBalance;
   }

	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
 
	public double calcSavingWithdraw(double amount) {
		savingBalance=(savingBalance-amount);
		return savingBalance;
	}
	public double calcCheckingDeposit(double amount) {
		checkingBalance=(checkingBalance+amount);
		return savingBalance;
	}
	public double calcSavingDeposit(double amount) {
		savingBalance=(savingBalance+amount);
		return savingBalance;
	}
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance:"+ moneyFormat.format(checkingBalance));
		System.out.println("Ammount you want to withdraw from Checking Account: ");
		double amount=input.nextDouble();
		if((checkingBalance-amount)>=0)
		{
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance:"+moneyFormat.format(checkingBalance));
		}
		else {
			System.out.println("Insufficient Balance"+"\n");
		}
		
	}
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance:"+ moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to Deposit to Checking Account: ");
		double amount = input.nextDouble();
        if((checkingBalance+amount)>0) {
        	calcCheckingDeposit(amount);
        	System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));

        	}
        	else {
        		System.out.print("Balance cannot be negative");
        	}
	}
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance:"+ moneyFormat.format(savingBalance));
		System.out.println("Ammount you want to withdraw from Saving Account: ");
		double amount=input.nextDouble();
		if((savingBalance-amount)>=0)
		{
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance:"+moneyFormat.format(savingBalance));
		}
		else {
			System.out.println("Insufficient Balance"+"\n");
		}
	}
	public void getSavingDepositInput() {
		System.out.println("Checking Account Balance:"+ moneyFormat.format(savingBalance));
		System.out.print("Amount you want to Deposit to Checking Account: ");
		double amount = input.nextDouble();
        if((savingBalance+amount)>0) {
        	calcSavingDeposit(amount);
        	System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));

        	}
        	else {
        		System.out.print("Balance cannot be negative");
        	}
	}
}
