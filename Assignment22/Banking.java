public class Banking{
public static void main(String [] args){
BankAccount b1=new SavingsAccount("PRM23144125888",4500092.89,3.2);
BankAccount b2=new CheckingAccount("PRM23144125888",4500092.89,34000);
BankAccount b3=new FixedDepositAccount("PRM23144125888",4500092.89,"5 years");
b1.Display();
System.out.println();
b2.Display();
System.out.println();
b3.Display();
}
}
class BankAccount{
private String accountNumber;
private double balance;
public BankAccount(String accountNumber, double balance){
this.balance=balance;
this.accountNumber=accountNumber;
}
public void Display(){
System.out.println("Account Number: "+accountNumber);
System.out.println("Balance: "+balance);
}
}
class SavingsAccount extends BankAccount{
private double interestRate;
public SavingsAccount(String accountNumber, double balance, double interestRate){
super(accountNumber,balance);
this.interestRate=interestRate;
}
public void Display(){
super.Display();
System.out.println("Interest rate: "+interestRate);
}
}
class CheckingAccount extends BankAccount{
private double withdrawalLimit;
public CheckingAccount(String accountNumber, double balance,double withdrawalLimit){
super(accountNumber,balance);
this.withdrawalLimit=withdrawalLimit;
}
public void Display(){
super.Display();
System.out.println("Withdrawal Limit: "+withdrawalLimit);
}
}
class FixedDepositAccount extends BankAccount{
private String duration;
public FixedDepositAccount(String accountNumber, double balance,String duration){
super(accountNumber,balance);
this.duration=duration;
}
public void Display(){
super.Display();
System.out.println("FD duration: "+duration);
}
}


