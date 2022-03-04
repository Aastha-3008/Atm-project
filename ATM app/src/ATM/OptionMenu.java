package ATM;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.HashMap;
import java.io.IOException;

public class OptionMenu extends Account {
      Scanner menuInput= new Scanner(System.in);
      NumberFormat moneyFormat= NumberFormat.getCurrencyInstance(Locale.CANADA);
      HashMap<Integer,Integer> data= new HashMap<>();
      
      public void getLogin() throws IOException{
    	 int x=1;
    	 do {
    		 try {
    			 data.put(98890,191204);
    			 data.put(952141,191904);
    			 data.put(989947, 171976);
    			 
    	System.out.println("Welcome to ATM Project!!!");
    	System.out.println("Enter the customerId:");
    	setCustomerId(menuInput.nextInt());
    	System.out.println("Enter the PIN Number");
    	setPinNumber(menuInput.nextInt());
    	
    			 } catch(Exception e)
    		 {
    				 System.out.println("\n"+"Invalid Character(s).Only Numbers."+"\n");
    				 x=2;
    		 }
    		 int cn=getCustomerId();
    		 int pn=getPinNumber();
    		 if(data.containsKey(cn) && data.get(cn)==pn)
    		 {
    			 getAccountType();
    		 }
    		 else {
    			 System.out.println("\n"+"Wrong Customer Number or Pin Number"+"\n");
    		 }
    	 }while(x==1);
      }	 
    	public String getCountry() {
    		String country= menuInput.nextLine();
    		return country;
    	}
      public void getAccountType() {
    		 System.out.println("Select the Account you Want to Access:");
    		 System.out.println("Type1:Check Balance");
    		 System.out.println("Type2:Saving Account");
    		 System.out.println("Type3:Exit");
    		 
    		 int selection = menuInput.nextInt();
    		 
    		 switch(selection) {
    		 case 1:
    		 { getChecking();
    		     break;}
    		 case 2:
    		 {
    			 getSaving();
    			 break;
    		 }
    		 case 3:
    		 {
    			 System.out.println("\n"+"Thank You for using this ATM"+"\n");
    			 break;
    		 }
    		 default:{
    			 System.out.println("\n"+"Invalid Choice."+"\n");
    			getAccountType();
    		 }
    		 }
    	 }		 
    		 public void getChecking(){
    			 System.out.println("Checking Account:");
    			 System.out.println("Type1: View Balance");
    			 System.out.println("Type2: Withdraw funds");
    			 System.out.println("Type3: Deposit funds");
    			 System.out.println("Type4: Exit");
    			 
    			 int selection = menuInput.nextInt();
    			 
    			 switch(selection) {
    			 case 1:
    			 { 
    				System.out.println("Checking Account Balance:"+  moneyFormat.format(getCheckingBalance()) );
    				getAccountType();
    				break;
    			 }
    			 case 2:
    			 {
    				 getCheckingWithdrawInput();
    				 getAccountType();
    				 break;
    			 }
    			 case 3:
    			 {
    				 getCheckingDepositInput();
    				 getAccountType();
    				 break;
    			 }
    			 case 4:{
    				 System.out.println("Thank you for using this ATM,bye");
    				 break;
    			 }
    			 default:{
    				 System.out.println("\n"+"Invalid Choice"+"\n");
    				 getChecking();
    			 }
    			 }
    		 }
    		 
    		 public void getSaving() {
    			 System.out.println("Saving Account:");
    			 System.out.println("Type1: View Balance");
    			 System.out.println("Type2: Withdraw funds");
    			 System.out.println("Type3: Deposit funds");
    			 System.out.println("Type4: Exit");
    			 System.out.println("Choice:");
    			 int selection = menuInput.nextInt();
    			 switch(selection) {
    			 case 1:
    			 {
    				 System.out.println("Saving Account Balance:"+ moneyFormat.format(getSavingBalance()));
    				 getAccountType();
    				 break;
    			 }
    			 case 2:{
    				 getSavingWithdrawInput();
    				 getAccountType();
    				 break;
    			 }
    			 case 3:{
    				 getSavingDepositInput();
    				 getAccountType();
    				 break;
    			 }
    			 case 4:
    			 {
    				 System.out.println("Thank you for using this ATM,bye");
    				 break;
    			 }
    			 default:{
    				 System.out.println("\n"+"Invalid Choice"+"\n");
    				 getChecking();
    			 }
    			 }
    		 }
    		 } 
